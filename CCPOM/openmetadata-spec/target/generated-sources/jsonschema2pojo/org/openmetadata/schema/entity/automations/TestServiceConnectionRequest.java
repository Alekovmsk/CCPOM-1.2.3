
package org.openmetadata.schema.entity.automations;

import javax.annotation.processing.Generated;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.entity.services.ServiceType;
import org.openmetadata.schema.security.secrets.SecretsManagerProvider;


/**
 * TestServiceConnectionRequest
 * <p>
 * Test Service Connection to test user provided configuration is valid or not.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "connection",
    "serviceType",
    "connectionType",
    "serviceName",
    "secretsManagerProvider"
})
@Generated("jsonschema2pojo")
public class TestServiceConnectionRequest {

    /**
     * Connection object.
     * 
     */
    @JsonProperty("connection")
    @JsonPropertyDescription("Connection object.")
    private Object connection;
    /**
     * Service Type
     * <p>
     * This schema defines the service types entities which requires a connection.
     * 
     */
    @JsonProperty("serviceType")
    @JsonPropertyDescription("This schema defines the service types entities which requires a connection.")
    private ServiceType serviceType;
    /**
     * Type of the connection to test such as Snowflake, MySQL, Looker, etc.
     * 
     */
    @JsonProperty("connectionType")
    @JsonPropertyDescription("Type of the connection to test such as Snowflake, MySQL, Looker, etc.")
    private String connectionType;
    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("serviceName")
    @JsonPropertyDescription("Name that identifies an entity.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()%]+$")
    @Size(min = 1, max = 128)
    private String serviceName;
    /**
     * Secrets Manager Provider
     * <p>
     * OpenMetadata Secrets Manager Provider. Make sure to configure the same secrets manager providers as the ones configured on the OpenMetadata server.
     * 
     */
    @JsonProperty("secretsManagerProvider")
    @JsonPropertyDescription("OpenMetadata Secrets Manager Provider. Make sure to configure the same secrets manager providers as the ones configured on the OpenMetadata server.")
    private SecretsManagerProvider secretsManagerProvider = SecretsManagerProvider.fromValue("noop");

    /**
     * Connection object.
     * 
     */
    @JsonProperty("connection")
    public Object getConnection() {
        return connection;
    }

    /**
     * Connection object.
     * 
     */
    @JsonProperty("connection")
    public void setConnection(Object connection) {
        this.connection = connection;
    }

    public TestServiceConnectionRequest withConnection(Object connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Service Type
     * <p>
     * This schema defines the service types entities which requires a connection.
     * 
     */
    @JsonProperty("serviceType")
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Service Type
     * <p>
     * This schema defines the service types entities which requires a connection.
     * 
     */
    @JsonProperty("serviceType")
    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public TestServiceConnectionRequest withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Type of the connection to test such as Snowflake, MySQL, Looker, etc.
     * 
     */
    @JsonProperty("connectionType")
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * Type of the connection to test such as Snowflake, MySQL, Looker, etc.
     * 
     */
    @JsonProperty("connectionType")
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public TestServiceConnectionRequest withConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("serviceName")
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("serviceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public TestServiceConnectionRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Secrets Manager Provider
     * <p>
     * OpenMetadata Secrets Manager Provider. Make sure to configure the same secrets manager providers as the ones configured on the OpenMetadata server.
     * 
     */
    @JsonProperty("secretsManagerProvider")
    public SecretsManagerProvider getSecretsManagerProvider() {
        return secretsManagerProvider;
    }

    /**
     * Secrets Manager Provider
     * <p>
     * OpenMetadata Secrets Manager Provider. Make sure to configure the same secrets manager providers as the ones configured on the OpenMetadata server.
     * 
     */
    @JsonProperty("secretsManagerProvider")
    public void setSecretsManagerProvider(SecretsManagerProvider secretsManagerProvider) {
        this.secretsManagerProvider = secretsManagerProvider;
    }

    public TestServiceConnectionRequest withSecretsManagerProvider(SecretsManagerProvider secretsManagerProvider) {
        this.secretsManagerProvider = secretsManagerProvider;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestServiceConnectionRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("connection");
        sb.append('=');
        sb.append(((this.connection == null)?"<null>":this.connection));
        sb.append(',');
        sb.append("serviceType");
        sb.append('=');
        sb.append(((this.serviceType == null)?"<null>":this.serviceType));
        sb.append(',');
        sb.append("connectionType");
        sb.append('=');
        sb.append(((this.connectionType == null)?"<null>":this.connectionType));
        sb.append(',');
        sb.append("serviceName");
        sb.append('=');
        sb.append(((this.serviceName == null)?"<null>":this.serviceName));
        sb.append(',');
        sb.append("secretsManagerProvider");
        sb.append('=');
        sb.append(((this.secretsManagerProvider == null)?"<null>":this.secretsManagerProvider));
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
        result = ((result* 31)+((this.serviceType == null)? 0 :this.serviceType.hashCode()));
        result = ((result* 31)+((this.connection == null)? 0 :this.connection.hashCode()));
        result = ((result* 31)+((this.secretsManagerProvider == null)? 0 :this.secretsManagerProvider.hashCode()));
        result = ((result* 31)+((this.serviceName == null)? 0 :this.serviceName.hashCode()));
        result = ((result* 31)+((this.connectionType == null)? 0 :this.connectionType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestServiceConnectionRequest) == false) {
            return false;
        }
        TestServiceConnectionRequest rhs = ((TestServiceConnectionRequest) other);
        return ((((((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType)))&&((this.connection == rhs.connection)||((this.connection!= null)&&this.connection.equals(rhs.connection))))&&((this.secretsManagerProvider == rhs.secretsManagerProvider)||((this.secretsManagerProvider!= null)&&this.secretsManagerProvider.equals(rhs.secretsManagerProvider))))&&((this.serviceName == rhs.serviceName)||((this.serviceName!= null)&&this.serviceName.equals(rhs.serviceName))))&&((this.connectionType == rhs.connectionType)||((this.connectionType!= null)&&this.connectionType.equals(rhs.connectionType))));
    }

}
