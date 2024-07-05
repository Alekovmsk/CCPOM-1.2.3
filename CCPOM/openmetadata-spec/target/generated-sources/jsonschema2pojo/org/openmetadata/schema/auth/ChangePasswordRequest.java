
package org.openmetadata.schema.auth;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * ChangePasswordRequest
 * <p>
 * Change Password Request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "username",
    "oldPassword",
    "newPassword",
    "confirmPassword",
    "requestType"
})
@Generated("jsonschema2pojo")
public class ChangePasswordRequest {

    /**
     * Name of the user
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Name of the user")
    private String username;
    /**
     * Name that identifies this Custom Metric.
     * 
     */
    @JsonProperty("oldPassword")
    @JsonPropertyDescription("Name that identifies this Custom Metric.")
    private String oldPassword;
    /**
     * Name of the column in a table.
     * (Required)
     * 
     */
    @JsonProperty("newPassword")
    @JsonPropertyDescription("Name of the column in a table.")
    @NotNull
    private String newPassword;
    /**
     * Name of the column in a table.
     * (Required)
     * 
     */
    @JsonProperty("confirmPassword")
    @JsonPropertyDescription("Name of the column in a table.")
    @NotNull
    private String confirmPassword;
    /**
     * Name of the column in a table.
     * 
     */
    @JsonProperty("requestType")
    @JsonPropertyDescription("Name of the column in a table.")
    private ChangePasswordRequest.RequestType requestType = ChangePasswordRequest.RequestType.fromValue("SELF");

    /**
     * Name of the user
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Name of the user
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public ChangePasswordRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Name that identifies this Custom Metric.
     * 
     */
    @JsonProperty("oldPassword")
    public String getOldPassword() {
        return oldPassword;
    }

    /**
     * Name that identifies this Custom Metric.
     * 
     */
    @JsonProperty("oldPassword")
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public ChangePasswordRequest withOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
        return this;
    }

    /**
     * Name of the column in a table.
     * (Required)
     * 
     */
    @JsonProperty("newPassword")
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Name of the column in a table.
     * (Required)
     * 
     */
    @JsonProperty("newPassword")
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public ChangePasswordRequest withNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    /**
     * Name of the column in a table.
     * (Required)
     * 
     */
    @JsonProperty("confirmPassword")
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * Name of the column in a table.
     * (Required)
     * 
     */
    @JsonProperty("confirmPassword")
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public ChangePasswordRequest withConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    /**
     * Name of the column in a table.
     * 
     */
    @JsonProperty("requestType")
    public ChangePasswordRequest.RequestType getRequestType() {
        return requestType;
    }

    /**
     * Name of the column in a table.
     * 
     */
    @JsonProperty("requestType")
    public void setRequestType(ChangePasswordRequest.RequestType requestType) {
        this.requestType = requestType;
    }

    public ChangePasswordRequest withRequestType(ChangePasswordRequest.RequestType requestType) {
        this.requestType = requestType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChangePasswordRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("oldPassword");
        sb.append('=');
        sb.append(((this.oldPassword == null)?"<null>":this.oldPassword));
        sb.append(',');
        sb.append("newPassword");
        sb.append('=');
        sb.append(((this.newPassword == null)?"<null>":this.newPassword));
        sb.append(',');
        sb.append("confirmPassword");
        sb.append('=');
        sb.append(((this.confirmPassword == null)?"<null>":this.confirmPassword));
        sb.append(',');
        sb.append("requestType");
        sb.append('=');
        sb.append(((this.requestType == null)?"<null>":this.requestType));
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
        result = ((result* 31)+((this.newPassword == null)? 0 :this.newPassword.hashCode()));
        result = ((result* 31)+((this.confirmPassword == null)? 0 :this.confirmPassword.hashCode()));
        result = ((result* 31)+((this.requestType == null)? 0 :this.requestType.hashCode()));
        result = ((result* 31)+((this.oldPassword == null)? 0 :this.oldPassword.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChangePasswordRequest) == false) {
            return false;
        }
        ChangePasswordRequest rhs = ((ChangePasswordRequest) other);
        return ((((((this.newPassword == rhs.newPassword)||((this.newPassword!= null)&&this.newPassword.equals(rhs.newPassword)))&&((this.confirmPassword == rhs.confirmPassword)||((this.confirmPassword!= null)&&this.confirmPassword.equals(rhs.confirmPassword))))&&((this.requestType == rhs.requestType)||((this.requestType!= null)&&this.requestType.equals(rhs.requestType))))&&((this.oldPassword == rhs.oldPassword)||((this.oldPassword!= null)&&this.oldPassword.equals(rhs.oldPassword))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * Name of the column in a table.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RequestType {

        SELF("SELF"),
        USER("USER");
        private final String value;
        private final static Map<String, ChangePasswordRequest.RequestType> CONSTANTS = new HashMap<String, ChangePasswordRequest.RequestType>();

        static {
            for (ChangePasswordRequest.RequestType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RequestType(String value) {
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
        public static ChangePasswordRequest.RequestType fromValue(String value) {
            ChangePasswordRequest.RequestType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
