
package org.openmetadata.schema.security.credentials;

import java.net.URI;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * AWSCredentials
 * <p>
 * AWS credentials configs.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "awsAccessKeyId",
    "awsSecretAccessKey",
    "awsRegion",
    "awsSessionToken",
    "endPointURL",
    "profileName",
    "assumeRoleArn",
    "assumeRoleSessionName",
    "assumeRoleSourceIdentity"
})
@Generated("jsonschema2pojo")
public class AWSCredentials {

    /**
     * AWS Access Key ID
     * <p>
     * AWS Access key ID.
     * 
     */
    @JsonProperty("awsAccessKeyId")
    @JsonPropertyDescription("AWS Access key ID.")
    private String awsAccessKeyId;
    /**
     * AWS Secret Access Key
     * <p>
     * AWS Secret Access Key.
     * 
     */
    @JsonProperty("awsSecretAccessKey")
    @JsonPropertyDescription("AWS Secret Access Key.")
    @PasswordField
    private String awsSecretAccessKey;
    /**
     * AWS Region
     * <p>
     * AWS Region
     * (Required)
     * 
     */
    @JsonProperty("awsRegion")
    @JsonPropertyDescription("AWS Region")
    @NotNull
    private String awsRegion;
    /**
     * AWS Session Token
     * <p>
     * AWS Session Token.
     * 
     */
    @JsonProperty("awsSessionToken")
    @JsonPropertyDescription("AWS Session Token.")
    private String awsSessionToken;
    /**
     * Endpoint URL
     * <p>
     * EndPoint URL for the AWS
     * 
     */
    @JsonProperty("endPointURL")
    @JsonPropertyDescription("EndPoint URL for the AWS")
    private URI endPointURL;
    /**
     * Profile Name
     * <p>
     * The name of a profile to use with the boto session.
     * 
     */
    @JsonProperty("profileName")
    @JsonPropertyDescription("The name of a profile to use with the boto session.")
    private String profileName;
    /**
     * Role Arn for Assume Role
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume. Required Field in case of Assume Role
     * 
     */
    @JsonProperty("assumeRoleArn")
    @JsonPropertyDescription("The Amazon Resource Name (ARN) of the role to assume. Required Field in case of Assume Role")
    private String assumeRoleArn;
    /**
     * Role Session Name for Assume Role
     * <p>
     * An identifier for the assumed role session. Use the role session name to uniquely identify a session when the same role is assumed by different principals or for different reasons. Required Field in case of Assume Role
     * 
     */
    @JsonProperty("assumeRoleSessionName")
    @JsonPropertyDescription("An identifier for the assumed role session. Use the role session name to uniquely identify a session when the same role is assumed by different principals or for different reasons. Required Field in case of Assume Role")
    private String assumeRoleSessionName = "OpenMetadataSession";
    /**
     * Source Identity for Assume Role
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume. Optional Field in case of Assume Role
     * 
     */
    @JsonProperty("assumeRoleSourceIdentity")
    @JsonPropertyDescription("The Amazon Resource Name (ARN) of the role to assume. Optional Field in case of Assume Role")
    private String assumeRoleSourceIdentity;

    /**
     * AWS Access Key ID
     * <p>
     * AWS Access key ID.
     * 
     */
    @JsonProperty("awsAccessKeyId")
    public String getAwsAccessKeyId() {
        return awsAccessKeyId;
    }

    /**
     * AWS Access Key ID
     * <p>
     * AWS Access key ID.
     * 
     */
    @JsonProperty("awsAccessKeyId")
    public void setAwsAccessKeyId(String awsAccessKeyId) {
        this.awsAccessKeyId = awsAccessKeyId;
    }

    public AWSCredentials withAwsAccessKeyId(String awsAccessKeyId) {
        this.awsAccessKeyId = awsAccessKeyId;
        return this;
    }

    /**
     * AWS Secret Access Key
     * <p>
     * AWS Secret Access Key.
     * 
     */
    @JsonProperty("awsSecretAccessKey")
    @PasswordField
    public String getAwsSecretAccessKey() {
        return awsSecretAccessKey;
    }

    /**
     * AWS Secret Access Key
     * <p>
     * AWS Secret Access Key.
     * 
     */
    @JsonProperty("awsSecretAccessKey")
    @PasswordField
    public void setAwsSecretAccessKey(String awsSecretAccessKey) {
        this.awsSecretAccessKey = awsSecretAccessKey;
    }

