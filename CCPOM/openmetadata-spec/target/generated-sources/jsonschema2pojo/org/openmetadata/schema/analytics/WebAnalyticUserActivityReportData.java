
package org.openmetadata.schema.analytics;

import java.util.UUID;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * webAnalyticUserActivityReportData
 * <p>
 * Refined data for overview report
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "userName",
    "userId",
    "team",
    "totalSessions",
    "totalSessionDuration",
    "totalPageView",
    "lastSession"
})
@Generated("jsonschema2pojo")
public class WebAnalyticUserActivityReportData {

    /**
     * user name
     * 
     */
    @JsonProperty("userName")
    @JsonPropertyDescription("user name")
    private String userName;
    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID userId;
    /**
     * the team the user belongs to
     * 
     */
    @JsonProperty("team")
    @JsonPropertyDescription("the team the user belongs to")
    private String team;
    /**
     * total number of sessions
     * 
     */
    @JsonProperty("totalSessions")
    @JsonPropertyDescription("total number of sessions")
    private Integer totalSessions;
    /**
     * total user count
     * 
     */
    @JsonProperty("totalSessionDuration")
    @JsonPropertyDescription("total user count")
    private Integer totalSessionDuration;
    /**
     * total user count
     * 
     */
    @JsonProperty("totalPageView")
    @JsonPropertyDescription("total user count")
    private Integer totalPageView;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastSession")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long lastSession;

    /**
     * user name
     * 
     */
    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * user name
     * 
     */
    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public WebAnalyticUserActivityReportData withUserName(String userName) {
        this.userName = userName;
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

    public WebAnalyticUserActivityReportData withUserId(UUID userId) {
        this.userId = userId;
        return this;
    }

    /**
     * the team the user belongs to
     * 
     */
    @JsonProperty("team")
    public String getTeam() {
        return team;
    }

    /**
     * the team the user belongs to
     * 
     */
    @JsonProperty("team")
    public void setTeam(String team) {
        this.team = team;
    }

    public WebAnalyticUserActivityReportData withTeam(String team) {
        this.team = team;
        return this;
    }

    /**
     * total number of sessions
     * 
     */
    @JsonProperty("totalSessions")
    public Integer getTotalSessions() {
        return totalSessions;
    }

    /**
     * total number of sessions
     * 
     */
    @JsonProperty("totalSessions")
    public void setTotalSessions(Integer totalSessions) {
        this.totalSessions = totalSessions;
    }

    public WebAnalyticUserActivityReportData withTotalSessions(Integer totalSessions) {
        this.totalSessions = totalSessions;
        return this;
    }

    /**
     * total user count
     * 
     */
    @JsonProperty("totalSessionDuration")
    public Integer getTotalSessionDuration() {
        return totalSessionDuration;
    }

    /**
     * total user count
     * 
     */
    @JsonProperty("totalSessionDuration")
    public void setTotalSessionDuration(Integer totalSessionDuration) {
        this.totalSessionDuration = totalSessionDuration;
    }

    public WebAnalyticUserActivityReportData withTotalSessionDuration(Integer totalSessionDuration) {
        this.totalSessionDuration = totalSessionDuration;
        return this;
    }

    /**
     * total user count
     * 
     */
    @JsonProperty("totalPageView")
    public Integer getTotalPageView() {
        return totalPageView;
    }

    /**
     * total user count
     * 
     */
    @JsonProperty("totalPageView")
    public void setTotalPageView(Integer totalPageView) {
        this.totalPageView = totalPageView;
    }

    public WebAnalyticUserActivityReportData withTotalPageView(Integer totalPageView) {
        this.totalPageView = totalPageView;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastSession")
    public Long getLastSession() {
        return lastSession;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastSession")
    public void setLastSession(Long lastSession) {
        this.lastSession = lastSession;
    }

    public WebAnalyticUserActivityReportData withLastSession(Long lastSession) {
        this.lastSession = lastSession;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WebAnalyticUserActivityReportData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("team");
        sb.append('=');
        sb.append(((this.team == null)?"<null>":this.team));
        sb.append(',');
        sb.append("totalSessions");
        sb.append('=');
        sb.append(((this.totalSessions == null)?"<null>":this.totalSessions));
        sb.append(',');
        sb.append("totalSessionDuration");
        sb.append('=');
        sb.append(((this.totalSessionDuration == null)?"<null>":this.totalSessionDuration));
        sb.append(',');
        sb.append("totalPageView");
        sb.append('=');
        sb.append(((this.totalPageView == null)?"<null>":this.totalPageView));
        sb.append(',');
        sb.append("lastSession");
        sb.append('=');
        sb.append(((this.lastSession == null)?"<null>":this.lastSession));
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
        result = ((result* 31)+((this.totalSessions == null)? 0 :this.totalSessions.hashCode()));
        result = ((result* 31)+((this.totalPageView == null)? 0 :this.totalPageView.hashCode()));
        result = ((result* 31)+((this.totalSessionDuration == null)? 0 :this.totalSessionDuration.hashCode()));
        result = ((result* 31)+((this.team == null)? 0 :this.team.hashCode()));
        result = ((result* 31)+((this.userName == null)? 0 :this.userName.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.lastSession == null)? 0 :this.lastSession.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebAnalyticUserActivityReportData) == false) {
            return false;
        }
        WebAnalyticUserActivityReportData rhs = ((WebAnalyticUserActivityReportData) other);
        return ((((((((this.totalSessions == rhs.totalSessions)||((this.totalSessions!= null)&&this.totalSessions.equals(rhs.totalSessions)))&&((this.totalPageView == rhs.totalPageView)||((this.totalPageView!= null)&&this.totalPageView.equals(rhs.totalPageView))))&&((this.totalSessionDuration == rhs.totalSessionDuration)||((this.totalSessionDuration!= null)&&this.totalSessionDuration.equals(rhs.totalSessionDuration))))&&((this.team == rhs.team)||((this.team!= null)&&this.team.equals(rhs.team))))&&((this.userName == rhs.userName)||((this.userName!= null)&&this.userName.equals(rhs.userName))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.lastSession == rhs.lastSession)||((this.lastSession!= null)&&this.lastSession.equals(rhs.lastSession))));
    }

}
