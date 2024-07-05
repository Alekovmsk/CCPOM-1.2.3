package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

import org.openmetadata.client.model.OpenMetadataServerVersion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface SystemApi extends ApiClient.Api {


  /**
   * Get version of metadata service
   * Get the build version of OpenMetadata service and build timestamp.
   * @return OpenMetadataServerVersion
   */
  @RequestLine("GET /v1/system/version")
  @Headers({
    "Accept: application/json",
  })
  OpenMetadataServerVersion getCatalogVersion();

  /**
   * Get version of metadata service
   * Similar to <code>getCatalogVersion</code> but it also returns the http response headers .
   * Get the build version of OpenMetadata service and build timestamp.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/system/version")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<OpenMetadataServerVersion> getCatalogVersionWithHttpInfo();


}
