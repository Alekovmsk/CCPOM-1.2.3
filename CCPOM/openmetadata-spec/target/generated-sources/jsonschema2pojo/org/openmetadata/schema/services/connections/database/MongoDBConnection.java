
package org.openmetadata.schema.services.connections.database;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * MongoDBConnection
 * <p>
 * MongoDB Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "connectionDetails",
    "databaseName",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class MongoDBConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private MongoDBConnection.MongoDBType type = MongoDBConnection.MongoDBType.fromValue("MongoDB");
    /**
     * MongoDB Connection Details
     * <p>
     * MongoDB Connection Details.
     * 
     */
    @JsonProperty("connectionDetails")
    @JsonPropertyDescription("MongoDB Connection Details.")
    private Object connectionDetails;
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
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public MongoDBConnection.MongoDBType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(MongoDBConnection.MongoDBType type) {
        this.type = type;
    }

    public MongoDBConnection withType(MongoDBConnection.MongoDBType type) {
        this.type = type;
        return this;
    }

    /**
     * MongoDB Connection Details
     * <p>
     * MongoDB Connection Details.
     * 
     */
    @JsonProperty("connectionDetails")
    public Object getConnectionDetails() {
        return connectionDetails;
    }

    /**
     * MongoDB Connection Details
     * <p>
     * MongoDB Connection Details.
     * 
     */
    @JsonProperty("connectionDetails")
    public void setConnectionDetails(Object connectionDetails) {
        this.connectionDetails = connectionDetails;
    }

    public MongoDBConnection withConnectionDetails(Object connectionDetails) {
        this.connectionDetails = connectionDetails;
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

    public MongoDBConnection withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
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

    public MongoDBConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MongoDBConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("connectionDetails");
        sb.append('=');
        sb.append(((this.connectionDetails == null)?"<null>":this.connectionDetails));
        sb.append(',');
        sb.append("databaseName");
        sb.append('=');
        sb.append(((this.databaseName == null)?"<null>":this.databaseName));
        sb.append(',');
        sb.append("supportsMetadataExtraction");
        sb.append('=');
        sb.append(((this.supportsMetadataExtraction == null)?"<null>":this.supportsMetadataExtraction));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.connectionDetails == null)? 0 :this.connectionDetails.hashCode()));
        result = ((result* 31)+((this.databaseName == null)? 0 :this.databaseName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MongoDBConnection) == false) {
            return false;
        }
        MongoDBConnection rhs = ((MongoDBConnection) other);
        return (((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.connectionDetails == rhs.connectionDetails)||((this.connectionDetails!= null)&&this.connectionDetails.equals(rhs.connectionDetails))))&&((this.databaseName == rhs.databaseName)||((this.databaseName!= null)&&this.databaseName.equals(rhs.databaseName))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MongoDBType {

        MONGO_DB("MongoDB");
        private final String value;
        private final static Map<String, MongoDBConnection.MongoDBType> CONSTANTS = new HashMap<String, MongoDBConnection.MongoDBType>();

        static {
            for (MongoDBConnection.MongoDBType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MongoDBType(String value) {
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
        public static MongoDBConnection.MongoDBType fromValue(String value) {
            MongoDBConnection.MongoDBType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
