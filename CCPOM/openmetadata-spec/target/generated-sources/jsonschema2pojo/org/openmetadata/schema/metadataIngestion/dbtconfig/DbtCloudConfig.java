
package org.openmetadata.schema.metadataIngestion.dbtconfig;

import java.net.URI;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * DBT Cloud Config
 * <p>
 * dbt Cloud configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dbtCloudAuthToken",
    "dbtCloudAccountId",
    "dbtCloudProjectId",
    "dbtCloudJobId",
    "dbtCloudUrl"
})
@Generated("jsonschema2pojo")
public class DbtCloudConfig {

    /**
     * dbt Cloud Authentication Token
     * <p>
     * dbt cloud account authentication token
     * (Required)
     * 
     */
    @JsonProperty("dbtCloudAuthToken")
    @JsonPropertyDescription("dbt cloud account authentication token")
    @PasswordField
    @NotNull
    private String dbtCloudAuthToken;
    /**
     * dbt Cloud Account Id
     * <p>
     * dbt cloud account Id
     * (Required)
     * 
     */
    @JsonProperty("dbtCloudAccountId")
    @JsonPropertyDescription("dbt cloud account Id")
    @NotNull
    private String dbtCloudAccountId;
    /**
     * dbt Cloud Project Id
     * <p>
     * In case of multiple projects in a dbt cloud account, specify the project's id from which you want to extract the dbt run artifacts
     * 
     */
    @JsonProperty("dbtCloudProjectId")
    @JsonPropertyDescription("In case of multiple projects in a dbt cloud account, specify the project's id from which you want to extract the dbt run artifacts")
    private String dbtCloudProjectId;
    /**
     * dbt Cloud Job Id
     * <p>
     * dbt cloud job id.
     * 
     */
    @JsonProperty("dbtCloudJobId")
    @JsonPropertyDescription("dbt cloud job id.")
    private String dbtCloudJobId;
    /**
     * dbt Cloud URL
     * <p>
     * URL to connect to your dbt cloud instance. E.g., https://cloud.getdbt.com or https://emea.dbt.com/
     * (Required)
     * 
     */
    @JsonProperty("dbtCloudUrl")
    @JsonPropertyDescription("URL to connect to your dbt cloud instance. E.g., https://cloud.getdbt.com or https://emea.dbt.com/")
    @NotNull
    private URI dbtCloudUrl = URI.create("https://cloud.getdbt.com");

    /**
     * dbt Cloud Authentication Token
     * <p>
     * dbt cloud account authentication token
     * (Required)
     * 
     */
    @JsonProperty("dbtCloudAuthToken")
    @PasswordField
    public String getDbtCloudAuthToken() {
        return dbtCloudAuthToken;
    }

    /**
     * dbt Cloud Authentication Token
     * <p>
     * dbt cloud account authentication token
     * (Required)
     * 
     */
    @JsonProperty("dbtCloudAuthToken")
    @PasswordField
    public void setDbtCloudAuthToken(String dbtCloudAuthToken) {
        this.dbtCloudAuthToken = dbtCloudAuthToken;
    }

    public DbtCloudConfig withDbtCloudAuthToken(String dbtCloudAuthToken) {
        this.dbtCloudAuthToken = dbtCloudAuthToken;
        return this;
    }

    /**
     * dbt Cloud Account Id
     * <p>
     * dbt cloud account Id
     * (Required)
     * 
     */
    @JsonProperty("dbtCloudAccountId")
    public String getDbtCloudAccountId() {
        return dbtCloudAccountId;
    }

    /**
     * dbt Cloud Account Id
     * <p>
     * dbt cloud account Id
     * (Required)
     * 
     */
    @JsonProperty("dbtCloudAccountId")
    public void setDbtCloudAccountId(String dbtCloudAccountId) {
        this.dbtCloudAccountId = dbtCloudAccountId;
    }

    public DbtCloudConfig withDbtCloudAccountId(String dbtCloudAccountId) {
        this.dbtCloudAccountId = dbtCloudAccountId;
        return this;
    }

    /**
     * dbt Cloud Project Id
     * <p>
     * In case of multiple projects in a dbt cloud account, specify the project's id from which you want to extract the dbt run artifacts
     * 
     */
    @JsonProperty("dbtCloudProjectId")
    public String getDbtCloudProjectId() {
        return dbtCloudProjectId;
    }

    /**
     * dbt Cloud Project Id
     * <p>
     * In case of multiple projects in a dbt cloud account, specify the project's id from which you want to extract the dbt run artifacts
     * 
     */
    @JsonProperty("dbtCloudProjectId")
    public void setDbtCloudProjectId(String dbtCloudProjectId) {
        this.dbtCloudProjectId = dbtCloudProjectId;
    }

