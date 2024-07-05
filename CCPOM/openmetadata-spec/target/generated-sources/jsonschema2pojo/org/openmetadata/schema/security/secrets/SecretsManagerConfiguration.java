
package org.openmetadata.schema.security.secrets;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ValidateSSLClientConfig
 * <p>
 * OpenMetadata server configuration for the Secrets Manager feature.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "secretsManager",
    "parameters"
})
@Generated("jsonschema2pojo")
public class SecretsManagerConfiguration {

    /**
     * Secrets Manager Provider
     * <p>
     * OpenMetadata Secrets Manager Provider. Make sure to configure the same secrets manager providers as the ones configured on the OpenMetadata server.
     * 
     */
    @JsonProperty("secretsManager")
    @JsonPropertyDescription("OpenMetadata Secrets Manager Provider. Make sure to configure the same secrets manager providers as the ones configured on the OpenMetadata server.")
    private SecretsManagerProvider secretsManager = SecretsManagerProvider.fromValue("noop");
    /**
     * Parameters
     * <p>
     * Extra parameters used by the Secrets Manager implementation.
     * 
     */
    @JsonProperty("parameters")
    @JsonPropertyDescription("Extra parameters used by the Secrets Manager implementation.")
    @Valid
    private Parameters parameters;

    /**
     * Secrets Manager Provider
     * <p>
     * OpenMetadata Secrets Manager Provider. Make sure to configure the same secrets manager providers as the ones configured on the OpenMetadata server.
     * 
     */
    @JsonProperty("secretsManager")
    public SecretsManagerProvider getSecretsManager() {
        return secretsManager;
    }

    /**
     * Secrets Manager Provider
     * <p>
     * OpenMetadata Secrets Manager Provider. Make sure to configure the same secrets manager providers as the ones configured on the OpenMetadata server.
     * 
     */
    @JsonProperty("secretsManager")
    public void setSecretsManager(SecretsManagerProvider secretsManager) {
        this.secretsManager = secretsManager;
    }

    public SecretsManagerConfiguration withSecretsManager(SecretsManagerProvider secretsManager) {
        this.secretsManager = secretsManager;
        return this;
    }

    /**
     * Parameters
     * <p>
     * Extra parameters used by the Secrets Manager implementation.
     * 
     */
    @JsonProperty("parameters")
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Parameters
     * <p>
     * Extra parameters used by the Secrets Manager implementation.
     * 
     */
    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public SecretsManagerConfiguration withParameters(Parameters parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecretsManagerConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("secretsManager");
        sb.append('=');
        sb.append(((this.secretsManager == null)?"<null>":this.secretsManager));
        sb.append(',');
        sb.append("parameters");
        sb.append('=');
        sb.append(((this.parameters == null)?"<null>":this.parameters));
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
        result = ((result* 31)+((this.secretsManager == null)? 0 :this.secretsManager.hashCode()));
        result = ((result* 31)+((this.parameters == null)? 0 :this.parameters.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecretsManagerConfiguration) == false) {
            return false;
        }
        SecretsManagerConfiguration rhs = ((SecretsManagerConfiguration) other);
        return (((this.secretsManager == rhs.secretsManager)||((this.secretsManager!= null)&&this.secretsManager.equals(rhs.secretsManager)))&&((this.parameters == rhs.parameters)||((this.parameters!= null)&&this.parameters.equals(rhs.parameters))));
    }

}
