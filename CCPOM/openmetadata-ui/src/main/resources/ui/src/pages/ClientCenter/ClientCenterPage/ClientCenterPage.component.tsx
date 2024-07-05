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

import { AxiosError } from 'axios';
import React, { useEffect, useState } from 'react';
import PageLayoutV1 from '../../../components/PageLayoutV1/PageLayoutV1';
import { PAGE_SIZE_LARGE } from '../../../constants/constants';
import { ClientCenter } from '../../../generated/entity/data/clientCenter';
import {
  getClientCentersList,
} from '../../../rest/clientCenterAPI';
import { showErrorToast } from '../../../utils/ToastUtils';
import ClientCenterLeftPanel from '../ClientCenterLeftPanel/ClientCenterLeftPanel.component';
import ClientCenterPagePart from './ClientCenterPagePart.component';
import { Col, Row } from 'antd';
import { t } from 'i18next';

const ClientCenterPage = () => {
  const [clientCenters, setClientCenters] = useState<ClientCenter[]>([]);
  const [centersLoaded, setCentersLoaded] = useState(false);
  const fetchClientCenterList = async () => {
    let isDataKnowledge:boolean = false;
    try {
      const { data } = await getClientCentersList({
        fields: 'owner,tags,reviewers,votes,domain',
        limit: PAGE_SIZE_LARGE,
      });
      setClientCenters(data);
      isDataKnowledge = data.length > 0;
    } catch (error) {
      showErrorToast(error as AxiosError);
    } finally {
      if (isDataKnowledge) {setCentersLoaded(true)};
    }
  };
  useEffect(() => {
    fetchClientCenterList();
  }, []);

  return (
    <PageLayoutV1
      className="client-center-page-layout"
      pageTitle={t('label.client-center')}
      leftPanelWidth = {400}
      leftPanel={
        centersLoaded &&
        <>
        <ClientCenterLeftPanel clientCenters={clientCenters} />
        <Col span={24}>
            <ClientCenterPagePart
              isDoc={false}
              headerVisible={false}
            />
          </Col>
          </>
      }
      rightPanelWidth={400}>
        <Row gutter={[0, 8]}>
          <Col span={24}>
            <ClientCenterPagePart
              isDoc={true}
            />
          </Col>
        </Row>
    </PageLayoutV1>

  );
};

export default ClientCenterPage;
