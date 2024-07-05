
package org.openmetadata.schema.type;

import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DatabaseConnectionConfig
 * <p>
 * Database Connection Config to capture connection details to a database service.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "username",
    "password",
    "hostPort",
    "database",
    "schema",
    "includeViews",
    "includeTables",
    "generateSampleData",
    "sampleDataQuery",
    "enableDataProfiler",
    "includeFilterPattern",
    "excludeFilterPattern"
})
@Generated("jsonschema2pojo")
public class DatabaseConnectionConfig {

    /**
     * username to connect  to the data source.
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("username to connect  to the data source.")
    private String username;
    /**
     * password to connect  to the data source.
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("password to connect  to the data source.")
    private String password;
    /**
     * Host and port of the data source.
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and port of the data source.")
    private String hostPort;
    /**
     * Database of the data source.
     * 
     */
    @JsonProperty("database")
    @JsonPropertyDescription("Database of the data source.")
    private String database;
    /**
     * schema of the data source.
     * 
     */
    @JsonProperty("schema")
    @JsonPropertyDescription("schema of the data source.")
    private String schema;
    /**
     * optional configuration to turn off fetching metadata for views.
     * 
     */
    @JsonProperty("includeViews")
    @JsonPropertyDescription("optional configuration to turn off fetching metadata for views.")
    private Boolean includeViews = true;
    /**
     * Optional configuration to turn off fetching metadata for tables.
     * 
     */
    @JsonProperty("includeTables")
    @JsonPropertyDescription("Optional configuration to turn off fetching metadata for tables.")
    private Boolean includeTables = true;
    /**
     * Turn on/off collecting sample data.
     * 
     */
    @JsonProperty("generateSampleData")
    @JsonPropertyDescription("Turn on/off collecting sample data.")
    private Boolean generateSampleData = true;
    /**
     * query to generate sample data.
     * 
     */
    @JsonProperty("sampleDataQuery")
    @JsonPropertyDescription("query to generate sample data.")
    private String sampleDataQuery = "select * from {}.{} limit 50";
    /**
     * Run data profiler as part of ingestion to get table profile data.
     * 
     */
    @JsonProperty("enableDataProfiler")
    @JsonPropertyDescription("Run data profiler as part of ingestion to get table profile data.")
    private Boolean enableDataProfiler = false;
    /**
     * Regex to only fetch tables or databases that matches the pattern.
     * 
     */
    @JsonProperty("includeFilterPattern")
    @JsonPropertyDescription("Regex to only fetch tables or databases that matches the pattern.")
    @Valid
    private List<String> includeFilterPattern = null;
    /**
     * Regex exclude tables or databases that matches the pattern.
     * 
     */
    @JsonProperty("excludeFilterPattern")
    @JsonPropertyDescription("Regex exclude tables or databases that matches the pattern.")
    @Valid
    private List<String> excludeFilterPattern = null;

    /**
     * username to connect  to the data source.
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * username to connect  to the data source.
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public DatabaseConnectionConfig withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * password to connect  to the data source.
     * 
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * password to connect  to the data source.
     * 
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public DatabaseConnectionConfig withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Host and port of the data source.
     * 
     */
    @JsonProperty("hostPort")
    public String getHostPort() {
        return hostPort;
    }

