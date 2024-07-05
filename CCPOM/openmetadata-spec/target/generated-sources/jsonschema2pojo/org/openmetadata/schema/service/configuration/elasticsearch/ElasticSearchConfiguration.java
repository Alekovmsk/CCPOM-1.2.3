
package org.openmetadata.schema.service.configuration.elasticsearch;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.type.IndexMappingLanguage;


/**
 * ElasticSearchConfiguration
 * <p>
 * This schema defines the Elastic Search Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "host",
    "port",
    "scheme",
    "username",
    "password",
    "truststorePath",
    "truststorePassword",
    "connectionTimeoutSecs",
    "socketTimeoutSecs",
    "keepAliveTimeoutSecs",
    "batchSize",
    "searchIndexMappingLanguage",
    "searchType"
})
@Generated("jsonschema2pojo")
public class ElasticSearchConfiguration {

    /**
     * Elastic Search Host
     * (Required)
     * 
     */
    @JsonProperty("host")
    @JsonPropertyDescription("Elastic Search Host")
    @NotNull
    private String host;
    /**
     * Elastic Search port
     * (Required)
     * 
     */
    @JsonProperty("port")
    @JsonPropertyDescription("Elastic Search port")
    @NotNull
    private Integer port;
    /**
     * Http/Https connection scheme
     * (Required)
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("Http/Https connection scheme")
    @NotNull
    private String scheme;
    /**
     * Elastic Search Username for Login
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Elastic Search Username for Login")
    private String username;
    /**
     * Elastic Search Password for Login
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Elastic Search Password for Login")
    private String password;
    /**
     * Truststore Path
     * 
     */
    @JsonProperty("truststorePath")
    @JsonPropertyDescription("Truststore Path")
    private String truststorePath;
    /**
     * Truststore Password
     * 
     */
    @JsonProperty("truststorePassword")
    @JsonPropertyDescription("Truststore Password")
    private String truststorePassword;
    /**
     * Connection Timeout in Seconds
     * (Required)
     * 
     */
    @JsonProperty("connectionTimeoutSecs")
    @JsonPropertyDescription("Connection Timeout in Seconds")
    @NotNull
    private Integer connectionTimeoutSecs = 5;
    /**
     * Socket Timeout in Seconds
     * (Required)
     * 
     */
    @JsonProperty("socketTimeoutSecs")
    @JsonPropertyDescription("Socket Timeout in Seconds")
    @NotNull
    private Integer socketTimeoutSecs = 60;
    /**
     * Keep Alive Timeout in Seconds
     * 
     */
    @JsonProperty("keepAliveTimeoutSecs")
    @JsonPropertyDescription("Keep Alive Timeout in Seconds")
    private Integer keepAliveTimeoutSecs;
    /**
     * Batch Size for Requests
     * (Required)
     * 
     */
    @JsonProperty("batchSize")
    @JsonPropertyDescription("Batch Size for Requests")
    @NotNull
    private Integer batchSize = 10;
    /**
     * This schema defines the language options available for search index mappings.
     * (Required)
     * 
     */
    @JsonProperty("searchIndexMappingLanguage")
    @JsonPropertyDescription("This schema defines the language options available for search index mappings.")
    @NotNull
    private IndexMappingLanguage searchIndexMappingLanguage = IndexMappingLanguage.fromValue("EN");
    /**
     * This enum defines the search Type elastic/open search.
     * 
     */
    @JsonProperty("searchType")
    @JsonPropertyDescription("This enum defines the search Type elastic/open search.")
    private ElasticSearchConfiguration.SearchType searchType = ElasticSearchConfiguration.SearchType.fromValue("elasticsearch");

    /**
     * Elastic Search Host
     * (Required)
     * 
     */
    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    /**
     * Elastic Search Host
     * (Required)
     * 
     */
    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    public ElasticSearchConfiguration withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Elastic Search port
     * (Required)
     * 
     */
    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    /**
     * Elastic Search port
     * (Required)
     * 
     */
    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    public ElasticSearchConfiguration withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Http/Https connection scheme
     * (Required)
     * 
     */
    @JsonProperty("scheme")
    public String getScheme() {
        return scheme;
    }

    /**
     * Http/Https connection scheme
     * (Required)
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public ElasticSearchConfiguration withScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Elastic Search Username for Login
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Elastic Search Username for Login
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public ElasticSearchConfiguration withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Elastic Search Password for Login
     * 
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * Elastic Search Password for Login
     * 
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public ElasticSearchConfiguration withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Truststore Path
     * 
     */
    @JsonProperty("truststorePath")
    public String getTruststorePath() {
        return truststorePath;
    }

    /**
     * Truststore Path
     * 
     */
    @JsonProperty("truststorePath")
    public void setTruststorePath(String truststorePath) {
        this.truststorePath = truststorePath;
    }

    public ElasticSearchConfiguration withTruststorePath(String truststorePath) {
        this.truststorePath = truststorePath;
        return this;
    }

    /**
     * Truststore Password
     * 
     */
    @JsonProperty("truststorePassword")
    public String getTruststorePassword() {
        return truststorePassword;
    }

    /**
     * Truststore Password
     * 
     */
    @JsonProperty("truststorePassword")
    public void setTruststorePassword(String truststorePassword) {
        this.truststorePassword = truststorePassword;
    }

    public ElasticSearchConfiguration withTruststorePassword(String truststorePassword) {
        this.truststorePassword = truststorePassword;
        return this;
    }

    /**
     * Connection Timeout in Seconds
     * (Required)
     * 
     */
    @JsonProperty("connectionTimeoutSecs")
    public Integer getConnectionTimeoutSecs() {
        return connectionTimeoutSecs;
    }

    /**
     * Connection Timeout in Seconds
     * (Required)
     * 
     */
    @JsonProperty("connectionTimeoutSecs")
    public void setConnectionTimeoutSecs(Integer connectionTimeoutSecs) {
        this.connectionTimeoutSecs = connectionTimeoutSecs;
    }

    public ElasticSearchConfiguration withConnectionTimeoutSecs(Integer connectionTimeoutSecs) {
        this.connectionTimeoutSecs = connectionTimeoutSecs;
        return this;
    }

    /**
     * Socket Timeout in Seconds
     * (Required)
     * 
     */
    @JsonProperty("socketTimeoutSecs")
    public Integer getSocketTimeoutSecs() {
        return socketTimeoutSecs;
    }

    /**
     * Socket Timeout in Seconds
     * (Required)
     * 
     */
    @JsonProperty("socketTimeoutSecs")
    public void setSocketTimeoutSecs(Integer socketTimeoutSecs) {
        this.socketTimeoutSecs = socketTimeoutSecs;
    }

    public ElasticSearchConfiguration withSocketTimeoutSecs(Integer socketTimeoutSecs) {
        this.socketTimeoutSecs = socketTimeoutSecs;
        return this;
    }

    /**
     * Keep Alive Timeout in Seconds
     * 
     */
    @JsonProperty("keepAliveTimeoutSecs")
    public Integer getKeepAliveTimeoutSecs() {
        return keepAliveTimeoutSecs;
    }

    /**
     * Keep Alive Timeout in Seconds
     * 
     */
    @JsonProperty("keepAliveTimeoutSecs")
    public void setKeepAliveTimeoutSecs(Integer keepAliveTimeoutSecs) {
        this.keepAliveTimeoutSecs = keepAliveTimeoutSecs;
    }

    public ElasticSearchConfiguration withKeepAliveTimeoutSecs(Integer keepAliveTimeoutSecs) {
        this.keepAliveTimeoutSecs = keepAliveTimeoutSecs;
        return this;
    }

    /**
     * Batch Size for Requests
     * (Required)
     * 
     */
    @JsonProperty("batchSize")
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Batch Size for Requests
     * (Required)
     * 
     */
    @JsonProperty("batchSize")
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    public ElasticSearchConfiguration withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * This schema defines the language options available for search index mappings.
     * (Required)
     * 
     */
    @JsonProperty("searchIndexMappingLanguage")
    public IndexMappingLanguage getSearchIndexMappingLanguage() {
        return searchIndexMappingLanguage;
    }

    /**
     * This schema defines the language options available for search index mappings.
     * (Required)
     * 
     */
    @JsonProperty("searchIndexMappingLanguage")
    public void setSearchIndexMappingLanguage(IndexMappingLanguage searchIndexMappingLanguage) {
        this.searchIndexMappingLanguage = searchIndexMappingLanguage;
    }

    public ElasticSearchConfiguration withSearchIndexMappingLanguage(IndexMappingLanguage searchIndexMappingLanguage) {
        this.searchIndexMappingLanguage = searchIndexMappingLanguage;
        return this;
    }

    /**
     * This enum defines the search Type elastic/open search.
     * 
     */
    @JsonProperty("searchType")
    public ElasticSearchConfiguration.SearchType getSearchType() {
        return searchType;
    }

    /**
     * This enum defines the search Type elastic/open search.
     * 
     */
    @JsonProperty("searchType")
    public void setSearchType(ElasticSearchConfiguration.SearchType searchType) {
        this.searchType = searchType;
    }

    public ElasticSearchConfiguration withSearchType(ElasticSearchConfiguration.SearchType searchType) {
        this.searchType = searchType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElasticSearchConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("host");
        sb.append('=');
        sb.append(((this.host == null)?"<null>":this.host));
        sb.append(',');
        sb.append("port");
        sb.append('=');
        sb.append(((this.port == null)?"<null>":this.port));
        sb.append(',');
        sb.append("scheme");
        sb.append('=');
        sb.append(((this.scheme == null)?"<null>":this.scheme));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("truststorePath");
        sb.append('=');
        sb.append(((this.truststorePath == null)?"<null>":this.truststorePath));
        sb.append(',');
        sb.append("truststorePassword");
        sb.append('=');
        sb.append(((this.truststorePassword == null)?"<null>":this.truststorePassword));
        sb.append(',');
        sb.append("connectionTimeoutSecs");
        sb.append('=');
        sb.append(((this.connectionTimeoutSecs == null)?"<null>":this.connectionTimeoutSecs));
        sb.append(',');
        sb.append("socketTimeoutSecs");
        sb.append('=');
        sb.append(((this.socketTimeoutSecs == null)?"<null>":this.socketTimeoutSecs));
        sb.append(',');
        sb.append("keepAliveTimeoutSecs");
        sb.append('=');
        sb.append(((this.keepAliveTimeoutSecs == null)?"<null>":this.keepAliveTimeoutSecs));
        sb.append(',');
        sb.append("batchSize");
        sb.append('=');
        sb.append(((this.batchSize == null)?"<null>":this.batchSize));
        sb.append(',');
        sb.append("searchIndexMappingLanguage");
        sb.append('=');
        sb.append(((this.searchIndexMappingLanguage == null)?"<null>":this.searchIndexMappingLanguage));
        sb.append(',');
        sb.append("searchType");
        sb.append('=');
        sb.append(((this.searchType == null)?"<null>":this.searchType));
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
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.socketTimeoutSecs == null)? 0 :this.socketTimeoutSecs.hashCode()));
        result = ((result* 31)+((this.searchIndexMappingLanguage == null)? 0 :this.searchIndexMappingLanguage.hashCode()));
        result = ((result* 31)+((this.searchType == null)? 0 :this.searchType.hashCode()));
        result = ((result* 31)+((this.keepAliveTimeoutSecs == null)? 0 :this.keepAliveTimeoutSecs.hashCode()));
        result = ((result* 31)+((this.truststorePath == null)? 0 :this.truststorePath.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.truststorePassword == null)? 0 :this.truststorePassword.hashCode()));
        result = ((result* 31)+((this.connectionTimeoutSecs == null)? 0 :this.connectionTimeoutSecs.hashCode()));
        result = ((result* 31)+((this.port == null)? 0 :this.port.hashCode()));
        result = ((result* 31)+((this.host == null)? 0 :this.host.hashCode()));
        result = ((result* 31)+((this.batchSize == null)? 0 :this.batchSize.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElasticSearchConfiguration) == false) {
            return false;
        }
        ElasticSearchConfiguration rhs = ((ElasticSearchConfiguration) other);
        return ((((((((((((((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme)))&&((this.socketTimeoutSecs == rhs.socketTimeoutSecs)||((this.socketTimeoutSecs!= null)&&this.socketTimeoutSecs.equals(rhs.socketTimeoutSecs))))&&((this.searchIndexMappingLanguage == rhs.searchIndexMappingLanguage)||((this.searchIndexMappingLanguage!= null)&&this.searchIndexMappingLanguage.equals(rhs.searchIndexMappingLanguage))))&&((this.searchType == rhs.searchType)||((this.searchType!= null)&&this.searchType.equals(rhs.searchType))))&&((this.keepAliveTimeoutSecs == rhs.keepAliveTimeoutSecs)||((this.keepAliveTimeoutSecs!= null)&&this.keepAliveTimeoutSecs.equals(rhs.keepAliveTimeoutSecs))))&&((this.truststorePath == rhs.truststorePath)||((this.truststorePath!= null)&&this.truststorePath.equals(rhs.truststorePath))))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.truststorePassword == rhs.truststorePassword)||((this.truststorePassword!= null)&&this.truststorePassword.equals(rhs.truststorePassword))))&&((this.connectionTimeoutSecs == rhs.connectionTimeoutSecs)||((this.connectionTimeoutSecs!= null)&&this.connectionTimeoutSecs.equals(rhs.connectionTimeoutSecs))))&&((this.port == rhs.port)||((this.port!= null)&&this.port.equals(rhs.port))))&&((this.host == rhs.host)||((this.host!= null)&&this.host.equals(rhs.host))))&&((this.batchSize == rhs.batchSize)||((this.batchSize!= null)&&this.batchSize.equals(rhs.batchSize))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * This enum defines the search Type elastic/open search.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SearchType {

        ELASTICSEARCH("elasticsearch"),
        OPENSEARCH("opensearch");
        private final String value;
        private final static Map<String, ElasticSearchConfiguration.SearchType> CONSTANTS = new HashMap<String, ElasticSearchConfiguration.SearchType>();

        static {
            for (ElasticSearchConfiguration.SearchType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SearchType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static ElasticSearchConfiguration.SearchType fromValue(String value) {
            ElasticSearchConfiguration.SearchType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
