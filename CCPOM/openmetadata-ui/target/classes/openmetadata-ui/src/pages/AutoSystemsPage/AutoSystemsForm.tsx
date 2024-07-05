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

import { Typography, Card, Table, TableProps } from 'antd';
import React, { useEffect, useMemo, useState } from 'react';
import { RenameFormProps, ColType } from './TagsPage.interface';





const TagsForm = ({
  initialValues
}: RenameFormProps) => {
    const columns: TableProps<ColType>['columns'] = [
      {
        title: 'Название',
        dataIndex: 'name',
        key: 'name',
        width: '25%',
        // render: (text) => (
        //   <Typography.Text>{text || NO_DATA_PLACEHOLDER}</Typography.Text>
        // ),
      },
      {
        title: 'Значение',
        dataIndex: 'value',
        key: 'value'
      }
    ]
  
    const data: ColType[] = [
      {
        name: 'Уник. Номер',
        value: initialValues?.numberInList
      },
      {
        name: 'Наименование',
        value: initialValues?.name
      },
      {
        name: 'Основные функции и назначение',
        value: initialValues?.description
      },
      {
        name: 'ФИО Владельца АС',
        value: initialValues?.fullNameOwner
      },
      {
        name: 'ОРД о назначении Владельца АС',
        value: initialValues?.ordApointmentOwner
      },
      {
        name: 'Сокращенное наименование АС',
        value: initialValues?.shortName
      },
      {
        name: 'Версия ПО',
        value: initialValues?.softwareVersion
      },
      {
        name: 'Собственная разработка или покупное ПО',
        value: initialValues?.ownDevelopmentOrPurchasedSoftware
      },
      {
        name: 'Сведения о разработчиках АС',
        value: initialValues?.developerInformation
      },
      {
        name: 'Ответственные работники - программисты, если собственная разработка',
        value: initialValues?.responsibleEmployees
      },
      {
        name: 'Режим работы (часы х дни)',
        value: initialValues?.workingHours
      },
      {
        name: 'Регламентные события',
        value: initialValues?.regulatoryEvents
      },
      {
        name: 'Подрядчик по поддержке',
        value: initialValues?.supportContractor
      },
      {
        name: 'Режим поддержки (часы х дни)',
        value: initialValues?.supportMode
      },
      {
        name: 'Дата начала поддержки по договору',
        value: initialValues?.startSupportDate
      },
      {
        name: 'Дата окончания поддержки',
        value: initialValues?.endSupportDate
      },
      {
        name: 'Поставщик, Подрядчик',
        value: initialValues?.supplier
      },
      {
        name: 'Менеджер продукта (менеджер АС)',
        value: initialValues?.productManager
      },
      {
        name: 'Менеджер продукта, должность',
        value: initialValues?.productManagerPosition
      },
      {
        name: 'Заместитель менеджера продуктов',
        value: initialValues?.deputyProductManager
      },
      {
        name: 'Дата ввода в опытную эксплуатацию',
        value: initialValues?.trialStartDate
      },
      {
        name: 'Дата окончания опытной эксплуатации',
        value: initialValues?.trialEndDate
      },
      {
        name: 'Сведения о модификациях АС',
        value: initialValues?.modificationsInfo
      },
      {
        name: 'Дата ввода в промышленную эксплуатацию',
        value: initialValues?.industrialStartDate
      },
      {
        name: 'Ответственные пользователи',
        value: initialValues?.responsibleUsers
      },
      {
        name: 'Комплект установки',
        value: initialValues?.installationKit
      },
      {
        name: 'Оборудование для серверной части имя, IP',
        value: initialValues?.serverEquipmentNameIp
      },
      {
        name: 'ПО для серверной части',
        value: initialValues?.serverSoftware
      },
      {
        name: 'Программно-аппаратный состав АС',
        value: initialValues?.softwareAndHardwareComposition
      },
      {
        name: 'СУБД',
        value: initialValues?.db
      },
      {
        name: 'Версия СУБД',
        value: initialValues?.dbVersion
      },
      {
        name: 'Оборудование, на котором устанавливается клиентская часть',
        value: initialValues?.clientPartEquioment
      },
      {
        name: 'Тип рабочего места и Версия программного окружения',
        value: initialValues?.workplaceTypeAndSoftwareEnvVersion
      },
      {
        name: 'Связи с другими системами Список',
        value: initialValues?.lisOfOtherSystemConnections
      },
      {
        name: 'Степень конфиденциальности АС',
        value: initialValues?.degreeOfConfidentiality
      },
      {
        name: 'Класс критичности АС',
        value: initialValues?.criticalityClass
      },
      {
        name: 'Департамент, сопровождающий АС',
        value: initialValues?.department
      },
      {
        name: 'Сопровождается ИТ-блоком ',
        value: initialValues?.accompaniedByItBlock
      },
      {
        name: 'Электронная копия документации на АС',
        value: initialValues?.electronicCopyDoc
      },
      {
        name: 'Связь с проектами',
        value: initialValues?.projectConnection
      },
      {
        name: 'Примечание',
        value: initialValues?.note
      },
      {
        name: 'Цвет',
        value: initialValues?.color
      },
      {
        name: 'Тип АС',
        value: initialValues?.asType
      },
      {
        name: 'Вид эксплуатации',
        value: initialValues?.operationType
      },
      {
        name: 'Основание для разработки, ввода в ПЭ (ОПЭ, ОЭ)',
        value: initialValues?.basisForDevelopmentAndInputIntoPe
      },
      {
        name: 'МЦ',
        value: initialValues?.mc
      },
      {
        name: 'Пороговое время несущественного сбоя (Т)*, минут',
        value: initialValues?.thresholdTimeOfMinorFailure
      },
      {
        name: 'Критичное время суток (МСК)**',
        value: initialValues?.criticalDayTime
      },
      {
        name: 'Ролевая модель АС',
        value: initialValues?.roleModel
      },
      {
        name: 'Ссылка на Список ролей пользователей',
        value: initialValues?.linkToUserList
      },
      {
        name: 'ИТ-координатор восстановления',
        value: initialValues?.itRecoveryCoordinator
      },
      {
        name: 'Информация об Администраторах',
        value: initialValues?.administratorsInfo
      },
      {
        name: 'Менеджер планирования',
        value: initialValues?.planningManager
      },
      {
        name: 'Свидетельство о регистрации программы для ЭВМ',
        value: initialValues?.registrationCertificate
      },
      {
        name: 'Координатор восстановления от бизнеса',
        value: initialValues?.businessRecoveryCoordinator
      },
      {
        name: 'Распоряжение (Акт) вывода системы из эксплуатации',
        value: initialValues?.orderForDecommissioning
      },
      {
        name: 'Администраторы',
        value: initialValues?.administrators
      },
      {
        name: 'Ссылка на регистрацию ЗНИ в JIRADEV',
        value: initialValues?.registerLinkRfiInJiradev
      },
      {
        name: 'Стратегические перспективы развития АС в Банке',
        value: initialValues?.devStrategicProspects
      },
      {
        name: 'Архитектор АС',
        value: initialValues?.architect
      },
      {
        name: 'Руководитель разработки',
        value: initialValues?.devHead
      },
      {
        name: 'Руководитель тестирования',
        value: initialValues?.testingManager
      },
      {
        name: 'Уровень прав на ПО',
        value: initialValues?.softwareRightsLevel
      },
      {
        name: 'Утвержденная модель сорсинга',
        value: initialValues?.approvedSourcingModel
      },
      {
        name: 'Срок действия модели сорсинга',
        value: initialValues?.durationSourcingModel
      },
      {
        name: 'Ключевые компетенции',
        value: initialValues?.keyCompetencies
      },
      {
        name: 'Разрешенные пропорции',
        value: initialValues?.allowedProportions
      },
      {
        name: 'Признак использования интернет технологий',
        value: initialValues?.usingInternetSign
      },
      {
        name: 'Сведения для отчета 0409070',
        value: initialValues?.reportInformation0409070
      },
      {
        name: 'Руководитель сопровождения',
        value: initialValues?.supportHead
      },
      {
        name: 'Доступ к АС за пределами РФ',
        value: initialValues?.outsideRussianFederationAccess
      },
      {
        name: 'Мнемокод',
        value: initialValues?.mnemonicCode
      },
      {
        name: 'Признак ПДн',
        value: initialValues?.signPd
      },
      {
        name: 'Ссылка на пространство в Сonfluence',
        value: initialValues?.confluenceSpaceLink
      },
      {
        name: 'ИСПДн',
        value: initialValues?.ispdn
      },
      {
        name: 'Наличие специальных или биометрических ПДн',
        value: initialValues?.availabilityOfSpecialOrBiometricPd
      },
      {
        name: 'Дата вывода системы из эксплуатации',
        value: initialValues?.decommissioningDate
      },
      {
        name: 'Основная',
        value: initialValues?.main
      },
      {
        name: 'Дата периода архивного хранения АС',
        value: initialValues?.archiveDate
      },
      {
        name: 'Распределение АС на Конечный продукт',
        value: initialValues?.finalProductAllocation
      },
      {
        name: 'Связь с ИТ-сервисами согласно заключаемым SLA',
        value: initialValues?.itCommunicationItSla
      },
      {
        name: 'RTO',
        value: initialValues?.rto
      },
      {
        name: 'RPO',
        value: initialValues?.rpo
      },
      {
        name: 'Принадлежность к контурам соответствия стандартам',
        value: initialValues?.membershipInComplianceCircuits
      },
      {
        name: 'Наличие данных о клиентах особых категорий обслуживания',
        value: initialValues?.dataAvailabilityonSpecialServiceClients
      },
      {
        name: 'Код проекта о создании АС',
        value: initialValues?.creationProjectCode
      },
      {
        name: 'Автор',
        value: initialValues?.author
      },
      {
        name: 'ip- адрес  добавления записи',
        value: initialValues?.addRecordIp
      },
      {
        name: 'Дата добавления записи',
        value: initialValues?.addRecordDate
      },
      {
        name: 'Время добавления записи',
        value: initialValues?.addRecordTime
      },
      {
        name: 'Пользователь последнего редактирования записи',
        value: initialValues?.userOfLastPostEdit
      },
      {
        name: 'ip-адрес последнего редактирования записи',
        value: initialValues?.ipOfLastPostEdit
      },
      {
        name: 'Дата последнего редактирования записи',
        value: initialValues?.recordLastEditDate
      },
      {
        name: 'Время последнего редактирования записи',
        value: initialValues?.recordLastEditTime
      },
      {
        name: 'Пользователь акцептования записи',
        value: initialValues?.recordAcceptanceUser
      },
      {
        name: 'ip-адрес акцептования записи',
        value: initialValues?.recordAcceptanceIp
      },
      {
        name: 'Дата акцептования записи',
        value: initialValues?.acceptanceRecordDate
      },
      {
        name: 'Время акцептования записи',
        value: initialValues?.acceptanceRecordTime
      },
    ]

  return (
    <div className="p-x-md" data-testid="tags-container">
      
      <Card 
        className="ant-card-feed"
        headStyle={{backgroundColor: 'rgba(250, 250, 250)' }}
        style={{
          marginBottom: '20px'
        }}
          title={
            <Typography.Text strong data-testid="header">
              Данные АС
            </Typography.Text>
          }>
          <Table columns={columns} dataSource={data} pagination={false} />
      </Card>
    </div>
  );
};

export default TagsForm;
