
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
 * CustomDatabaseConnection
 * <p>
 * Custom Database Service connection to build a source that is not supported by OpenMetadata yet.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "sourcePythonClass",
    "connectionOptions"
})
@Generated("jsonschema2pojo")
public class CustomDatabaseConnection {

    /**
     * Service Type
     * <p>
     * Custom database service type
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Custom database service type")
    @NotNull
    private CustomDatabaseConnection.CustomDatabaseType type = CustomDatabaseConnection.CustomDatabaseType.fromValue("CustomDatabase");
    /**
     * Source Python Class Name
     * <p>
     * Source Python Class Name to instantiated by the ingestion workflow
     * 
     */
    @JsonProperty("sourcePythonClass")
    @JsonPropertyDescription("Source Python Class Name to instantiated by the ingestion workflow")
    private String sourcePythonClass;
    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    @JsonPropertyDescription("Additional connection options to build the URL that can be sent to service during the connection.")
    @Valid
    private ConnectionOptions connectionOptions;

    /**
     * Service Type
     * <p>
     * Custom database service type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public CustomDatabaseConnection.CustomDatabaseType getType() {
        return type;
    }

    /**
     * Service Type
     * <p>
     * Custom database service type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(CustomDatabaseConnection.CustomDatabaseType type) {
        this.type = type;
    }

    public CustomDatabaseConnection withType(CustomDatabaseConnection.CustomDatabaseType type) {
        this.type = type;
        return this;
    }

    /**
     * Source Python Class Name
     * <p>
     * Source Python Class Name to instantiated by the ingestion workflow
     * 
     */
    @JsonProperty("sourcePythonClass")
    public String getSourcePythonClass() {
        return sourcePythonClass;
    }

    /**
     * Source Python Class Name
     * <p>
     * Source Python Class Name to instantiated by the ingestion workflow
     * 
     */
    @JsonProperty("sourcePythonClass")
    public void setSourcePythonClass(String sourcePythonClass) {
        this.sourcePythonClass = sourcePythonClass;
    }

    public CustomDatabaseConnection withSourcePythonClass(String sourcePythonClass) {
        this.sourcePythonClass = sourcePythonClass;
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

    public CustomDatabaseConnection withConnectionOptions(ConnectionOptions connectionOptions) {
        this.connectionOptions = connectionOptions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomDatabaseConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("sourcePythonClass");
        sb.append('=');
        sb.append(((this.sourcePythonClass == null)?"<null>":this.sourcePythonClass));
        sb.append(',');
        sb.append("connectionOptions");
        sb.append('=');
        sb.append(((this.connectionOptions == null)?"<null>":this.connectionOptions));
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
        result = ((result* 31)+((this.sourcePythonClass == null)? 0 :this.sourcePythonClass.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.connectionOptions == null)? 0 :this.connectionOptions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomDatabaseConnection) == false) {
            return false;
        }
        CustomDatabaseConnection rhs = ((CustomDatabaseConnection) other);
        return ((((this.sourcePythonClass == rhs.sourcePythonClass)||((this.sourcePythonClass!= null)&&this.sourcePythonClass.equals(rhs.sourcePythonClass)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))));
    }


    /**
     * Service Type
     * <p>
     * Custom database service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum CustomDatabaseType {

        CUSTOM_DATABASE("CustomDatabase");
        private final String value;
        private final static Map<String, CustomDatabaseConnection.CustomDatabaseType> CONSTANTS = new HashMap<String, CustomDatabaseConnection.CustomDatabaseType>();

        static {
            for (CustomDatabaseConnection.CustomDatabaseType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CustomDatabaseType(String value) {
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
        public static CustomDatabaseConnection.CustomDatabaseType fromValue(String value) {
            CustomDatabaseConnection.CustomDatabaseType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