    /**
     * Host and port of the data source.
     * 
     */
    @JsonProperty("hostPort")
    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public DatabaseConnectionConfig withHostPort(String hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Database of the data source.
     * 
     */
    @JsonProperty("database")
    public String getDatabase() {
        return database;
    }

    /**
     * Database of the data source.
     * 
     */
    @JsonProperty("database")
    public void setDatabase(String database) {
        this.database = database;
    }

    public DatabaseConnectionConfig withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * schema of the data source.
     * 
     */
    @JsonProperty("schema")
    public String getSchema() {
        return schema;
    }

    /**
     * schema of the data source.
     * 
     */
    @JsonProperty("schema")
    public void setSchema(String schema) {
        this.schema = schema;
    }

    public DatabaseConnectionConfig withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * optional configuration to turn off fetching metadata for views.
     * 
     */
    @JsonProperty("includeViews")
    public Boolean getIncludeViews() {
        return includeViews;
    }

    /**
     * optional configuration to turn off fetching metadata for views.
     * 
     */
    @JsonProperty("includeViews")
    public void setIncludeViews(Boolean includeViews) {
        this.includeViews = includeViews;
    }

    public DatabaseConnectionConfig withIncludeViews(Boolean includeViews) {
        this.includeViews = includeViews;
        return this;
    }

    /**
     * Optional configuration to turn off fetching metadata for tables.
     * 
     */
    @JsonProperty("includeTables")
    public Boolean getIncludeTables() {
        return includeTables;
    }

    /**
     * Optional configuration to turn off fetching metadata for tables.
     * 
     */
    @JsonProperty("includeTables")
    public void setIncludeTables(Boolean includeTables) {
        this.includeTables = includeTables;
    }

    public DatabaseConnectionConfig withIncludeTables(Boolean includeTables) {
        this.includeTables = includeTables;
        return this;
    }

    /**
     * Turn on/off collecting sample data.
     * 
     */
    @JsonProperty("generateSampleData")
    public Boolean getGenerateSampleData() {
        return generateSampleData;
    }

    /**
     * Turn on/off collecting sample data.
     * 
     */
    @JsonProperty("generateSampleData")
    public void setGenerateSampleData(Boolean generateSampleData) {
        this.generateSampleData = generateSampleData;
    }

    public DatabaseConnectionConfig withGenerateSampleData(Boolean generateSampleData) {
        this.generateSampleData = generateSampleData;
        return this;
    }

    /**
     * query to generate sample data.
     * 
     */
    @JsonProperty("sampleDataQuery")
    public String getSampleDataQuery() {
        return sampleDataQuery;
    }

    /**
     * query to generate sample data.
     * 
     */
    @JsonProperty("sampleDataQuery")
    public void setSampleDataQuery(String sampleDataQuery) {
        this.sampleDataQuery = sampleDataQuery;
    }

    public DatabaseConnectionConfig withSampleDataQuery(String sampleDataQuery) {
        this.sampleDataQuery = sampleDataQuery;
        return this;
    }

    /**
     * Run data profiler as part of ingestion to get table profile data.
     * 
     */
    @JsonProperty("enableDataProfiler")
    public Boolean getEnableDataProfiler() {
        return enableDataProfiler;
    }

    /**
     * Run data profiler as part of ingestion to get table profile data.
     * 
     */
    @JsonProperty("enableDataProfiler")
    public void setEnableDataProfiler(Boolean enableDataProfiler) {
        this.enableDataProfiler = enableDataProfiler;
    }

    public DatabaseConnectionConfig withEnableDataProfiler(Boolean enableDataProfiler) {
        this.enableDataProfiler = enableDataProfiler;
        return this;
    }

    /**
     * Regex to only fetch tables or databases that matches the pattern.
     * 
     */
    @JsonProperty("includeFilterPattern")
    public List<String> getIncludeFilterPattern() {
        return includeFilterPattern;
    }

    /**
     * Regex to only fetch tables or databases that matches the pattern.
     * 
     */
    @JsonProperty("includeFilterPattern")
    public void setIncludeFilterPattern(List<String> includeFilterPattern) {
        this.includeFilterPattern = includeFilterPattern;
    }

    public DatabaseConnectionConfig withIncludeFilterPattern(List<String> includeFilterPattern) {
        this.includeFilterPattern = includeFilterPattern;
        return this;
    }

    /**
     * Regex exclude tables or databases that matches the pattern.
     * 
     */
    @JsonProperty("excludeFilterPattern")
    public List<String> getExcludeFilterPattern() {
        return excludeFilterPattern;
    }

    /**
     * Regex exclude tables or databases that matches the pattern.
     * 
     */
    @JsonProperty("excludeFilterPattern")
    public void setExcludeFilterPattern(List<String> excludeFilterPattern) {
        this.excludeFilterPattern = excludeFilterPattern;
    }

    public DatabaseConnectionConfig withExcludeFilterPattern(List<String> excludeFilterPattern) {
        this.excludeFilterPattern = excludeFilterPattern;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DatabaseConnectionConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("database");
        sb.append('=');
        sb.append(((this.database == null)?"<null>":this.database));
        sb.append(',');
        sb.append("schema");
        sb.append('=');
        sb.append(((this.schema == null)?"<null>":this.schema));
        sb.append(',');
        sb.append("includeViews");
        sb.append('=');
        sb.append(((this.includeViews == null)?"<null>":this.includeViews));
        sb.append(',');
        sb.append("includeTables");
        sb.append('=');
        sb.append(((this.includeTables == null)?"<null>":this.includeTables));
        sb.append(',');
        sb.append("generateSampleData");
        sb.append('=');
        sb.append(((this.generateSampleData == null)?"<null>":this.generateSampleData));
        sb.append(',');
        sb.append("sampleDataQuery");
        sb.append('=');
        sb.append(((this.sampleDataQuery == null)?"<null>":this.sampleDataQuery));
        sb.append(',');
        sb.append("enableDataProfiler");
        sb.append('=');
        sb.append(((this.enableDataProfiler == null)?"<null>":this.enableDataProfiler));
        sb.append(',');
        sb.append("includeFilterPattern");
        sb.append('=');
        sb.append(((this.includeFilterPattern == null)?"<null>":this.includeFilterPattern));
        sb.append(',');
        sb.append("excludeFilterPattern");
        sb.append('=');
        sb.append(((this.excludeFilterPattern == null)?"<null>":this.excludeFilterPattern));
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
        result = ((result* 31)+((this.schema == null)? 0 :this.schema.hashCode()));
        result = ((result* 31)+((this.includeViews == null)? 0 :this.includeViews.hashCode()));
        result = ((result* 31)+((this.includeTables == null)? 0 :this.includeTables.hashCode()));
        result = ((result* 31)+((this.sampleDataQuery == null)? 0 :this.sampleDataQuery.hashCode()));
        result = ((result* 31)+((this.generateSampleData == null)? 0 :this.generateSampleData.hashCode()));
        result = ((result* 31)+((this.includeFilterPattern == null)? 0 :this.includeFilterPattern.hashCode()));
        result = ((result* 31)+((this.excludeFilterPattern == null)? 0 :this.excludeFilterPattern.hashCode()));
        result = ((result* 31)+((this.enableDataProfiler == null)? 0 :this.enableDataProfiler.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.database == null)? 0 :this.database.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatabaseConnectionConfig) == false) {
            return false;
        }
        DatabaseConnectionConfig rhs = ((DatabaseConnectionConfig) other);
        return (((((((((((((this.schema == rhs.schema)||((this.schema!= null)&&this.schema.equals(rhs.schema)))&&((this.includeViews == rhs.includeViews)||((this.includeViews!= null)&&this.includeViews.equals(rhs.includeViews))))&&((this.includeTables == rhs.includeTables)||((this.includeTables!= null)&&this.includeTables.equals(rhs.includeTables))))&&((this.sampleDataQuery == rhs.sampleDataQuery)||((this.sampleDataQuery!= null)&&this.sampleDataQuery.equals(rhs.sampleDataQuery))))&&((this.generateSampleData == rhs.generateSampleData)||((this.generateSampleData!= null)&&this.generateSampleData.equals(rhs.generateSampleData))))&&((this.includeFilterPattern == rhs.includeFilterPattern)||((this.includeFilterPattern!= null)&&this.includeFilterPattern.equals(rhs.includeFilterPattern))))&&((this.excludeFilterPattern == rhs.excludeFilterPattern)||((this.excludeFilterPattern!= null)&&this.excludeFilterPattern.equals(rhs.excludeFilterPattern))))&&((this.enableDataProfiler == rhs.enableDataProfiler)||((this.enableDataProfiler!= null)&&this.enableDataProfiler.equals(rhs.enableDataProfiler))))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.database == rhs.database)||((this.database!= null)&&this.database.equals(rhs.database))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

}
