
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "tables",
    "databaseName",
    "joins",
    "sql",
    "query_type",
    "exclude_usage",
    "serviceName",
    "userName",
    "date",
    "databaseSchema",
    "duration"
})
@Generated("jsonschema2pojo")
public class ParsedData {

    /**
     * List of tables used in query
     * (Required)
     * 
     */
    @JsonProperty("tables")
    @JsonPropertyDescription("List of tables used in query")
    @Valid
    @NotNull
    private List<String> tables = new ArrayList<String>();
    /**
     * Database associated with the table in the query
     * 
     */
    @JsonProperty("databaseName")
    @JsonPropertyDescription("Database associated with the table in the query")
    private String databaseName;
    /**
     * Maps each parsed table name of a query to the join information
     * 
     */
    @JsonProperty("joins")
    @JsonPropertyDescription("Maps each parsed table name of a query to the join information")
    @Valid
    private Joins joins;
    /**
     * SQL query
     * (Required)
     * 
     */
    @JsonProperty("sql")
    @JsonPropertyDescription("SQL query")
    @NotNull
    private String sql;
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
     * Name that identifies this database service.
     * (Required)
     * 
     */
    @JsonProperty("serviceName")
    @JsonPropertyDescription("Name that identifies this database service.")
    @NotNull
    private String serviceName;
    /**
     * Name of the user that executed the SQL query
     * 
     */
    @JsonProperty("userName")
    @JsonPropertyDescription("Name of the user that executed the SQL query")
    private String userName;
    /**
     * Date of execution of SQL query
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Date of execution of SQL query")
    private String date;
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
     * List of tables used in query
     * (Required)
     * 
     */
    @JsonProperty("tables")
    public List<String> getTables() {
        return tables;
    }

    /**
     * List of tables used in query
     * (Required)
     * 
     */
    @JsonProperty("tables")
    public void setTables(List<String> tables) {
        this.tables = tables;
    }

    public ParsedData withTables(List<String> tables) {
        this.tables = tables;
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

    public ParsedData withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Maps each parsed table name of a query to the join information
     * 
     */
    @JsonProperty("joins")
    public Joins getJoins() {
        return joins;
    }

    /**
     * Maps each parsed table name of a query to the join information
     * 
     */
    @JsonProperty("joins")
    public void setJoins(Joins joins) {
        this.joins = joins;
    }

    public ParsedData withJoins(Joins joins) {
        this.joins = joins;
        return this;
    }

    /**
     * SQL query
     * (Required)
     * 
     */
    @JsonProperty("sql")
    public String getSql() {
        return sql;
    }

    /**
     * SQL query
     * (Required)
     * 
     */
    @JsonProperty("sql")
    public void setSql(String sql) {
        this.sql = sql;
    }

    public ParsedData withSql(String sql) {
        this.sql = sql;
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

    public ParsedData withQueryType(String queryType) {
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

    public ParsedData withExcludeUsage(Boolean excludeUsage) {
        this.excludeUsage = excludeUsage;
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

    public ParsedData withServiceName(String serviceName) {
        this.serviceName = serviceName;
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

    public ParsedData withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Date of execution of SQL query
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * Date of execution of SQL query
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public ParsedData withDate(String date) {
        this.date = date;
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

    public ParsedData withDatabaseSchema(String databaseSchema) {
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

    public ParsedData withDuration(Double duration) {
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

    public ParsedData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ParsedData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tables");
        sb.append('=');
        sb.append(((this.tables == null)?"<null>":this.tables));
        sb.append(',');
        sb.append("databaseName");
        sb.append('=');
        sb.append(((this.databaseName == null)?"<null>":this.databaseName));
        sb.append(',');
        sb.append("joins");
        sb.append('=');
        sb.append(((this.joins == null)?"<null>":this.joins));
        sb.append(',');
        sb.append("sql");
        sb.append('=');
        sb.append(((this.sql == null)?"<null>":this.sql));
        sb.append(',');
        sb.append("queryType");
        sb.append('=');
        sb.append(((this.queryType == null)?"<null>":this.queryType));
        sb.append(',');
        sb.append("excludeUsage");
        sb.append('=');
        sb.append(((this.excludeUsage == null)?"<null>":this.excludeUsage));
        sb.append(',');
        sb.append("serviceName");
        sb.append('=');
        sb.append(((this.serviceName == null)?"<null>":this.serviceName));
        sb.append(',');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
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
        result = ((result* 31)+((this.joins == null)? 0 :this.joins.hashCode()));
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.databaseSchema == null)? 0 :this.databaseSchema.hashCode()));
        result = ((result* 31)+((this.excludeUsage == null)? 0 :this.excludeUsage.hashCode()));
        result = ((result* 31)+((this.databaseName == null)? 0 :this.databaseName.hashCode()));
        result = ((result* 31)+((this.serviceName == null)? 0 :this.serviceName.hashCode()));
        result = ((result* 31)+((this.userName == null)? 0 :this.userName.hashCode()));
        result = ((result* 31)+((this.sql == null)? 0 :this.sql.hashCode()));
        result = ((result* 31)+((this.queryType == null)? 0 :this.queryType.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.tables == null)? 0 :this.tables.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParsedData) == false) {
            return false;
        }
        ParsedData rhs = ((ParsedData) other);
        return (((((((((((((this.joins == rhs.joins)||((this.joins!= null)&&this.joins.equals(rhs.joins)))&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.databaseSchema == rhs.databaseSchema)||((this.databaseSchema!= null)&&this.databaseSchema.equals(rhs.databaseSchema))))&&((this.excludeUsage == rhs.excludeUsage)||((this.excludeUsage!= null)&&this.excludeUsage.equals(rhs.excludeUsage))))&&((this.databaseName == rhs.databaseName)||((this.databaseName!= null)&&this.databaseName.equals(rhs.databaseName))))&&((this.serviceName == rhs.serviceName)||((this.serviceName!= null)&&this.serviceName.equals(rhs.serviceName))))&&((this.userName == rhs.userName)||((this.userName!= null)&&this.userName.equals(rhs.userName))))&&((this.sql == rhs.sql)||((this.sql!= null)&&this.sql.equals(rhs.sql))))&&((this.queryType == rhs.queryType)||((this.queryType!= null)&&this.queryType.equals(rhs.queryType))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.tables == rhs.tables)||((this.tables!= null)&&this.tables.equals(rhs.tables))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
