package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.BulkAssets;
import org.openmetadata.client.model.BulkOperationResult;
import org.openmetadata.client.model.ChangeEvent;
import org.openmetadata.client.model.CreateDataProduct;
import org.openmetadata.client.model.CreateDomain;
import org.openmetadata.client.model.CreatePerimeter;
import org.openmetadata.client.model.DataProduct;
import org.openmetadata.client.model.DataProductList;
import org.openmetadata.client.model.Domain;
import org.openmetadata.client.model.DomainList;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.Perimeter;
import org.openmetadata.client.model.PerimeterList;
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
 * API tests for DomainsApi
 */
class DomainsApiTest {

    private DomainsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(DomainsApi.class);
    }

    
    /**
     * Bulk Add Assets
     *
     * Bulk Add Assets
     */
    @Test
    void bulkAddAssetsTest() {
        String name = null;
        BulkAssets bulkAssets = null;
        // BulkOperationResult response = api.bulkAddAssets(name, bulkAssets);

        // TODO: test validations
    }

    
    /**
     * Bulk Add Assets
     *
     * Bulk Add Assets
     */
    @Test
    void bulkAddAssets1Test() {
        String name = null;
        BulkAssets bulkAssets = null;
        // BulkOperationResult response = api.bulkAddAssets1(name, bulkAssets);

        // TODO: test validations
    }

    
    /**
     * Bulk Remove Assets
     *
     * Bulk Remove Assets
     */
    @Test
    void bulkRemoveAssetsTest() {
        String name = null;
        BulkAssets bulkAssets = null;
        // ChangeEvent response = api.bulkRemoveAssets(name, bulkAssets);

        // TODO: test validations
    }

    
    /**
     * Bulk Remove Assets
     *
     * Bulk Remove Assets
     */
    @Test
    void bulkRemoveAssets1Test() {
        String name = null;
        BulkAssets bulkAssets = null;
        // ChangeEvent response = api.bulkRemoveAssets1(name, bulkAssets);

        // TODO: test validations
    }

    
    /**
     * Create a dataProduct
     *
     * Create a new dataProduct.
     */
    @Test
    void createDataProductTest() {
        CreateDataProduct createDataProduct = null;
        // DataProduct response = api.createDataProduct(createDataProduct);

        // TODO: test validations
    }

    
    /**
     * Create a domain
     *
     * Create a new domain.
     */
    @Test
    void createDomainTest() {
        CreateDomain createDomain = null;
        // Domain response = api.createDomain(createDomain);

        // TODO: test validations
    }

    
    /**
     * Create or update a dataProduct
     *
     * Create a dataProduct. if it does not exist. If a dataProduct already exists, update the dataProduct.
     */
    @Test
    void createOrUpdateDataProductTest() {
        CreateDataProduct createDataProduct = null;
        // DataProduct response = api.createOrUpdateDataProduct(createDataProduct);

        // TODO: test validations
    }

    
    /**
     * Create or update a domain
     *
     * Create a domain. if it does not exist. If a domain already exists, update the domain.
     */
    @Test
    void createOrUpdateDomainTest() {
        CreateDomain createDomain = null;
        // Domain response = api.createOrUpdateDomain(createDomain);

        // TODO: test validations
    }

    
    /**
     * Create or update a perimeter
     *
     * Create a perimeter. if it does not exist. If a perimeter already exists, update the perimeter.
     */
    @Test
    void createOrUpdatePerimeterTest() {
        CreatePerimeter createPerimeter = null;
        // Perimeter response = api.createOrUpdatePerimeter(createPerimeter);

        // TODO: test validations
    }

    
    /**
     * Create a perimeter
     *
     * Create a new perimeter.
     */
    @Test
    void createPerimeterTest() {
        CreatePerimeter createPerimeter = null;
        // Perimeter response = api.createPerimeter(createPerimeter);

        // TODO: test validations
    }

    
    /**
     * Delete a dataProduct by Id
     *
     * Delete a dataProduct by &#x60;Id&#x60;.
     */
    @Test
    void deleteDataProductTest() {
        UUID id = null;
        // api.deleteDataProduct(id);

        // TODO: test validations
    }

    
    /**
     * Delete a dataProduct by name
     *
     * Delete a dataProduct by &#x60;name&#x60;.
     */
    @Test
    void deleteDataProductByFQNTest() {
        String name = null;
        // api.deleteDataProductByFQN(name);

        // TODO: test validations
    }

    
    /**
     * Delete a domain by Id
     *
     * Delete a domain by &#x60;Id&#x60;.
     */
    @Test
    void deleteDomainTest() {
        UUID id = null;
        // api.deleteDomain(id);

        // TODO: test validations
    }

    
    /**
     * Delete a domain by name
     *
     * Delete a domain by &#x60;name&#x60;.
     */
    @Test
    void deleteDomainByFQNTest() {
        String name = null;
        // api.deleteDomainByFQN(name);

        // TODO: test validations
    }

    
    /**
     * Delete a perimeter by Id
     *
     * Delete a perimeter by &#x60;Id&#x60;.
     */
    @Test
    void deletePerimeterTest() {
        UUID id = null;
        // api.deletePerimeter(id);

        // TODO: test validations
    }

    
    /**
     * Delete a perimeter by name
     *
     * Delete a perimeter by &#x60;name&#x60;.
     */
    @Test
    void deletePerimeterByFQNTest() {
        String name = null;
        // api.deletePerimeterByFQN(name);

        // TODO: test validations
    }

    
    /**
     * Get a dataProduct by name
     *
     * Get a dataProduct by &#x60;name&#x60;.
     */
    @Test
    void getDataProductByFQNTest() {
        String name = null;
        String fields = null;
        // DataProduct response = api.getDataProductByFQN(name, fields);

        // TODO: test validations
    }

    /**
     * Get a dataProduct by name
     *
     * Get a dataProduct by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDataProductByFQNTestQueryMap() {
        String name = null;
        DomainsApi.GetDataProductByFQNQueryParams queryParams = new DomainsApi.GetDataProductByFQNQueryParams()
            .fields(null);
        // DataProduct response = api.getDataProductByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a dataProduct by Id
     *
     * Get a dataProduct by &#x60;Id&#x60;.
     */
    @Test
    void getDataProductByIDTest() {
        UUID id = null;
        String fields = null;
        // DataProduct response = api.getDataProductByID(id, fields);

        // TODO: test validations
    }

    /**
     * Get a dataProduct by Id
     *
     * Get a dataProduct by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDataProductByIDTestQueryMap() {
        UUID id = null;
        DomainsApi.GetDataProductByIDQueryParams queryParams = new DomainsApi.GetDataProductByIDQueryParams()
            .fields(null);
        // DataProduct response = api.getDataProductByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a domain by name
     *
     * Get a domain by &#x60;name&#x60;.
     */
    @Test
    void getDomainByFQNTest() {
        String name = null;
        String fields = null;
        // Domain response = api.getDomainByFQN(name, fields);

        // TODO: test validations
    }

    /**
     * Get a domain by name
     *
     * Get a domain by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDomainByFQNTestQueryMap() {
        String name = null;
        DomainsApi.GetDomainByFQNQueryParams queryParams = new DomainsApi.GetDomainByFQNQueryParams()
            .fields(null);
        // Domain response = api.getDomainByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a domain by Id
     *
     * Get a domain by &#x60;Id&#x60;.
     */
    @Test
    void getDomainByIDTest() {
        UUID id = null;
        String fields = null;
        // Domain response = api.getDomainByID(id, fields);

        // TODO: test validations
    }

    /**
     * Get a domain by Id
     *
     * Get a domain by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getDomainByIDTestQueryMap() {
        UUID id = null;
        DomainsApi.GetDomainByIDQueryParams queryParams = new DomainsApi.GetDomainByIDQueryParams()
            .fields(null);
        // Domain response = api.getDomainByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a perimeter by name
     *
     * Get a perimeter by &#x60;name&#x60;.
     */
    @Test
    void getPerimeterByFQNTest() {
        String name = null;
        String fields = null;
        // Perimeter response = api.getPerimeterByFQN(name, fields);

        // TODO: test validations
    }

    /**
     * Get a perimeter by name
     *
     * Get a perimeter by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getPerimeterByFQNTestQueryMap() {
        String name = null;
        DomainsApi.GetPerimeterByFQNQueryParams queryParams = new DomainsApi.GetPerimeterByFQNQueryParams()
            .fields(null);
        // Perimeter response = api.getPerimeterByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a perimeter by Id
     *
     * Get a perimeter by &#x60;Id&#x60;.
     */
    @Test
    void getPerimeterByIDTest() {
        UUID id = null;
        String fields = null;
        // Perimeter response = api.getPerimeterByID(id, fields);

        // TODO: test validations
    }

    /**
     * Get a perimeter by Id
     *
     * Get a perimeter by &#x60;Id&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getPerimeterByIDTestQueryMap() {
        UUID id = null;
        DomainsApi.GetPerimeterByIDQueryParams queryParams = new DomainsApi.GetPerimeterByIDQueryParams()
            .fields(null);
        // Perimeter response = api.getPerimeterByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * List dataProduct versions
     *
     * Get a list of all the versions of a dataProduct identified by &#x60;Id&#x60;
     */
    @Test
    void listAllDataProductVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllDataProductVersion(id);

        // TODO: test validations
    }

    
    /**
     * List domain versions
     *
     * Get a list of all the versions of a domain identified by &#x60;Id&#x60;
     */
    @Test
    void listAllDomainVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllDomainVersion(id);

        // TODO: test validations
    }

    
    /**
     * List perimeter versions
     *
     * Get a list of all the versions of a perimeter identified by &#x60;Id&#x60;
     */
    @Test
    void listAllPerimeterVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllPerimeterVersion(id);

        // TODO: test validations
    }

    
    /**
     * List dataProducts
     *
     * Get a list of DataProducts.
     */
    @Test
    void listDataProductsTest() {
        String fields = null;
        String domain = null;
        Integer limit = null;
        String before = null;
        String after = null;
        // DataProductList response = api.listDataProducts(fields, domain, limit, before, after);

        // TODO: test validations
    }

    /**
     * List dataProducts
     *
     * Get a list of DataProducts.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listDataProductsTestQueryMap() {
        DomainsApi.ListDataProductsQueryParams queryParams = new DomainsApi.ListDataProductsQueryParams()
            .fields(null)
            .domain(null)
            .limit(null)
            .before(null)
            .after(null);
        // DataProductList response = api.listDataProducts(queryParams);

    // TODO: test validations
    }
    
    /**
     * List domains
     *
     * Get a list of Domains.
     */
    @Test
    void listDomainsTest() {
        String fields = null;
        Integer limit = null;
        String before = null;
        String after = null;
        // DomainList response = api.listDomains(fields, limit, before, after);

        // TODO: test validations
    }

    /**
     * List domains
     *
     * Get a list of Domains.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listDomainsTestQueryMap() {
        DomainsApi.ListDomainsQueryParams queryParams = new DomainsApi.ListDomainsQueryParams()
            .fields(null)
            .limit(null)
            .before(null)
            .after(null);
        // DomainList response = api.listDomains(queryParams);

    // TODO: test validations
    }
    
    /**
     * List perimeters
     *
     * Get a list of Perimeters.
     */
    @Test
    void listPerimetersTest() {
        String fields = null;
        String domain = null;
        Integer limit = null;
        String before = null;
        String after = null;
        // PerimeterList response = api.listPerimeters(fields, domain, limit, before, after);

        // TODO: test validations
    }

    /**
     * List perimeters
     *
     * Get a list of Perimeters.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listPerimetersTestQueryMap() {
        DomainsApi.ListPerimetersQueryParams queryParams = new DomainsApi.ListPerimetersQueryParams()
            .fields(null)
            .domain(null)
            .limit(null)
            .before(null)
            .after(null);
        // PerimeterList response = api.listPerimeters(queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the dataProduct
     *
     * Get a version of the dataProduct by given &#x60;Id&#x60;
     */
    @Test
    void listSpecificDataProductVersionTest() {
        UUID id = null;
        String version = null;
        // DataProduct response = api.listSpecificDataProductVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a version of the domain
     *
     * Get a version of the domain by given &#x60;Id&#x60;
     */
    @Test
    void listSpecificDomainVersionTest() {
        UUID id = null;
        String version = null;
        // Domain response = api.listSpecificDomainVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a version of the perimeter
     *
     * Get a version of the perimeter by given &#x60;Id&#x60;
     */
    @Test
    void listSpecificPerimeterVersionTest() {
        UUID id = null;
        String version = null;
        // Perimeter response = api.listSpecificPerimeterVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Update a dataProduct
     *
     * Update an existing dataProduct using JsonPatch.
     */
    @Test
    void patchDataProductTest() {
        UUID id = null;
        Object body = null;
        // api.patchDataProduct(id, body);

        // TODO: test validations
    }

    
    /**
     * Update a domain
     *
     * Update an existing domain using JsonPatch.
     */
    @Test
    void patchDomainTest() {
        UUID id = null;
        Object body = null;
        // api.patchDomain(id, body);

        // TODO: test validations
    }

    
    /**
     * Update a perimeter
     *
     * Update an existing perimeter using JsonPatch.
     */
    @Test
    void patchPerimeterTest() {
        UUID id = null;
        Object body = null;
        // api.patchPerimeter(id, body);

        // TODO: test validations
    }

    
}
