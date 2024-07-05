
package org.openmetadata.schema.type;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "query",
    "query_type",
    "exclude_usage",
    "userName",
    "startTime",
    "endTime",
    "analysisDate",
    "aborted",
    "serviceName",
    "databaseName",
    "databaseSchema",
    "duration"
})
@Generated("jsonschema2pojo")
public class TableQuery__1 {

    /**
     * SQL query
     * (Required)
     * 
     */
    @JsonProperty("query")
    @JsonPropertyDescription("SQL query")
    @NotNull
    private String query;
    /**
     * SQL query type
     * 
     */
    @JsonProperty("query_type")
    @JsonPropertyDescription("SQL query type")
    private String queryType;
    /**
     * Flag to check if query is to be excluded while processing usage
     * 
     */
    @JsonProperty("exclude_usage")
    @JsonPropertyDescription("Flag to check if query is to be excluded while processing usage")
    private Boolean excludeUsage;
    /**
     * Name of the user that executed the SQL query
     * 
     */
    @JsonProperty("userName")
    @JsonPropertyDescription("Name of the user that executed the SQL query")
    private String userName;
    /**
     * Start time of execution of SQL query
     * 
     */
    @JsonProperty("startTime")
    @JsonPropertyDescription("Start time of execution of SQL query")
    private String startTime;
    /**
     * End time of execution of SQL query
     * 
     */
    @JsonProperty("endTime")
    @JsonPropertyDescription("End time of execution of SQL query")
    private String endTime;
    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("analysisDate")
    @JsonPropertyDescription("Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.")
    private Date analysisDate;
    /**
     * Flag to check if query was aborted during execution
     * 
     */
    @JsonProperty("aborted")
    @JsonPropertyDescription("Flag to check if query was aborted during execution")
    private Boolean aborted;
    /**
     * Name that identifies this database service.
     * (Required)
     * 
     */
    @JsonProperty("serviceName")
    @JsonPropertyDescription("Name that identifies this database service.")
    @NotNull
    private String serviceName;
    /**
     * Database associated with the table in the query
     * 
     */
    @JsonProperty("databaseName")
    @JsonPropertyDescription("Database associated with the table in the query")
    private String databaseName;
    /**
     * Database schema of the associated with query
     * 
     */
    @JsonProperty("databaseSchema")
    @JsonPropertyDescription("Database schema of the associated with query")
    private String databaseSchema;
    /**
     * How long did the query took to run in seconds.
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("How long did the query took to run in seconds.")
    private Double duration;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * SQL query
     * (Required)
     * 
     */
    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    /**
     * SQL query
     * (Required)
     * 
     */
    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    public TableQuery__1 withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * SQL query type
     * 
     */
    @JsonProperty("query_type")
    public String getQueryType() {
        return queryType;
    }

    /**
     * SQL query type
     * 
     */
    @JsonProperty("query_type")
    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public TableQuery__1 withQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * Flag to check if query is to be excluded while processing usage
     * 
     */
    @JsonProperty("exclude_usage")
    public Boolean getExcludeUsage() {
        return excludeUsage;
    }

    /**
     * Flag to check if query is to be excluded while processing usage
     * 
     */
    @JsonProperty("exclude_usage")
    public void setExcludeUsage(Boolean excludeUsage) {
        this.excludeUsage = excludeUsage;
    }

    public TableQuery__1 withExcludeUsage(Boolean excludeUsage) {
        this.excludeUsage = excludeUsage;
        return this;
    }

    /**
     * Name of the user that executed the SQL query
     * 
     */
    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * Name of the user that executed the SQL query
     * 
     */
    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public TableQuery__1 withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Start time of execution of SQL query
     * 
     */
    @JsonProperty("startTime")
    public String getStartTime() {
        return startTime;
    }

