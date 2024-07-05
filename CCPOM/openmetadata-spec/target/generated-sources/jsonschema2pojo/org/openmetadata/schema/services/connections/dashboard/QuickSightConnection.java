
package org.openmetadata.schema.services.connections.dashboard;

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
import org.openmetadata.schema.security.credentials.AWSCredentials;


/**
 * QuickSightConnection
 * <p>
 * QuickSight Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "awsConfig",
    "awsAccountId",
    "identityType",
    "namespace",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class QuickSightConnection {

    /**
     * QuickSight service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("QuickSight service type")
    private QuickSightConnection.QuickSightType type = QuickSightConnection.QuickSightType.fromValue("QuickSight");
    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("awsConfig")
    @JsonPropertyDescription("AWS credentials configs.")
    @Valid
    @NotNull
    private AWSCredentials awsConfig;
    /**
     * AWS Account ID
     * <p>
     * AWS Account ID
     * (Required)
     * 
     */
    @JsonProperty("awsAccountId")
    @JsonPropertyDescription("AWS Account ID")
    @NotNull
    private String awsAccountId;
    /**
     * Identity Type
     * <p>
     * The authentication method that the user uses to sign in.
     * 
     */
    @JsonProperty("identityType")
    @JsonPropertyDescription("The authentication method that the user uses to sign in.")
    private QuickSightConnection.IdentityType identityType = QuickSightConnection.IdentityType.fromValue("IAM");
    /**
     * The Amazon QuickSight namespace that contains the dashboard IDs in this request ( To be provided when identityType is `ANONYMOUS` )
     * 
     */
    @JsonProperty("namespace")
    @JsonPropertyDescription("The Amazon QuickSight namespace that contains the dashboard IDs in this request ( To be provided when identityType is `ANONYMOUS` )")
    private String namespace;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * QuickSight service type
     * 
     */
    @JsonProperty("type")
    public QuickSightConnection.QuickSightType getType() {
        return type;
    }

    /**
     * QuickSight service type
     * 
     */
    @JsonProperty("type")
    public void setType(QuickSightConnection.QuickSightType type) {
        this.type = type;
    }

    public QuickSightConnection withType(QuickSightConnection.QuickSightType type) {
        this.type = type;
        return this;
    }

    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("awsConfig")
    public AWSCredentials getAwsConfig() {
        return awsConfig;
    }

    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("awsConfig")
    public void setAwsConfig(AWSCredentials awsConfig) {
        this.awsConfig = awsConfig;
    }

    public QuickSightConnection withAwsConfig(AWSCredentials awsConfig) {
        this.awsConfig = awsConfig;
        return this;
    }

    /**
     * AWS Account ID
     * <p>
     * AWS Account ID
     * (Required)
     * 
     */
    @JsonProperty("awsAccountId")
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * AWS Account ID
     * <p>
     * AWS Account ID
     * (Required)
     * 
     */
    @JsonProperty("awsAccountId")
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    public QuickSightConnection withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * Identity Type
     * <p>
     * The authentication method that the user uses to sign in.
     * 
     */
    @JsonProperty("identityType")
    public QuickSightConnection.IdentityType getIdentityType() {
        return identityType;
    }

    /**
     * Identity Type
     * <p>
     * The authentication method that the user uses to sign in.
     * 
     */
    @JsonProperty("identityType")
    public void setIdentityType(QuickSightConnection.IdentityType identityType) {
        this.identityType = identityType;
    }

    public QuickSightConnection withIdentityType(QuickSightConnection.IdentityType identityType) {
        this.identityType = identityType;
        return this;
    }

    /**
     * The Amazon QuickSight namespace that contains the dashboard IDs in this request ( To be provided when identityType is `ANONYMOUS` )
     * 
     */
    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }

    /**
     * The Amazon QuickSight namespace that contains the dashboard IDs in this request ( To be provided when identityType is `ANONYMOUS` )
     * 
     */
    @JsonProperty("namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public QuickSightConnection withNamespace(String namespace) {
        this.namespace = namespace;
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

    public QuickSightConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QuickSightConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("awsConfig");
        sb.append('=');
        sb.append(((this.awsConfig == null)?"<null>":this.awsConfig));
        sb.append(',');
        sb.append("awsAccountId");
        sb.append('=');
        sb.append(((this.awsAccountId == null)?"<null>":this.awsAccountId));
        sb.append(',');
        sb.append("identityType");
        sb.append('=');
        sb.append(((this.identityType == null)?"<null>":this.identityType));
        sb.append(',');
        sb.append("namespace");
        sb.append('=');
        sb.append(((this.namespace == null)?"<null>":this.namespace));
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
        result = ((result* 31)+((this.awsAccountId == null)? 0 :this.awsAccountId.hashCode()));
        result = ((result* 31)+((this.awsConfig == null)? 0 :this.awsConfig.hashCode()));
        result = ((result* 31)+((this.identityType == null)? 0 :this.identityType.hashCode()));
        result = ((result* 31)+((this.namespace == null)? 0 :this.namespace.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuickSightConnection) == false) {
            return false;
        }
        QuickSightConnection rhs = ((QuickSightConnection) other);
        return (((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.awsAccountId == rhs.awsAccountId)||((this.awsAccountId!= null)&&this.awsAccountId.equals(rhs.awsAccountId))))&&((this.awsConfig == rhs.awsConfig)||((this.awsConfig!= null)&&this.awsConfig.equals(rhs.awsConfig))))&&((this.identityType == rhs.identityType)||((this.identityType!= null)&&this.identityType.equals(rhs.identityType))))&&((this.namespace == rhs.namespace)||((this.namespace!= null)&&this.namespace.equals(rhs.namespace))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Identity Type
     * <p>
     * The authentication method that the user uses to sign in.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum IdentityType {

        IAM("IAM"),
        QUICKSIGHT("QUICKSIGHT"),
        ANONYMOUS("ANONYMOUS");
        private final String value;
        private final static Map<String, QuickSightConnection.IdentityType> CONSTANTS = new HashMap<String, QuickSightConnection.IdentityType>();

        static {
            for (QuickSightConnection.IdentityType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        IdentityType(String value) {
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
        public static QuickSightConnection.IdentityType fromValue(String value) {
            QuickSightConnection.IdentityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * QuickSight service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum QuickSightType {

        QUICK_SIGHT("QuickSight");
        private final String value;
        private final static Map<String, QuickSightConnection.QuickSightType> CONSTANTS = new HashMap<String, QuickSightConnection.QuickSightType>();

        static {
            for (QuickSightConnection.QuickSightType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        QuickSightType(String value) {
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
        public static QuickSightConnection.QuickSightType fromValue(String value) {
            QuickSightConnection.QuickSightType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
