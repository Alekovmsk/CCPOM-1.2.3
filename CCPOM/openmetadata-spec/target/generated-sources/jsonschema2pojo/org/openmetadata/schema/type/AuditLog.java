
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * AuditLog
 * <p>
 * This schema defines the Audit Log type to capture the audit trail of POST, PUT, and PATCH API operations.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "method",
    "responseCode",
    "path",
    "userName",
    "entityId",
    "entityType",
    "timestamp"
})
@Generated("jsonschema2pojo")
public class AuditLog {

    /**
     * HTTP Method used in a call.
     * (Required)
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("HTTP Method used in a call.")
    @NotNull
    private AuditLog.Method method;
    /**
     * HTTP response code for the api requested.
     * (Required)
     * 
     */
    @JsonProperty("responseCode")
    @JsonPropertyDescription("HTTP response code for the api requested.")
    @NotNull
    private Integer responseCode;
    /**
     * Requested API Path.
     * (Required)
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("Requested API Path.")
    @NotNull
    private String path;
    /**
     * Name of the user who made the API request.
     * (Required)
     * 
     */
    @JsonProperty("userName")
    @JsonPropertyDescription("Name of the user who made the API request.")
    @NotNull
    private String userName;
    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    @NotNull
    private UUID entityId;
    /**
     * Type of Entity that is modified by the operation.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    @JsonPropertyDescription("Type of Entity that is modified by the operation.")
    @NotNull
    private String entityType;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;

    /**
     * HTTP Method used in a call.
     * (Required)
     * 
     */
    @JsonProperty("method")
    public AuditLog.Method getMethod() {
        return method;
    }

    /**
     * HTTP Method used in a call.
     * (Required)
     * 
     */
    @JsonProperty("method")
    public void setMethod(AuditLog.Method method) {
        this.method = method;
    }

    public AuditLog withMethod(AuditLog.Method method) {
        this.method = method;
        return this;
    }

    /**
     * HTTP response code for the api requested.
     * (Required)
     * 
     */
    @JsonProperty("responseCode")
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * HTTP response code for the api requested.
     * (Required)
     * 
     */
    @JsonProperty("responseCode")
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public AuditLog withResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * Requested API Path.
     * (Required)
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * Requested API Path.
     * (Required)
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    public AuditLog withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Name of the user who made the API request.
     * (Required)
     * 
     */
    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * Name of the user who made the API request.
     * (Required)
     * 
     */
    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AuditLog withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    public UUID getEntityId() {
        return entityId;
    }

    /**
     * Unique id used to identify an entity.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    public void setEntityId(UUID entityId) {
        this.entityId = entityId;
    }

    public AuditLog withEntityId(UUID entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Type of Entity that is modified by the operation.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    public String getEntityType() {
        return entityType;
    }

    /**
     * Type of Entity that is modified by the operation.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public AuditLog withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public AuditLog withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AuditLog.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("responseCode");
        sb.append('=');
        sb.append(((this.responseCode == null)?"<null>":this.responseCode));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        sb.append("entityId");
        sb.append('=');
        sb.append(((this.entityId == null)?"<null>":this.entityId));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
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
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.entityId == null)? 0 :this.entityId.hashCode()));
        result = ((result* 31)+((this.userName == null)? 0 :this.userName.hashCode()));
        result = ((result* 31)+((this.responseCode == null)? 0 :this.responseCode.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuditLog) == false) {
            return false;
        }
        AuditLog rhs = ((AuditLog) other);
        return ((((((((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path)))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId))))&&((this.userName == rhs.userName)||((this.userName!= null)&&this.userName.equals(rhs.userName))))&&((this.responseCode == rhs.responseCode)||((this.responseCode!= null)&&this.responseCode.equals(rhs.responseCode))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }


    /**
     * HTTP Method used in a call.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Method {

        POST("POST"),
        PUT("PUT"),
        PATCH("PATCH"),
        DELETE("DELETE");
        private final String value;
        private final static Map<String, AuditLog.Method> CONSTANTS = new HashMap<String, AuditLog.Method>();

        static {
            for (AuditLog.Method c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Method(String value) {
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
        public static AuditLog.Method fromValue(String value) {
            AuditLog.Method constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
