
package org.openmetadata.schema.security.credentials;

import java.net.URI;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * GCP Credentials Values
 * <p>
 * Pass the raw credential values provided by GCP
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "projectId",
    "privateKeyId",
    "privateKey",
    "clientEmail",
    "clientId",
    "authUri",
    "tokenUri",
    "authProviderX509CertUrl",
    "clientX509CertUrl"
})
@Generated("jsonschema2pojo")
public class GCPValues {

    /**
     * Credentials Type
     * <p>
     * Google Cloud Platform account type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Google Cloud Platform account type.")
    private String type;
    /**
     * Project ID
     * <p>
     * Project ID
     * 
     */
    @JsonProperty("projectId")
    @JsonPropertyDescription("Project ID")
    private Object projectId;
    /**
     * Private Key ID
     * <p>
     * Google Cloud private key id.
     * 
     */
    @JsonProperty("privateKeyId")
    @JsonPropertyDescription("Google Cloud private key id.")
    private String privateKeyId;
    /**
     * Private Key
     * <p>
     * Google Cloud private key.
     * 
     */
    @JsonProperty("privateKey")
    @JsonPropertyDescription("Google Cloud private key.")
    @PasswordField
    private String privateKey;
    /**
     * Client Email
     * <p>
     * Google Cloud email.
     * 
     */
    @JsonProperty("clientEmail")
    @JsonPropertyDescription("Google Cloud email.")
    private String clientEmail;
    /**
     * Client ID
     * <p>
     * Google Cloud Client ID.
     * 
     */
    @JsonProperty("clientId")
    @JsonPropertyDescription("Google Cloud Client ID.")
    private String clientId;
    /**
     * Authentication URI
     * <p>
     * Google Cloud auth uri.
     * 
     */
    @JsonProperty("authUri")
    @JsonPropertyDescription("Google Cloud auth uri.")
    private URI authUri = URI.create("https://accounts.google.com/o/oauth2/auth");
    /**
     * Token URI
     * <p>
     * Google Cloud token uri.
     * 
     */
    @JsonProperty("tokenUri")
    @JsonPropertyDescription("Google Cloud token uri.")
    private URI tokenUri = URI.create("https://oauth2.googleapis.com/token");
    /**
     * Authentication Provider x509 Certificate URL
     * <p>
     * Google Cloud auth provider certificate.
     * 
     */
    @JsonProperty("authProviderX509CertUrl")
    @JsonPropertyDescription("Google Cloud auth provider certificate.")
    private URI authProviderX509CertUrl = URI.create("https://www.googleapis.com/oauth2/v1/certs");
    /**
     * Client x509 Certificate URL
     * <p>
     * Google Cloud client certificate uri.
     * 
     */
    @JsonProperty("clientX509CertUrl")
    @JsonPropertyDescription("Google Cloud client certificate uri.")
    private URI clientX509CertUrl;

    /**
     * Credentials Type
     * <p>
     * Google Cloud Platform account type.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Credentials Type
     * <p>
     * Google Cloud Platform account type.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public GCPValues withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Project ID
     * <p>
     * Project ID
     * 
     */
    @JsonProperty("projectId")
    public Object getProjectId() {
        return projectId;
    }

    /**
     * Project ID
     * <p>
     * Project ID
     * 
     */
    @JsonProperty("projectId")
    public void setProjectId(Object projectId) {
        this.projectId = projectId;
    }

    public GCPValues withProjectId(Object projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Private Key ID
     * <p>
     * Google Cloud private key id.
     * 
     */
    @JsonProperty("privateKeyId")
    public String getPrivateKeyId() {
        return privateKeyId;
    }

    /**
     * Private Key ID
     * <p>
     * Google Cloud private key id.
     * 
     */
    @JsonProperty("privateKeyId")
    public void setPrivateKeyId(String privateKeyId) {
        this.privateKeyId = privateKeyId;
    }

    public GCPValues withPrivateKeyId(String privateKeyId) {
        this.privateKeyId = privateKeyId;
        return this;
    }

    /**
     * Private Key
     * <p>
     * Google Cloud private key.
     * 
     */
    @JsonProperty("privateKey")
    @PasswordField
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * Private Key
     * <p>
     * Google Cloud private key.
     * 
     */
    @JsonProperty("privateKey")
    @PasswordField
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public GCPValues withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Client Email
     * <p>
     * Google Cloud email.
     * 
     */
    @JsonProperty("clientEmail")
    public String getClientEmail() {
        return clientEmail;
    }

    /**
     * Client Email
     * <p>
     * Google Cloud email.
     * 
     */
    @JsonProperty("clientEmail")
    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public GCPValues withClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
        return this;
    }

    /**
     * Client ID
     * <p>
     * Google Cloud Client ID.
     * 
     */
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    /**
     * Client ID
     * <p>
     * Google Cloud Client ID.
     * 
     */
    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public GCPValues withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Authentication URI
     * <p>
     * Google Cloud auth uri.
     * 
     */
    @JsonProperty("authUri")
    public URI getAuthUri() {
        return authUri;
    }

    /**
     * Authentication URI
     * <p>
     * Google Cloud auth uri.
     * 
     */
    @JsonProperty("authUri")
    public void setAuthUri(URI authUri) {
        this.authUri = authUri;
    }

    public GCPValues withAuthUri(URI authUri) {
        this.authUri = authUri;
        return this;
    }

    /**
     * Token URI
     * <p>
     * Google Cloud token uri.
     * 
     */
    @JsonProperty("tokenUri")
    public URI getTokenUri() {
        return tokenUri;
    }

