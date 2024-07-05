
package org.openmetadata.schema.services.connections.database;

import java.util.HashMap;
import java.util.List;
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
import org.openmetadata.schema.security.credentials.GCPCredentials;


/**
 * BigQueryConnection
 * <p>
 * Google BigQuery Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "scheme",
    "hostPort",
    "credentials",
    "taxonomyProjectID",
    "taxonomyLocation",
    "usageLocation",
    "connectionOptions",
    "connectionArguments",
    "supportsMetadataExtraction",
    "supportsUsageExtraction",
    "supportsLineageExtraction",
    "supportsDBTExtraction",
    "supportsProfiler",
    "supportsDatabase",
    "supportsQueryComment",
    "sampleDataStorageConfig"
})
@Generated("jsonschema2pojo")
public class BigQueryConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private BigQueryConnection.BigqueryType type = BigQueryConnection.BigqueryType.fromValue("BigQuery");
    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("SQLAlchemy driver scheme options.")
    private BigQueryConnection.BigqueryScheme scheme = BigQueryConnection.BigqueryScheme.fromValue("bigquery");
    /**
     * Host and Port
     * <p>
     * BigQuery APIs URL.
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("BigQuery APIs URL.")
    private String hostPort = "bigquery.googleapis.com";
    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("credentials")
    @JsonPropertyDescription("GCP credentials configs.")
    @Valid
    @NotNull
    private GCPCredentials credentials;
    /**
     * Taxonomy Project IDs
     * <p>
     * Project IDs used to fetch policy tags
     * 
     */
    @JsonProperty("taxonomyProjectID")
    @JsonPropertyDescription("Project IDs used to fetch policy tags")
    @Valid
    private List<String> taxonomyProjectID = null;
    /**
     * Taxonomy Location
     * <p>
     * Taxonomy location used to fetch policy tags
     * 
     */
    @JsonProperty("taxonomyLocation")
    @JsonPropertyDescription("Taxonomy location used to fetch policy tags")
    private String taxonomyLocation = "us";
    /**
     * Usage Location
     * <p>
     * Location used to query INFORMATION_SCHEMA.JOBS_BY_PROJECT to fetch usage data. You can pass multi-regions, such as `us` or `eu`, or you specific region. Australia and Asia multi-regions are not yet in GA.
     * 
     */
    @JsonProperty("usageLocation")
    @JsonPropertyDescription("Location used to query INFORMATION_SCHEMA.JOBS_BY_PROJECT to fetch usage data. You can pass multi-regions, such as `us` or `eu`, or you specific region. Australia and Asia multi-regions are not yet in GA.")
    private String usageLocation = "us";
    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    @JsonPropertyDescription("Additional connection options to build the URL that can be sent to service during the connection.")
    @Valid
    private ConnectionOptions connectionOptions;
    /**
     * Additional connection arguments such as security or protocol configs that can be sent to service during connection.
     * 
     */
    @JsonProperty("connectionArguments")
    @JsonPropertyDescription("Additional connection arguments such as security or protocol configs that can be sent to service during connection.")
    @Valid
    private ConnectionArguments connectionArguments;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;
    /**
     * Supports Usage Extraction.
     * 
     */
    @JsonProperty("supportsUsageExtraction")
    @JsonPropertyDescription("Supports Usage Extraction.")
    private Boolean supportsUsageExtraction = true;
    /**
     * Supports Lineage Extraction.
     * 
     */
    @JsonProperty("supportsLineageExtraction")
    @JsonPropertyDescription("Supports Lineage Extraction.")
    private Boolean supportsLineageExtraction = true;
    /**
     * Supports DBT Extraction.
     * 
     */
    @JsonProperty("supportsDBTExtraction")
    @JsonPropertyDescription("Supports DBT Extraction.")
    private Boolean supportsDBTExtraction = true;
    /**
     * Supports Profiler
     * 
     */
    @JsonProperty("supportsProfiler")
    @JsonPropertyDescription("Supports Profiler")
    private Boolean supportsProfiler = true;
    /**
     * The source service supports the database concept in its hierarchy
     * 
     */
    @JsonProperty("supportsDatabase")
    @JsonPropertyDescription("The source service supports the database concept in its hierarchy")
    private Boolean supportsDatabase = true;
    /**
     * For Database Services using SQLAlchemy, True to enable running a comment for all queries run from OpenMetadata.
     * 
     */
    @JsonProperty("supportsQueryComment")
    @JsonPropertyDescription("For Database Services using SQLAlchemy, True to enable running a comment for all queries run from OpenMetadata.")
    private Boolean supportsQueryComment = true;
    /**
     * Storage config to store sample data
     * 
     */
    @JsonProperty("sampleDataStorageConfig")
    @JsonPropertyDescription("Storage config to store sample data")
    @Valid
    private SampleDataStorageConfig sampleDataStorageConfig;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public BigQueryConnection.BigqueryType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(BigQueryConnection.BigqueryType type) {
        this.type = type;
    }

    public BigQueryConnection withType(BigQueryConnection.BigqueryType type) {
        this.type = type;
        return this;
    }

    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public BigQueryConnection.BigqueryScheme getScheme() {
        return scheme;
    }

    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(BigQueryConnection.BigqueryScheme scheme) {
        this.scheme = scheme;
    }

    public BigQueryConnection withScheme(BigQueryConnection.BigqueryScheme scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * BigQuery APIs URL.
     * 
     */
    @JsonProperty("hostPort")
    public String getHostPort() {
        return hostPort;
    }

    /**
     * Host and Port
     * <p>
     * BigQuery APIs URL.
     * 
     */
    @JsonProperty("hostPort")
    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public BigQueryConnection withHostPort(String hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("credentials")
    public GCPCredentials getCredentials() {
        return credentials;
    }

    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("credentials")
    public void setCredentials(GCPCredentials credentials) {
        this.credentials = credentials;
    }

    public BigQueryConnection withCredentials(GCPCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Taxonomy Project IDs
     * <p>
     * Project IDs used to fetch policy tags
     * 
     */
    @JsonProperty("taxonomyProjectID")
    public List<String> getTaxonomyProjectID() {
        return taxonomyProjectID;
    }

    /**
     * Taxonomy Project IDs
     * <p>
     * Project IDs used to fetch policy tags
     * 
     */
    @JsonProperty("taxonomyProjectID")
    public void setTaxonomyProjectID(List<String> taxonomyProjectID) {
        this.taxonomyProjectID = taxonomyProjectID;
    }

    public BigQueryConnection withTaxonomyProjectID(List<String> taxonomyProjectID) {
        this.taxonomyProjectID = taxonomyProjectID;
        return this;
    }

    /**
     * Taxonomy Location
     * <p>
     * Taxonomy location used to fetch policy tags
     * 
     */
    @JsonProperty("taxonomyLocation")
    public String getTaxonomyLocation() {
        return taxonomyLocation;
    }

    /**
     * Taxonomy Location
     * <p>
     * Taxonomy location used to fetch policy tags
     * 
     */
    @JsonProperty("taxonomyLocation")
    public void setTaxonomyLocation(String taxonomyLocation) {
        this.taxonomyLocation = taxonomyLocation;
    }

    public BigQueryConnection withTaxonomyLocation(String taxonomyLocation) {
        this.taxonomyLocation = taxonomyLocation;
        return this;
    }

    /**
     * Usage Location
     * <p>
     * Location used to query INFORMATION_SCHEMA.JOBS_BY_PROJECT to fetch usage data. You can pass multi-regions, such as `us` or `eu`, or you specific region. Australia and Asia multi-regions are not yet in GA.
     * 
     */
    @JsonProperty("usageLocation")
    public String getUsageLocation() {
        return usageLocation;
    }

    /**
     * Usage Location
     * <p>
     * Location used to query INFORMATION_SCHEMA.JOBS_BY_PROJECT to fetch usage data. You can pass multi-regions, such as `us` or `eu`, or you specific region. Australia and Asia multi-regions are not yet in GA.
     * 
     */
    @JsonProperty("usageLocation")
    public void setUsageLocation(String usageLocation) {
        this.usageLocation = usageLocation;
    }

    public BigQueryConnection withUsageLocation(String usageLocation) {
        this.usageLocation = usageLocation;
        return this;
    }

    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    public ConnectionOptions getConnectionOptions() {
        return connectionOptions;
    }

    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    public void setConnectionOptions(ConnectionOptions connectionOptions) {
        this.connectionOptions = connectionOptions;
    }

    public BigQueryConnection withConnectionOptions(ConnectionOptions connectionOptions) {
        this.connectionOptions = connectionOptions;
        return this;
    }

    /**
     * Additional connection arguments such as security or protocol configs that can be sent to service during connection.
     * 
     */
    @JsonProperty("connectionArguments")
    public ConnectionArguments getConnectionArguments() {
        return connectionArguments;
    }

    /**
     * Additional connection arguments such as security or protocol configs that can be sent to service during connection.
     * 
     */
    @JsonProperty("connectionArguments")
    public void setConnectionArguments(ConnectionArguments connectionArguments) {
        this.connectionArguments = connectionArguments;
    }

    public BigQueryConnection withConnectionArguments(ConnectionArguments connectionArguments) {
        this.connectionArguments = connectionArguments;
        return this;
    }

    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    public Boolean getSupportsMetadataExtraction() {
        return supportsMetadataExtraction;
    }

    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    public void setSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
    }

    public BigQueryConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    /**
     * Supports Usage Extraction.
     * 
     */
    @JsonProperty("supportsUsageExtraction")
    public Boolean getSupportsUsageExtraction() {
        return supportsUsageExtraction;
    }

    /**
     * Supports Usage Extraction.
     * 
     */
    @JsonProperty("supportsUsageExtraction")
    public void setSupportsUsageExtraction(Boolean supportsUsageExtraction) {
        this.supportsUsageExtraction = supportsUsageExtraction;
    }

    public BigQueryConnection withSupportsUsageExtraction(Boolean supportsUsageExtraction) {
        this.supportsUsageExtraction = supportsUsageExtraction;
        return this;
    }

    /**
     * Supports Lineage Extraction.
     * 
     */
    @JsonProperty("supportsLineageExtraction")
    public Boolean getSupportsLineageExtraction() {
        return supportsLineageExtraction;
    }

    /**
     * Supports Lineage Extraction.
     * 
     */
    @JsonProperty("supportsLineageExtraction")
    public void setSupportsLineageExtraction(Boolean supportsLineageExtraction) {
        this.supportsLineageExtraction = supportsLineageExtraction;
    }

    public BigQueryConnection withSupportsLineageExtraction(Boolean supportsLineageExtraction) {
        this.supportsLineageExtraction = supportsLineageExtraction;
        return this;
    }

    /**
     * Supports DBT Extraction.
     * 
     */
    @JsonProperty("supportsDBTExtraction")
    public Boolean getSupportsDBTExtraction() {
        return supportsDBTExtraction;
    }

    /**
     * Supports DBT Extraction.
     * 
     */
    @JsonProperty("supportsDBTExtraction")
    public void setSupportsDBTExtraction(Boolean supportsDBTExtraction) {
        this.supportsDBTExtraction = supportsDBTExtraction;
    }

    public BigQueryConnection withSupportsDBTExtraction(Boolean supportsDBTExtraction) {
        this.supportsDBTExtraction = supportsDBTExtraction;
        return this;
    }

    /**
     * Supports Profiler
     * 
     */
    @JsonProperty("supportsProfiler")
    public Boolean getSupportsProfiler() {
        return supportsProfiler;
    }

    /**
     * Supports Profiler
     * 
     */
    @JsonProperty("supportsProfiler")
    public void setSupportsProfiler(Boolean supportsProfiler) {
        this.supportsProfiler = supportsProfiler;
    }

    public BigQueryConnection withSupportsProfiler(Boolean supportsProfiler) {
        this.supportsProfiler = supportsProfiler;
        return this;
    }

    /**
     * The source service supports the database concept in its hierarchy
     * 
     */
    @JsonProperty("supportsDatabase")
    public Boolean getSupportsDatabase() {
        return supportsDatabase;
    }

    /**
     * The source service supports the database concept in its hierarchy
     * 
     */
    @JsonProperty("supportsDatabase")
    public void setSupportsDatabase(Boolean supportsDatabase) {
        this.supportsDatabase = supportsDatabase;
    }

    public BigQueryConnection withSupportsDatabase(Boolean supportsDatabase) {
        this.supportsDatabase = supportsDatabase;
        return this;
    }

    /**
     * For Database Services using SQLAlchemy, True to enable running a comment for all queries run from OpenMetadata.
     * 
     */
    @JsonProperty("supportsQueryComment")
    public Boolean getSupportsQueryComment() {
        return supportsQueryComment;
    }

    /**
     * For Database Services using SQLAlchemy, True to enable running a comment for all queries run from OpenMetadata.
     * 
     */
    @JsonProperty("supportsQueryComment")
    public void setSupportsQueryComment(Boolean supportsQueryComment) {
        this.supportsQueryComment = supportsQueryComment;
    }

    public BigQueryConnection withSupportsQueryComment(Boolean supportsQueryComment) {
        this.supportsQueryComment = supportsQueryComment;
        return this;
    }

    /**
     * Storage config to store sample data
     * 
     */
    @JsonProperty("sampleDataStorageConfig")
    public SampleDataStorageConfig getSampleDataStorageConfig() {
        return sampleDataStorageConfig;
    }

    /**
     * Storage config to store sample data
     * 
     */
    @JsonProperty("sampleDataStorageConfig")
    public void setSampleDataStorageConfig(SampleDataStorageConfig sampleDataStorageConfig) {
        this.sampleDataStorageConfig = sampleDataStorageConfig;
    }

    public BigQueryConnection withSampleDataStorageConfig(SampleDataStorageConfig sampleDataStorageConfig) {
        this.sampleDataStorageConfig = sampleDataStorageConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BigQueryConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("scheme");
        sb.append('=');
        sb.append(((this.scheme == null)?"<null>":this.scheme));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("credentials");
        sb.append('=');
        sb.append(((this.credentials == null)?"<null>":this.credentials));
        sb.append(',');
        sb.append("taxonomyProjectID");
        sb.append('=');
        sb.append(((this.taxonomyProjectID == null)?"<null>":this.taxonomyProjectID));
        sb.append(',');
        sb.append("taxonomyLocation");
        sb.append('=');
        sb.append(((this.taxonomyLocation == null)?"<null>":this.taxonomyLocation));
        sb.append(',');
        sb.append("usageLocation");
        sb.append('=');
        sb.append(((this.usageLocation == null)?"<null>":this.usageLocation));
        sb.append(',');
        sb.append("connectionOptions");
        sb.append('=');
        sb.append(((this.connectionOptions == null)?"<null>":this.connectionOptions));
        sb.append(',');
        sb.append("connectionArguments");
        sb.append('=');
        sb.append(((this.connectionArguments == null)?"<null>":this.connectionArguments));
        sb.append(',');
        sb.append("supportsMetadataExtraction");
        sb.append('=');
        sb.append(((this.supportsMetadataExtraction == null)?"<null>":this.supportsMetadataExtraction));
        sb.append(',');
        sb.append("supportsUsageExtraction");
        sb.append('=');
        sb.append(((this.supportsUsageExtraction == null)?"<null>":this.supportsUsageExtraction));
        sb.append(',');
        sb.append("supportsLineageExtraction");
        sb.append('=');
        sb.append(((this.supportsLineageExtraction == null)?"<null>":this.supportsLineageExtraction));
        sb.append(',');
        sb.append("supportsDBTExtraction");
        sb.append('=');
        sb.append(((this.supportsDBTExtraction == null)?"<null>":this.supportsDBTExtraction));
        sb.append(',');
        sb.append("supportsProfiler");
        sb.append('=');
        sb.append(((this.supportsProfiler == null)?"<null>":this.supportsProfiler));
        sb.append(',');
        sb.append("supportsDatabase");
        sb.append('=');
        sb.append(((this.supportsDatabase == null)?"<null>":this.supportsDatabase));
        sb.append(',');
        sb.append("supportsQueryComment");
        sb.append('=');
        sb.append(((this.supportsQueryComment == null)?"<null>":this.supportsQueryComment));
        sb.append(',');
        sb.append("sampleDataStorageConfig");
        sb.append('=');
        sb.append(((this.sampleDataStorageConfig == null)?"<null>":this.sampleDataStorageConfig));
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
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.supportsProfiler == null)? 0 :this.supportsProfiler.hashCode()));
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        result = ((result* 31)+((this.sampleDataStorageConfig == null)? 0 :this.sampleDataStorageConfig.hashCode()));
        result = ((result* 31)+((this.taxonomyProjectID == null)? 0 :this.taxonomyProjectID.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.supportsUsageExtraction == null)? 0 :this.supportsUsageExtraction.hashCode()));
        result = ((result* 31)+((this.taxonomyLocation == null)? 0 :this.taxonomyLocation.hashCode()));
        result = ((result* 31)+((this.supportsDBTExtraction == null)? 0 :this.supportsDBTExtraction.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        result = ((result* 31)+((this.supportsDatabase == null)? 0 :this.supportsDatabase.hashCode()));
        result = ((result* 31)+((this.supportsLineageExtraction == null)? 0 :this.supportsLineageExtraction.hashCode()));
        result = ((result* 31)+((this.connectionOptions == null)? 0 :this.connectionOptions.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.usageLocation == null)? 0 :this.usageLocation.hashCode()));
        result = ((result* 31)+((this.supportsQueryComment == null)? 0 :this.supportsQueryComment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BigQueryConnection) == false) {
            return false;
        }
        BigQueryConnection rhs = ((BigQueryConnection) other);
        return ((((((((((((((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.supportsProfiler == rhs.supportsProfiler)||((this.supportsProfiler!= null)&&this.supportsProfiler.equals(rhs.supportsProfiler))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))))&&((this.sampleDataStorageConfig == rhs.sampleDataStorageConfig)||((this.sampleDataStorageConfig!= null)&&this.sampleDataStorageConfig.equals(rhs.sampleDataStorageConfig))))&&((this.taxonomyProjectID == rhs.taxonomyProjectID)||((this.taxonomyProjectID!= null)&&this.taxonomyProjectID.equals(rhs.taxonomyProjectID))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.supportsUsageExtraction == rhs.supportsUsageExtraction)||((this.supportsUsageExtraction!= null)&&this.supportsUsageExtraction.equals(rhs.supportsUsageExtraction))))&&((this.taxonomyLocation == rhs.taxonomyLocation)||((this.taxonomyLocation!= null)&&this.taxonomyLocation.equals(rhs.taxonomyLocation))))&&((this.supportsDBTExtraction == rhs.supportsDBTExtraction)||((this.supportsDBTExtraction!= null)&&this.supportsDBTExtraction.equals(rhs.supportsDBTExtraction))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))))&&((this.supportsDatabase == rhs.supportsDatabase)||((this.supportsDatabase!= null)&&this.supportsDatabase.equals(rhs.supportsDatabase))))&&((this.supportsLineageExtraction == rhs.supportsLineageExtraction)||((this.supportsLineageExtraction!= null)&&this.supportsLineageExtraction.equals(rhs.supportsLineageExtraction))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.usageLocation == rhs.usageLocation)||((this.usageLocation!= null)&&this.usageLocation.equals(rhs.usageLocation))))&&((this.supportsQueryComment == rhs.supportsQueryComment)||((this.supportsQueryComment!= null)&&this.supportsQueryComment.equals(rhs.supportsQueryComment))));
    }


    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum BigqueryScheme {

        BIGQUERY("bigquery");
        private final String value;
        private final static Map<String, BigQueryConnection.BigqueryScheme> CONSTANTS = new HashMap<String, BigQueryConnection.BigqueryScheme>();

        static {
            for (BigQueryConnection.BigqueryScheme c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        BigqueryScheme(String value) {
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
        public static BigQueryConnection.BigqueryScheme fromValue(String value) {
            BigQueryConnection.BigqueryScheme constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum BigqueryType {

        BIG_QUERY("BigQuery");
        private final String value;
        private final static Map<String, BigQueryConnection.BigqueryType> CONSTANTS = new HashMap<String, BigQueryConnection.BigqueryType>();

        static {
            for (BigQueryConnection.BigqueryType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        BigqueryType(String value) {
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
        public static BigQueryConnection.BigqueryType fromValue(String value) {
            BigQueryConnection.BigqueryType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
