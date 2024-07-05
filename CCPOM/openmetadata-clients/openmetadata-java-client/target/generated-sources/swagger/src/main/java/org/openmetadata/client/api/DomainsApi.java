package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface DomainsApi extends ApiClient.Api {


  /**
   * Bulk Add Assets
   * Bulk Add Assets
   * @param name Name of the Data product (required)
   * @param bulkAssets  (optional)
   * @return BulkOperationResult
   */
  @RequestLine("PUT /v1/dataProducts/{name}/assets/add")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BulkOperationResult bulkAddAssets(@Param("name") String name, BulkAssets bulkAssets);

  /**
   * Bulk Add Assets
   * Similar to <code>bulkAddAssets</code> but it also returns the http response headers .
   * Bulk Add Assets
   * @param name Name of the Data product (required)
   * @param bulkAssets  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dataProducts/{name}/assets/add")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BulkOperationResult> bulkAddAssetsWithHttpInfo(@Param("name") String name, BulkAssets bulkAssets);



  /**
   * Bulk Add Assets
   * Bulk Add Assets
   * @param name Name of the domain (required)
   * @param bulkAssets  (optional)
   * @return BulkOperationResult
   */
  @RequestLine("PUT /v1/domains/{name}/assets/add")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BulkOperationResult bulkAddAssets1(@Param("name") String name, BulkAssets bulkAssets);

  /**
   * Bulk Add Assets
   * Similar to <code>bulkAddAssets1</code> but it also returns the http response headers .
   * Bulk Add Assets
   * @param name Name of the domain (required)
   * @param bulkAssets  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/domains/{name}/assets/add")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BulkOperationResult> bulkAddAssets1WithHttpInfo(@Param("name") String name, BulkAssets bulkAssets);



  /**
   * Bulk Remove Assets
   * Bulk Remove Assets
   * @param name Name of the Data Product (required)
   * @param bulkAssets  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/dataProducts/{name}/assets/remove")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent bulkRemoveAssets(@Param("name") String name, BulkAssets bulkAssets);

  /**
   * Bulk Remove Assets
   * Similar to <code>bulkRemoveAssets</code> but it also returns the http response headers .
   * Bulk Remove Assets
   * @param name Name of the Data Product (required)
   * @param bulkAssets  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dataProducts/{name}/assets/remove")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> bulkRemoveAssetsWithHttpInfo(@Param("name") String name, BulkAssets bulkAssets);



  /**
   * Bulk Remove Assets
   * Bulk Remove Assets
   * @param name Name of the domain (required)
   * @param bulkAssets  (optional)
   * @return ChangeEvent
   */
  @RequestLine("PUT /v1/domains/{name}/assets/remove")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeEvent bulkRemoveAssets1(@Param("name") String name, BulkAssets bulkAssets);

  /**
   * Bulk Remove Assets
   * Similar to <code>bulkRemoveAssets1</code> but it also returns the http response headers .
   * Bulk Remove Assets
   * @param name Name of the domain (required)
   * @param bulkAssets  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/domains/{name}/assets/remove")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeEvent> bulkRemoveAssets1WithHttpInfo(@Param("name") String name, BulkAssets bulkAssets);



  /**
   * Create a dataProduct
   * Create a new dataProduct.
   * @param createDataProduct  (optional)
   * @return DataProduct
   */
  @RequestLine("POST /v1/dataProducts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataProduct createDataProduct(CreateDataProduct createDataProduct);

  /**
   * Create a dataProduct
   * Similar to <code>createDataProduct</code> but it also returns the http response headers .
   * Create a new dataProduct.
   * @param createDataProduct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/dataProducts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataProduct> createDataProductWithHttpInfo(CreateDataProduct createDataProduct);



  /**
   * Create a domain
   * Create a new domain.
   * @param createDomain  (optional)
   * @return Domain
   */
  @RequestLine("POST /v1/domains")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Domain createDomain(CreateDomain createDomain);

  /**
   * Create a domain
   * Similar to <code>createDomain</code> but it also returns the http response headers .
   * Create a new domain.
   * @param createDomain  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/domains")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Domain> createDomainWithHttpInfo(CreateDomain createDomain);



  /**
   * Create or update a dataProduct
   * Create a dataProduct. if it does not exist. If a dataProduct already exists, update the dataProduct.
   * @param createDataProduct  (optional)
   * @return DataProduct
   */
  @RequestLine("PUT /v1/dataProducts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataProduct createOrUpdateDataProduct(CreateDataProduct createDataProduct);

  /**
   * Create or update a dataProduct
   * Similar to <code>createOrUpdateDataProduct</code> but it also returns the http response headers .
   * Create a dataProduct. if it does not exist. If a dataProduct already exists, update the dataProduct.
   * @param createDataProduct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/dataProducts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataProduct> createOrUpdateDataProductWithHttpInfo(CreateDataProduct createDataProduct);



  /**
   * Create or update a domain
   * Create a domain. if it does not exist. If a domain already exists, update the domain.
   * @param createDomain  (optional)
   * @return Domain
   */
  @RequestLine("PUT /v1/domains")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Domain createOrUpdateDomain(CreateDomain createDomain);

  /**
   * Create or update a domain
   * Similar to <code>createOrUpdateDomain</code> but it also returns the http response headers .
   * Create a domain. if it does not exist. If a domain already exists, update the domain.
   * @param createDomain  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/domains")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Domain> createOrUpdateDomainWithHttpInfo(CreateDomain createDomain);



  /**
   * Create or update a perimeter
   * Create a perimeter. if it does not exist. If a perimeter already exists, update the perimeter.
   * @param createPerimeter  (optional)
   * @return Perimeter
   */
  @RequestLine("PUT /v1/perimeters")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Perimeter createOrUpdatePerimeter(CreatePerimeter createPerimeter);

  /**
   * Create or update a perimeter
   * Similar to <code>createOrUpdatePerimeter</code> but it also returns the http response headers .
   * Create a perimeter. if it does not exist. If a perimeter already exists, update the perimeter.
   * @param createPerimeter  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/perimeters")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Perimeter> createOrUpdatePerimeterWithHttpInfo(CreatePerimeter createPerimeter);



  /**
   * Create a perimeter
   * Create a new perimeter.
   * @param createPerimeter  (optional)
   * @return Perimeter
   */
  @RequestLine("POST /v1/perimeters")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Perimeter createPerimeter(CreatePerimeter createPerimeter);

  /**
   * Create a perimeter
   * Similar to <code>createPerimeter</code> but it also returns the http response headers .
   * Create a new perimeter.
   * @param createPerimeter  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/perimeters")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Perimeter> createPerimeterWithHttpInfo(CreatePerimeter createPerimeter);



  /**
   * Delete a dataProduct by Id
   * Delete a dataProduct by &#x60;Id&#x60;.
   * @param id Id of the dataProduct (required)
   */
  @RequestLine("DELETE /v1/dataProducts/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDataProduct(@Param("id") UUID id);

  /**
   * Delete a dataProduct by Id
   * Similar to <code>deleteDataProduct</code> but it also returns the http response headers .
   * Delete a dataProduct by &#x60;Id&#x60;.
   * @param id Id of the dataProduct (required)
   */
  @RequestLine("DELETE /v1/dataProducts/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDataProductWithHttpInfo(@Param("id") UUID id);



  /**
   * Delete a dataProduct by name
   * Delete a dataProduct by &#x60;name&#x60;.
   * @param name Name of the dataProduct (required)
   */
  @RequestLine("DELETE /v1/dataProducts/name/{name}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDataProductByFQN(@Param("name") String name);

  /**
   * Delete a dataProduct by name
   * Similar to <code>deleteDataProductByFQN</code> but it also returns the http response headers .
   * Delete a dataProduct by &#x60;name&#x60;.
   * @param name Name of the dataProduct (required)
   */
  @RequestLine("DELETE /v1/dataProducts/name/{name}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDataProductByFQNWithHttpInfo(@Param("name") String name);



  /**
   * Delete a domain by Id
   * Delete a domain by &#x60;Id&#x60;.
   * @param id Id of the domain (required)
   */
  @RequestLine("DELETE /v1/domains/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDomain(@Param("id") UUID id);

  /**
   * Delete a domain by Id
   * Similar to <code>deleteDomain</code> but it also returns the http response headers .
   * Delete a domain by &#x60;Id&#x60;.
   * @param id Id of the domain (required)
   */
  @RequestLine("DELETE /v1/domains/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDomainWithHttpInfo(@Param("id") UUID id);



  /**
   * Delete a domain by name
   * Delete a domain by &#x60;name&#x60;.
   * @param name Name of the domain (required)
   */
  @RequestLine("DELETE /v1/domains/name/{name}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDomainByFQN(@Param("name") String name);

  /**
   * Delete a domain by name
   * Similar to <code>deleteDomainByFQN</code> but it also returns the http response headers .
   * Delete a domain by &#x60;name&#x60;.
   * @param name Name of the domain (required)
   */
  @RequestLine("DELETE /v1/domains/name/{name}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteDomainByFQNWithHttpInfo(@Param("name") String name);



  /**
   * Delete a perimeter by Id
   * Delete a perimeter by &#x60;Id&#x60;.
   * @param id Id of the perimeter (required)
   */
  @RequestLine("DELETE /v1/perimeters/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deletePerimeter(@Param("id") UUID id);

  /**
   * Delete a perimeter by Id
   * Similar to <code>deletePerimeter</code> but it also returns the http response headers .
   * Delete a perimeter by &#x60;Id&#x60;.
   * @param id Id of the perimeter (required)
   */
  @RequestLine("DELETE /v1/perimeters/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deletePerimeterWithHttpInfo(@Param("id") UUID id);



  /**
   * Delete a perimeter by name
   * Delete a perimeter by &#x60;name&#x60;.
   * @param name Name of the perimeter (required)
   */
  @RequestLine("DELETE /v1/perimeters/name/{name}")
  @Headers({
    "Accept: application/json",
  })
  void deletePerimeterByFQN(@Param("name") String name);

  /**
   * Delete a perimeter by name
   * Similar to <code>deletePerimeterByFQN</code> but it also returns the http response headers .
   * Delete a perimeter by &#x60;name&#x60;.
   * @param name Name of the perimeter (required)
   */
  @RequestLine("DELETE /v1/perimeters/name/{name}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deletePerimeterByFQNWithHttpInfo(@Param("name") String name);



  /**
   * Get a dataProduct by name
   * Get a dataProduct by &#x60;name&#x60;.
   * @param name Name of the dataProduct (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return DataProduct
   */
  @RequestLine("GET /v1/dataProducts/name/{name}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  DataProduct getDataProductByFQN(@Param("name") String name, @Param("fields") String fields);

  /**
   * Get a dataProduct by name
   * Similar to <code>getDataProductByFQN</code> but it also returns the http response headers .
   * Get a dataProduct by &#x60;name&#x60;.
   * @param name Name of the dataProduct (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataProducts/name/{name}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DataProduct> getDataProductByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields);


  /**
   * Get a dataProduct by name
   * Get a dataProduct by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getDataProductByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDataProductByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the dataProduct (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   </ul>
   * @return DataProduct
   */
  @RequestLine("GET /v1/dataProducts/name/{name}?fields={fields}")
  @Headers({
  "Accept: application/json",
  })
  DataProduct getDataProductByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a dataProduct by name
  * Get a dataProduct by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getDataProductByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the dataProduct (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
      *   </ul>
          * @return DataProduct
      */
      @RequestLine("GET /v1/dataProducts/name/{name}?fields={fields}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DataProduct> getDataProductByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDataProductByFQN</code> method in a fluent style.
   */
  public static class GetDataProductByFQNQueryParams extends HashMap<String, Object> {
    public GetDataProductByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a dataProduct by Id
   * Get a dataProduct by &#x60;Id&#x60;.
   * @param id Id of the dataProduct (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return DataProduct
   */
  @RequestLine("GET /v1/dataProducts/{id}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  DataProduct getDataProductByID(@Param("id") UUID id, @Param("fields") String fields);

  /**
   * Get a dataProduct by Id
   * Similar to <code>getDataProductByID</code> but it also returns the http response headers .
   * Get a dataProduct by &#x60;Id&#x60;.
   * @param id Id of the dataProduct (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataProducts/{id}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DataProduct> getDataProductByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields);


  /**
   * Get a dataProduct by Id
   * Get a dataProduct by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getDataProductByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDataProductByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the dataProduct (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   </ul>
   * @return DataProduct
   */
  @RequestLine("GET /v1/dataProducts/{id}?fields={fields}")
  @Headers({
  "Accept: application/json",
  })
  DataProduct getDataProductByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a dataProduct by Id
  * Get a dataProduct by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getDataProductByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the dataProduct (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
      *   </ul>
          * @return DataProduct
      */
      @RequestLine("GET /v1/dataProducts/{id}?fields={fields}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DataProduct> getDataProductByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDataProductByID</code> method in a fluent style.
   */
  public static class GetDataProductByIDQueryParams extends HashMap<String, Object> {
    public GetDataProductByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a domain by name
   * Get a domain by &#x60;name&#x60;.
   * @param name Name of the domain (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return Domain
   */
  @RequestLine("GET /v1/domains/name/{name}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  Domain getDomainByFQN(@Param("name") String name, @Param("fields") String fields);

  /**
   * Get a domain by name
   * Similar to <code>getDomainByFQN</code> but it also returns the http response headers .
   * Get a domain by &#x60;name&#x60;.
   * @param name Name of the domain (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/domains/name/{name}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Domain> getDomainByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields);


  /**
   * Get a domain by name
   * Get a domain by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getDomainByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDomainByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the domain (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   </ul>
   * @return Domain
   */
  @RequestLine("GET /v1/domains/name/{name}?fields={fields}")
  @Headers({
  "Accept: application/json",
  })
  Domain getDomainByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a domain by name
  * Get a domain by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getDomainByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the domain (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
      *   </ul>
          * @return Domain
      */
      @RequestLine("GET /v1/domains/name/{name}?fields={fields}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Domain> getDomainByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDomainByFQN</code> method in a fluent style.
   */
  public static class GetDomainByFQNQueryParams extends HashMap<String, Object> {
    public GetDomainByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a domain by Id
   * Get a domain by &#x60;Id&#x60;.
   * @param id Id of the domain (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return Domain
   */
  @RequestLine("GET /v1/domains/{id}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  Domain getDomainByID(@Param("id") UUID id, @Param("fields") String fields);

  /**
   * Get a domain by Id
   * Similar to <code>getDomainByID</code> but it also returns the http response headers .
   * Get a domain by &#x60;Id&#x60;.
   * @param id Id of the domain (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/domains/{id}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Domain> getDomainByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields);


  /**
   * Get a domain by Id
   * Get a domain by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getDomainByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDomainByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the domain (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   </ul>
   * @return Domain
   */
  @RequestLine("GET /v1/domains/{id}?fields={fields}")
  @Headers({
  "Accept: application/json",
  })
  Domain getDomainByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a domain by Id
  * Get a domain by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getDomainByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the domain (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
      *   </ul>
          * @return Domain
      */
      @RequestLine("GET /v1/domains/{id}?fields={fields}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Domain> getDomainByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getDomainByID</code> method in a fluent style.
   */
  public static class GetDomainByIDQueryParams extends HashMap<String, Object> {
    public GetDomainByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a perimeter by name
   * Get a perimeter by &#x60;name&#x60;.
   * @param name Name of the perimeter (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return Perimeter
   */
  @RequestLine("GET /v1/perimeters/name/{name}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  Perimeter getPerimeterByFQN(@Param("name") String name, @Param("fields") String fields);

  /**
   * Get a perimeter by name
   * Similar to <code>getPerimeterByFQN</code> but it also returns the http response headers .
   * Get a perimeter by &#x60;name&#x60;.
   * @param name Name of the perimeter (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/perimeters/name/{name}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Perimeter> getPerimeterByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields);


  /**
   * Get a perimeter by name
   * Get a perimeter by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getPerimeterByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPerimeterByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the perimeter (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   </ul>
   * @return Perimeter
   */
  @RequestLine("GET /v1/perimeters/name/{name}?fields={fields}")
  @Headers({
  "Accept: application/json",
  })
  Perimeter getPerimeterByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a perimeter by name
  * Get a perimeter by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getPerimeterByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the perimeter (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
      *   </ul>
          * @return Perimeter
      */
      @RequestLine("GET /v1/perimeters/name/{name}?fields={fields}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Perimeter> getPerimeterByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPerimeterByFQN</code> method in a fluent style.
   */
  public static class GetPerimeterByFQNQueryParams extends HashMap<String, Object> {
    public GetPerimeterByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a perimeter by Id
   * Get a perimeter by &#x60;Id&#x60;.
   * @param id Id of the perimeter (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return Perimeter
   */
  @RequestLine("GET /v1/perimeters/{id}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  Perimeter getPerimeterByID(@Param("id") UUID id, @Param("fields") String fields);

  /**
   * Get a perimeter by Id
   * Similar to <code>getPerimeterByID</code> but it also returns the http response headers .
   * Get a perimeter by &#x60;Id&#x60;.
   * @param id Id of the perimeter (required)
   * @param fields Fields requested in the returned resource (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/perimeters/{id}?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Perimeter> getPerimeterByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields);


  /**
   * Get a perimeter by Id
   * Get a perimeter by &#x60;Id&#x60;.
   * Note, this is equivalent to the other <code>getPerimeterByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPerimeterByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the perimeter (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   </ul>
   * @return Perimeter
   */
  @RequestLine("GET /v1/perimeters/{id}?fields={fields}")
  @Headers({
  "Accept: application/json",
  })
  Perimeter getPerimeterByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a perimeter by Id
  * Get a perimeter by &#x60;Id&#x60;.
  * Note, this is equivalent to the other <code>getPerimeterByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the perimeter (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
      *   </ul>
          * @return Perimeter
      */
      @RequestLine("GET /v1/perimeters/{id}?fields={fields}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Perimeter> getPerimeterByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPerimeterByID</code> method in a fluent style.
   */
  public static class GetPerimeterByIDQueryParams extends HashMap<String, Object> {
    public GetPerimeterByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List dataProduct versions
   * Get a list of all the versions of a dataProduct identified by &#x60;Id&#x60;
   * @param id Id of the dataProduct (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/dataProducts/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllDataProductVersion(@Param("id") UUID id);

  /**
   * List dataProduct versions
   * Similar to <code>listAllDataProductVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a dataProduct identified by &#x60;Id&#x60;
   * @param id Id of the dataProduct (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataProducts/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllDataProductVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List domain versions
   * Get a list of all the versions of a domain identified by &#x60;Id&#x60;
   * @param id Id of the domain (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/domains/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllDomainVersion(@Param("id") UUID id);

  /**
   * List domain versions
   * Similar to <code>listAllDomainVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a domain identified by &#x60;Id&#x60;
   * @param id Id of the domain (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/domains/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllDomainVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List perimeter versions
   * Get a list of all the versions of a perimeter identified by &#x60;Id&#x60;
   * @param id Id of the perimeter (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/perimeters/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllPerimeterVersion(@Param("id") UUID id);

  /**
   * List perimeter versions
   * Similar to <code>listAllPerimeterVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a perimeter identified by &#x60;Id&#x60;
   * @param id Id of the perimeter (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/perimeters/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllPerimeterVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List dataProducts
   * Get a list of DataProducts.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter data products by domain name (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of DataProduct before this cursor (optional)
   * @param after Returns list of DataProduct after this cursor (optional)
   * @return DataProductList
   */
  @RequestLine("GET /v1/dataProducts?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  DataProductList listDataProducts(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);

  /**
   * List dataProducts
   * Similar to <code>listDataProducts</code> but it also returns the http response headers .
   * Get a list of DataProducts.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter data products by domain name (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of DataProduct before this cursor (optional)
   * @param after Returns list of DataProduct after this cursor (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataProducts?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DataProductList> listDataProductsWithHttpInfo(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);


  /**
   * List dataProducts
   * Get a list of DataProducts.
   * Note, this is equivalent to the other <code>listDataProducts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListDataProductsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>domain - Filter data products by domain name (optional)</li>
   *   <li>limit -  (optional, default to 10)</li>
   *   <li>before - Returns list of DataProduct before this cursor (optional)</li>
   *   <li>after - Returns list of DataProduct after this cursor (optional)</li>
   *   </ul>
   * @return DataProductList
   */
  @RequestLine("GET /v1/dataProducts?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}")
  @Headers({
  "Accept: application/json",
  })
  DataProductList listDataProducts(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List dataProducts
  * Get a list of DataProducts.
  * Note, this is equivalent to the other <code>listDataProducts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>domain - Filter data products by domain name (optional)</li>
          *   <li>limit -  (optional, default to 10)</li>
          *   <li>before - Returns list of DataProduct before this cursor (optional)</li>
          *   <li>after - Returns list of DataProduct after this cursor (optional)</li>
      *   </ul>
          * @return DataProductList
      */
      @RequestLine("GET /v1/dataProducts?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DataProductList> listDataProductsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listDataProducts</code> method in a fluent style.
   */
  public static class ListDataProductsQueryParams extends HashMap<String, Object> {
    public ListDataProductsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListDataProductsQueryParams domain(final String value) {
      put("domain", EncodingUtils.encode(value));
      return this;
    }
    public ListDataProductsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListDataProductsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListDataProductsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List domains
   * Get a list of Domains.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of Domain before this cursor (optional)
   * @param after Returns list of Domain after this cursor (optional)
   * @return DomainList
   */
  @RequestLine("GET /v1/domains?fields={fields}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  DomainList listDomains(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);

  /**
   * List domains
   * Similar to <code>listDomains</code> but it also returns the http response headers .
   * Get a list of Domains.
   * @param fields Fields requested in the returned resource (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of Domain before this cursor (optional)
   * @param after Returns list of Domain after this cursor (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/domains?fields={fields}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DomainList> listDomainsWithHttpInfo(@Param("fields") String fields, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);


  /**
   * List domains
   * Get a list of Domains.
   * Note, this is equivalent to the other <code>listDomains</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListDomainsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>limit -  (optional, default to 10)</li>
   *   <li>before - Returns list of Domain before this cursor (optional)</li>
   *   <li>after - Returns list of Domain after this cursor (optional)</li>
   *   </ul>
   * @return DomainList
   */
  @RequestLine("GET /v1/domains?fields={fields}&limit={limit}&before={before}&after={after}")
  @Headers({
  "Accept: application/json",
  })
  DomainList listDomains(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List domains
  * Get a list of Domains.
  * Note, this is equivalent to the other <code>listDomains</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>limit -  (optional, default to 10)</li>
          *   <li>before - Returns list of Domain before this cursor (optional)</li>
          *   <li>after - Returns list of Domain after this cursor (optional)</li>
      *   </ul>
          * @return DomainList
      */
      @RequestLine("GET /v1/domains?fields={fields}&limit={limit}&before={before}&after={after}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<DomainList> listDomainsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listDomains</code> method in a fluent style.
   */
  public static class ListDomainsQueryParams extends HashMap<String, Object> {
    public ListDomainsQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListDomainsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListDomainsQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListDomainsQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List perimeters
   * Get a list of Perimeters.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter perimeters by domain name (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of Perimeter before this cursor (optional)
   * @param after Returns list of Perimeter after this cursor (optional)
   * @return PerimeterList
   */
  @RequestLine("GET /v1/perimeters?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  PerimeterList listPerimeters(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);

  /**
   * List perimeters
   * Similar to <code>listPerimeters</code> but it also returns the http response headers .
   * Get a list of Perimeters.
   * @param fields Fields requested in the returned resource (optional)
   * @param domain Filter perimeters by domain name (optional)
   * @param limit  (optional, default to 10)
   * @param before Returns list of Perimeter before this cursor (optional)
   * @param after Returns list of Perimeter after this cursor (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/perimeters?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PerimeterList> listPerimetersWithHttpInfo(@Param("fields") String fields, @Param("domain") String domain, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after);


  /**
   * List perimeters
   * Get a list of Perimeters.
   * Note, this is equivalent to the other <code>listPerimeters</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPerimetersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>domain - Filter perimeters by domain name (optional)</li>
   *   <li>limit -  (optional, default to 10)</li>
   *   <li>before - Returns list of Perimeter before this cursor (optional)</li>
   *   <li>after - Returns list of Perimeter after this cursor (optional)</li>
   *   </ul>
   * @return PerimeterList
   */
  @RequestLine("GET /v1/perimeters?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}")
  @Headers({
  "Accept: application/json",
  })
  PerimeterList listPerimeters(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List perimeters
  * Get a list of Perimeters.
  * Note, this is equivalent to the other <code>listPerimeters</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>domain - Filter perimeters by domain name (optional)</li>
          *   <li>limit -  (optional, default to 10)</li>
          *   <li>before - Returns list of Perimeter before this cursor (optional)</li>
          *   <li>after - Returns list of Perimeter after this cursor (optional)</li>
      *   </ul>
          * @return PerimeterList
      */
      @RequestLine("GET /v1/perimeters?fields={fields}&domain={domain}&limit={limit}&before={before}&after={after}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PerimeterList> listPerimetersWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listPerimeters</code> method in a fluent style.
   */
  public static class ListPerimetersQueryParams extends HashMap<String, Object> {
    public ListPerimetersQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListPerimetersQueryParams domain(final String value) {
      put("domain", EncodingUtils.encode(value));
      return this;
    }
    public ListPerimetersQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListPerimetersQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListPerimetersQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the dataProduct
   * Get a version of the dataProduct by given &#x60;Id&#x60;
   * @param id Id of the dataProduct (required)
   * @param version DataProduct version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return DataProduct
   */
  @RequestLine("GET /v1/dataProducts/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  DataProduct listSpecificDataProductVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the dataProduct
   * Similar to <code>listSpecificDataProductVersion</code> but it also returns the http response headers .
   * Get a version of the dataProduct by given &#x60;Id&#x60;
   * @param id Id of the dataProduct (required)
   * @param version DataProduct version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/dataProducts/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<DataProduct> listSpecificDataProductVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a version of the domain
   * Get a version of the domain by given &#x60;Id&#x60;
   * @param id Id of the domain (required)
   * @param version Domain version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Domain
   */
  @RequestLine("GET /v1/domains/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Domain listSpecificDomainVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the domain
   * Similar to <code>listSpecificDomainVersion</code> but it also returns the http response headers .
   * Get a version of the domain by given &#x60;Id&#x60;
   * @param id Id of the domain (required)
   * @param version Domain version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/domains/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Domain> listSpecificDomainVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a version of the perimeter
   * Get a version of the perimeter by given &#x60;Id&#x60;
   * @param id Id of the perimeter (required)
   * @param version Perimeter version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return Perimeter
   */
  @RequestLine("GET /v1/perimeters/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  Perimeter listSpecificPerimeterVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the perimeter
   * Similar to <code>listSpecificPerimeterVersion</code> but it also returns the http response headers .
   * Get a version of the perimeter by given &#x60;Id&#x60;
   * @param id Id of the perimeter (required)
   * @param version Perimeter version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/perimeters/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Perimeter> listSpecificPerimeterVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Update a dataProduct
   * Update an existing dataProduct using JsonPatch.
   * @param id Id of the dataProduct (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a dataProduct Documentation</a>
   */
  @RequestLine("PATCH /v1/dataProducts/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchDataProduct(@Param("id") UUID id, Object body);

  /**
   * Update a dataProduct
   * Similar to <code>patchDataProduct</code> but it also returns the http response headers .
   * Update an existing dataProduct using JsonPatch.
   * @param id Id of the dataProduct (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a dataProduct Documentation</a>
   */
  @RequestLine("PATCH /v1/dataProducts/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchDataProductWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Update a domain
   * Update an existing domain using JsonPatch.
   * @param id Id of the domain (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a domain Documentation</a>
   */
  @RequestLine("PATCH /v1/domains/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchDomain(@Param("id") UUID id, Object body);

  /**
   * Update a domain
   * Similar to <code>patchDomain</code> but it also returns the http response headers .
   * Update an existing domain using JsonPatch.
   * @param id Id of the domain (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a domain Documentation</a>
   */
  @RequestLine("PATCH /v1/domains/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchDomainWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Update a perimeter
   * Update an existing perimeter using JsonPatch.
   * @param id Id of the perimeter (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a perimeter Documentation</a>
   */
  @RequestLine("PATCH /v1/perimeters/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchPerimeter(@Param("id") UUID id, Object body);

  /**
   * Update a perimeter
   * Similar to <code>patchPerimeter</code> but it also returns the http response headers .
   * Update an existing perimeter using JsonPatch.
   * @param id Id of the perimeter (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a perimeter Documentation</a>
   */
  @RequestLine("PATCH /v1/perimeters/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchPerimeterWithHttpInfo(@Param("id") UUID id, Object body);


}
