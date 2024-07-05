/*
 *  Copyright 2022 Collate.
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

/* eslint-disable max-len */

export const TEST_FORM_DATA = [
  {
    title: 'Создайте тест кейс',
    body: 'Для создания тест кейса добавьте уникальное наименование. Выберите тип теста из выпадающего списка. Заполните сведения о параметрах, которые отображаются для выбранного типа теста. Введите описание (необязательно).',
  },
  {
    title: 'Тест кейс создан успешно',
    body: 'Тест кейс создан успешно. Просмотрите набор тестов, чтобы проверить детали нового созданного тестового кейса. Это будет учтено при следующем запуске.',
  },
  {
    title: 'Набор тестов и Тест кейс созданы успешно',
    body: 'Набор тестов и Тест кейс созданы успешно. На следующем этапе вы можете запланировать прием метаданных с желаемым расписанием. На следующем этапе вы можете запланировать прием метаданных с желаемой частотой. Вы также можете просмотреть набор тестов, чтобы проверить детали нового созданного тест кейса.',
  },
];

export const TEST_PAGE_FORM_DATA = [
  {
    title: 'Создайте набор тестов',
    body: 'Набор тестов - это контейнер, состоящий из нескольких связанных между собой тест кейсов. С помощью Набора тестов вы можете легко развернуть конвейер для выполнения тест кейсов. Начните с выбора существующего набора тестов или создайте новый набор тестов, чтобы создать тест на уровне таблицы или столбца для сущности.',
  },
  {
    title: 'Выберите тест кейсы',
    body: 'Свяжите существующие тест кейсы с вновь созданным набором тестов. Вы можете добавить несколько тест кейсов.',
  },
  {
    title: 'Набор тестов создан успешно',
    body: 'Набор тестов создан успешно. На следующем этапе вы можете запланировать прием метаданных с желаемым расписанием. Вы также можете просмотреть набор тестов, чтобы проверить детали нового созданного тест кейса.',
  },
];

export const INGESTION_DATA = {
  title: 'Расписание для Тестов',
  body: 'Тесты качества данных можно запланировать для запуска с желаемым расписанием. Часовой пояс в UTC.',
};

export const addTestSuiteRightPanel = (
  step: number,
  isSuiteCreate?: boolean,
  data?: { testSuite: string; testCase: string }
) => {
  let message = TEST_FORM_DATA[step - 1];

  if (step === 3) {
    if (isSuiteCreate) {
      message = TEST_FORM_DATA[step];
      const updatedMessage = message.body
        .replace('{testSuite}', data?.testSuite || 'Test Suite')
        .replace('{testCase}', data?.testCase || 'Test Case');
      message.body = updatedMessage;
    } else {
      const updatedMessage = message.body.replace(
        '{testCase}',
        data?.testCase || 'Test Case'
      );
      message.body = updatedMessage;
    }
  }

  return message;
};

export const getRightPanelForAddTestSuitePage = (
  step: number,
  testSuite: string
) => {
  const message = TEST_PAGE_FORM_DATA[step - 1];
  if (step === 3) {
    message.body = message.body.replace('{testSuite}', testSuite);
  }

  return message;
};