    /**
     * Token URI
     * <p>
     * Google Cloud token uri.
     * 
     */
    @JsonProperty("tokenUri")
    public void setTokenUri(URI tokenUri) {
        this.tokenUri = tokenUri;
    }

    public GCPValues withTokenUri(URI tokenUri) {
        this.tokenUri = tokenUri;
        return this;
    }

    /**
     * Authentication Provider x509 Certificate URL
     * <p>
     * Google Cloud auth provider certificate.
     * 
     */
    @JsonProperty("authProviderX509CertUrl")
    public URI getAuthProviderX509CertUrl() {
        return authProviderX509CertUrl;
    }

    /**
     * Authentication Provider x509 Certificate URL
     * <p>
     * Google Cloud auth provider certificate.
     * 
     */
    @JsonProperty("authProviderX509CertUrl")
    public void setAuthProviderX509CertUrl(URI authProviderX509CertUrl) {
        this.authProviderX509CertUrl = authProviderX509CertUrl;
    }

    public GCPValues withAuthProviderX509CertUrl(URI authProviderX509CertUrl) {
        this.authProviderX509CertUrl = authProviderX509CertUrl;
        return this;
    }

    /**
     * Client x509 Certificate URL
     * <p>
     * Google Cloud client certificate uri.
     * 
     */
    @JsonProperty("clientX509CertUrl")
    public URI getClientX509CertUrl() {
        return clientX509CertUrl;
    }

    /**
     * Client x509 Certificate URL
     * <p>
     * Google Cloud client certificate uri.
     * 
     */
    @JsonProperty("clientX509CertUrl")
    public void setClientX509CertUrl(URI clientX509CertUrl) {
        this.clientX509CertUrl = clientX509CertUrl;
    }

    public GCPValues withClientX509CertUrl(URI clientX509CertUrl) {
        this.clientX509CertUrl = clientX509CertUrl;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GCPValues.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("projectId");
        sb.append('=');
        sb.append(((this.projectId == null)?"<null>":this.projectId));
        sb.append(',');
        sb.append("privateKeyId");
        sb.append('=');
        sb.append(((this.privateKeyId == null)?"<null>":this.privateKeyId));
        sb.append(',');
        sb.append("privateKey");
        sb.append('=');
        sb.append(((this.privateKey == null)?"<null>":this.privateKey));
        sb.append(',');
        sb.append("clientEmail");
        sb.append('=');
        sb.append(((this.clientEmail == null)?"<null>":this.clientEmail));
        sb.append(',');
        sb.append("clientId");
        sb.append('=');
        sb.append(((this.clientId == null)?"<null>":this.clientId));
        sb.append(',');
        sb.append("authUri");
        sb.append('=');
        sb.append(((this.authUri == null)?"<null>":this.authUri));
        sb.append(',');
        sb.append("tokenUri");
        sb.append('=');
        sb.append(((this.tokenUri == null)?"<null>":this.tokenUri));
        sb.append(',');
        sb.append("authProviderX509CertUrl");
        sb.append('=');
        sb.append(((this.authProviderX509CertUrl == null)?"<null>":this.authProviderX509CertUrl));
        sb.append(',');
        sb.append("clientX509CertUrl");
        sb.append('=');
        sb.append(((this.clientX509CertUrl == null)?"<null>":this.clientX509CertUrl));
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
        result = ((result* 31)+((this.privateKey == null)? 0 :this.privateKey.hashCode()));
        result = ((result* 31)+((this.authUri == null)? 0 :this.authUri.hashCode()));
        result = ((result* 31)+((this.clientId == null)? 0 :this.clientId.hashCode()));
        result = ((result* 31)+((this.clientEmail == null)? 0 :this.clientEmail.hashCode()));
        result = ((result* 31)+((this.tokenUri == null)? 0 :this.tokenUri.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.authProviderX509CertUrl == null)? 0 :this.authProviderX509CertUrl.hashCode()));
        result = ((result* 31)+((this.clientX509CertUrl == null)? 0 :this.clientX509CertUrl.hashCode()));
        result = ((result* 31)+((this.projectId == null)? 0 :this.projectId.hashCode()));
        result = ((result* 31)+((this.privateKeyId == null)? 0 :this.privateKeyId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GCPValues) == false) {
            return false;
        }
        GCPValues rhs = ((GCPValues) other);
        return (((((((((((this.privateKey == rhs.privateKey)||((this.privateKey!= null)&&this.privateKey.equals(rhs.privateKey)))&&((this.authUri == rhs.authUri)||((this.authUri!= null)&&this.authUri.equals(rhs.authUri))))&&((this.clientId == rhs.clientId)||((this.clientId!= null)&&this.clientId.equals(rhs.clientId))))&&((this.clientEmail == rhs.clientEmail)||((this.clientEmail!= null)&&this.clientEmail.equals(rhs.clientEmail))))&&((this.tokenUri == rhs.tokenUri)||((this.tokenUri!= null)&&this.tokenUri.equals(rhs.tokenUri))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.authProviderX509CertUrl == rhs.authProviderX509CertUrl)||((this.authProviderX509CertUrl!= null)&&this.authProviderX509CertUrl.equals(rhs.authProviderX509CertUrl))))&&((this.clientX509CertUrl == rhs.clientX509CertUrl)||((this.clientX509CertUrl!= null)&&this.clientX509CertUrl.equals(rhs.clientX509CertUrl))))&&((this.projectId == rhs.projectId)||((this.projectId!= null)&&this.projectId.equals(rhs.projectId))))&&((this.privateKeyId == rhs.privateKeyId)||((this.privateKeyId!= null)&&this.privateKeyId.equals(rhs.privateKeyId))));
    }

}
