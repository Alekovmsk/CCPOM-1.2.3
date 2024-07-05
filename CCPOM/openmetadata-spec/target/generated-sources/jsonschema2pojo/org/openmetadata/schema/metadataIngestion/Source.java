
package org.openmetadata.schema.metadataIngestion;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Configuration for Source component in OpenMetadata Ingestion Framework.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "serviceName",
    "serviceConnection",
    "sourceConfig"
})
@Generated("jsonschema2pojo")
public class Source {

    /**
     * Type of the source connector ex: mysql, snowflake, tableau etc..
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of the source connector ex: mysql, snowflake, tableau etc..")
    @NotNull
    private String type;
    /**
     * Type of the source connector ex: mysql, snowflake, tableau etc..
     * 
     */
    @JsonProperty("serviceName")
    @JsonPropertyDescription("Type of the source connector ex: mysql, snowflake, tableau etc..")
    private String serviceName;
    /**
     * Supported services
     * 
     */
    @JsonProperty("serviceConnection")
    @JsonPropertyDescription("Supported services")
    private Object serviceConnection;
    /**
     * Additional connection configuration.
     * (Required)
     * 
     */
    @JsonProperty("sourceConfig")
    @JsonPropertyDescription("Additional connection configuration.")
    @Valid
    @NotNull
    private SourceConfig sourceConfig;

    /**
     * Type of the source connector ex: mysql, snowflake, tableau etc..
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type of the source connector ex: mysql, snowflake, tableau etc..
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Source withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Type of the source connector ex: mysql, snowflake, tableau etc..
     * 
     */
    @JsonProperty("serviceName")
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Type of the source connector ex: mysql, snowflake, tableau etc..
     * 
     */
    @JsonProperty("serviceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Source withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Supported services
     * 
     */
    @JsonProperty("serviceConnection")
    public Object getServiceConnection() {
        return serviceConnection;
    }

    /**
     * Supported services
     * 
     */
    @JsonProperty("serviceConnection")
    public void setServiceConnection(Object serviceConnection) {
        this.serviceConnection = serviceConnection;
    }

    public Source withServiceConnection(Object serviceConnection) {
        this.serviceConnection = serviceConnection;
        return this;
    }

    /**
     * Additional connection configuration.
     * (Required)
     * 
     */
    @JsonProperty("sourceConfig")
    public SourceConfig getSourceConfig() {
        return sourceConfig;
    }

    /**
     * Additional connection configuration.
     * (Required)
     * 
     */
    @JsonProperty("sourceConfig")
    public void setSourceConfig(SourceConfig sourceConfig) {
        this.sourceConfig = sourceConfig;
    }

    public Source withSourceConfig(SourceConfig sourceConfig) {
        this.sourceConfig = sourceConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Source.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("serviceName");
        sb.append('=');
        sb.append(((this.serviceName == null)?"<null>":this.serviceName));
        sb.append(',');
        sb.append("serviceConnection");
        sb.append('=');
        sb.append(((this.serviceConnection == null)?"<null>":this.serviceConnection));
        sb.append(',');
        sb.append("sourceConfig");
        sb.append('=');
        sb.append(((this.sourceConfig == null)?"<null>":this.sourceConfig));
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
        result = ((result* 31)+((this.sourceConfig == null)? 0 :this.sourceConfig.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.serviceName == null)? 0 :this.serviceName.hashCode()));
        result = ((result* 31)+((this.serviceConnection == null)? 0 :this.serviceConnection.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Source) == false) {
            return false;
        }
        Source rhs = ((Source) other);
        return (((((this.sourceConfig == rhs.sourceConfig)||((this.sourceConfig!= null)&&this.sourceConfig.equals(rhs.sourceConfig)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.serviceName == rhs.serviceName)||((this.serviceName!= null)&&this.serviceName.equals(rhs.serviceName))))&&((this.serviceConnection == rhs.serviceConnection)||((this.serviceConnection!= null)&&this.serviceConnection.equals(rhs.serviceConnection))));
    }

}
