
package org.openmetadata.schema.api.configuration.pipelineServiceClient;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.api.configuration.airflow.AuthConfiguration;
import org.openmetadata.schema.security.secrets.SecretsManagerClientLoader;
import org.openmetadata.schema.security.ssl.VerifySSL;
import org.openmetadata.schema.services.connections.metadata.AuthProvider;


/**
 * PipelineServiceClientConfiguration
 * <p>
 * This schema defines the Pipeline Service Client Configuration
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enabled",
    "className",
    "apiEndpoint",
    "hostIp",
    "healthCheckInterval",
    "ingestionIpInfoEnabled",
    "metadataApiEndpoint",
    "verifySSL",
    "sslConfig",
    "secretsManagerLoader",
    "authProvider",
    "authConfig",
    "parameters"
})
@Generated("jsonschema2pojo")
public class PipelineServiceClientConfiguration {

    /**
     * Flags if the ingestion from the OpenMetadata UI is enabled. If ingesting externally, we can set this value to false to not check the Pipeline Service Client component health.
     * 
     */
    @JsonProperty("enabled")
    @JsonPropertyDescription("Flags if the ingestion from the OpenMetadata UI is enabled. If ingesting externally, we can set this value to false to not check the Pipeline Service Client component health.")
    private Boolean enabled = true;
    /**
     * Class Name for the Pipeline Service Client.
     * (Required)
     * 
     */
    @JsonProperty("className")
    @JsonPropertyDescription("Class Name for the Pipeline Service Client.")
    @NotNull
    private String className;
    /**
     * External API root to interact with the Pipeline Service Client
     * (Required)
     * 
     */
    @JsonProperty("apiEndpoint")
    @JsonPropertyDescription("External API root to interact with the Pipeline Service Client")
    @NotNull
    private String apiEndpoint;
    /**
     * Pipeline Service Client host IP that will be used to connect to the sources.
     * 
     */
    @JsonProperty("hostIp")
    @JsonPropertyDescription("Pipeline Service Client host IP that will be used to connect to the sources.")
    private String hostIp;
    /**
     * Interval in seconds that the server will use to check the /status of the pipelineServiceClient and flag any errors in a Prometheus metric `pipelineServiceClientStatus.counter`.
     * 
     */
    @JsonProperty("healthCheckInterval")
    @JsonPropertyDescription("Interval in seconds that the server will use to check the /status of the pipelineServiceClient and flag any errors in a Prometheus metric `pipelineServiceClientStatus.counter`.")
    private Integer healthCheckInterval = 300;
    /**
     * Enable or disable the API that fetches the public IP running the ingestion process.
     * 
     */
    @JsonProperty("ingestionIpInfoEnabled")
    @JsonPropertyDescription("Enable or disable the API that fetches the public IP running the ingestion process.")
    private Boolean ingestionIpInfoEnabled = false;
    /**
     * Metadata api endpoint, e.g., `http://localhost:8585/api`
     * (Required)
     * 
     */
    @JsonProperty("metadataApiEndpoint")
    @JsonPropertyDescription("Metadata api endpoint, e.g., `http://localhost:8585/api`")
    @NotNull
    private String metadataApiEndpoint;
    /**
     * Verify SSL
     * <p>
     * Client SSL verification. Make sure to configure the SSLConfig if enabled.
     * 
     */
    @JsonProperty("verifySSL")
    @JsonPropertyDescription("Client SSL verification. Make sure to configure the SSLConfig if enabled.")
    private VerifySSL verifySSL = VerifySSL.fromValue("no-ssl");
    /**
     * SSL Config
     * <p>
     * Client SSL configuration
     * 
     */
    @JsonProperty("sslConfig")
    @JsonPropertyDescription("Client SSL configuration")
    private Object sslConfig;
    /**
     * Secrets Manager Client Loader
     * <p>
     * OpenMetadata Secrets Manager Client Loader. Lets the client know how the Secrets Manager Credentials should be loaded from the environment.
     * 
     */
    @JsonProperty("secretsManagerLoader")
    @JsonPropertyDescription("OpenMetadata Secrets Manager Client Loader. Lets the client know how the Secrets Manager Credentials should be loaded from the environment.")
    private SecretsManagerClientLoader secretsManagerLoader = SecretsManagerClientLoader.fromValue("noop");
    /**
     * OpenMetadata Server Authentication Provider. Make sure configure same auth providers as the one configured on OpenMetadata server.
     * 
     */
    @JsonProperty("authProvider")
    @JsonPropertyDescription("OpenMetadata Server Authentication Provider. Make sure configure same auth providers as the one configured on OpenMetadata server.")
    private AuthProvider authProvider = AuthProvider.fromValue("basic");
    /**
     * AuthConfiguration
     * <p>
     * This schema defines the Auth Config.
     * 
     */
    @JsonProperty("authConfig")
    @JsonPropertyDescription("This schema defines the Auth Config.")
    @Valid
    private AuthConfiguration authConfig;
    /**
     * Additional parameters to initialize the PipelineServiceClient.
     * 
     */
    @JsonProperty("parameters")
    @JsonPropertyDescription("Additional parameters to initialize the PipelineServiceClient.")
    @Valid
    private Parameters parameters;

    /**
     * Flags if the ingestion from the OpenMetadata UI is enabled. If ingesting externally, we can set this value to false to not check the Pipeline Service Client component health.
     * 
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Flags if the ingestion from the OpenMetadata UI is enabled. If ingesting externally, we can set this value to false to not check the Pipeline Service Client component health.
     * 
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public PipelineServiceClientConfiguration withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Class Name for the Pipeline Service Client.
     * (Required)
     * 
     */
    @JsonProperty("className")
    public String getClassName() {
        return className;
    }

    /**
     * Class Name for the Pipeline Service Client.
     * (Required)
     * 
     */
    @JsonProperty("className")
    public void setClassName(String className) {
        this.className = className;
    }

    public PipelineServiceClientConfiguration withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * External API root to interact with the Pipeline Service Client
     * (Required)
     * 
     */
    @JsonProperty("apiEndpoint")
    public String getApiEndpoint() {
        return apiEndpoint;
    }

    /**
     * External API root to interact with the Pipeline Service Client
     * (Required)
     * 
     */
    @JsonProperty("apiEndpoint")
    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

    public PipelineServiceClientConfiguration withApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
        return this;
    }

    /**
     * Pipeline Service Client host IP that will be used to connect to the sources.
     * 
     */
    @JsonProperty("hostIp")
    public String getHostIp() {
        return hostIp;
    }

    /**
     * Pipeline Service Client host IP that will be used to connect to the sources.
     * 
     */
    @JsonProperty("hostIp")
    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public PipelineServiceClientConfiguration withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * Interval in seconds that the server will use to check the /status of the pipelineServiceClient and flag any errors in a Prometheus metric `pipelineServiceClientStatus.counter`.
     * 
     */
    @JsonProperty("healthCheckInterval")
    public Integer getHealthCheckInterval() {
        return healthCheckInterval;
    }

    /**
     * Interval in seconds that the server will use to check the /status of the pipelineServiceClient and flag any errors in a Prometheus metric `pipelineServiceClientStatus.counter`.
     * 
     */
    @JsonProperty("healthCheckInterval")
    public void setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
    }

    public PipelineServiceClientConfiguration withHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }

    /**
     * Enable or disable the API that fetches the public IP running the ingestion process.
     * 
     */
    @JsonProperty("ingestionIpInfoEnabled")
    public Boolean getIngestionIpInfoEnabled() {
        return ingestionIpInfoEnabled;
    }

    /**
     * Enable or disable the API that fetches the public IP running the ingestion process.
     * 
     */
    @JsonProperty("ingestionIpInfoEnabled")
    public void setIngestionIpInfoEnabled(Boolean ingestionIpInfoEnabled) {
        this.ingestionIpInfoEnabled = ingestionIpInfoEnabled;
    }

    public PipelineServiceClientConfiguration withIngestionIpInfoEnabled(Boolean ingestionIpInfoEnabled) {
        this.ingestionIpInfoEnabled = ingestionIpInfoEnabled;
        return this;
    }

    /**
     * Metadata api endpoint, e.g., `http://localhost:8585/api`
     * (Required)
     * 
     */
    @JsonProperty("metadataApiEndpoint")
    public String getMetadataApiEndpoint() {
        return metadataApiEndpoint;
    }

    /**
     * Metadata api endpoint, e.g., `http://localhost:8585/api`
     * (Required)
     * 
     */
    @JsonProperty("metadataApiEndpoint")
    public void setMetadataApiEndpoint(String metadataApiEndpoint) {
        this.metadataApiEndpoint = metadataApiEndpoint;
    }

    public PipelineServiceClientConfiguration withMetadataApiEndpoint(String metadataApiEndpoint) {
        this.metadataApiEndpoint = metadataApiEndpoint;
        return this;
    }

    /**
     * Verify SSL
     * <p>
     * Client SSL verification. Make sure to configure the SSLConfig if enabled.
     * 
     */
    @JsonProperty("verifySSL")
    public VerifySSL getVerifySSL() {
        return verifySSL;
    }

    /**
     * Verify SSL
     * <p>
     * Client SSL verification. Make sure to configure the SSLConfig if enabled.
     * 
     */
    @JsonProperty("verifySSL")
    public void setVerifySSL(VerifySSL verifySSL) {
        this.verifySSL = verifySSL;
    }

    public PipelineServiceClientConfiguration withVerifySSL(VerifySSL verifySSL) {
        this.verifySSL = verifySSL;
        return this;
    }

    /**
     * SSL Config
     * <p>
     * Client SSL configuration
     * 
     */
    @JsonProperty("sslConfig")
    public Object getSslConfig() {
        return sslConfig;
    }

    /**
     * SSL Config
     * <p>
     * Client SSL configuration
     * 
     */
    @JsonProperty("sslConfig")
    public void setSslConfig(Object sslConfig) {
        this.sslConfig = sslConfig;
    }

    public PipelineServiceClientConfiguration withSslConfig(Object sslConfig) {
        this.sslConfig = sslConfig;
        return this;
    }

    /**
     * Secrets Manager Client Loader
     * <p>
     * OpenMetadata Secrets Manager Client Loader. Lets the client know how the Secrets Manager Credentials should be loaded from the environment.
     * 
     */
    @JsonProperty("secretsManagerLoader")
    public SecretsManagerClientLoader getSecretsManagerLoader() {
        return secretsManagerLoader;
    }

    /**
     * Secrets Manager Client Loader
     * <p>
     * OpenMetadata Secrets Manager Client Loader. Lets the client know how the Secrets Manager Credentials should be loaded from the environment.
     * 
     */
    @JsonProperty("secretsManagerLoader")
    public void setSecretsManagerLoader(SecretsManagerClientLoader secretsManagerLoader) {
        this.secretsManagerLoader = secretsManagerLoader;
    }

    public PipelineServiceClientConfiguration withSecretsManagerLoader(SecretsManagerClientLoader secretsManagerLoader) {
        this.secretsManagerLoader = secretsManagerLoader;
        return this;
    }

    /**
     * OpenMetadata Server Authentication Provider. Make sure configure same auth providers as the one configured on OpenMetadata server.
     * 
     */
    @JsonProperty("authProvider")
    public AuthProvider getAuthProvider() {
        return authProvider;
    }

    /**
     * OpenMetadata Server Authentication Provider. Make sure configure same auth providers as the one configured on OpenMetadata server.
     * 
     */
    @JsonProperty("authProvider")
    public void setAuthProvider(AuthProvider authProvider) {
        this.authProvider = authProvider;
    }

    public PipelineServiceClientConfiguration withAuthProvider(AuthProvider authProvider) {
        this.authProvider = authProvider;
        return this;
    }

    /**
     * AuthConfiguration
     * <p>
     * This schema defines the Auth Config.
     * 
     */
    @JsonProperty("authConfig")
    public AuthConfiguration getAuthConfig() {
        return authConfig;
    }

    /**
     * AuthConfiguration
     * <p>
     * This schema defines the Auth Config.
     * 
     */
    @JsonProperty("authConfig")
    public void setAuthConfig(AuthConfiguration authConfig) {
        this.authConfig = authConfig;
    }

    public PipelineServiceClientConfiguration withAuthConfig(AuthConfiguration authConfig) {
        this.authConfig = authConfig;
        return this;
    }

    /**
     * Additional parameters to initialize the PipelineServiceClient.
     * 
     */
    @JsonProperty("parameters")
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Additional parameters to initialize the PipelineServiceClient.
     * 
     */
    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public PipelineServiceClientConfiguration withParameters(Parameters parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PipelineServiceClientConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null)?"<null>":this.enabled));
        sb.append(',');
        sb.append("className");
        sb.append('=');
        sb.append(((this.className == null)?"<null>":this.className));
        sb.append(',');
        sb.append("apiEndpoint");
        sb.append('=');
        sb.append(((this.apiEndpoint == null)?"<null>":this.apiEndpoint));
        sb.append(',');
        sb.append("hostIp");
        sb.append('=');
        sb.append(((this.hostIp == null)?"<null>":this.hostIp));
        sb.append(',');
        sb.append("healthCheckInterval");
        sb.append('=');
        sb.append(((this.healthCheckInterval == null)?"<null>":this.healthCheckInterval));
        sb.append(',');
        sb.append("ingestionIpInfoEnabled");
        sb.append('=');
        sb.append(((this.ingestionIpInfoEnabled == null)?"<null>":this.ingestionIpInfoEnabled));
        sb.append(',');
        sb.append("metadataApiEndpoint");
        sb.append('=');
        sb.append(((this.metadataApiEndpoint == null)?"<null>":this.metadataApiEndpoint));
        sb.append(',');
        sb.append("verifySSL");
        sb.append('=');
        sb.append(((this.verifySSL == null)?"<null>":this.verifySSL));
        sb.append(',');
        sb.append("sslConfig");
        sb.append('=');
        sb.append(((this.sslConfig == null)?"<null>":this.sslConfig));
        sb.append(',');
        sb.append("secretsManagerLoader");
        sb.append('=');
        sb.append(((this.secretsManagerLoader == null)?"<null>":this.secretsManagerLoader));
        sb.append(',');
        sb.append("authProvider");
        sb.append('=');
        sb.append(((this.authProvider == null)?"<null>":this.authProvider));
        sb.append(',');
        sb.append("authConfig");
        sb.append('=');
        sb.append(((this.authConfig == null)?"<null>":this.authConfig));
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
        result = ((result* 31)+((this.sslConfig == null)? 0 :this.sslConfig.hashCode()));
        result = ((result* 31)+((this.hostIp == null)? 0 :this.hostIp.hashCode()));
        result = ((result* 31)+((this.authConfig == null)? 0 :this.authConfig.hashCode()));
        result = ((result* 31)+((this.className == null)? 0 :this.className.hashCode()));
        result = ((result* 31)+((this.metadataApiEndpoint == null)? 0 :this.metadataApiEndpoint.hashCode()));
        result = ((result* 31)+((this.enabled == null)? 0 :this.enabled.hashCode()));
        result = ((result* 31)+((this.healthCheckInterval == null)? 0 :this.healthCheckInterval.hashCode()));
        result = ((result* 31)+((this.authProvider == null)? 0 :this.authProvider.hashCode()));
        result = ((result* 31)+((this.apiEndpoint == null)? 0 :this.apiEndpoint.hashCode()));
        result = ((result* 31)+((this.verifySSL == null)? 0 :this.verifySSL.hashCode()));
        result = ((result* 31)+((this.secretsManagerLoader == null)? 0 :this.secretsManagerLoader.hashCode()));
        result = ((result* 31)+((this.parameters == null)? 0 :this.parameters.hashCode()));
        result = ((result* 31)+((this.ingestionIpInfoEnabled == null)? 0 :this.ingestionIpInfoEnabled.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PipelineServiceClientConfiguration) == false) {
            return false;
        }
        PipelineServiceClientConfiguration rhs = ((PipelineServiceClientConfiguration) other);
        return ((((((((((((((this.sslConfig == rhs.sslConfig)||((this.sslConfig!= null)&&this.sslConfig.equals(rhs.sslConfig)))&&((this.hostIp == rhs.hostIp)||((this.hostIp!= null)&&this.hostIp.equals(rhs.hostIp))))&&((this.authConfig == rhs.authConfig)||((this.authConfig!= null)&&this.authConfig.equals(rhs.authConfig))))&&((this.className == rhs.className)||((this.className!= null)&&this.className.equals(rhs.className))))&&((this.metadataApiEndpoint == rhs.metadataApiEndpoint)||((this.metadataApiEndpoint!= null)&&this.metadataApiEndpoint.equals(rhs.metadataApiEndpoint))))&&((this.enabled == rhs.enabled)||((this.enabled!= null)&&this.enabled.equals(rhs.enabled))))&&((this.healthCheckInterval == rhs.healthCheckInterval)||((this.healthCheckInterval!= null)&&this.healthCheckInterval.equals(rhs.healthCheckInterval))))&&((this.authProvider == rhs.authProvider)||((this.authProvider!= null)&&this.authProvider.equals(rhs.authProvider))))&&((this.apiEndpoint == rhs.apiEndpoint)||((this.apiEndpoint!= null)&&this.apiEndpoint.equals(rhs.apiEndpoint))))&&((this.verifySSL == rhs.verifySSL)||((this.verifySSL!= null)&&this.verifySSL.equals(rhs.verifySSL))))&&((this.secretsManagerLoader == rhs.secretsManagerLoader)||((this.secretsManagerLoader!= null)&&this.secretsManagerLoader.equals(rhs.secretsManagerLoader))))&&((this.parameters == rhs.parameters)||((this.parameters!= null)&&this.parameters.equals(rhs.parameters))))&&((this.ingestionIpInfoEnabled == rhs.ingestionIpInfoEnabled)||((this.ingestionIpInfoEnabled!= null)&&this.ingestionIpInfoEnabled.equals(rhs.ingestionIpInfoEnabled))));
    }

}