    public DbtCloudConfig withDbtCloudProjectId(String dbtCloudProjectId) {
        this.dbtCloudProjectId = dbtCloudProjectId;
        return this;
    }

    /**
     * dbt Cloud Job Id
     * <p>
     * dbt cloud job id.
     * 
     */
    @JsonProperty("dbtCloudJobId")
    public String getDbtCloudJobId() {
        return dbtCloudJobId;
    }

    /**
     * dbt Cloud Job Id
     * <p>
     * dbt cloud job id.
     * 
     */
    @JsonProperty("dbtCloudJobId")
    public void setDbtCloudJobId(String dbtCloudJobId) {
        this.dbtCloudJobId = dbtCloudJobId;
    }

    public DbtCloudConfig withDbtCloudJobId(String dbtCloudJobId) {
        this.dbtCloudJobId = dbtCloudJobId;
        return this;
    }

    /**
     * dbt Cloud URL
     * <p>
     * URL to connect to your dbt cloud instance. E.g., https://cloud.getdbt.com or https://emea.dbt.com/
     * (Required)
     * 
     */
    @JsonProperty("dbtCloudUrl")
    public URI getDbtCloudUrl() {
        return dbtCloudUrl;
    }

    /**
     * dbt Cloud URL
     * <p>
     * URL to connect to your dbt cloud instance. E.g., https://cloud.getdbt.com or https://emea.dbt.com/
     * (Required)
     * 
     */
    @JsonProperty("dbtCloudUrl")
    public void setDbtCloudUrl(URI dbtCloudUrl) {
        this.dbtCloudUrl = dbtCloudUrl;
    }

    public DbtCloudConfig withDbtCloudUrl(URI dbtCloudUrl) {
        this.dbtCloudUrl = dbtCloudUrl;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DbtCloudConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dbtCloudAuthToken");
        sb.append('=');
        sb.append(((this.dbtCloudAuthToken == null)?"<null>":this.dbtCloudAuthToken));
        sb.append(',');
        sb.append("dbtCloudAccountId");
        sb.append('=');
        sb.append(((this.dbtCloudAccountId == null)?"<null>":this.dbtCloudAccountId));
        sb.append(',');
        sb.append("dbtCloudProjectId");
        sb.append('=');
        sb.append(((this.dbtCloudProjectId == null)?"<null>":this.dbtCloudProjectId));
        sb.append(',');
        sb.append("dbtCloudJobId");
        sb.append('=');
        sb.append(((this.dbtCloudJobId == null)?"<null>":this.dbtCloudJobId));
        sb.append(',');
        sb.append("dbtCloudUrl");
        sb.append('=');
        sb.append(((this.dbtCloudUrl == null)?"<null>":this.dbtCloudUrl));
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
        result = ((result* 31)+((this.dbtCloudAccountId == null)? 0 :this.dbtCloudAccountId.hashCode()));
        result = ((result* 31)+((this.dbtCloudProjectId == null)? 0 :this.dbtCloudProjectId.hashCode()));
        result = ((result* 31)+((this.dbtCloudJobId == null)? 0 :this.dbtCloudJobId.hashCode()));
        result = ((result* 31)+((this.dbtCloudUrl == null)? 0 :this.dbtCloudUrl.hashCode()));
        result = ((result* 31)+((this.dbtCloudAuthToken == null)? 0 :this.dbtCloudAuthToken.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DbtCloudConfig) == false) {
            return false;
        }
        DbtCloudConfig rhs = ((DbtCloudConfig) other);
        return ((((((this.dbtCloudAccountId == rhs.dbtCloudAccountId)||((this.dbtCloudAccountId!= null)&&this.dbtCloudAccountId.equals(rhs.dbtCloudAccountId)))&&((this.dbtCloudProjectId == rhs.dbtCloudProjectId)||((this.dbtCloudProjectId!= null)&&this.dbtCloudProjectId.equals(rhs.dbtCloudProjectId))))&&((this.dbtCloudJobId == rhs.dbtCloudJobId)||((this.dbtCloudJobId!= null)&&this.dbtCloudJobId.equals(rhs.dbtCloudJobId))))&&((this.dbtCloudUrl == rhs.dbtCloudUrl)||((this.dbtCloudUrl!= null)&&this.dbtCloudUrl.equals(rhs.dbtCloudUrl))))&&((this.dbtCloudAuthToken == rhs.dbtCloudAuthToken)||((this.dbtCloudAuthToken!= null)&&this.dbtCloudAuthToken.equals(rhs.dbtCloudAuthToken))));
    }

}
