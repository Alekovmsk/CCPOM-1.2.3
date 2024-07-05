
package org.openmetadata.schema.analytics;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * pageViewData
 * <p>
 * Page view data event
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fullUrl",
    "url",
    "hostname",
    "language",
    "screenSize",
    "userId",
    "sessionId",
    "pageLoadTime",
    "referrer"
})
@Generated("jsonschema2pojo")
public class PageViewData {

    /**
     * complete URL of the page
     * 
     */
    @JsonProperty("fullUrl")
    @JsonPropertyDescription("complete URL of the page")
    private String fullUrl;
    /**
     * url part after the domain specification
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("url part after the domain specification")
    private String url;
    /**
     * domain name
     * 
     */
    @JsonProperty("hostname")
    @JsonPropertyDescription("domain name")
    private String hostname;
    /**
     * language set on the page
     * 
     */
    @JsonProperty("language")
    @JsonPropertyDescription("language set on the page")
    private String language;
    /**
     * Size of the screen
     * 
     */
    @JsonProperty("screenSize")
    @JsonPropertyDescription("Size of the screen")
    private String screenSize;
    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID userId;
    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("sessionId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID sessionId;
    /**
     * time for the page to load in seconds
     * 
     */
    @JsonProperty("pageLoadTime")
    @JsonPropertyDescription("time for the page to load in seconds")
    private Double pageLoadTime;
    /**
     * referrer URL
     * 
     */
    @JsonProperty("referrer")
    @JsonPropertyDescription("referrer URL")
    private String referrer;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * complete URL of the page
     * 
     */
    @JsonProperty("fullUrl")
    public String getFullUrl() {
        return fullUrl;
    }

    /**
     * complete URL of the page
     * 
     */
    @JsonProperty("fullUrl")
    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    public PageViewData withFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
        return this;
    }

    /**
     * url part after the domain specification
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * url part after the domain specification
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public PageViewData withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * domain name
     * 
     */
    @JsonProperty("hostname")
    public String getHostname() {
        return hostname;
    }

    /**
     * domain name
     * 
     */
    @JsonProperty("hostname")
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public PageViewData withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * language set on the page
     * 
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * language set on the page
     * 
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    public PageViewData withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Size of the screen
     * 
     */
    @JsonProperty("screenSize")
    public String getScreenSize() {
        return screenSize;
    }

    /**
     * Size of the screen
     * 
     */
    @JsonProperty("screenSize")
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public PageViewData withScreenSize(String screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("userId")
    public UUID getUserId() {
        return userId;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("userId")
    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public PageViewData withUserId(UUID userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("sessionId")
    public UUID getSessionId() {
        return sessionId;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("sessionId")
    public void setSessionId(UUID sessionId) {
        this.sessionId = sessionId;
    }

    public PageViewData withSessionId(UUID sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * time for the page to load in seconds
     * 
     */
    @JsonProperty("pageLoadTime")
    public Double getPageLoadTime() {
        return pageLoadTime;
    }

    /**
     * time for the page to load in seconds
     * 
     */
    @JsonProperty("pageLoadTime")
    public void setPageLoadTime(Double pageLoadTime) {
        this.pageLoadTime = pageLoadTime;
    }

    public PageViewData withPageLoadTime(Double pageLoadTime) {
        this.pageLoadTime = pageLoadTime;
        return this;
    }

    /**
     * referrer URL
     * 
     */
    @JsonProperty("referrer")
    public String getReferrer() {
        return referrer;
    }

    /**
     * referrer URL
     * 
     */
    @JsonProperty("referrer")
    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public PageViewData withReferrer(String referrer) {
        this.referrer = referrer;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public PageViewData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PageViewData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fullUrl");
        sb.append('=');
        sb.append(((this.fullUrl == null)?"<null>":this.fullUrl));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("hostname");
        sb.append('=');
        sb.append(((this.hostname == null)?"<null>":this.hostname));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("screenSize");
        sb.append('=');
        sb.append(((this.screenSize == null)?"<null>":this.screenSize));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("sessionId");
        sb.append('=');
        sb.append(((this.sessionId == null)?"<null>":this.sessionId));
        sb.append(',');
        sb.append("pageLoadTime");
        sb.append('=');
        sb.append(((this.pageLoadTime == null)?"<null>":this.pageLoadTime));
        sb.append(',');
        sb.append("referrer");
        sb.append('=');
        sb.append(((this.referrer == null)?"<null>":this.referrer));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.referrer == null)? 0 :this.referrer.hashCode()));
        result = ((result* 31)+((this.hostname == null)? 0 :this.hostname.hashCode()));
        result = ((result* 31)+((this.screenSize == null)? 0 :this.screenSize.hashCode()));
        result = ((result* 31)+((this.fullUrl == null)? 0 :this.fullUrl.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.pageLoadTime == null)? 0 :this.pageLoadTime.hashCode()));
        result = ((result* 31)+((this.sessionId == null)? 0 :this.sessionId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PageViewData) == false) {
            return false;
        }
        PageViewData rhs = ((PageViewData) other);
        return (((((((((((this.referrer == rhs.referrer)||((this.referrer!= null)&&this.referrer.equals(rhs.referrer)))&&((this.hostname == rhs.hostname)||((this.hostname!= null)&&this.hostname.equals(rhs.hostname))))&&((this.screenSize == rhs.screenSize)||((this.screenSize!= null)&&this.screenSize.equals(rhs.screenSize))))&&((this.fullUrl == rhs.fullUrl)||((this.fullUrl!= null)&&this.fullUrl.equals(rhs.fullUrl))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.pageLoadTime == rhs.pageLoadTime)||((this.pageLoadTime!= null)&&this.pageLoadTime.equals(rhs.pageLoadTime))))&&((this.sessionId == rhs.sessionId)||((this.sessionId!= null)&&this.sessionId.equals(rhs.sessionId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))));
    }

}
