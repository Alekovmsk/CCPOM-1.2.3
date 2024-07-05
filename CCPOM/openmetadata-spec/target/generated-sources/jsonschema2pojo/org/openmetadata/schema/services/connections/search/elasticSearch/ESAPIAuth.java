
package org.openmetadata.schema.services.connections.search.elasticSearch;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * API Key Authentication
 * <p>
 * API Key Authentication for ElasticSearch
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiKey",
    "apiKeyId"
})
@Generated("jsonschema2pojo")
public class ESAPIAuth {

    /**
     * API Key
     * <p>
     * Elastic Search API Key for API Authentication
     * 
     */
    @JsonProperty("apiKey")
    @JsonPropertyDescription("Elastic Search API Key for API Authentication")
    @PasswordField
    private String apiKey;
    /**
     * API Key ID
     * <p>
     * Elastic Search API Key ID for API Authentication
     * 
     */
    @JsonProperty("apiKeyId")
    @JsonPropertyDescription("Elastic Search API Key ID for API Authentication")
    private String apiKeyId;

    /**
     * API Key
     * <p>
     * Elastic Search API Key for API Authentication
     * 
     */
    @JsonProperty("apiKey")
    @PasswordField
    public String getApiKey() {
        return apiKey;
    }

    /**
     * API Key
     * <p>
     * Elastic Search API Key for API Authentication
     * 
     */
    @JsonProperty("apiKey")
    @PasswordField
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public ESAPIAuth withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * API Key ID
     * <p>
     * Elastic Search API Key ID for API Authentication
     * 
     */
    @JsonProperty("apiKeyId")
    public String getApiKeyId() {
        return apiKeyId;
    }

    /**
     * API Key ID
     * <p>
     * Elastic Search API Key ID for API Authentication
     * 
     */
    @JsonProperty("apiKeyId")
    public void setApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
    }

    public ESAPIAuth withApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ESAPIAuth.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apiKey");
        sb.append('=');
        sb.append(((this.apiKey == null)?"<null>":this.apiKey));
        sb.append(',');
        sb.append("apiKeyId");
        sb.append('=');
        sb.append(((this.apiKeyId == null)?"<null>":this.apiKeyId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.apiKey == null)? 0 :this.apiKey.hashCode()));
        result = ((result* 31)+((this.apiKeyId == null)? 0 :this.apiKeyId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ESAPIAuth) == false) {
            return false;
        }
        ESAPIAuth rhs = ((ESAPIAuth) other);
        return (((this.apiKey == rhs.apiKey)||((this.apiKey!= null)&&this.apiKey.equals(rhs.apiKey)))&&((this.apiKeyId == rhs.apiKeyId)||((this.apiKeyId!= null)&&this.apiKeyId.equals(rhs.apiKeyId))));
    }

}
