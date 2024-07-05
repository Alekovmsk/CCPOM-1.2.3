
package org.openmetadata.api.configuration;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LogoConfiguration
 * <p>
 * This schema defines the Logo Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customLogoUrlPath",
    "customFaviconUrlPath",
    "customMonogramUrlPath"
})
@Generated("jsonschema2pojo")
public class LogoConfiguration {

    /**
     * Login Page Logo Image Url
     * 
     */
    @JsonProperty("customLogoUrlPath")
    @JsonPropertyDescription("Login Page Logo Image Url")
    private String customLogoUrlPath;
    /**
     * Favicon Page Logo Image Url
     * 
     */
    @JsonProperty("customFaviconUrlPath")
    @JsonPropertyDescription("Favicon Page Logo Image Url")
    private String customFaviconUrlPath;
    /**
     * Navigation Bar Logo Image Url
     * 
     */
    @JsonProperty("customMonogramUrlPath")
    @JsonPropertyDescription("Navigation Bar Logo Image Url")
    private String customMonogramUrlPath;

    /**
     * Login Page Logo Image Url
     * 
     */
    @JsonProperty("customLogoUrlPath")
    public String getCustomLogoUrlPath() {
        return customLogoUrlPath;
    }

    /**
     * Login Page Logo Image Url
     * 
     */
    @JsonProperty("customLogoUrlPath")
    public void setCustomLogoUrlPath(String customLogoUrlPath) {
        this.customLogoUrlPath = customLogoUrlPath;
    }

    public LogoConfiguration withCustomLogoUrlPath(String customLogoUrlPath) {
        this.customLogoUrlPath = customLogoUrlPath;
        return this;
    }

    /**
     * Favicon Page Logo Image Url
     * 
     */
    @JsonProperty("customFaviconUrlPath")
    public String getCustomFaviconUrlPath() {
        return customFaviconUrlPath;
    }

    /**
     * Favicon Page Logo Image Url
     * 
     */
    @JsonProperty("customFaviconUrlPath")
    public void setCustomFaviconUrlPath(String customFaviconUrlPath) {
        this.customFaviconUrlPath = customFaviconUrlPath;
    }

    public LogoConfiguration withCustomFaviconUrlPath(String customFaviconUrlPath) {
        this.customFaviconUrlPath = customFaviconUrlPath;
        return this;
    }

    /**
     * Navigation Bar Logo Image Url
     * 
     */
    @JsonProperty("customMonogramUrlPath")
    public String getCustomMonogramUrlPath() {
        return customMonogramUrlPath;
    }

    /**
     * Navigation Bar Logo Image Url
     * 
     */
    @JsonProperty("customMonogramUrlPath")
    public void setCustomMonogramUrlPath(String customMonogramUrlPath) {
        this.customMonogramUrlPath = customMonogramUrlPath;
    }

    public LogoConfiguration withCustomMonogramUrlPath(String customMonogramUrlPath) {
        this.customMonogramUrlPath = customMonogramUrlPath;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LogoConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customLogoUrlPath");
        sb.append('=');
        sb.append(((this.customLogoUrlPath == null)?"<null>":this.customLogoUrlPath));
        sb.append(',');
        sb.append("customFaviconUrlPath");
        sb.append('=');
        sb.append(((this.customFaviconUrlPath == null)?"<null>":this.customFaviconUrlPath));
        sb.append(',');
        sb.append("customMonogramUrlPath");
        sb.append('=');
        sb.append(((this.customMonogramUrlPath == null)?"<null>":this.customMonogramUrlPath));
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
        result = ((result* 31)+((this.customLogoUrlPath == null)? 0 :this.customLogoUrlPath.hashCode()));
        result = ((result* 31)+((this.customFaviconUrlPath == null)? 0 :this.customFaviconUrlPath.hashCode()));
        result = ((result* 31)+((this.customMonogramUrlPath == null)? 0 :this.customMonogramUrlPath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LogoConfiguration) == false) {
            return false;
        }
        LogoConfiguration rhs = ((LogoConfiguration) other);
        return ((((this.customLogoUrlPath == rhs.customLogoUrlPath)||((this.customLogoUrlPath!= null)&&this.customLogoUrlPath.equals(rhs.customLogoUrlPath)))&&((this.customFaviconUrlPath == rhs.customFaviconUrlPath)||((this.customFaviconUrlPath!= null)&&this.customFaviconUrlPath.equals(rhs.customFaviconUrlPath))))&&((this.customMonogramUrlPath == rhs.customMonogramUrlPath)||((this.customMonogramUrlPath!= null)&&this.customMonogramUrlPath.equals(rhs.customMonogramUrlPath))));
    }

}