    /**
     * Start time of execution of SQL query
     * 
     */
    @JsonProperty("startTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public TableQuery__1 withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * End time of execution of SQL query
     * 
     */
    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    /**
     * End time of execution of SQL query
     * 
     */
    @JsonProperty("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public TableQuery__1 withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("analysisDate")
    public Date getAnalysisDate() {
        return analysisDate;
    }

    /**
     * Date and time in ISO 8601 format. Example - '2018-11-13T20:20:39+00:00'.@om-field-type
     * 
     */
    @JsonProperty("analysisDate")
    public void setAnalysisDate(Date analysisDate) {
        this.analysisDate = analysisDate;
    }

    public TableQuery__1 withAnalysisDate(Date analysisDate) {
        this.analysisDate = analysisDate;
        return this;
    }

    /**
     * Flag to check if query was aborted during execution
     * 
     */
    @JsonProperty("aborted")
    public Boolean getAborted() {
        return aborted;
    }

    /**
     * Flag to check if query was aborted during execution
     * 
     */
    @JsonProperty("aborted")
    public void setAborted(Boolean aborted) {
        this.aborted = aborted;
    }

    public TableQuery__1 withAborted(Boolean aborted) {
        this.aborted = aborted;
        return this;
    }

    /**
     * Name that identifies this database service.
     * (Required)
     * 
     */
    @JsonProperty("serviceName")
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Name that identifies this database service.
     * (Required)
     * 
     */
    @JsonProperty("serviceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public TableQuery__1 withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Database associated with the table in the query
     * 
     */
    @JsonProperty("databaseName")
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Database associated with the table in the query
     * 
     */
    @JsonProperty("databaseName")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public TableQuery__1 withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Database schema of the associated with query
     * 
     */
    @JsonProperty("databaseSchema")
    public String getDatabaseSchema() {
        return databaseSchema;
    }

    /**
     * Database schema of the associated with query
     * 
     */
    @JsonProperty("databaseSchema")
    public void setDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
    }

    public TableQuery__1 withDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }

    /**
     * How long did the query took to run in seconds.
     * 
     */
    @JsonProperty("duration")
    public Double getDuration() {
        return duration;
    }

    /**
     * How long did the query took to run in seconds.
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public TableQuery__1 withDuration(Double duration) {
        this.duration = duration;
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

    public TableQuery__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TableQuery__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("query");
        sb.append('=');
        sb.append(((this.query == null)?"<null>":this.query));
        sb.append(',');
        sb.append("queryType");
        sb.append('=');
        sb.append(((this.queryType == null)?"<null>":this.queryType));
        sb.append(',');
        sb.append("excludeUsage");
        sb.append('=');
        sb.append(((this.excludeUsage == null)?"<null>":this.excludeUsage));
        sb.append(',');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
        sb.append(',');
        sb.append("analysisDate");
        sb.append('=');
        sb.append(((this.analysisDate == null)?"<null>":this.analysisDate));
        sb.append(',');
        sb.append("aborted");
        sb.append('=');
        sb.append(((this.aborted == null)?"<null>":this.aborted));
        sb.append(',');
        sb.append("serviceName");
        sb.append('=');
        sb.append(((this.serviceName == null)?"<null>":this.serviceName));
        sb.append(',');
        sb.append("databaseName");
        sb.append('=');
        sb.append(((this.databaseName == null)?"<null>":this.databaseName));
        sb.append(',');
        sb.append("databaseSchema");
        sb.append('=');
        sb.append(((this.databaseSchema == null)?"<null>":this.databaseSchema));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
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
        result = ((result* 31)+((this.databaseSchema == null)? 0 :this.databaseSchema.hashCode()));
        result = ((result* 31)+((this.excludeUsage == null)? 0 :this.excludeUsage.hashCode()));
        result = ((result* 31)+((this.databaseName == null)? 0 :this.databaseName.hashCode()));
        result = ((result* 31)+((this.aborted == null)? 0 :this.aborted.hashCode()));
        result = ((result* 31)+((this.query == null)? 0 :this.query.hashCode()));
        result = ((result* 31)+((this.analysisDate == null)? 0 :this.analysisDate.hashCode()));
        result = ((result* 31)+((this.userName == null)? 0 :this.userName.hashCode()));
        result = ((result* 31)+((this.serviceName == null)? 0 :this.serviceName.hashCode()));
        result = ((result* 31)+((this.queryType == null)? 0 :this.queryType.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableQuery__1) == false) {
            return false;
        }
        TableQuery__1 rhs = ((TableQuery__1) other);
        return ((((((((((((((this.databaseSchema == rhs.databaseSchema)||((this.databaseSchema!= null)&&this.databaseSchema.equals(rhs.databaseSchema)))&&((this.excludeUsage == rhs.excludeUsage)||((this.excludeUsage!= null)&&this.excludeUsage.equals(rhs.excludeUsage))))&&((this.databaseName == rhs.databaseName)||((this.databaseName!= null)&&this.databaseName.equals(rhs.databaseName))))&&((this.aborted == rhs.aborted)||((this.aborted!= null)&&this.aborted.equals(rhs.aborted))))&&((this.query == rhs.query)||((this.query!= null)&&this.query.equals(rhs.query))))&&((this.analysisDate == rhs.analysisDate)||((this.analysisDate!= null)&&this.analysisDate.equals(rhs.analysisDate))))&&((this.userName == rhs.userName)||((this.userName!= null)&&this.userName.equals(rhs.userName))))&&((this.serviceName == rhs.serviceName)||((this.serviceName!= null)&&this.serviceName.equals(rhs.serviceName))))&&((this.queryType == rhs.queryType)||((this.queryType!= null)&&this.queryType.equals(rhs.queryType))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
