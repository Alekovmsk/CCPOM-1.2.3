
package org.openmetadata.schema.metadataIngestion;

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
 * MetadataToElasticSearchPipeline
 * <p>
 * Data Insight Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "regionName",
    "caCerts",
    "timeout",
    "useSSL",
    "verifyCerts",
    "useAwsCredentials",
    "searchIndexMappingLanguage",
    "batchSize",
    "recreateIndex"
})
@Generated("jsonschema2pojo")
public class MetadataToElasticSearchPipeline {

    /**
     * Pipeline Source Config Metadata Pipeline type
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Pipeline Source Config Metadata Pipeline type")
    @NotNull
    private MetadataToElasticSearchPipeline.MetadataToESConfigType type = MetadataToElasticSearchPipeline.MetadataToESConfigType.fromValue("MetadataToElasticSearch");
    /**
     * AWS Region Name
     * <p>
     * Region name. Required when using AWS Credentials.
     * 
     */
    @JsonProperty("regionName")
    @JsonPropertyDescription("Region name. Required when using AWS Credentials.")
    private String regionName = null;
    /**
     * CA Certificates
     * <p>
     * Certificate path to be added in configuration. The path should be local in the Ingestion Container.
     * 
     */
    @JsonProperty("caCerts")
    @JsonPropertyDescription("Certificate path to be added in configuration. The path should be local in the Ingestion Container.")
    private String caCerts = null;
    /**
     * Connection Timeout
     * 
     */
    @JsonProperty("timeout")
    @JsonPropertyDescription("Connection Timeout")
    private Integer timeout = 30;
    /**
     * Use SSL
     * <p>
     * Indicates whether to use SSL when connecting to ElasticSearch. By default, we will ignore SSL settings.
     * 
     */
    @JsonProperty("useSSL")
    @JsonPropertyDescription("Indicates whether to use SSL when connecting to ElasticSearch. By default, we will ignore SSL settings.")
    private Boolean useSSL = false;
    /**
     * Validate Certificates
     * <p>
     * Indicates whether to verify certificates when using SSL connection to ElasticSearch. Ignored by default. Is set to true, make sure to send the certificates in the property `CA Certificates`.
     * 
     */
    @JsonProperty("verifyCerts")
    @JsonPropertyDescription("Indicates whether to verify certificates when using SSL connection to ElasticSearch. Ignored by default. Is set to true, make sure to send the certificates in the property `CA Certificates`.")
    private Boolean verifyCerts = false;
    /**
     * Use AWS Credentials
     * <p>
     * Indicates whether to use aws credentials when connecting to OpenSearch in AWS.
     * 
     */
    @JsonProperty("useAwsCredentials")
    @JsonPropertyDescription("Indicates whether to use aws credentials when connecting to OpenSearch in AWS.")
    private Boolean useAwsCredentials = false;
    /**
     * This schema defines the language options available for search index mappings.
     * 
     */
    @JsonProperty("searchIndexMappingLanguage")
    @JsonPropertyDescription("This schema defines the language options available for search index mappings.")
    private IndexMappingLanguage searchIndexMappingLanguage = IndexMappingLanguage.fromValue("EN");
    /**
     * Batch Size
     * <p>
     * Maximum number of events entities in a batch (Default 1000).
     * 
     */
    @JsonProperty("batchSize")
    @JsonPropertyDescription("Maximum number of events entities in a batch (Default 1000).")
    private Integer batchSize = 1000;
    /**
     * Recreate Indexes
     * <p>
     * 
     * 
     */
    @JsonProperty("recreateIndex")
    private Boolean recreateIndex = true;

    /**
     * Pipeline Source Config Metadata Pipeline type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public MetadataToElasticSearchPipeline.MetadataToESConfigType getType() {
        return type;
    }

    /**
     * Pipeline Source Config Metadata Pipeline type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(MetadataToElasticSearchPipeline.MetadataToESConfigType type) {
        this.type = type;
    }

    public MetadataToElasticSearchPipeline withType(MetadataToElasticSearchPipeline.MetadataToESConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * AWS Region Name
     * <p>
     * Region name. Required when using AWS Credentials.
     * 
     */
    @JsonProperty("regionName")
    public String getRegionName() {
        return regionName;
    }

    /**
     * AWS Region Name
     * <p>
     * Region name. Required when using AWS Credentials.
     * 
     */
    @JsonProperty("regionName")
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public MetadataToElasticSearchPipeline withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * CA Certificates
     * <p>
     * Certificate path to be added in configuration. The path should be local in the Ingestion Container.
     * 
     */
    @JsonProperty("caCerts")
    public String getCaCerts() {
        return caCerts;
    }

