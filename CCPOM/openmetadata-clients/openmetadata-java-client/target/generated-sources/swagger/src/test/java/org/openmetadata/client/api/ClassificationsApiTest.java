package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.Classification;
import org.openmetadata.client.model.ClassificationList;
import org.openmetadata.client.model.CreateClassification;
import org.openmetadata.client.model.CreateTag;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.Table;
import org.openmetadata.client.model.Tag;
import org.openmetadata.client.model.TagList;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClassificationsApi
 */
class ClassificationsApiTest {

    private ClassificationsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(ClassificationsApi.class);
    }

    
    /**
     * Create a classification
     *
     * Create a new classification. The request can include the children tags to be created along with the classification.
     */
    @Test
    void createClassificationTest() {
        CreateClassification createClassification = null;
        // Classification response = api.createClassification(createClassification);

        // TODO: test validations
    }

    
    /**
     * Update a classification
     *
     * Update an existing category identify by category name
     */
    @Test
    void createOrUpdateClassificationTest() {
        CreateClassification createClassification = null;
        // api.createOrUpdateClassification(createClassification);

        // TODO: test validations
    }

    
    /**
     * Create or update a tag
     *
     * Create a new tag, if it does not exist or update an existing tag.
     */
    @Test
    void createOrUpdateTagTest() {
        CreateTag createTag = null;
        // Tag response = api.createOrUpdateTag(createTag);

        // TODO: test validations
    }

    
    /**
     * Create a tag
     *
     * Create a new tag.
     */
    @Test
    void createTagTest() {
        CreateTag createTag = null;
        // Tag response = api.createTag(createTag);

        // TODO: test validations
    }

    
    /**
     * Delete classification by id
     *
     * Delete a classification and all the tags under it.
     */
    @Test
    void deleteClassificationTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteClassification(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete classification by id
     *
     * Delete a classification and all the tags under it.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteClassificationTestQueryMap() {
        UUID id = null;
        ClassificationsApi.DeleteClassificationQueryParams queryParams = new ClassificationsApi.DeleteClassificationQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteClassification(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete classification by name
     *
     * Delete a classification by &#x60;name&#x60; and all the tags under it.
     */
    @Test
    void deleteClassificationByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.deleteClassificationByName(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete classification by name
     *
     * Delete a classification by &#x60;name&#x60; and all the tags under it.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteClassificationByNameTestQueryMap() {
        String name = null;
        ClassificationsApi.DeleteClassificationByNameQueryParams queryParams = new ClassificationsApi.DeleteClassificationByNameQueryParams()
            .hardDelete(null);
        // api.deleteClassificationByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a tag by id
     *
     * Delete a tag by &#x60;id&#x60;.
     */
    @Test
    void deleteTagTest() {
        UUID id = null;
        Boolean recursive = null;
        Boolean hardDelete = null;
        // api.deleteTag(id, recursive, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a tag by id
     *
     * Delete a tag by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteTagTestQueryMap() {
        UUID id = null;
        ClassificationsApi.DeleteTagQueryParams queryParams = new ClassificationsApi.DeleteTagQueryParams()
            .recursive(null)
            .hardDelete(null);
        // api.deleteTag(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a tag by fully qualified name
     *
     * Delete a tag by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void deleteTagByNameTest() {
        String fqn = null;
        Boolean hardDelete = null;
        // api.deleteTagByName(fqn, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a tag by fully qualified name
     *
     * Delete a tag by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteTagByNameTestQueryMap() {
        String fqn = null;
        ClassificationsApi.DeleteTagByNameQueryParams queryParams = new ClassificationsApi.DeleteTagByNameQueryParams()
            .hardDelete(null);
        // api.deleteTagByName(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a classification by id
     *
     * Get a classification by &#x60;id&#x60;
     */
    @Test
    void getClassificationByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Classification response = api.getClassificationByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a classification by id
     *
     * Get a classification by &#x60;id&#x60;
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getClassificationByIDTestQueryMap() {
        UUID id = null;
        ClassificationsApi.GetClassificationByIDQueryParams queryParams = new ClassificationsApi.GetClassificationByIDQueryParams()
            .fields(null)
            .include(null);
        // Classification response = api.getClassificationByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a classification by name
     *
     * Get a classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags.
     */
    @Test
    void getClassificationByNameTest() {
        String name = null;
        String fields = null;
        String include = null;
        // Classification response = api.getClassificationByName(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a classification by name
     *
     * Get a classification identified by name. The response includes classification information along with the entire hierarchy of all the children tags.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getClassificationByNameTestQueryMap() {
        String name = null;
        ClassificationsApi.GetClassificationByNameQueryParams queryParams = new ClassificationsApi.GetClassificationByNameQueryParams()
            .fields(null)
            .include(null);
        // Classification response = api.getClassificationByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the classification
     *
     * Get a version of the classification by given &#x60;id&#x60;
     */
    @Test
    void getSpecificClassificationVersionTest() {
        UUID id = null;
        String version = null;
        // Classification response = api.getSpecificClassificationVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a version of the tags
     *
     * Get a version of the tag by given &#x60;id&#x60;
     */
    @Test
    void getSpecificTagVersionTest() {
        UUID id = null;
        String version = null;
        // Tag response = api.getSpecificTagVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a tag by fully qualified name
     *
     * Get a tag by &#x60;fullyQualifiedName&#x60;.
     */
    @Test
    void getTagByFQNTest() {
        String fqn = null;
        String fields = null;
        String include = null;
        // Tag response = api.getTagByFQN(fqn, fields, include);

        // TODO: test validations
    }

    /**
     * Get a tag by fully qualified name
     *
     * Get a tag by &#x60;fullyQualifiedName&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getTagByFQNTestQueryMap() {
        String fqn = null;
        ClassificationsApi.GetTagByFQNQueryParams queryParams = new ClassificationsApi.GetTagByFQNQueryParams()
            .fields(null)
            .include(null);
        // Tag response = api.getTagByFQN(fqn, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a tag by id
     *
     * Get a tag by &#x60;id&#x60;.
     */
    @Test
    void getTagByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Tag response = api.getTagByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a tag by id
     *
     * Get a tag by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getTagByIDTestQueryMap() {
        UUID id = null;
        ClassificationsApi.GetTagByIDQueryParams queryParams = new ClassificationsApi.GetTagByIDQueryParams()
            .fields(null)
            .include(null);
        // Tag response = api.getTagByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * List classification versions
     *
     * Get a list of all the versions of a classification identified by &#x60;id&#x60;
     */
    @Test
    void listAllClassificationVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllClassificationVersion(id);

        // TODO: test validations
    }

    
    /**
     * List tag versions
     *
     * Get a list of all the versions of a tag identified by &#x60;id&#x60;
     */
    @Test
    void listAllTagVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllTagVersion(id);

        // TODO: test validations
    }

    
    /**
     * List classifications
     *
     * Get a list of classifications.
     */
    @Test
    void listClassificationsTest() {
        String fields = null;
        String disabled = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // ClassificationList response = api.listClassifications(fields, disabled, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List classifications
     *
     * Get a list of classifications.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listClassificationsTestQueryMap() {
        ClassificationsApi.ListClassificationsQueryParams queryParams = new ClassificationsApi.ListClassificationsQueryParams()
            .fields(null)
            .disabled(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // ClassificationList response = api.listClassifications(queryParams);

    // TODO: test validations
    }
    
    /**
     * List tags
     *
     * Get a list of tags. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listTagsTest() {
        String parent = null;
        String fields = null;
        String disabled = null;
        Integer limit = null;
        String before = null;
        String after = null;
        String include = null;
        // TagList response = api.listTags(parent, fields, disabled, limit, before, after, include);

        // TODO: test validations
    }

    /**
     * List tags
     *
     * Get a list of tags. Use &#x60;fields&#x60; parameter to get only necessary fields.  Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listTagsTestQueryMap() {
        ClassificationsApi.ListTagsQueryParams queryParams = new ClassificationsApi.ListTagsQueryParams()
            .parent(null)
            .fields(null)
            .disabled(null)
            .limit(null)
            .before(null)
            .after(null)
            .include(null);
        // TagList response = api.listTags(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a classification
     *
     * Update an existing classification using JsonPatch.
     */
    @Test
    void patchClassificationTest() {
        UUID id = null;
        Object body = null;
        // api.patchClassification(id, body);

        // TODO: test validations
    }

    
    /**
     * Update a tag
     *
     * Update an existing tag using JsonPatch.
     */
    @Test
    void patchTagTest() {
        UUID id = null;
        Object body = null;
        // api.patchTag(id, body);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted classification
     *
     * Restore a soft deleted classification.
     */
    @Test
    void restoreClassification3Test() {
        RestoreEntity restoreEntity = null;
        // Table response = api.restoreClassification3(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted tag.
     *
     * Restore a soft deleted tag.
     */
    @Test
    void restoreTagTest() {
        RestoreEntity restoreEntity = null;
        // Tag response = api.restoreTag(restoreEntity);

        // TODO: test validations
    }

    
}
