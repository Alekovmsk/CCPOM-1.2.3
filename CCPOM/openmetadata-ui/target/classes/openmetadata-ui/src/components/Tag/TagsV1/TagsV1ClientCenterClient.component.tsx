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
import { Card, Tag, Tooltip, Typography } from 'antd';
import classNames from 'classnames';
import React, { useCallback, useMemo } from 'react';
import { useHistory } from 'react-router-dom';
import { ReactComponent as IconTerm } from '../../../assets/svg/book.svg';
import { ReactComponent as IconTag } from '../../../assets/svg/classification.svg';
import { ReactComponent as PlusIcon } from '../../../assets/svg/plus-primary.svg';
import { ReactComponent as ClientIcon } from '../../../assets/svg/clientCenter.svg';
import { FQN_SEPARATOR_CHAR } from '../../../constants/char.constants';
import { ROUTES, getClientCenterClientDetailsPath } from '../../../constants/constants';
import { TAG_START_WITH } from '../../../constants/Tag.constants';
import { TagSource } from '../../../generated/type/tagLabel';
import { reduceColorOpacity } from '../../../utils/CommonUtils';
import { getEntityName } from '../../../utils/EntityUtils';
import Fqn from '../../../utils/Fqn';
import { getEncodedFqn } from '../../../utils/StringsUtils';
import { getTagDisplay, getTagTooltip } from '../../../utils/TagsUtils';
import { TagsV1Props } from './TagsV1.interface';
import './tagsV1.less';
import { TagsV1ClientCenterClientProps } from './TagsV1ClientCenterClient.interface';
import { ClientCenterClient } from '../../../generated/entity/data/clientCenterClient';
import ClientInfoCard from '../../ClientCenter/ClientCenterClients/tabs/ClientCenterOverviewInfo';

const TagsClientCenterClientV1 = ({
  tag,
  startWith,
  className,
  showOnlyName = false,
  isVersionPage = false,
  tagProps,
  tooltipOverride,
  isTagLabel
}: TagsV1ClientCenterClientProps) => {
  const history = useHistory();
  const color = useMemo(
    () => (isVersionPage ? undefined : tag.style?.color),
    [tag]
  );

  const startIcon =
    <ClientIcon
      // className="flex-shrink m-r-xss"
      // data-testid="tags-icon"
      height={30}
      // name="tag-icon"
      width={30}
    />
    ;

  const tagName = useMemo(
    () => isTagLabel ?
      getEntityName(tag) ||
      getTagDisplay(
        showOnlyName
          ? tag.tagFQN
            .split(FQN_SEPARATOR_CHAR)
            .slice(-2)
            .join(FQN_SEPARATOR_CHAR)
          : tag.tagFQN
      )
      :
      getEntityName(tag) ||
      getTagDisplay(
        showOnlyName
          ? tag.fullyQualifiedName
            .split(FQN_SEPARATOR_CHAR)
            .slice(-2)
            .join(FQN_SEPARATOR_CHAR)
          : tag.fullyQualifiedName
      )
    ,
    [showOnlyName, tag.tagFQN, tag.fullyQualifiedName]
  );

  const redirectLink = useCallback(
    () =>
      isTagLabel ?
        history.push(getClientCenterClientDetailsPath(tag.tagFQN || ''))
        :
        history.push(getClientCenterClientDetailsPath(tag.fullyQualifiedName || '')),
    [tag.source, tag.tagFQN, tag.fullyQualifiedName]
  );

  const tagColorBar = useMemo(
    () =>
      color ? (
        <div className="tag-color-bar" style={{ borderColor: color }} />
      ) : null,
    [color]
  );

  const tagContent = useMemo(
    () => (
      <div className="">
        {tagColorBar}
        <div className="d-flex items-center p-x-xs w-full">
          <ClientIcon
            // className="flex-shrink m-r-xss"
            // data-testid="tags-icon"
            height={30}
            // name="tag-icon"
            width={30}
          />
          <Tooltip
            className="cursor-pointer"
            mouseEnterDelay={1.5}
            placement="bottomLeft"
            title={tooltipOverride ?? getTagTooltip(isTagLabel ? tag.tagFQN : tag.fullyQualifiedName)}
            trigger="hover">
            <Typography.Paragraph
              ellipsis
              className="m-0"
              data-testid={`tag-${isTagLabel ? tag.tagFQN : tag.fullyQualifiedName}`}
              style={{ color: 'blue', fontSize: '105px !important' }}
              onClick={redirectLink}>
              {tagName}
            </Typography.Paragraph>
          </Tooltip>
        </div>
      </div>
    ),
    [startIcon, tagName, tag, tagColorBar]
  );

  const tagChip = useMemo(
    () => (
      <Card
        className={classNames(className)}
        style={
          color
            ? { backgroundColor: reduceColorOpacity(color, 0.05), width: '100%' }
            : { width: '100%' }
        }
      >{tagContent} {!isTagLabel &&
        <ClientInfoCard initialValues={tag as ClientCenterClient} />}
      </Card>

    ),
    [color, tagContent, className]
  );

  const addTagChip = useMemo(
    () => (
      <Tag
        className={classNames('tag-chip tag-chip-add-button')}
        icon={<PlusIcon height={16} name="plus" width={16} />}>
        <Typography.Paragraph
          className="m-0 text-xs font-medium text-primary"
          data-testid="add-tag">
          {getTagDisplay(tagName)}
        </Typography.Paragraph>
      </Tag>
    ),
    [tagName]
  );

  if (startWith === TAG_START_WITH.PLUS) {
    return addTagChip;
  }

  return (
    <>
      {tagChip}
    </>
  );
};

export default TagsClientCenterClientV1;