    /**
     * CA Certificates
     * <p>
     * Certificate path to be added in configuration. The path should be local in the Ingestion Container.
     * 
     */
    @JsonProperty("caCerts")
    public void setCaCerts(String caCerts) {
        this.caCerts = caCerts;
    }

    public MetadataToElasticSearchPipeline withCaCerts(String caCerts) {
        this.caCerts = caCerts;
        return this;
    }

    /**
     * Connection Timeout
     * 
     */
    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Connection Timeout
     * 
     */
    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public MetadataToElasticSearchPipeline withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Use SSL
     * <p>
     * Indicates whether to use SSL when connecting to ElasticSearch. By default, we will ignore SSL settings.
     * 
     */
    @JsonProperty("useSSL")
    public Boolean getUseSSL() {
        return useSSL;
    }

    /**
     * Use SSL
     * <p>
     * Indicates whether to use SSL when connecting to ElasticSearch. By default, we will ignore SSL settings.
     * 
     */
    @JsonProperty("useSSL")
    public void setUseSSL(Boolean useSSL) {
        this.useSSL = useSSL;
    }

    public MetadataToElasticSearchPipeline withUseSSL(Boolean useSSL) {
        this.useSSL = useSSL;
        return this;
    }

    /**
     * Validate Certificates
     * <p>
     * Indicates whether to verify certificates when using SSL connection to ElasticSearch. Ignored by default. Is set to true, make sure to send the certificates in the property `CA Certificates`.
     * 
     */
    @JsonProperty("verifyCerts")
    public Boolean getVerifyCerts() {
        return verifyCerts;
    }

    /**
     * Validate Certificates
     * <p>
     * Indicates whether to verify certificates when using SSL connection to ElasticSearch. Ignored by default. Is set to true, make sure to send the certificates in the property `CA Certificates`.
     * 
     */
    @JsonProperty("verifyCerts")
    public void setVerifyCerts(Boolean verifyCerts) {
        this.verifyCerts = verifyCerts;
    }

    public MetadataToElasticSearchPipeline withVerifyCerts(Boolean verifyCerts) {
        this.verifyCerts = verifyCerts;
        return this;
    }

    /**
     * Use AWS Credentials
     * <p>
     * Indicates whether to use aws credentials when connecting to OpenSearch in AWS.
     * 
     */
    @JsonProperty("useAwsCredentials")
    public Boolean getUseAwsCredentials() {
        return useAwsCredentials;
    }

    /**
     * Use AWS Credentials
     * <p>
     * Indicates whether to use aws credentials when connecting to OpenSearch in AWS.
     * 
     */
    @JsonProperty("useAwsCredentials")
    public void setUseAwsCredentials(Boolean useAwsCredentials) {
        this.useAwsCredentials = useAwsCredentials;
    }

    public MetadataToElasticSearchPipeline withUseAwsCredentials(Boolean useAwsCredentials) {
        this.useAwsCredentials = useAwsCredentials;
        return this;
    }

    /**
     * This schema defines the language options available for search index mappings.
     * 
     */
    @JsonProperty("searchIndexMappingLanguage")
    public IndexMappingLanguage getSearchIndexMappingLanguage() {
        return searchIndexMappingLanguage;
    }

    /**
     * This schema defines the language options available for search index mappings.
     * 
     */
    @JsonProperty("searchIndexMappingLanguage")
    public void setSearchIndexMappingLanguage(IndexMappingLanguage searchIndexMappingLanguage) {
        this.searchIndexMappingLanguage = searchIndexMappingLanguage;
    }

    public MetadataToElasticSearchPipeline withSearchIndexMappingLanguage(IndexMappingLanguage searchIndexMappingLanguage) {
        this.searchIndexMappingLanguage = searchIndexMappingLanguage;
        return this;
    }

    /**
     * Batch Size
     * <p>
     * Maximum number of events entities in a batch (Default 1000).
     * 
     */
    @JsonProperty("batchSize")
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Batch Size
     * <p>
     * Maximum number of events entities in a batch (Default 1000).
     * 
     */
    @JsonProperty("batchSize")
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    public MetadataToElasticSearchPipeline withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Recreate Indexes
     * <p>
     * 
     * 
     */
    @JsonProperty("recreateIndex")
    public Boolean getRecreateIndex() {
        return recreateIndex;
    }

    /**
     * Recreate Indexes
     * <p>
     * 
     * 
     */
    @JsonProperty("recreateIndex")
    public void setRecreateIndex(Boolean recreateIndex) {
        this.recreateIndex = recreateIndex;
    }

