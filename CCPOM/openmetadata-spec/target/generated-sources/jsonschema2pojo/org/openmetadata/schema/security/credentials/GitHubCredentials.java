
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
 * GitHubCredentials
 * <p>
 * Credentials for a GitHub repository
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "repositoryOwner",
    "repositoryName",
    "token"
})
@Generated("jsonschema2pojo")
public class GitHubCredentials {

    /**
     * GitHub Credentials type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("GitHub Credentials type")
    private GitHubCredentials.GithubType type = GitHubCredentials.GithubType.fromValue("GitHub");
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
     * GitHub Credentials type
     * 
     */
    @JsonProperty("type")
    public GitHubCredentials.GithubType getType() {
        return type;
    }

    /**
     * GitHub Credentials type
     * 
     */
    @JsonProperty("type")
    public void setType(GitHubCredentials.GithubType type) {
        this.type = type;
    }

    public GitHubCredentials withType(GitHubCredentials.GithubType type) {
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

    public GitHubCredentials withRepositoryOwner(String repositoryOwner) {
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

    public GitHubCredentials withRepositoryName(String repositoryName) {
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

    public GitHubCredentials withToken(String token) {
        this.token = token;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GitHubCredentials.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GitHubCredentials) == false) {
            return false;
        }
        GitHubCredentials rhs = ((GitHubCredentials) other);
        return (((((this.repositoryOwner == rhs.repositoryOwner)||((this.repositoryOwner!= null)&&this.repositoryOwner.equals(rhs.repositoryOwner)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.repositoryName == rhs.repositoryName)||((this.repositoryName!= null)&&this.repositoryName.equals(rhs.repositoryName))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))));
    }


    /**
     * GitHub Credentials type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum GithubType {

        GIT_HUB("GitHub");
        private final String value;
        private final static Map<String, GitHubCredentials.GithubType> CONSTANTS = new HashMap<String, GitHubCredentials.GithubType>();

        static {
            for (GitHubCredentials.GithubType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        GithubType(String value) {
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
        public static GitHubCredentials.GithubType fromValue(String value) {
            GitHubCredentials.GithubType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
