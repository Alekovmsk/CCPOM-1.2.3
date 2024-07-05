
package org.openmetadata.schema.dataInsight.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MostActiveUsers
 * <p>
 * pageViewsByEntities data blob
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "userName",
    "team",
    "lastSession",
    "sessions",
    "sessionDuration",
    "avgSessionDuration",
    "pageViews"
})
@Generated("jsonschema2pojo")
public class MostActiveUsers {

    /**
     * Name of a user
     * 
     */
    @JsonProperty("userName")
    @JsonPropertyDescription("Name of a user")
    private String userName;
    /**
     * Team a user belongs to
     * 
     */
    @JsonProperty("team")
    @JsonPropertyDescription("Team a user belongs to")
    private String team;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("lastSession")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long lastSession;
    /**
     * Total number of sessions
     * 
     */
    @JsonProperty("sessions")
    @JsonPropertyDescription("Total number of sessions")
    private Double sessions;
    /**
     * Total duration of all sessions in seconds
     * 
     */
    @JsonProperty("sessionDuration")
    @JsonPropertyDescription("Total duration of all sessions in seconds")
    private Double sessionDuration;
    /**
     * avg. duration of a sessions in seconds
     * 
     */
    @JsonProperty("avgSessionDuration")
    @JsonPropertyDescription("avg. duration of a sessions in seconds")
    private Double avgSessionDuration;
    /**
     * Total number of pages viewed by the user
     * 
     */
    @JsonProperty("pageViews")
    @JsonPropertyDescription("Total number of pages viewed by the user")
    private Double pageViews;

    /**
     * Name of a user
     * 
     */
    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * Name of a user
     * 
     */
    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public MostActiveUsers withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Team a user belongs to
     * 
     */
    @JsonProperty("team")
    public String getTeam() {
        return team;
    }

    /**
     * Team a user belongs to
     * 
     */
    @JsonProperty("team")
    public void setTeam(String team) {
        this.team = team;
    }

    public MostActiveUsers withTeam(String team) {
        this.team = team;
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

    public MostActiveUsers withLastSession(Long lastSession) {
        this.lastSession = lastSession;
        return this;
    }

    /**
     * Total number of sessions
     * 
     */
    @JsonProperty("sessions")
    public Double getSessions() {
        return sessions;
    }

    /**
     * Total number of sessions
     * 
     */
    @JsonProperty("sessions")
    public void setSessions(Double sessions) {
        this.sessions = sessions;
    }

    public MostActiveUsers withSessions(Double sessions) {
        this.sessions = sessions;
        return this;
    }

    /**
     * Total duration of all sessions in seconds
     * 
     */
    @JsonProperty("sessionDuration")
    public Double getSessionDuration() {
        return sessionDuration;
    }

    /**
     * Total duration of all sessions in seconds
     * 
     */
    @JsonProperty("sessionDuration")
    public void setSessionDuration(Double sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    public MostActiveUsers withSessionDuration(Double sessionDuration) {
        this.sessionDuration = sessionDuration;
        return this;
    }

    /**
     * avg. duration of a sessions in seconds
     * 
     */
    @JsonProperty("avgSessionDuration")
    public Double getAvgSessionDuration() {
        return avgSessionDuration;
    }

    /**
     * avg. duration of a sessions in seconds
     * 
     */
    @JsonProperty("avgSessionDuration")
    public void setAvgSessionDuration(Double avgSessionDuration) {
        this.avgSessionDuration = avgSessionDuration;
    }

    public MostActiveUsers withAvgSessionDuration(Double avgSessionDuration) {
        this.avgSessionDuration = avgSessionDuration;
        return this;
    }

    /**
     * Total number of pages viewed by the user
     * 
     */
    @JsonProperty("pageViews")
    public Double getPageViews() {
        return pageViews;
    }

    /**
     * Total number of pages viewed by the user
     * 
     */
    @JsonProperty("pageViews")
    public void setPageViews(Double pageViews) {
        this.pageViews = pageViews;
    }

    public MostActiveUsers withPageViews(Double pageViews) {
        this.pageViews = pageViews;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MostActiveUsers.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        sb.append("team");
        sb.append('=');
        sb.append(((this.team == null)?"<null>":this.team));
        sb.append(',');
        sb.append("lastSession");
        sb.append('=');
        sb.append(((this.lastSession == null)?"<null>":this.lastSession));
        sb.append(',');
        sb.append("sessions");
        sb.append('=');
        sb.append(((this.sessions == null)?"<null>":this.sessions));
        sb.append(',');
        sb.append("sessionDuration");
        sb.append('=');
        sb.append(((this.sessionDuration == null)?"<null>":this.sessionDuration));
        sb.append(',');
        sb.append("avgSessionDuration");
        sb.append('=');
        sb.append(((this.avgSessionDuration == null)?"<null>":this.avgSessionDuration));
        sb.append(',');
        sb.append("pageViews");
        sb.append('=');
        sb.append(((this.pageViews == null)?"<null>":this.pageViews));
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
        result = ((result* 31)+((this.sessions == null)? 0 :this.sessions.hashCode()));
        result = ((result* 31)+((this.avgSessionDuration == null)? 0 :this.avgSessionDuration.hashCode()));
        result = ((result* 31)+((this.pageViews == null)? 0 :this.pageViews.hashCode()));
        result = ((result* 31)+((this.team == null)? 0 :this.team.hashCode()));
        result = ((result* 31)+((this.userName == null)? 0 :this.userName.hashCode()));
        result = ((result* 31)+((this.sessionDuration == null)? 0 :this.sessionDuration.hashCode()));
        result = ((result* 31)+((this.lastSession == null)? 0 :this.lastSession.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MostActiveUsers) == false) {
            return false;
        }
        MostActiveUsers rhs = ((MostActiveUsers) other);
        return ((((((((this.sessions == rhs.sessions)||((this.sessions!= null)&&this.sessions.equals(rhs.sessions)))&&((this.avgSessionDuration == rhs.avgSessionDuration)||((this.avgSessionDuration!= null)&&this.avgSessionDuration.equals(rhs.avgSessionDuration))))&&((this.pageViews == rhs.pageViews)||((this.pageViews!= null)&&this.pageViews.equals(rhs.pageViews))))&&((this.team == rhs.team)||((this.team!= null)&&this.team.equals(rhs.team))))&&((this.userName == rhs.userName)||((this.userName!= null)&&this.userName.equals(rhs.userName))))&&((this.sessionDuration == rhs.sessionDuration)||((this.sessionDuration!= null)&&this.sessionDuration.equals(rhs.sessionDuration))))&&((this.lastSession == rhs.lastSession)||((this.lastSession!= null)&&this.lastSession.equals(rhs.lastSession))));
    }

}
