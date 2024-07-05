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
import { Col, Row, Space, Tag, Typography } from 'antd';
import { isEmpty } from 'lodash';
import React, { useCallback, useMemo, useState } from 'react';
import { useTranslation } from 'react-i18next';
import { useHistory } from 'react-router-dom';
import { ReactComponent as EditIcon } from '../../assets/svg/edit-new.svg';
import { ReactComponent as PerimeterIcon } from '../../assets/svg/ic-data-product.svg';
import PerimeterSelectForm from '../PerimeterSelectForm/PerimetersSelectForm';
import TagsV1 from '../Tag/TagsV1/TagsV1.component';
import {
  DE_ACTIVE_COLOR,
  NO_DATA_PLACEHOLDER,
} from '../../constants/constants';
import { TAG_CONSTANT, TAG_START_WITH } from '../../constants/Tag.constants';
import { Perimeter } from '../../generated/entity/domains/perimeter';
import { EntityReference } from '../../generated/entity/type';
import { fetchPerimetersElasticSearch } from '../../rest/perimeterAPI';
import { getEntityName } from '../../utils/EntityUtils';
import { getPerimetersDetailsPath } from '../../utils/RouterUtils';
import { getEncodedFqn } from '../../utils/StringsUtils';

interface PerimetersContainerProps {
  showHeader?: boolean;
  hasPermission: boolean;
  perimeters: EntityReference[];
  activeDomain?: EntityReference;
  onSave?: (perimeters: Perimeter[]) => Promise<void>;
}

const PerimetersContainer = ({
  showHeader = true,
  hasPermission,
  perimeters,
  activeDomain,
  onSave,
}: PerimetersContainerProps) => {
  const { t } = useTranslation();
  const history = useHistory();
  const [isEditMode, setIsEditMode] = useState(false);

  const handleAddClick = () => {
    setIsEditMode(true);
  };

  const fetchAPI = useCallback(
    (searchValue: string, page: number) => {
      let searchText = searchValue;
      const domainText = activeDomain
        ? `(domain.fullyQualifiedName:"${activeDomain.name}")`
        : '';

      if (!isEmpty(searchText)) {
        searchText = `${searchText} ${
          !isEmpty(domainText) ? `AND ${domainText}` : ''
        } `;
      } else {
        searchText = domainText;
      }

      return fetchPerimetersElasticSearch(searchText, page);
    },
    [activeDomain]
  );

  const redirectLink = useCallback((fqn) => {
    history.push(getPerimetersDetailsPath(getEncodedFqn(fqn)));
  }, []);

  const handleSave = async (perimeters: Perimeter[]) => {
    await onSave?.(perimeters);
    setIsEditMode(false);
  };

  const handleCancel = () => {
    setIsEditMode(false);
  };

  const autoCompleteFormSelectContainer = useMemo(() => {
    return (
      <PerimeterSelectForm
        defaultValue={(perimeters ?? []).map(
          (item) => item.fullyQualifiedName ?? ''
        )}
        fetchApi={fetchAPI}
        placeholder={t('label.perimeter-plural')}
        onCancel={handleCancel}
        onSubmit={handleSave}
      />
    );
  }, [handleCancel, handleSave, perimeters, fetchAPI]);

  const showAddTagButton = useMemo(
    () => hasPermission && isEmpty(perimeters),
    [hasPermission, perimeters]
  );

  const renderPerimeters = useMemo(() => {
    if (isEmpty(perimeters)) {
      return NO_DATA_PLACEHOLDER;
    }

    return perimeters.map((perimeter) => {
      return (
        <Tag
          className="tag-chip tag-chip-content"
          key={`dp-tags-${perimeter.fullyQualifiedName}`}
          onClick={() => redirectLink(perimeter.fullyQualifiedName)}>
          <div className="d-flex w-full">
            <div className="d-flex items-center p-x-xs w-full gap-1">
              <PerimeterIcon
                className="align-middle"
                height={12}
                width={12}
              />
              <Typography.Paragraph
                ellipsis
                className="m-0 tags-label"
                data-testid={`perimeter-${perimeter.fullyQualifiedName}`}>
                {getEntityName(perimeter)}
              </Typography.Paragraph>
            </div>
          </div>
        </Tag>
      );
    });
  }, [perimeters]);

  const header = useMemo(() => {
    return (
      showHeader && (
        <Space align="center" className="m-b-xss w-full" size="middle">
          <Typography.Text className="right-panel-label">
            {t('label.perimeter-plural')}
          </Typography.Text>
          {hasPermission && (
            <Row gutter={12}>
              {!isEmpty(perimeters) && (
                <Col>
                  <EditIcon
                    className="cursor-pointer"
                    color={DE_ACTIVE_COLOR}
                    data-testid="edit-button"
                    width="14px"
                    onClick={handleAddClick}
                  />
                </Col>
              )}
            </Row>
          )}
        </Space>
      )
    );
  }, [showHeader, perimeters, hasPermission]);

  const addTagButton = useMemo(
    () =>
      showAddTagButton ? (
        <Col className="m-t-xss" onClick={handleAddClick}>
          <TagsV1 startWith={TAG_START_WITH.PLUS} tag={TAG_CONSTANT} />
        </Col>
      ) : null,
    [showAddTagButton]
  );

  return (
    <div className="w-full" data-testid="perimeters-container">
      {header}
      {!isEditMode && (
        <Row data-testid="perimeters-list">
          <Col>
            {addTagButton}
            {renderPerimeters}
          </Col>
        </Row>
      )}
      {isEditMode && autoCompleteFormSelectContainer}
    </div>
  );
};

export default PerimetersContainer;
