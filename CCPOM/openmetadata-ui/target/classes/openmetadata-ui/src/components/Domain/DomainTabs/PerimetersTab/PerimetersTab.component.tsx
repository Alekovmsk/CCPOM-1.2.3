/*
 *  Copyright 2023 Collate.
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
import classNames from 'classnames';
import { isEmpty } from 'lodash';
import { PagingResponse } from 'Models';
import React, {
  forwardRef,
  useCallback,
  useEffect,
  useImperativeHandle,
  useState,
} from 'react';
import { useTranslation } from 'react-i18next';
import { useParams } from 'react-router-dom';
import { PAGE_SIZE_LARGE } from '../../../../constants/constants';
import { ERROR_PLACEHOLDER_TYPE } from '../../../../enums/common.enum';
import { EntityType } from '../../../../enums/entity.enum';
import { SearchIndex } from '../../../../enums/search.enum';
import { Perimeter } from '../../../../generated/entity/domains/perimeter';
import { searchData } from '../../../../rest/miscAPI';
import { formatPerimeterResponse } from '../../../../utils/APIUtils';
import {
  escapeESReservedCharacters,
  getDecodedFqn,
  getEncodedFqn,
} from '../../../../utils/StringsUtils';
import ErrorPlaceHolder from '../../../common/ErrorWithPlaceholder/ErrorPlaceHolder';
import EntitySummaryPanel from '../../../Explore/EntitySummaryPanel/EntitySummaryPanel.component';
import ExploreSearchCard from '../../../ExploreV1/ExploreSearchCard/ExploreSearchCard';
import Loader from '../../../Loader/Loader';
import PageLayoutV1 from '../../../PageLayoutV1/PageLayoutV1';
import { SourceType } from '../../../SearchedData/SearchedData.interface';
import { PerimetersTabProps } from './PerimetersTab.interface';

const PerimetersTab = forwardRef(
  ({ permissions, onAddPerimeter }: PerimetersTabProps, ref) => {
    const { t } = useTranslation();
    const { fqn: domainFqn } = useParams<{ fqn: string }>();
    const [perimeters, setPerimeters] = useState<
      PagingResponse<Perimeter[]>
    >({
      data: [],
      paging: { total: 0 },
    });

    const [selectedCard, setSelectedCard] = useState<Perimeter>();
    const [loading, setLoading] = useState(true);

    const fetchPerimeters = async () => {
      try {
        setLoading(true);
        const decodedFqn = getDecodedFqn(domainFqn);
        const encodedFqn = getEncodedFqn(
          escapeESReservedCharacters(decodedFqn)
        );
        const res = await searchData(
          '',
          1,
          PAGE_SIZE_LARGE,
          `(domain.fullyQualifiedName:"${encodedFqn}")`,
          '',
          '',
          SearchIndex.PERIMETER
        );
        console.log('perimetrsearchres');
        console.log(res);

        const data = formatPerimeterResponse(res.data.hits.hits);
        setPerimeters({
          data: data,
          paging: { total: res.data.hits.total.value ?? 0 },
        });
        if (data.length > 0) {
          setSelectedCard(data[0]);
        }
      } catch (error) {
        console.log('perimetrsearchcatcherr');
        setPerimeters({
          data: [],
          paging: { total: 0 },
        });
      } finally {
        setLoading(false);
      }
    };

    const updateSelectedCard = useCallback((perimeterCard: SourceType) => {
      setSelectedCard(perimeterCard as Perimeter);
    }, []);

    useImperativeHandle(ref, () => ({
      refreshPerimeters() {
        fetchPerimeters();
      },
    }));

    useEffect(() => {
      fetchPerimeters();
    }, [domainFqn]);

    if (loading) {
      return <Loader />;
    }

    if (isEmpty(perimeters.data) && !loading) {
      return (
        <ErrorPlaceHolder
          className="m-t-xlg"
          heading={t('label.perimeter')}
          permission={permissions.Create}
          type={ERROR_PLACEHOLDER_TYPE.CREATE}
          onClick={onAddPerimeter}
        />
      );
    }

    return (
      <PageLayoutV1
        className="domain-page-layout"
        pageTitle={t('label.domain')}
        rightPanel={
          selectedCard && (
            <EntitySummaryPanel
              entityDetails={{
                details: {
                  ...selectedCard,
                  entityType: EntityType.PERIMETER,
                },
              }}
              handleClosePanel={() => setSelectedCard(undefined)}
            />
          )
        }>
        <div className="p-x-md">
          {perimeters.data.map((perimeter) => (
            <ExploreSearchCard
              className={classNames(
                'm-b-sm cursor-pointer',
                selectedCard?.id === perimeter.id ? 'highlight-card' : ''
              )}
              handleSummaryPanelDisplay={updateSelectedCard}
              id={perimeter.id}
              key={'perimeter_card' + perimeter.id}
              showTags={false}
              source={{ ...perimeter, entityType: EntityType.PERIMETER }}
            />
          ))}
        </div>
      </PageLayoutV1>
    );
  }
);

export default PerimetersTab;
