
package org.openmetadata.schema.metadataIngestion.dbtconfig;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.security.credentials.AWSCredentials;


/**
 * DBT S3 Config
 * <p>
 * DBT Catalog, Manifest and Run Results files in S3 bucket. We will search for catalog.json, manifest.json and run_results.json.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dbtSecurityConfig",
    "dbtPrefixConfig"
})
@Generated("jsonschema2pojo")
public class DbtS3Config {

    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * 
     */
    @JsonProperty("dbtSecurityConfig")
    @JsonPropertyDescription("AWS credentials configs.")
    @Valid
    private AWSCredentials dbtSecurityConfig;
    /**
     * DBT Prefix Config
     * <p>
     * Details of the bucket where the dbt files are stored
     * 
     */
    @JsonProperty("dbtPrefixConfig")
    @JsonPropertyDescription("Details of the bucket where the dbt files are stored")
    @Valid
    private DbtPrefixConfig__2 dbtPrefixConfig;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * 
     */
    @JsonProperty("dbtSecurityConfig")
    public AWSCredentials getDbtSecurityConfig() {
        return dbtSecurityConfig;
    }

    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * 
     */
    @JsonProperty("dbtSecurityConfig")
    public void setDbtSecurityConfig(AWSCredentials dbtSecurityConfig) {
        this.dbtSecurityConfig = dbtSecurityConfig;
    }

    public DbtS3Config withDbtSecurityConfig(AWSCredentials dbtSecurityConfig) {
        this.dbtSecurityConfig = dbtSecurityConfig;
        return this;
    }

    /**
     * DBT Prefix Config
     * <p>
     * Details of the bucket where the dbt files are stored
     * 
     */
    @JsonProperty("dbtPrefixConfig")
    public DbtPrefixConfig__2 getDbtPrefixConfig() {
        return dbtPrefixConfig;
    }

    /**
     * DBT Prefix Config
     * <p>
     * Details of the bucket where the dbt files are stored
     * 
     */
    @JsonProperty("dbtPrefixConfig")
    public void setDbtPrefixConfig(DbtPrefixConfig__2 dbtPrefixConfig) {
        this.dbtPrefixConfig = dbtPrefixConfig;
    }

    public DbtS3Config withDbtPrefixConfig(DbtPrefixConfig__2 dbtPrefixConfig) {
        this.dbtPrefixConfig = dbtPrefixConfig;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public DbtS3Config withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DbtS3Config.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dbtSecurityConfig");
        sb.append('=');
        sb.append(((this.dbtSecurityConfig == null)?"<null>":this.dbtSecurityConfig));
        sb.append(',');
        sb.append("dbtPrefixConfig");
        sb.append('=');
        sb.append(((this.dbtPrefixConfig == null)?"<null>":this.dbtPrefixConfig));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.dbtPrefixConfig == null)? 0 :this.dbtPrefixConfig.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dbtSecurityConfig == null)? 0 :this.dbtSecurityConfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DbtS3Config) == false) {
            return false;
        }
        DbtS3Config rhs = ((DbtS3Config) other);
        return ((((this.dbtPrefixConfig == rhs.dbtPrefixConfig)||((this.dbtPrefixConfig!= null)&&this.dbtPrefixConfig.equals(rhs.dbtPrefixConfig)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dbtSecurityConfig == rhs.dbtSecurityConfig)||((this.dbtSecurityConfig!= null)&&this.dbtSecurityConfig.equals(rhs.dbtSecurityConfig))));
    }

}
