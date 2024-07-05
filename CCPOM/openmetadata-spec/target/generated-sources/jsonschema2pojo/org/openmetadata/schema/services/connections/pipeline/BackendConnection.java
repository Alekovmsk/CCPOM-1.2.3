
package org.openmetadata.schema.services.connections.pipeline;

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
 * BackendConnection
 * <p>
 * Lineage Backend Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type"
})
@Generated("jsonschema2pojo")
public class BackendConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private BackendConnection.BackendType type = BackendConnection.BackendType.fromValue("Backend");

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public BackendConnection.BackendType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(BackendConnection.BackendType type) {
        this.type = type;
    }

    public BackendConnection withType(BackendConnection.BackendType type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BackendConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BackendConnection) == false) {
            return false;
        }
        BackendConnection rhs = ((BackendConnection) other);
        return ((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum BackendType {

        BACKEND("Backend");
        private final String value;
        private final static Map<String, BackendConnection.BackendType> CONSTANTS = new HashMap<String, BackendConnection.BackendType>();

        static {
            for (BackendConnection.BackendType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        BackendType(String value) {
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
        public static BackendConnection.BackendType fromValue(String value) {
            BackendConnection.BackendType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