    public MetadataToElasticSearchPipeline withRecreateIndex(Boolean recreateIndex) {
        this.recreateIndex = recreateIndex;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MetadataToElasticSearchPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("regionName");
        sb.append('=');
        sb.append(((this.regionName == null)?"<null>":this.regionName));
        sb.append(',');
        sb.append("caCerts");
        sb.append('=');
        sb.append(((this.caCerts == null)?"<null>":this.caCerts));
        sb.append(',');
        sb.append("timeout");
        sb.append('=');
        sb.append(((this.timeout == null)?"<null>":this.timeout));
        sb.append(',');
        sb.append("useSSL");
        sb.append('=');
        sb.append(((this.useSSL == null)?"<null>":this.useSSL));
        sb.append(',');
        sb.append("verifyCerts");
        sb.append('=');
        sb.append(((this.verifyCerts == null)?"<null>":this.verifyCerts));
        sb.append(',');
        sb.append("useAwsCredentials");
        sb.append('=');
        sb.append(((this.useAwsCredentials == null)?"<null>":this.useAwsCredentials));
        sb.append(',');
        sb.append("searchIndexMappingLanguage");
        sb.append('=');
        sb.append(((this.searchIndexMappingLanguage == null)?"<null>":this.searchIndexMappingLanguage));
        sb.append(',');
        sb.append("batchSize");
        sb.append('=');
        sb.append(((this.batchSize == null)?"<null>":this.batchSize));
        sb.append(',');
        sb.append("recreateIndex");
        sb.append('=');
        sb.append(((this.recreateIndex == null)?"<null>":this.recreateIndex));
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
        result = ((result* 31)+((this.useAwsCredentials == null)? 0 :this.useAwsCredentials.hashCode()));
        result = ((result* 31)+((this.searchIndexMappingLanguage == null)? 0 :this.searchIndexMappingLanguage.hashCode()));
        result = ((result* 31)+((this.regionName == null)? 0 :this.regionName.hashCode()));
        result = ((result* 31)+((this.verifyCerts == null)? 0 :this.verifyCerts.hashCode()));
        result = ((result* 31)+((this.recreateIndex == null)? 0 :this.recreateIndex.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.batchSize == null)? 0 :this.batchSize.hashCode()));
        result = ((result* 31)+((this.timeout == null)? 0 :this.timeout.hashCode()));
        result = ((result* 31)+((this.caCerts == null)? 0 :this.caCerts.hashCode()));
        result = ((result* 31)+((this.useSSL == null)? 0 :this.useSSL.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetadataToElasticSearchPipeline) == false) {
            return false;
        }
        MetadataToElasticSearchPipeline rhs = ((MetadataToElasticSearchPipeline) other);
        return (((((((((((this.useAwsCredentials == rhs.useAwsCredentials)||((this.useAwsCredentials!= null)&&this.useAwsCredentials.equals(rhs.useAwsCredentials)))&&((this.searchIndexMappingLanguage == rhs.searchIndexMappingLanguage)||((this.searchIndexMappingLanguage!= null)&&this.searchIndexMappingLanguage.equals(rhs.searchIndexMappingLanguage))))&&((this.regionName == rhs.regionName)||((this.regionName!= null)&&this.regionName.equals(rhs.regionName))))&&((this.verifyCerts == rhs.verifyCerts)||((this.verifyCerts!= null)&&this.verifyCerts.equals(rhs.verifyCerts))))&&((this.recreateIndex == rhs.recreateIndex)||((this.recreateIndex!= null)&&this.recreateIndex.equals(rhs.recreateIndex))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.batchSize == rhs.batchSize)||((this.batchSize!= null)&&this.batchSize.equals(rhs.batchSize))))&&((this.timeout == rhs.timeout)||((this.timeout!= null)&&this.timeout.equals(rhs.timeout))))&&((this.caCerts == rhs.caCerts)||((this.caCerts!= null)&&this.caCerts.equals(rhs.caCerts))))&&((this.useSSL == rhs.useSSL)||((this.useSSL!= null)&&this.useSSL.equals(rhs.useSSL))));
    }


    /**
     * Pipeline Source Config Metadata Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MetadataToESConfigType {

        METADATA_TO_ELASTIC_SEARCH("MetadataToElasticSearch");
        private final String value;
        private final static Map<String, MetadataToElasticSearchPipeline.MetadataToESConfigType> CONSTANTS = new HashMap<String, MetadataToElasticSearchPipeline.MetadataToESConfigType>();

        static {
            for (MetadataToElasticSearchPipeline.MetadataToESConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MetadataToESConfigType(String value) {
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
        public static MetadataToElasticSearchPipeline.MetadataToESConfigType fromValue(String value) {
            MetadataToElasticSearchPipeline.MetadataToESConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
