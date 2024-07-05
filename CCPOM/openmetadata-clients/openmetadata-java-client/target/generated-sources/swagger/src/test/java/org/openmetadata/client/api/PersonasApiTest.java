package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.CreatePersona;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.Persona;
import org.openmetadata.client.model.PersonaList;
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
 * API tests for PersonasApi
 */
class PersonasApiTest {

    private PersonasApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PersonasApi.class);
    }

    
    /**
     * Update Persona
     *
     * Create or Update a Persona.
     */
    @Test
    void createOrUpdatePersonaTest() {
        CreatePersona createPersona = null;
        // Persona response = api.createOrUpdatePersona(createPersona);

        // TODO: test validations
    }

    
    /**
     * Create a Persona
     *
     * Create a new Persona.
     */
    @Test
    void createPersonaTest() {
        CreatePersona createPersona = null;
        // Persona response = api.createPersona(createPersona);

        // TODO: test validations
    }

    
    /**
     * Delete a Persona by id
     *
     * Delete a Persona by given &#x60;id&#x60;.
     */
    @Test
    void deletePersonaTest() {
        UUID id = null;
        // api.deletePersona(id);

        // TODO: test validations
    }

    
    /**
     * Delete a Persona by name
     *
     * Delete a Persona by given &#x60;name&#x60;.
     */
    @Test
    void deletePersonaByNameTest() {
        String name = null;
        // api.deletePersonaByName(name);

        // TODO: test validations
    }

    
    /**
     * Get a Persona by name
     *
     * Get a Persona by &#x60;name&#x60;.
     */
    @Test
    void getPersonaByFQNTest() {
        String name = null;
        String fields = null;
        String include = null;
        // Persona response = api.getPersonaByFQN(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a Persona by name
     *
     * Get a Persona by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getPersonaByFQNTestQueryMap() {
        String name = null;
        PersonasApi.GetPersonaByFQNQueryParams queryParams = new PersonasApi.GetPersonaByFQNQueryParams()
            .fields(null)
            .include(null);
        // Persona response = api.getPersonaByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a persona by id
     *
     * Get a persona by &#x60;id&#x60;.
     */
    @Test
    void getPersonaByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // Persona response = api.getPersonaByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a persona by id
     *
     * Get a persona by &#x60;id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getPersonaByIDTestQueryMap() {
        UUID id = null;
        PersonasApi.GetPersonaByIDQueryParams queryParams = new PersonasApi.GetPersonaByIDQueryParams()
            .fields(null)
            .include(null);
        // Persona response = api.getPersonaByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the Persona
     *
     * Get a version of the Persona by given &#x60;id&#x60;
     */
    @Test
    void getSpecificPersonaVersionTest() {
        UUID id = null;
        String version = null;
        // Persona response = api.getSpecificPersonaVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * List Persona versions
     *
     * Get a list of all the versions of a persona identified by &#x60;id&#x60;
     */
    @Test
    void listAllPersonaVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllPersonaVersion(id);

        // TODO: test validations
    }

    
    /**
     * List personas
     *
     * Get a list of personas. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listPersonasTest() {
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        // PersonaList response = api.listPersonas(fields, limit, before, after);

        // TODO: test validations
    }

    /**
     * List personas
     *
     * Get a list of personas. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listPersonasTestQueryMap() {
        PersonasApi.ListPersonasQueryParams queryParams = new PersonasApi.ListPersonasQueryParams()
            .fields(null)
            .limit(null)
            .before(null)
            .after(null);
        // PersonaList response = api.listPersonas(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a Persona
     *
     * Update an existing persona with JsonPatch.
     */
    @Test
    void patchPersonaTest() {
        UUID id = null;
        Object body = null;
        // api.patchPersona(id, body);

        // TODO: test validations
    }

    
}
