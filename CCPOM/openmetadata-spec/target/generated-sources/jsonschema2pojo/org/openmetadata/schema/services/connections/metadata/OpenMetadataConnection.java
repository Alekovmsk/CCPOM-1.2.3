
package org.openmetadata.schema.services.connections.metadata;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.annotations.MaskedField;
import org.openmetadata.schema.security.secrets.SecretsManagerClientLoader;
import org.openmetadata.schema.security.secrets.SecretsManagerProvider;
import org.openmetadata.schema.security.ssl.VerifySSL;


/**
 * OpenMetadataConnection
 * <p>
 * OpenMetadata Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clusterName",
    "type",
    "hostPort",
    "authProvider",
    "verifySSL",
    "sslConfig",
    "securityConfig",
    "secretsManagerProvider",
    "secretsManagerLoader",
    "apiVersion",
    "includeTopics",
    "includeTables",
    "includeDashboards",
    "includePipelines",
    "includeMlModels",
    "includeUsers",
    "includeTeams",
    "includeGlossaryTerms",
    "includeTags",
    "includePolicy",
    "includeMessagingServices",
    "enableVersionValidation",
    "includeDatabaseServices",
    "includePipelineServices",
    "limitRecords",
    "forceEntityOverwriting",
    "storeServiceConnection",
    "elasticsSearch",
    "supportsDataInsightExtraction",
    "supportsElasticSearchReindexingExtraction",
    "extraHeaders"
})
@Generated("jsonschema2pojo")
public class OpenMetadataConnection {

    /**
     * Cluster name to differentiate OpenMetadata Server instance
     * 
     */
    @JsonProperty("clusterName")
    @JsonPropertyDescription("Cluster name to differentiate OpenMetadata Server instance")
    private String clusterName = "openmetadata";
    /**
     * OpenMetadata service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("OpenMetadata service type")
    private OpenMetadataConnection.OpenmetadataType type = OpenMetadataConnection.OpenmetadataType.fromValue("OpenMetadata");
    /**
     * OpenMetadata Server Config. Must include API end point ex: http://localhost:8585/api
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("OpenMetadata Server Config. Must include API end point ex: http://localhost:8585/api")
    @NotNull
    private String hostPort = "http://localhost:8585/api";
    /**
     * OpenMetadata Server Authentication Provider. Make sure configure same auth providers as the one configured on OpenMetadata server.
     * 
     */
    @JsonProperty("authProvider")
    @JsonPropertyDescription("OpenMetadata Server Authentication Provider. Make sure configure same auth providers as the one configured on OpenMetadata server.")
    private AuthProvider authProvider = AuthProvider.fromValue("basic");
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
     * OpenMetadata Client security configuration.
     * 
     */
    @JsonProperty("securityConfig")
    @JsonPropertyDescription("OpenMetadata Client security configuration.")
    @MaskedField
    private Object securityConfig;
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
     * Secrets Manager Client Loader
     * <p>
     * OpenMetadata Secrets Manager Client Loader. Lets the client know how the Secrets Manager Credentials should be loaded from the environment.
     * 
     */
    @JsonProperty("secretsManagerLoader")
    @JsonPropertyDescription("OpenMetadata Secrets Manager Client Loader. Lets the client know how the Secrets Manager Credentials should be loaded from the environment.")
    private SecretsManagerClientLoader secretsManagerLoader = SecretsManagerClientLoader.fromValue("noop");
    /**
     * OpenMetadata server API version to use.
     * 
     */
    @JsonProperty("apiVersion")
    @JsonPropertyDescription("OpenMetadata server API version to use.")
    private String apiVersion = "v1";
    /**
     * Include Topics for Indexing
     * 
     */
    @JsonProperty("includeTopics")
    @JsonPropertyDescription("Include Topics for Indexing")
    private Boolean includeTopics = true;
    /**
     * Include Tables for Indexing
     * 
     */
    @JsonProperty("includeTables")
    @JsonPropertyDescription("Include Tables for Indexing")
    private Boolean includeTables = true;
    /**
     * Include Dashboards for Indexing
     * 
     */
    @JsonProperty("includeDashboards")
    @JsonPropertyDescription("Include Dashboards for Indexing")
    private Boolean includeDashboards = true;
    /**
     * Include Pipelines for Indexing
     * 
     */
    @JsonProperty("includePipelines")
    @JsonPropertyDescription("Include Pipelines for Indexing")
    private Boolean includePipelines = true;
    /**
     * Include MlModels for Indexing
     * 
     */
    @JsonProperty("includeMlModels")
    @JsonPropertyDescription("Include MlModels for Indexing")
    private Boolean includeMlModels = true;
    /**
     * Include Users for Indexing
     * 
     */
    @JsonProperty("includeUsers")
    @JsonPropertyDescription("Include Users for Indexing")
    private Boolean includeUsers = true;
    /**
     * Include Teams for Indexing
     * 
     */
    @JsonProperty("includeTeams")
    @JsonPropertyDescription("Include Teams for Indexing")
    private Boolean includeTeams = true;
    /**
     * Include Glossary Terms for Indexing
     * 
     */
    @JsonProperty("includeGlossaryTerms")
    @JsonPropertyDescription("Include Glossary Terms for Indexing")
    private Boolean includeGlossaryTerms = true;
    /**
     * Include Tags for Indexing
     * 
     */
    @JsonProperty("includeTags")
    @JsonPropertyDescription("Include Tags for Indexing")
    private Boolean includeTags = true;
    /**
     * Include Tags for Policy
     * 
     */
    @JsonProperty("includePolicy")
    @JsonPropertyDescription("Include Tags for Policy")
    private Boolean includePolicy = true;
    /**
     * Include Messaging Services for Indexing
     * 
     */
    @JsonProperty("includeMessagingServices")
    @JsonPropertyDescription("Include Messaging Services for Indexing")
    private Boolean includeMessagingServices = true;
    /**
     * Validate Openmetadata Server & Client Version.
     * 
     */
    @JsonProperty("enableVersionValidation")
    @JsonPropertyDescription("Validate Openmetadata Server & Client Version.")
    private Boolean enableVersionValidation = true;
    /**
     * Include Database Services for Indexing
     * 
     */
    @JsonProperty("includeDatabaseServices")
    @JsonPropertyDescription("Include Database Services for Indexing")
    private Boolean includeDatabaseServices = true;
    /**
     * Include Pipeline Services for Indexing
     * 
     */
    @JsonProperty("includePipelineServices")
    @JsonPropertyDescription("Include Pipeline Services for Indexing")
    private Boolean includePipelineServices = true;
    /**
     * Limit the number of records for Indexing.
     * 
     */
    @JsonProperty("limitRecords")
    @JsonPropertyDescription("Limit the number of records for Indexing.")
    private Integer limitRecords = 1000;
    /**
     * Force the overwriting of any entity during the ingestion.
     * 
     */
    @JsonProperty("forceEntityOverwriting")
    @JsonPropertyDescription("Force the overwriting of any entity during the ingestion.")
    private Boolean forceEntityOverwriting = false;
    /**
     * If set to true, when creating a service during the ingestion we will store its Service Connection. Otherwise, the ingestion will create a bare service without connection details.
     * 
     */
    @JsonProperty("storeServiceConnection")
    @JsonPropertyDescription("If set to true, when creating a service during the ingestion we will store its Service Connection. Otherwise, the ingestion will create a bare service without connection details.")
    private Boolean storeServiceConnection = true;
    /**
     * Configuration for Sink Component in the OpenMetadata Ingestion Framework.
     * 
     */
    @JsonProperty("elasticsSearch")
    @JsonPropertyDescription("Configuration for Sink Component in the OpenMetadata Ingestion Framework.")
    @Valid
    private ElasticsSearch elasticsSearch;
    /**
     * Support Metadata To Elastic Search
     * 
     */
    @JsonProperty("supportsDataInsightExtraction")
    @JsonPropertyDescription("Support Metadata To Elastic Search")
    private Boolean supportsDataInsightExtraction = true;
    /**
     * Support Elastic Search Reindexing
     * 
     */
    @JsonProperty("supportsElasticSearchReindexingExtraction")
    @JsonPropertyDescription("Support Elastic Search Reindexing")
    private Boolean supportsElasticSearchReindexingExtraction = true;
    /**
     * Additional headers to be sent to the API endpoint.
     * 
     */
    @JsonProperty("extraHeaders")
    @JsonPropertyDescription("Additional headers to be sent to the API endpoint.")
    @Valid
    private ExtraHeaders extraHeaders;

    /**
     * Cluster name to differentiate OpenMetadata Server instance
     * 
     */
    @JsonProperty("clusterName")
    public String getClusterName() {
        return clusterName;
    }

    /**
     * Cluster name to differentiate OpenMetadata Server instance
     * 
     */
    @JsonProperty("clusterName")
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public OpenMetadataConnection withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * OpenMetadata service type
     * 
     */
    @JsonProperty("type")
    public OpenMetadataConnection.OpenmetadataType getType() {
        return type;
    }

    /**
     * OpenMetadata service type
     * 
     */
    @JsonProperty("type")
    public void setType(OpenMetadataConnection.OpenmetadataType type) {
        this.type = type;
    }

    public OpenMetadataConnection withType(OpenMetadataConnection.OpenmetadataType type) {
        this.type = type;
        return this;
    }

    /**
     * OpenMetadata Server Config. Must include API end point ex: http://localhost:8585/api
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    public String getHostPort() {
        return hostPort;
    }

    /**
     * OpenMetadata Server Config. Must include API end point ex: http://localhost:8585/api
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public OpenMetadataConnection withHostPort(String hostPort) {
        this.hostPort = hostPort;
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

    public OpenMetadataConnection withAuthProvider(AuthProvider authProvider) {
        this.authProvider = authProvider;
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

    public OpenMetadataConnection withVerifySSL(VerifySSL verifySSL) {
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

    public OpenMetadataConnection withSslConfig(Object sslConfig) {
        this.sslConfig = sslConfig;
        return this;
    }

    /**
     * OpenMetadata Client security configuration.
     * 
     */
    @JsonProperty("securityConfig")
    @MaskedField
    public Object getSecurityConfig() {
        return securityConfig;
    }

    /**
     * OpenMetadata Client security configuration.
     * 
     */
    @JsonProperty("securityConfig")
    @MaskedField
    public void setSecurityConfig(Object securityConfig) {
        this.securityConfig = securityConfig;
    }

    public OpenMetadataConnection withSecurityConfig(Object securityConfig) {
        this.securityConfig = securityConfig;
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

    public OpenMetadataConnection withSecretsManagerProvider(SecretsManagerProvider secretsManagerProvider) {
        this.secretsManagerProvider = secretsManagerProvider;
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

    public OpenMetadataConnection withSecretsManagerLoader(SecretsManagerClientLoader secretsManagerLoader) {
        this.secretsManagerLoader = secretsManagerLoader;
        return this;
    }

    /**
     * OpenMetadata server API version to use.
     * 
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * OpenMetadata server API version to use.
     * 
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public OpenMetadataConnection withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Include Topics for Indexing
     * 
     */
    @JsonProperty("includeTopics")
    public Boolean getIncludeTopics() {
        return includeTopics;
    }

    /**
     * Include Topics for Indexing
     * 
     */
    @JsonProperty("includeTopics")
    public void setIncludeTopics(Boolean includeTopics) {
        this.includeTopics = includeTopics;
    }

    public OpenMetadataConnection withIncludeTopics(Boolean includeTopics) {
        this.includeTopics = includeTopics;
        return this;
    }

    /**
     * Include Tables for Indexing
     * 
     */
    @JsonProperty("includeTables")
    public Boolean getIncludeTables() {
        return includeTables;
    }

    /**
     * Include Tables for Indexing
     * 
     */
    @JsonProperty("includeTables")
    public void setIncludeTables(Boolean includeTables) {
        this.includeTables = includeTables;
    }

    public OpenMetadataConnection withIncludeTables(Boolean includeTables) {
        this.includeTables = includeTables;
        return this;
    }

    /**
     * Include Dashboards for Indexing
     * 
     */
    @JsonProperty("includeDashboards")
    public Boolean getIncludeDashboards() {
        return includeDashboards;
    }

    /**
     * Include Dashboards for Indexing
     * 
     */
    @JsonProperty("includeDashboards")
    public void setIncludeDashboards(Boolean includeDashboards) {
        this.includeDashboards = includeDashboards;
    }

    public OpenMetadataConnection withIncludeDashboards(Boolean includeDashboards) {
        this.includeDashboards = includeDashboards;
        return this;
    }

    /**
     * Include Pipelines for Indexing
     * 
     */
    @JsonProperty("includePipelines")
    public Boolean getIncludePipelines() {
        return includePipelines;
    }

    /**
     * Include Pipelines for Indexing
     * 
     */
    @JsonProperty("includePipelines")
    public void setIncludePipelines(Boolean includePipelines) {
        this.includePipelines = includePipelines;
    }

    public OpenMetadataConnection withIncludePipelines(Boolean includePipelines) {
        this.includePipelines = includePipelines;
        return this;
    }

    /**
     * Include MlModels for Indexing
     * 
     */
    @JsonProperty("includeMlModels")
    public Boolean getIncludeMlModels() {
        return includeMlModels;
    }

    /**
     * Include MlModels for Indexing
     * 
     */
    @JsonProperty("includeMlModels")
    public void setIncludeMlModels(Boolean includeMlModels) {
        this.includeMlModels = includeMlModels;
    }

    public OpenMetadataConnection withIncludeMlModels(Boolean includeMlModels) {
        this.includeMlModels = includeMlModels;
        return this;
    }

    /**
     * Include Users for Indexing
     * 
     */
    @JsonProperty("includeUsers")
    public Boolean getIncludeUsers() {
        return includeUsers;
    }

    /**
     * Include Users for Indexing
     * 
     */
    @JsonProperty("includeUsers")
    public void setIncludeUsers(Boolean includeUsers) {
        this.includeUsers = includeUsers;
    }

    public OpenMetadataConnection withIncludeUsers(Boolean includeUsers) {
        this.includeUsers = includeUsers;
        return this;
    }

    /**
     * Include Teams for Indexing
     * 
     */
    @JsonProperty("includeTeams")
    public Boolean getIncludeTeams() {
        return includeTeams;
    }

    /**
     * Include Teams for Indexing
     * 
     */
    @JsonProperty("includeTeams")
    public void setIncludeTeams(Boolean includeTeams) {
        this.includeTeams = includeTeams;
    }

    public OpenMetadataConnection withIncludeTeams(Boolean includeTeams) {
        this.includeTeams = includeTeams;
        return this;
    }

    /**
     * Include Glossary Terms for Indexing
     * 
     */
    @JsonProperty("includeGlossaryTerms")
    public Boolean getIncludeGlossaryTerms() {
        return includeGlossaryTerms;
    }

    /**
     * Include Glossary Terms for Indexing
     * 
     */
    @JsonProperty("includeGlossaryTerms")
    public void setIncludeGlossaryTerms(Boolean includeGlossaryTerms) {
        this.includeGlossaryTerms = includeGlossaryTerms;
    }

    public OpenMetadataConnection withIncludeGlossaryTerms(Boolean includeGlossaryTerms) {
        this.includeGlossaryTerms = includeGlossaryTerms;
        return this;
    }

    /**
     * Include Tags for Indexing
     * 
     */
    @JsonProperty("includeTags")
    public Boolean getIncludeTags() {
        return includeTags;
    }

    /**
     * Include Tags for Indexing
     * 
     */
    @JsonProperty("includeTags")
    public void setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
    }

    public OpenMetadataConnection withIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
        return this;
    }

    /**
     * Include Tags for Policy
     * 
     */
    @JsonProperty("includePolicy")
    public Boolean getIncludePolicy() {
        return includePolicy;
    }

    /**
     * Include Tags for Policy
     * 
     */
    @JsonProperty("includePolicy")
    public void setIncludePolicy(Boolean includePolicy) {
        this.includePolicy = includePolicy;
    }

    public OpenMetadataConnection withIncludePolicy(Boolean includePolicy) {
        this.includePolicy = includePolicy;
        return this;
    }

    /**
     * Include Messaging Services for Indexing
     * 
     */
    @JsonProperty("includeMessagingServices")
    public Boolean getIncludeMessagingServices() {
        return includeMessagingServices;
    }

    /**
     * Include Messaging Services for Indexing
     * 
     */
    @JsonProperty("includeMessagingServices")
    public void setIncludeMessagingServices(Boolean includeMessagingServices) {
        this.includeMessagingServices = includeMessagingServices;
    }

    public OpenMetadataConnection withIncludeMessagingServices(Boolean includeMessagingServices) {
        this.includeMessagingServices = includeMessagingServices;
        return this;
    }

    /**
     * Validate Openmetadata Server & Client Version.
     * 
     */
    @JsonProperty("enableVersionValidation")
    public Boolean getEnableVersionValidation() {
        return enableVersionValidation;
    }

    /**
     * Validate Openmetadata Server & Client Version.
     * 
     */
    @JsonProperty("enableVersionValidation")
    public void setEnableVersionValidation(Boolean enableVersionValidation) {
        this.enableVersionValidation = enableVersionValidation;
    }

    public OpenMetadataConnection withEnableVersionValidation(Boolean enableVersionValidation) {
        this.enableVersionValidation = enableVersionValidation;
        return this;
    }

    /**
     * Include Database Services for Indexing
     * 
     */
    @JsonProperty("includeDatabaseServices")
    public Boolean getIncludeDatabaseServices() {
        return includeDatabaseServices;
    }

    /**
     * Include Database Services for Indexing
     * 
     */
    @JsonProperty("includeDatabaseServices")
    public void setIncludeDatabaseServices(Boolean includeDatabaseServices) {
        this.includeDatabaseServices = includeDatabaseServices;
    }

    public OpenMetadataConnection withIncludeDatabaseServices(Boolean includeDatabaseServices) {
        this.includeDatabaseServices = includeDatabaseServices;
        return this;
    }

    /**
     * Include Pipeline Services for Indexing
     * 
     */
    @JsonProperty("includePipelineServices")
    public Boolean getIncludePipelineServices() {
        return includePipelineServices;
    }

    /**
     * Include Pipeline Services for Indexing
     * 
     */
    @JsonProperty("includePipelineServices")
    public void setIncludePipelineServices(Boolean includePipelineServices) {
        this.includePipelineServices = includePipelineServices;
    }

    public OpenMetadataConnection withIncludePipelineServices(Boolean includePipelineServices) {
        this.includePipelineServices = includePipelineServices;
        return this;
    }

    /**
     * Limit the number of records for Indexing.
     * 
     */
    @JsonProperty("limitRecords")
    public Integer getLimitRecords() {
        return limitRecords;
    }

    /**
     * Limit the number of records for Indexing.
     * 
     */
    @JsonProperty("limitRecords")
    public void setLimitRecords(Integer limitRecords) {
        this.limitRecords = limitRecords;
    }

    public OpenMetadataConnection withLimitRecords(Integer limitRecords) {
        this.limitRecords = limitRecords;
        return this;
    }

    /**
     * Force the overwriting of any entity during the ingestion.
     * 
     */
    @JsonProperty("forceEntityOverwriting")
    public Boolean getForceEntityOverwriting() {
        return forceEntityOverwriting;
    }

    /**
     * Force the overwriting of any entity during the ingestion.
     * 
     */
    @JsonProperty("forceEntityOverwriting")
    public void setForceEntityOverwriting(Boolean forceEntityOverwriting) {
        this.forceEntityOverwriting = forceEntityOverwriting;
    }

    public OpenMetadataConnection withForceEntityOverwriting(Boolean forceEntityOverwriting) {
        this.forceEntityOverwriting = forceEntityOverwriting;
        return this;
    }

    /**
     * If set to true, when creating a service during the ingestion we will store its Service Connection. Otherwise, the ingestion will create a bare service without connection details.
     * 
     */
    @JsonProperty("storeServiceConnection")
    public Boolean getStoreServiceConnection() {
        return storeServiceConnection;
    }

    /**
     * If set to true, when creating a service during the ingestion we will store its Service Connection. Otherwise, the ingestion will create a bare service without connection details.
     * 
     */
    @JsonProperty("storeServiceConnection")
    public void setStoreServiceConnection(Boolean storeServiceConnection) {
        this.storeServiceConnection = storeServiceConnection;
    }

    public OpenMetadataConnection withStoreServiceConnection(Boolean storeServiceConnection) {
        this.storeServiceConnection = storeServiceConnection;
        return this;
    }

    /**
     * Configuration for Sink Component in the OpenMetadata Ingestion Framework.
     * 
     */
    @JsonProperty("elasticsSearch")
    public ElasticsSearch getElasticsSearch() {
        return elasticsSearch;
    }

    /**
     * Configuration for Sink Component in the OpenMetadata Ingestion Framework.
     * 
     */
    @JsonProperty("elasticsSearch")
    public void setElasticsSearch(ElasticsSearch elasticsSearch) {
        this.elasticsSearch = elasticsSearch;
    }

    public OpenMetadataConnection withElasticsSearch(ElasticsSearch elasticsSearch) {
        this.elasticsSearch = elasticsSearch;
        return this;
    }

    /**
     * Support Metadata To Elastic Search
     * 
     */
    @JsonProperty("supportsDataInsightExtraction")
    public Boolean getSupportsDataInsightExtraction() {
        return supportsDataInsightExtraction;
    }

    /**
     * Support Metadata To Elastic Search
     * 
     */
    @JsonProperty("supportsDataInsightExtraction")
    public void setSupportsDataInsightExtraction(Boolean supportsDataInsightExtraction) {
        this.supportsDataInsightExtraction = supportsDataInsightExtraction;
    }

    public OpenMetadataConnection withSupportsDataInsightExtraction(Boolean supportsDataInsightExtraction) {
        this.supportsDataInsightExtraction = supportsDataInsightExtraction;
        return this;
    }

    /**
     * Support Elastic Search Reindexing
     * 
     */
    @JsonProperty("supportsElasticSearchReindexingExtraction")
    public Boolean getSupportsElasticSearchReindexingExtraction() {
        return supportsElasticSearchReindexingExtraction;
    }

    /**
     * Support Elastic Search Reindexing
     * 
     */
    @JsonProperty("supportsElasticSearchReindexingExtraction")
    public void setSupportsElasticSearchReindexingExtraction(Boolean supportsElasticSearchReindexingExtraction) {
        this.supportsElasticSearchReindexingExtraction = supportsElasticSearchReindexingExtraction;
    }

    public OpenMetadataConnection withSupportsElasticSearchReindexingExtraction(Boolean supportsElasticSearchReindexingExtraction) {
        this.supportsElasticSearchReindexingExtraction = supportsElasticSearchReindexingExtraction;
        return this;
    }

    /**
     * Additional headers to be sent to the API endpoint.
     * 
     */
    @JsonProperty("extraHeaders")
    public ExtraHeaders getExtraHeaders() {
        return extraHeaders;
    }

    /**
     * Additional headers to be sent to the API endpoint.
     * 
     */
    @JsonProperty("extraHeaders")
    public void setExtraHeaders(ExtraHeaders extraHeaders) {
        this.extraHeaders = extraHeaders;
    }

    public OpenMetadataConnection withExtraHeaders(ExtraHeaders extraHeaders) {
        this.extraHeaders = extraHeaders;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenMetadataConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clusterName");
        sb.append('=');
        sb.append(((this.clusterName == null)?"<null>":this.clusterName));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("authProvider");
        sb.append('=');
        sb.append(((this.authProvider == null)?"<null>":this.authProvider));
        sb.append(',');
        sb.append("verifySSL");
        sb.append('=');
        sb.append(((this.verifySSL == null)?"<null>":this.verifySSL));
        sb.append(',');
        sb.append("sslConfig");
        sb.append('=');
        sb.append(((this.sslConfig == null)?"<null>":this.sslConfig));
        sb.append(',');
        sb.append("securityConfig");
        sb.append('=');
        sb.append(((this.securityConfig == null)?"<null>":this.securityConfig));
        sb.append(',');
        sb.append("secretsManagerProvider");
        sb.append('=');
        sb.append(((this.secretsManagerProvider == null)?"<null>":this.secretsManagerProvider));
        sb.append(',');
        sb.append("secretsManagerLoader");
        sb.append('=');
        sb.append(((this.secretsManagerLoader == null)?"<null>":this.secretsManagerLoader));
        sb.append(',');
        sb.append("apiVersion");
        sb.append('=');
        sb.append(((this.apiVersion == null)?"<null>":this.apiVersion));
        sb.append(',');
        sb.append("includeTopics");
        sb.append('=');
        sb.append(((this.includeTopics == null)?"<null>":this.includeTopics));
        sb.append(',');
        sb.append("includeTables");
        sb.append('=');
        sb.append(((this.includeTables == null)?"<null>":this.includeTables));
        sb.append(',');
        sb.append("includeDashboards");
        sb.append('=');
        sb.append(((this.includeDashboards == null)?"<null>":this.includeDashboards));
        sb.append(',');
        sb.append("includePipelines");
        sb.append('=');
        sb.append(((this.includePipelines == null)?"<null>":this.includePipelines));
        sb.append(',');
        sb.append("includeMlModels");
        sb.append('=');
        sb.append(((this.includeMlModels == null)?"<null>":this.includeMlModels));
        sb.append(',');
        sb.append("includeUsers");
        sb.append('=');
        sb.append(((this.includeUsers == null)?"<null>":this.includeUsers));
        sb.append(',');
        sb.append("includeTeams");
        sb.append('=');
        sb.append(((this.includeTeams == null)?"<null>":this.includeTeams));
        sb.append(',');
        sb.append("includeGlossaryTerms");
        sb.append('=');
        sb.append(((this.includeGlossaryTerms == null)?"<null>":this.includeGlossaryTerms));
        sb.append(',');
        sb.append("includeTags");
        sb.append('=');
        sb.append(((this.includeTags == null)?"<null>":this.includeTags));
        sb.append(',');
        sb.append("includePolicy");
        sb.append('=');
        sb.append(((this.includePolicy == null)?"<null>":this.includePolicy));
        sb.append(',');
        sb.append("includeMessagingServices");
        sb.append('=');
        sb.append(((this.includeMessagingServices == null)?"<null>":this.includeMessagingServices));
        sb.append(',');
        sb.append("enableVersionValidation");
        sb.append('=');
        sb.append(((this.enableVersionValidation == null)?"<null>":this.enableVersionValidation));
        sb.append(',');
        sb.append("includeDatabaseServices");
        sb.append('=');
        sb.append(((this.includeDatabaseServices == null)?"<null>":this.includeDatabaseServices));
        sb.append(',');
        sb.append("includePipelineServices");
        sb.append('=');
        sb.append(((this.includePipelineServices == null)?"<null>":this.includePipelineServices));
        sb.append(',');
        sb.append("limitRecords");
        sb.append('=');
        sb.append(((this.limitRecords == null)?"<null>":this.limitRecords));
        sb.append(',');
        sb.append("forceEntityOverwriting");
        sb.append('=');
        sb.append(((this.forceEntityOverwriting == null)?"<null>":this.forceEntityOverwriting));
        sb.append(',');
        sb.append("storeServiceConnection");
        sb.append('=');
        sb.append(((this.storeServiceConnection == null)?"<null>":this.storeServiceConnection));
        sb.append(',');
        sb.append("elasticsSearch");
        sb.append('=');
        sb.append(((this.elasticsSearch == null)?"<null>":this.elasticsSearch));
        sb.append(',');
        sb.append("supportsDataInsightExtraction");
        sb.append('=');
        sb.append(((this.supportsDataInsightExtraction == null)?"<null>":this.supportsDataInsightExtraction));
        sb.append(',');
        sb.append("supportsElasticSearchReindexingExtraction");
        sb.append('=');
        sb.append(((this.supportsElasticSearchReindexingExtraction == null)?"<null>":this.supportsElasticSearchReindexingExtraction));
        sb.append(',');
        sb.append("extraHeaders");
        sb.append('=');
        sb.append(((this.extraHeaders == null)?"<null>":this.extraHeaders));
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
        result = ((result* 31)+((this.includeTables == null)? 0 :this.includeTables.hashCode()));
        result = ((result* 31)+((this.sslConfig == null)? 0 :this.sslConfig.hashCode()));
        result = ((result* 31)+((this.includeTeams == null)? 0 :this.includeTeams.hashCode()));
        result = ((result* 31)+((this.includeTags == null)? 0 :this.includeTags.hashCode()));
        result = ((result* 31)+((this.elasticsSearch == null)? 0 :this.elasticsSearch.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.includeDashboards == null)? 0 :this.includeDashboards.hashCode()));
        result = ((result* 31)+((this.authProvider == null)? 0 :this.authProvider.hashCode()));
        result = ((result* 31)+((this.apiVersion == null)? 0 :this.apiVersion.hashCode()));
        result = ((result* 31)+((this.includeTopics == null)? 0 :this.includeTopics.hashCode()));
        result = ((result* 31)+((this.includePipelines == null)? 0 :this.includePipelines.hashCode()));
        result = ((result* 31)+((this.includeMessagingServices == null)? 0 :this.includeMessagingServices.hashCode()));
        result = ((result* 31)+((this.clusterName == null)? 0 :this.clusterName.hashCode()));
        result = ((result* 31)+((this.includePolicy == null)? 0 :this.includePolicy.hashCode()));
        result = ((result* 31)+((this.includeDatabaseServices == null)? 0 :this.includeDatabaseServices.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.includeGlossaryTerms == null)? 0 :this.includeGlossaryTerms.hashCode()));
        result = ((result* 31)+((this.limitRecords == null)? 0 :this.limitRecords.hashCode()));
        result = ((result* 31)+((this.secretsManagerLoader == null)? 0 :this.secretsManagerLoader.hashCode()));
        result = ((result* 31)+((this.includeMlModels == null)? 0 :this.includeMlModels.hashCode()));
        result = ((result* 31)+((this.storeServiceConnection == null)? 0 :this.storeServiceConnection.hashCode()));
        result = ((result* 31)+((this.extraHeaders == null)? 0 :this.extraHeaders.hashCode()));
        result = ((result* 31)+((this.supportsDataInsightExtraction == null)? 0 :this.supportsDataInsightExtraction.hashCode()));
        result = ((result* 31)+((this.includePipelineServices == null)? 0 :this.includePipelineServices.hashCode()));
        result = ((result* 31)+((this.supportsElasticSearchReindexingExtraction == null)? 0 :this.supportsElasticSearchReindexingExtraction.hashCode()));
        result = ((result* 31)+((this.securityConfig == null)? 0 :this.securityConfig.hashCode()));
        result = ((result* 31)+((this.secretsManagerProvider == null)? 0 :this.secretsManagerProvider.hashCode()));
        result = ((result* 31)+((this.forceEntityOverwriting == null)? 0 :this.forceEntityOverwriting.hashCode()));
        result = ((result* 31)+((this.enableVersionValidation == null)? 0 :this.enableVersionValidation.hashCode()));
        result = ((result* 31)+((this.verifySSL == null)? 0 :this.verifySSL.hashCode()));
        result = ((result* 31)+((this.includeUsers == null)? 0 :this.includeUsers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpenMetadataConnection) == false) {
            return false;
        }
        OpenMetadataConnection rhs = ((OpenMetadataConnection) other);
        return ((((((((((((((((((((((((((((((((this.includeTables == rhs.includeTables)||((this.includeTables!= null)&&this.includeTables.equals(rhs.includeTables)))&&((this.sslConfig == rhs.sslConfig)||((this.sslConfig!= null)&&this.sslConfig.equals(rhs.sslConfig))))&&((this.includeTeams == rhs.includeTeams)||((this.includeTeams!= null)&&this.includeTeams.equals(rhs.includeTeams))))&&((this.includeTags == rhs.includeTags)||((this.includeTags!= null)&&this.includeTags.equals(rhs.includeTags))))&&((this.elasticsSearch == rhs.elasticsSearch)||((this.elasticsSearch!= null)&&this.elasticsSearch.equals(rhs.elasticsSearch))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.includeDashboards == rhs.includeDashboards)||((this.includeDashboards!= null)&&this.includeDashboards.equals(rhs.includeDashboards))))&&((this.authProvider == rhs.authProvider)||((this.authProvider!= null)&&this.authProvider.equals(rhs.authProvider))))&&((this.apiVersion == rhs.apiVersion)||((this.apiVersion!= null)&&this.apiVersion.equals(rhs.apiVersion))))&&((this.includeTopics == rhs.includeTopics)||((this.includeTopics!= null)&&this.includeTopics.equals(rhs.includeTopics))))&&((this.includePipelines == rhs.includePipelines)||((this.includePipelines!= null)&&this.includePipelines.equals(rhs.includePipelines))))&&((this.includeMessagingServices == rhs.includeMessagingServices)||((this.includeMessagingServices!= null)&&this.includeMessagingServices.equals(rhs.includeMessagingServices))))&&((this.clusterName == rhs.clusterName)||((this.clusterName!= null)&&this.clusterName.equals(rhs.clusterName))))&&((this.includePolicy == rhs.includePolicy)||((this.includePolicy!= null)&&this.includePolicy.equals(rhs.includePolicy))))&&((this.includeDatabaseServices == rhs.includeDatabaseServices)||((this.includeDatabaseServices!= null)&&this.includeDatabaseServices.equals(rhs.includeDatabaseServices))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.includeGlossaryTerms == rhs.includeGlossaryTerms)||((this.includeGlossaryTerms!= null)&&this.includeGlossaryTerms.equals(rhs.includeGlossaryTerms))))&&((this.limitRecords == rhs.limitRecords)||((this.limitRecords!= null)&&this.limitRecords.equals(rhs.limitRecords))))&&((this.secretsManagerLoader == rhs.secretsManagerLoader)||((this.secretsManagerLoader!= null)&&this.secretsManagerLoader.equals(rhs.secretsManagerLoader))))&&((this.includeMlModels == rhs.includeMlModels)||((this.includeMlModels!= null)&&this.includeMlModels.equals(rhs.includeMlModels))))&&((this.storeServiceConnection == rhs.storeServiceConnection)||((this.storeServiceConnection!= null)&&this.storeServiceConnection.equals(rhs.storeServiceConnection))))&&((this.extraHeaders == rhs.extraHeaders)||((this.extraHeaders!= null)&&this.extraHeaders.equals(rhs.extraHeaders))))&&((this.supportsDataInsightExtraction == rhs.supportsDataInsightExtraction)||((this.supportsDataInsightExtraction!= null)&&this.supportsDataInsightExtraction.equals(rhs.supportsDataInsightExtraction))))&&((this.includePipelineServices == rhs.includePipelineServices)||((this.includePipelineServices!= null)&&this.includePipelineServices.equals(rhs.includePipelineServices))))&&((this.supportsElasticSearchReindexingExtraction == rhs.supportsElasticSearchReindexingExtraction)||((this.supportsElasticSearchReindexingExtraction!= null)&&this.supportsElasticSearchReindexingExtraction.equals(rhs.supportsElasticSearchReindexingExtraction))))&&((this.securityConfig == rhs.securityConfig)||((this.securityConfig!= null)&&this.securityConfig.equals(rhs.securityConfig))))&&((this.secretsManagerProvider == rhs.secretsManagerProvider)||((this.secretsManagerProvider!= null)&&this.secretsManagerProvider.equals(rhs.secretsManagerProvider))))&&((this.forceEntityOverwriting == rhs.forceEntityOverwriting)||((this.forceEntityOverwriting!= null)&&this.forceEntityOverwriting.equals(rhs.forceEntityOverwriting))))&&((this.enableVersionValidation == rhs.enableVersionValidation)||((this.enableVersionValidation!= null)&&this.enableVersionValidation.equals(rhs.enableVersionValidation))))&&((this.verifySSL == rhs.verifySSL)||((this.verifySSL!= null)&&this.verifySSL.equals(rhs.verifySSL))))&&((this.includeUsers == rhs.includeUsers)||((this.includeUsers!= null)&&this.includeUsers.equals(rhs.includeUsers))));
    }


    /**
     * OpenMetadata service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum OpenmetadataType {

        OPEN_METADATA("OpenMetadata");
        private final String value;
        private final static Map<String, OpenMetadataConnection.OpenmetadataType> CONSTANTS = new HashMap<String, OpenMetadataConnection.OpenmetadataType>();

        static {
            for (OpenMetadataConnection.OpenmetadataType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        OpenmetadataType(String value) {
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
        public static OpenMetadataConnection.OpenmetadataType fromValue(String value) {
            OpenMetadataConnection.OpenmetadataType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
