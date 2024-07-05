/*
 *  Copyright 2021 Collate
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

package org.openmetadata.service.exception;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.openmetadata.schema.api.events.CreateEventSubscription;
import org.openmetadata.schema.api.teams.CreateTeam.TeamType;
import org.openmetadata.schema.entity.teams.Team;
import org.openmetadata.schema.type.ChangeEvent;
import org.openmetadata.schema.type.MetadataOperation;
import org.openmetadata.schema.type.TagLabel;
import org.openmetadata.schema.type.TaskType;
import org.openmetadata.service.resources.feeds.MessageParser.EntityLink;
import org.openmetadata.service.util.JsonUtils;

public final class CatalogExceptionMessage {
  public static final String EMAIL_SENDING_ISSUE =
      "Возникли проблемы с отправкой почты. Пожалуйста, свяжитесь с вашим администратором.";
  public static final String PASSWORD_INVALID_FORMAT =
      "Пароль должен состоять минимум из 8 символов, включая один специальный, один верхний, один строчный символ и одну цифру.";
  public static final String MAX_FAILED_LOGIN_ATTEMPT =
      "Превышено количество неудачных попыток входа. Пожалуйста, попробуйте снова через некоторое время.";
  public static final String INVALID_USERNAME_PASSWORD = "Вы ввели неверное имя пользователя или пароль.";
  public static final String ENTITY_ALREADY_EXISTS = "Объект уже существует";
  public static final String FERNET_KEY_NULL = "Fernet key is null";
  public static final String FIELD_NOT_TOKENIZED = "Поле не токенизировано";
  public static final String FIELD_ALREADY_TOKENIZED = "Поле уже токенизировано";
  public static final String INVALID_ENTITY_LINK =
      "Ссылка на сущность должна содержать как {arrayFieldName}, так и {arrayFieldValue}.";
  public static final String EMPTY_POLICIES_IN_ROLE = "Для роли требуется хотя бы одна политика";
  public static final String EMPTY_RULES_IN_POLICY = "В политике должно быть хотя бы одно правило";
  public static final String INVALID_GROUP_TEAM_UPDATE = "Команда типа \"Группа\" не может быть обновлена";
  public static final String INVALID_GROUP_TEAM_CHILDREN_UPDATE =
      "Команду с потомками (children) невозможно обновить до типа \"Группа\". ";
  public static final String ANNOUNCEMENT_OVERLAP =
      "Уже запланировано объявление, которое совпадает с указанным временем начала и окончания.";
  public static final String ANNOUNCEMENT_INVALID_START_TIME =
      "Время начала объявления должно быть раньше времени окончания.";
  public static final String UNEXPECTED_PARENT = "Команда типа \"Организация\" не может иметь родительскую команду";
  public static final String DELETE_ORGANIZATION = "Типа команды \"Организация\" не может быть удалена";
  public static final String CREATE_ORGANIZATION =
      "Разрешена только одна команда с типом \"Организация\". Новая команда с типом \"Организация\" не может быть создана.";
  public static final String CREATE_GROUP =
      "Команда типа \"Группа\" не может включать в себя другие команды. В состав команды могут входить только пользователи";
  public static final String TEAM_HIERARCHY = "Произошла непредвиденная ошибка при построении иерархии команд";
  public static final String LDAP_MISSING_ATTR =
      "Неверное имя пользователя или адрес электронной почты. Пожалуйста, проверьте конфигурацию Openmetadata.";
  public static final String MULTIPLE_EMAIL_ENTRIES = "Электронная почта соответствует нескольким записям в каталоге.";

  public static final String INVALID_EMAIL_PASSWORD = "Вы ввели неверный адрес электронной почты или пароль.";

  public static final String SELF_SIGNUP_ERROR = "Регистрация не поддерживается.";
  public static final String NOT_IMPLEMENTED_METHOD = "Метод не реализован.";

  public static final String FORBIDDEN_AUTHENTICATOR_OP = "Работа с выбранным аутентификатором не разрешена.";
  public static final String TOKEN_EXPIRY_ERROR =
      "Срок действия токена подтверждения электронной почты %s истек. Пожалуйста, отправьте новый запрос на подтверждение электронной почты.";
  public static final String INVALID_BOT_USER =
      "Токен отзыва (Revoke Token) можно применить только к пользователям-ботам.";
  public static final String LIVE_APP_SCHEDULE_ERR = "Live Application cannot scheduled.";
  public static final String INVALID_APP_TYPE = "Недопустимый тип приложения.";

  private CatalogExceptionMessage() {}

  public static String entityNotFound(String entityType, String id) {
    return String.format("%s instance for %s not found", entityType, id);
  }

  public static String entityNotFound(String entityType, UUID id) {
    return entityNotFound(entityType, id.toString());
  }

  public static String readOnlyAttribute(String entityType, String attribute) {
    return String.format("%s attribute %s can't be modified", entityType, attribute);
  }

  public static String invalidName(String name) {
    return String.format("Invalid name %s", name);
  }

  public static String invalidField(String field) {
    return String.format("Invalid field name %s", field);
  }

  public static String entityTypeNotFound(String entityType) {
    return String.format("Entity type %s not found", entityType);
  }

  public static String entityRepositoryNotFound(String entityType) {
    return String.format("Entity repository for %s not found. Is the ENTITY_TYPE_MAP initialized?", entityType);
  }

  public static String entityRelationshipNotFound(
      String entityType, UUID id, String relationshipName, String toEntityType) {
    return String.format(
        "Entity type %s %s does not have expected relationship %s to/from entity type %s",
        entityType, id, relationshipName, toEntityType);
  }

  public static String resourceTypeNotFound(String resourceType) {
    return String.format("Resource type %s not found", resourceType);
  }

  public static String entityTypeNotSupported(String entityType) {
    return String.format("Entity type %s not supported", entityType);
  }

  public static String deletedUser(UUID id) {
    return String.format("User %s is deleted", id);
  }

  public static String userAlreadyPartOfTeam(String userName, String teamName) {
    return String.format("User '%s' is already part of the team '%s'", userName, teamName);
  }

  public static String invalidColumnFQN(String fqn) {
    return String.format("Invalid fully qualified column name %s", fqn);
  }

  public static String invalidFieldName(String fieldType, String fieldName) {
    return String.format("Invalid %s name %s", fieldType, fieldName);
  }

  public static String entityVersionNotFound(String entityType, UUID id, Double version) {
    return String.format("%s instance for %s and version %s not found", entityType, id, version);
  }

  public static String invalidServiceEntity(String serviceType, String entityType, String expected) {
    return String.format("Invalid service type `%s` for %s. Expected %s.", serviceType, entityType, expected);
  }

  public static String glossaryTermMismatch(String parentId, String glossaryId) {
    return String.format(
        "Invalid queryParameters - glossary term `parent` %s is not in the `glossary` %s", parentId, glossaryId);
  }

  public static String knowledgeCenterDocumentMismatch(String parentId, String knowledgeCenterId) {
    return String.format(
        "Invalid queryParameters - knowledge center document `parent` %s is not in the `knowledge center` %s",
        parentId, knowledgeCenterId);
  }

  public static String clientCenterClientMismatch(String parentId, String clientCenterId) {
    return String.format(
        "Invalid queryParameters - Client center client `parent` %s is not in the `client center` %s",
        parentId, clientCenterId);
  }

  public static String notAdmin(String name) {
    return String.format("Principal: CatalogPrincipal{name='%s'} is not admin", name);
  }

  public static String notReviewer(String name) {
    return String.format("User '%s' is not a reviewer", name);
  }

  public static String permissionDenied(
      String user, MetadataOperation operation, String roleName, String policyName, String ruleName) {
    if (roleName != null) {
      return String.format(
          "Principal: CatalogPrincipal{name='%s'} operation %s denied by role %s, policy %s, rule %s",
          user, operation, roleName, policyName, ruleName);
    }
    return String.format(
        "Principal: CatalogPrincipal{name='%s'} operation %s denied policy %s, rule %s",
        user, operation, policyName, ruleName);
  }

  public static String permissionNotAllowed(String user, List<MetadataOperation> operations) {
    return String.format("Principal: CatalogPrincipal{name='%s'} operations %s not allowed", user, operations);
  }

  public static String taskOperationNotAllowed(String user, String operations) {
    return String.format("Principal: CatalogPrincipal{name='%s'} operations %s not allowed", user, operations);
  }

  public static String entityIsNotEmpty(String entityType) {
    return String.format("%s is not empty", entityType);
  }

  public static String unknownCustomField(String fieldName) {
    return String.format("Unknown custom field %s", fieldName);
  }

  public static String jsonValidationError(String fieldName, String validationMessages) {
    return String.format("Custom field %s has invalid JSON %s", fieldName, validationMessages);
  }

  public static String invalidParent(Team parent, String child, TeamType childType) {
    return String.format(
        "Team %s of type %s can't be of parent of team %s of type %s",
        parent.getName(), parent.getTeamType(), child, childType);
  }

  public static String invalidChild(String parent, TeamType parentType, Team child) {
    return String.format(
        "Team %s of type %s can't have child team %s of type %s",
        parent, parentType, child.getName(), child.getTeamType());
  }

  public static String invalidParentCount(int validParentCount, TeamType teamType) {
    return String.format("Team of type %s can have only %s parents", teamType, validParentCount);
  }

  public static String invalidTeamOwner(TeamType teamType) {
    return String.format("Team of type %s can't own entities. Only Team of type Group can own entities.", teamType);
  }

  public static String invalidOwnerType(String entityType) {
    return String.format(
        "Entity of type %s can't be the owner. Only Team of type Group or a User can own entities.", entityType);
  }

  public static String failedToParse(String message) {
    return String.format("Failed to parse - %s", message);
  }

  public static String failedToEvaluate(String message) {
    return String.format("Failed to evaluate - %s", message);
  }

  public static String systemEntityDeleteNotAllowed(String name, String entityType) {
    return String.format("System entity [%s] of type %s can not be deleted.", name, entityType);
  }

  public static String systemEntityRenameNotAllowed(String name, String entityType) {
    return String.format("System entity [%s] of type %s can not be renamed.", name, entityType);
  }

  public static String mutuallyExclusiveLabels(TagLabel tag1, TagLabel tag2) {
    return String.format(
        "Tag labels %s and %s are mutually exclusive and can't be assigned together",
        tag1.getTagFQN(), tag2.getTagFQN());
  }

  public static String csvNotSupported(String entityType) {
    return String.format("Upload/download CSV for bulk operations is not supported for entity [%s]", entityType);
  }

  public static String userAlreadyBot(String userName, String botName) {
    return String.format("Bot user [%s] is already used by [%s] bot", userName, botName);
  }

  public static String invalidGlossaryTermMove(String term, String newParent) {
    return String.format("Can't move Glossary term %s to its child Glossary term %s", term, newParent);
  }

  public static String invalidKnowledgeCenterDocumentMove(String term, String newParent) {
    return String.format(
        "Can't move knowledge center document %s to its child knowledge center document %s", term, newParent);
  }

  public static String invalidClientCenterClientMove(String term, String newParent) {
    return String.format("Can't move client center client %s to its child client center client %s", term, newParent);
  }

  public static String eventPublisherFailedToPublish(
      CreateEventSubscription.SubscriptionType type, ChangeEvent event, String message) {
    return String.format(
        "Failed to publish event %s to %s due to %s ", JsonUtils.pojoToJson(event), type.value(), message);
  }

  public static String invalidTaskField(EntityLink entityLink, TaskType taskType) {
    return String.format("The Entity link with no field name - %s is not supported for %s task.", entityLink, taskType);
  }

  public static String invalidFieldForTask(String fieldName, TaskType type) {
    return String.format("The field name %s is not supported for %s task.", fieldName, type);
  }

  public static String invalidEnumValue(Class<? extends Enum<?>> enumClass) {
    String className = enumClass.getSimpleName();
    String classNameWithLowercaseFirstLetter = className.substring(0, 1).toLowerCase() + className.substring(1);

    return invalidEnumValue(enumClass, classNameWithLowercaseFirstLetter);
  }

  public static String invalidEnumValue(Class<? extends Enum<?>> enumClass, String key) {
    String enumValues =
        Arrays.stream(enumClass.getEnumConstants()).map(Object::toString).collect(Collectors.joining(", "));
    return "query param " + key + " must be one of [" + enumValues + "]";
  }
}
