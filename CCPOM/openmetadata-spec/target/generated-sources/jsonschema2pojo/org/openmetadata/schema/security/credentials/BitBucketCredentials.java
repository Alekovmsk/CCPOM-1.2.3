
package org.openmetadata.schema.security.credentials;

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
import org.openmetadata.annotations.PasswordField;


/**
 * BitBucketCredentials
 * <p>
 * Credentials for a BitBucket repository
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "repositoryOwner",
    "repositoryName",
    "token",
    "branch"
})
@Generated("jsonschema2pojo")
public class BitBucketCredentials {

    /**
     * BitBucket Credentials type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("BitBucket Credentials type")
    private BitBucketCredentials.BitbucketType type = BitBucketCredentials.BitbucketType.fromValue("BitBucket");
    /**
     * Repository Owner
     * <p>
     * The owner (user or organization) of a Git repository. For example, in https://github.com/open-metadata/OpenMetadata, the owner is `open-metadata`.
     * (Required)
     * 
     */
    @JsonProperty("repositoryOwner")
    @JsonPropertyDescription("The owner (user or organization) of a Git repository. For example, in https://github.com/open-metadata/OpenMetadata, the owner is `open-metadata`.")
    @NotNull
    private String repositoryOwner;
    /**
     * Repository Name
     * <p>
     * The name of a Git repository. For example, in https://github.com/open-metadata/OpenMetadata, the name is `OpenMetadata`.
     * (Required)
     * 
     */
    @JsonProperty("repositoryName")
    @JsonPropertyDescription("The name of a Git repository. For example, in https://github.com/open-metadata/OpenMetadata, the name is `OpenMetadata`.")
    @NotNull
    private String repositoryName;
    /**
     * API Token
     * <p>
     * Token to use the API. This is required for private repositories and to ensure we don't hit API limits.
     * 
     */
    @JsonProperty("token")
    @JsonPropertyDescription("Token to use the API. This is required for private repositories and to ensure we don't hit API limits.")
    @PasswordField
    private String token;
    /**
     * Main Branch
     * <p>
     * Main production branch of the repository. E.g., `main`
     * (Required)
     * 
     */
    @JsonProperty("branch")
    @JsonPropertyDescription("Main production branch of the repository. E.g., `main`")
    @NotNull
    private String branch;

    /**
     * BitBucket Credentials type
     * 
     */
    @JsonProperty("type")
    public BitBucketCredentials.BitbucketType getType() {
        return type;
    }

    /**
     * BitBucket Credentials type
     * 
     */
    @JsonProperty("type")
    public void setType(BitBucketCredentials.BitbucketType type) {
        this.type = type;
    }

    public BitBucketCredentials withType(BitBucketCredentials.BitbucketType type) {
        this.type = type;
        return this;
    }

    /**
     * Repository Owner
     * <p>
     * The owner (user or organization) of a Git repository. For example, in https://github.com/open-metadata/OpenMetadata, the owner is `open-metadata`.
     * (Required)
     * 
     */
    @JsonProperty("repositoryOwner")
    public String getRepositoryOwner() {
        return repositoryOwner;
    }

    /**
     * Repository Owner
     * <p>
     * The owner (user or organization) of a Git repository. For example, in https://github.com/open-metadata/OpenMetadata, the owner is `open-metadata`.
     * (Required)
     * 
     */
    @JsonProperty("repositoryOwner")
    public void setRepositoryOwner(String repositoryOwner) {
        this.repositoryOwner = repositoryOwner;
    }

    public BitBucketCredentials withRepositoryOwner(String repositoryOwner) {
        this.repositoryOwner = repositoryOwner;
        return this;
    }

    /**
     * Repository Name
     * <p>
     * The name of a Git repository. For example, in https://github.com/open-metadata/OpenMetadata, the name is `OpenMetadata`.
     * (Required)
     * 
     */
    @JsonProperty("repositoryName")
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * Repository Name
     * <p>
     * The name of a Git repository. For example, in https://github.com/open-metadata/OpenMetadata, the name is `OpenMetadata`.
     * (Required)
     * 
     */
    @JsonProperty("repositoryName")
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public BitBucketCredentials withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * API Token
     * <p>
     * Token to use the API. This is required for private repositories and to ensure we don't hit API limits.
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public String getToken() {
        return token;
    }

    /**
     * API Token
     * <p>
     * Token to use the API. This is required for private repositories and to ensure we don't hit API limits.
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public void setToken(String token) {
        this.token = token;
    }

    public BitBucketCredentials withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Main Branch
     * <p>
     * Main production branch of the repository. E.g., `main`
     * (Required)
     * 
     */
    @JsonProperty("branch")
    public String getBranch() {
        return branch;
    }

    /**
     * Main Branch
     * <p>
     * Main production branch of the repository. E.g., `main`
     * (Required)
     * 
     */
    @JsonProperty("branch")
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public BitBucketCredentials withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BitBucketCredentials.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("repositoryOwner");
        sb.append('=');
        sb.append(((this.repositoryOwner == null)?"<null>":this.repositoryOwner));
        sb.append(',');
        sb.append("repositoryName");
        sb.append('=');
        sb.append(((this.repositoryName == null)?"<null>":this.repositoryName));
        sb.append(',');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
        sb.append(',');
        sb.append("branch");
        sb.append('=');
        sb.append(((this.branch == null)?"<null>":this.branch));
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
        result = ((result* 31)+((this.repositoryOwner == null)? 0 :this.repositoryOwner.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.repositoryName == null)? 0 :this.repositoryName.hashCode()));
        result = ((result* 31)+((this.branch == null)? 0 :this.branch.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BitBucketCredentials) == false) {
            return false;
        }
        BitBucketCredentials rhs = ((BitBucketCredentials) other);
        return ((((((this.repositoryOwner == rhs.repositoryOwner)||((this.repositoryOwner!= null)&&this.repositoryOwner.equals(rhs.repositoryOwner)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.repositoryName == rhs.repositoryName)||((this.repositoryName!= null)&&this.repositoryName.equals(rhs.repositoryName))))&&((this.branch == rhs.branch)||((this.branch!= null)&&this.branch.equals(rhs.branch))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))));
    }


    /**
     * BitBucket Credentials type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum BitbucketType {

        BIT_BUCKET("BitBucket");
        private final String value;
        private final static Map<String, BitBucketCredentials.BitbucketType> CONSTANTS = new HashMap<String, BitBucketCredentials.BitbucketType>();

        static {
            for (BitBucketCredentials.BitbucketType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        BitbucketType(String value) {
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
        public static BitBucketCredentials.BitbucketType fromValue(String value) {
            BitBucketCredentials.BitbucketType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
