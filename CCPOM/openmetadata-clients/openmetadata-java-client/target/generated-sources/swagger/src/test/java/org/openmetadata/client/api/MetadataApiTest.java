package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreateType;
import org.openmetadata.client.model.CustomProperty;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.Type;
import org.openmetadata.client.model.TypeList;
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
 * API tests for MetadataApi
 */
class MetadataApiTest {

    private MetadataApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(MetadataApi.class);
    }

    
    /**
     * Add or update a Property to an entity
     *
     * Add or update a property to an entity type. Properties can only be added to entity type and not property type.
     */
    @Test
    void addPropertyTest() {
        UUID id = null;
        CustomProperty customProperty = null;
        // api.addProperty(id, customProperty);

        // TODO: test validations
    }

    
    /**
     * Create or update a type
     *
     * Create a new type, if it does not exist or update an existing type.
     */
    @Test
    void createOrUpdateTest() {
        CreateType createType = null;
        // Type response = api.createOrUpdate(createType);

        // TODO: test validations
    }

    
    /**
     * Create a type
     *
     * Create a new type.
     */
    @Test
    void createTypeTest() {
        CreateType createType = null;
        // Type response = api.createType(createType);

        // TODO: test validations
    }

    
    /**
     * Delete a type by id
     *
     * Delete a type by &#x60;id&#x60;.
     */
    @Test
    void deleteTypeTest() {
        UUID id = null;
        // api.deleteType(id);

        // TODO: test validations
    }

    
    /**
     * Delete a type by name
     *
     * Delete a type by &#x60;name&#x60;.
     */
    @Test
    void deleteTypeByNameTest() {
        String name = null;
        // api.deleteTypeByName(name);

        // TODO: test validations
    }

    
    /**
     * Get a version of the types
     *
     * Get a version of the type by given &#x60;id&#x60;
     */
    @Test
    void getSpecificTypeVersionTest() {
        UUID id = null;
        String version = null;
        // Type response = api.getSpecificTypeVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a type
     *
     * Get a type by &#x60;id&#x60;.
     */
    @Test
    void getTypeByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Type response = api.getTypeByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a type
     *
     * Get a type by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getTypeByIDTestQueryMap() {
        UUID id = null;
        MetadataApi.GetTypeByIDQueryParams queryParams = new MetadataApi.GetTypeByIDQueryParams()
            .fields(null)
            .include(null);
        // Type response = api.getTypeByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a type by name
     *
     * Get a type by name.
     */
    @Test
    void getTypeByNameTest() {
        String name = null;
        String fields = null;
        String include = null;
        // Type response = api.getTypeByName(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a type by name
     *
     * Get a type by name.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getTypeByNameTestQueryMap() {
        String name = null;
        MetadataApi.GetTypeByNameQueryParams queryParams = new MetadataApi.GetTypeByNameQueryParams()
            .fields(null)
            .include(null);
        // Type response = api.getTypeByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * List type versions
     *
     * Get a list of all the versions of a type identified by &#x60;id&#x60;
     */
    @Test
    void listAllTypeVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllTypeVersion(id);

        // TODO: test validations
    }

    
    /**
     * List types
     *
     * Get a list of types. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listTypesTest() {
        String category = null;
        Integer limit = null;
        String before = null;
        String after = null;
        // TypeList response = api.listTypes(category, limit, before, after);

        // TODO: test validations
    }

    /**
     * List types
     *
     * Get a list of types. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listTypesTestQueryMap() {
        MetadataApi.ListTypesQueryParams queryParams = new MetadataApi.ListTypesQueryParams()
            .category(null)
            .limit(null)
            .before(null)
            .after(null);
        // TypeList response = api.listTypes(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a type
     *
     * Update an existing type using JsonPatch.
     */
    @Test
    void patchTypeTest() {
        UUID id = null;
        Object body = null;
        // api.patchType(id, body);

        // TODO: test validations
    }

    
}
