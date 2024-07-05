
package org.openmetadata.schema.services.connections.database;

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


/**
 * DeltaLakeConnection
 * <p>
 * DeltaLake Database Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "metastoreConnection",
    "appName",
    "databaseName",
    "connectionArguments",
    "supportsMetadataExtraction",
    "supportsDBTExtraction"
})
@Generated("jsonschema2pojo")
public class DeltaLakeConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private DeltaLakeConnection.DeltaLakeType type = DeltaLakeConnection.DeltaLakeType.fromValue("DeltaLake");
    /**
     * Hive Metastore Connection
     * <p>
     * Hive metastore service, local file path or metastore db.
     * (Required)
     * 
     */
    @JsonProperty("metastoreConnection")
    @JsonPropertyDescription("Hive metastore service, local file path or metastore db.")
    @NotNull
    private Object metastoreConnection;
    /**
     * Application Name
     * <p>
     * pySpark App Name.
     * 
     */
    @JsonProperty("appName")
    @JsonPropertyDescription("pySpark App Name.")
    private String appName = "OpenMetadata";
    /**
     * Database Name
     * <p>
     * Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.
     * 
     */
    @JsonProperty("databaseName")
    @JsonPropertyDescription("Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.")
    private String databaseName;
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
     * Supports DBT Extraction.
     * 
     */
    @JsonProperty("supportsDBTExtraction")
    @JsonPropertyDescription("Supports DBT Extraction.")
    private Boolean supportsDBTExtraction = true;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public DeltaLakeConnection.DeltaLakeType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(DeltaLakeConnection.DeltaLakeType type) {
        this.type = type;
    }

    public DeltaLakeConnection withType(DeltaLakeConnection.DeltaLakeType type) {
        this.type = type;
        return this;
    }

    /**
     * Hive Metastore Connection
     * <p>
     * Hive metastore service, local file path or metastore db.
     * (Required)
     * 
     */
    @JsonProperty("metastoreConnection")
    public Object getMetastoreConnection() {
        return metastoreConnection;
    }

    /**
     * Hive Metastore Connection
     * <p>
     * Hive metastore service, local file path or metastore db.
     * (Required)
     * 
     */
    @JsonProperty("metastoreConnection")
    public void setMetastoreConnection(Object metastoreConnection) {
        this.metastoreConnection = metastoreConnection;
    }

    public DeltaLakeConnection withMetastoreConnection(Object metastoreConnection) {
        this.metastoreConnection = metastoreConnection;
        return this;
    }

    /**
     * Application Name
     * <p>
     * pySpark App Name.
     * 
     */
    @JsonProperty("appName")
    public String getAppName() {
        return appName;
    }

    /**
     * Application Name
     * <p>
     * pySpark App Name.
     * 
     */
    @JsonProperty("appName")
    public void setAppName(String appName) {
        this.appName = appName;
    }

    public DeltaLakeConnection withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * Database Name
     * <p>
     * Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.
     * 
     */
    @JsonProperty("databaseName")
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Database Name
     * <p>
     * Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.
     * 
     */
    @JsonProperty("databaseName")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public DeltaLakeConnection withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
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

    public DeltaLakeConnection withConnectionArguments(ConnectionArguments connectionArguments) {
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

    public DeltaLakeConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
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

    public DeltaLakeConnection withSupportsDBTExtraction(Boolean supportsDBTExtraction) {
        this.supportsDBTExtraction = supportsDBTExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeltaLakeConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("metastoreConnection");
        sb.append('=');
        sb.append(((this.metastoreConnection == null)?"<null>":this.metastoreConnection));
        sb.append(',');
        sb.append("appName");
        sb.append('=');
        sb.append(((this.appName == null)?"<null>":this.appName));
        sb.append(',');
        sb.append("databaseName");
        sb.append('=');
        sb.append(((this.databaseName == null)?"<null>":this.databaseName));
        sb.append(',');
        sb.append("connectionArguments");
        sb.append('=');
        sb.append(((this.connectionArguments == null)?"<null>":this.connectionArguments));
        sb.append(',');
        sb.append("supportsMetadataExtraction");
        sb.append('=');
        sb.append(((this.supportsMetadataExtraction == null)?"<null>":this.supportsMetadataExtraction));
        sb.append(',');
        sb.append("supportsDBTExtraction");
        sb.append('=');
        sb.append(((this.supportsDBTExtraction == null)?"<null>":this.supportsDBTExtraction));
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
        result = ((result* 31)+((this.databaseName == null)? 0 :this.databaseName.hashCode()));
        result = ((result* 31)+((this.appName == null)? 0 :this.appName.hashCode()));
        result = ((result* 31)+((this.metastoreConnection == null)? 0 :this.metastoreConnection.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.supportsDBTExtraction == null)? 0 :this.supportsDBTExtraction.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeltaLakeConnection) == false) {
            return false;
        }
        DeltaLakeConnection rhs = ((DeltaLakeConnection) other);
        return ((((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.databaseName == rhs.databaseName)||((this.databaseName!= null)&&this.databaseName.equals(rhs.databaseName))))&&((this.appName == rhs.appName)||((this.appName!= null)&&this.appName.equals(rhs.appName))))&&((this.metastoreConnection == rhs.metastoreConnection)||((this.metastoreConnection!= null)&&this.metastoreConnection.equals(rhs.metastoreConnection))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.supportsDBTExtraction == rhs.supportsDBTExtraction)||((this.supportsDBTExtraction!= null)&&this.supportsDBTExtraction.equals(rhs.supportsDBTExtraction))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DeltaLakeType {

        DELTA_LAKE("DeltaLake");
        private final String value;
        private final static Map<String, DeltaLakeConnection.DeltaLakeType> CONSTANTS = new HashMap<String, DeltaLakeConnection.DeltaLakeType>();

        static {
            for (DeltaLakeConnection.DeltaLakeType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DeltaLakeType(String value) {
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
        public static DeltaLakeConnection.DeltaLakeType fromValue(String value) {
            DeltaLakeConnection.DeltaLakeType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
