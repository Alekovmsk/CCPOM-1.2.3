package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.OpenMetadataServerVersion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SystemApi
 */
class SystemApiTest {

    private SystemApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(SystemApi.class);
    }

    
    /**
     * Get version of metadata service
     *
     * Get the build version of OpenMetadata service and build timestamp.
     */
    @Test
    void getCatalogVersionTest() {
        // OpenMetadataServerVersion response = api.getCatalogVersion();

        // TODO: test validations
    }

    
}