    public AWSCredentials withAwsSecretAccessKey(String awsSecretAccessKey) {
        this.awsSecretAccessKey = awsSecretAccessKey;
        return this;
    }

    /**
     * AWS Region
     * <p>
     * AWS Region
     * (Required)
     * 
     */
    @JsonProperty("awsRegion")
    public String getAwsRegion() {
        return awsRegion;
    }

    /**
     * AWS Region
     * <p>
     * AWS Region
     * (Required)
     * 
     */
    @JsonProperty("awsRegion")
    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    public AWSCredentials withAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
        return this;
    }

    /**
     * AWS Session Token
     * <p>
     * AWS Session Token.
     * 
     */
    @JsonProperty("awsSessionToken")
    public String getAwsSessionToken() {
        return awsSessionToken;
    }

    /**
     * AWS Session Token
     * <p>
     * AWS Session Token.
     * 
     */
    @JsonProperty("awsSessionToken")
    public void setAwsSessionToken(String awsSessionToken) {
        this.awsSessionToken = awsSessionToken;
    }

    public AWSCredentials withAwsSessionToken(String awsSessionToken) {
        this.awsSessionToken = awsSessionToken;
        return this;
    }

    /**
     * Endpoint URL
     * <p>
     * EndPoint URL for the AWS
     * 
     */
    @JsonProperty("endPointURL")
    public URI getEndPointURL() {
        return endPointURL;
    }

    /**
     * Endpoint URL
     * <p>
     * EndPoint URL for the AWS
     * 
     */
    @JsonProperty("endPointURL")
    public void setEndPointURL(URI endPointURL) {
        this.endPointURL = endPointURL;
    }

    public AWSCredentials withEndPointURL(URI endPointURL) {
        this.endPointURL = endPointURL;
        return this;
    }

    /**
     * Profile Name
     * <p>
     * The name of a profile to use with the boto session.
     * 
     */
    @JsonProperty("profileName")
    public String getProfileName() {
        return profileName;
    }

    /**
     * Profile Name
     * <p>
     * The name of a profile to use with the boto session.
     * 
     */
    @JsonProperty("profileName")
    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public AWSCredentials withProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }

    /**
     * Role Arn for Assume Role
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume. Required Field in case of Assume Role
     * 
     */
    @JsonProperty("assumeRoleArn")
    public String getAssumeRoleArn() {
        return assumeRoleArn;
    }

    /**
     * Role Arn for Assume Role
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume. Required Field in case of Assume Role
     * 
     */
    @JsonProperty("assumeRoleArn")
    public void setAssumeRoleArn(String assumeRoleArn) {
        this.assumeRoleArn = assumeRoleArn;
    }

    public AWSCredentials withAssumeRoleArn(String assumeRoleArn) {
        this.assumeRoleArn = assumeRoleArn;
        return this;
    }

    /**
     * Role Session Name for Assume Role
     * <p>
     * An identifier for the assumed role session. Use the role session name to uniquely identify a session when the same role is assumed by different principals or for different reasons. Required Field in case of Assume Role
     * 
     */
    @JsonProperty("assumeRoleSessionName")
    public String getAssumeRoleSessionName() {
        return assumeRoleSessionName;
    }

    /**
     * Role Session Name for Assume Role
     * <p>
     * An identifier for the assumed role session. Use the role session name to uniquely identify a session when the same role is assumed by different principals or for different reasons. Required Field in case of Assume Role
     * 
     */
    @JsonProperty("assumeRoleSessionName")
    public void setAssumeRoleSessionName(String assumeRoleSessionName) {
        this.assumeRoleSessionName = assumeRoleSessionName;
    }

    public AWSCredentials withAssumeRoleSessionName(String assumeRoleSessionName) {
        this.assumeRoleSessionName = assumeRoleSessionName;
        return this;
    }

    /**
     * Source Identity for Assume Role
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume. Optional Field in case of Assume Role
     * 
     */
    @JsonProperty("assumeRoleSourceIdentity")
    public String getAssumeRoleSourceIdentity() {
        return assumeRoleSourceIdentity;
    }

    /**
     * Source Identity for Assume Role
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume. Optional Field in case of Assume Role
     * 
     */
    @JsonProperty("assumeRoleSourceIdentity")
    public void setAssumeRoleSourceIdentity(String assumeRoleSourceIdentity) {
        this.assumeRoleSourceIdentity = assumeRoleSourceIdentity;
    }

    public AWSCredentials withAssumeRoleSourceIdentity(String assumeRoleSourceIdentity) {
        this.assumeRoleSourceIdentity = assumeRoleSourceIdentity;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AWSCredentials.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("awsAccessKeyId");
        sb.append('=');
        sb.append(((this.awsAccessKeyId == null)?"<null>":this.awsAccessKeyId));
        sb.append(',');
        sb.append("awsSecretAccessKey");
        sb.append('=');
        sb.append(((this.awsSecretAccessKey == null)?"<null>":this.awsSecretAccessKey));
        sb.append(',');
        sb.append("awsRegion");
        sb.append('=');
        sb.append(((this.awsRegion == null)?"<null>":this.awsRegion));
        sb.append(',');
        sb.append("awsSessionToken");
        sb.append('=');
        sb.append(((this.awsSessionToken == null)?"<null>":this.awsSessionToken));
        sb.append(',');
        sb.append("endPointURL");
        sb.append('=');
        sb.append(((this.endPointURL == null)?"<null>":this.endPointURL));
        sb.append(',');
        sb.append("profileName");
        sb.append('=');
        sb.append(((this.profileName == null)?"<null>":this.profileName));
        sb.append(',');
        sb.append("assumeRoleArn");
        sb.append('=');
        sb.append(((this.assumeRoleArn == null)?"<null>":this.assumeRoleArn));
        sb.append(',');
        sb.append("assumeRoleSessionName");
        sb.append('=');
        sb.append(((this.assumeRoleSessionName == null)?"<null>":this.assumeRoleSessionName));
        sb.append(',');
        sb.append("assumeRoleSourceIdentity");
        sb.append('=');
        sb.append(((this.assumeRoleSourceIdentity == null)?"<null>":this.assumeRoleSourceIdentity));
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
        result = ((result* 31)+((this.profileName == null)? 0 :this.profileName.hashCode()));
        result = ((result* 31)+((this.awsRegion == null)? 0 :this.awsRegion.hashCode()));
        result = ((result* 31)+((this.assumeRoleSessionName == null)? 0 :this.assumeRoleSessionName.hashCode()));
        result = ((result* 31)+((this.awsAccessKeyId == null)? 0 :this.awsAccessKeyId.hashCode()));
        result = ((result* 31)+((this.assumeRoleArn == null)? 0 :this.assumeRoleArn.hashCode()));
        result = ((result* 31)+((this.assumeRoleSourceIdentity == null)? 0 :this.assumeRoleSourceIdentity.hashCode()));
        result = ((result* 31)+((this.endPointURL == null)? 0 :this.endPointURL.hashCode()));
        result = ((result* 31)+((this.awsSessionToken == null)? 0 :this.awsSessionToken.hashCode()));
        result = ((result* 31)+((this.awsSecretAccessKey == null)? 0 :this.awsSecretAccessKey.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AWSCredentials) == false) {
            return false;
        }
        AWSCredentials rhs = ((AWSCredentials) other);
        return ((((((((((this.profileName == rhs.profileName)||((this.profileName!= null)&&this.profileName.equals(rhs.profileName)))&&((this.awsRegion == rhs.awsRegion)||((this.awsRegion!= null)&&this.awsRegion.equals(rhs.awsRegion))))&&((this.assumeRoleSessionName == rhs.assumeRoleSessionName)||((this.assumeRoleSessionName!= null)&&this.assumeRoleSessionName.equals(rhs.assumeRoleSessionName))))&&((this.awsAccessKeyId == rhs.awsAccessKeyId)||((this.awsAccessKeyId!= null)&&this.awsAccessKeyId.equals(rhs.awsAccessKeyId))))&&((this.assumeRoleArn == rhs.assumeRoleArn)||((this.assumeRoleArn!= null)&&this.assumeRoleArn.equals(rhs.assumeRoleArn))))&&((this.assumeRoleSourceIdentity == rhs.assumeRoleSourceIdentity)||((this.assumeRoleSourceIdentity!= null)&&this.assumeRoleSourceIdentity.equals(rhs.assumeRoleSourceIdentity))))&&((this.endPointURL == rhs.endPointURL)||((this.endPointURL!= null)&&this.endPointURL.equals(rhs.endPointURL))))&&((this.awsSessionToken == rhs.awsSessionToken)||((this.awsSessionToken!= null)&&this.awsSessionToken.equals(rhs.awsSessionToken))))&&((this.awsSecretAccessKey == rhs.awsSecretAccessKey)||((this.awsSecretAccessKey!= null)&&this.awsSecretAccessKey.equals(rhs.awsSecretAccessKey))));
    }

}
