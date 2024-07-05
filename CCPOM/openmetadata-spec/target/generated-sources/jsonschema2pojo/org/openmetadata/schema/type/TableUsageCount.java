
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.api.data.CreateQuery;


/**
 * Table Usage Count
 * <p>
 * This model is the linking between the usage stage and bulk sink steps
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "table",
    "date",
    "databaseName",
    "count",
    "databaseSchema",
    "sqlQueries",
    "joins",
    "serviceName"
})
@Generated("jsonschema2pojo")
public class TableUsageCount {

    /**
     * Name of the table
     * (Required)
     * 
     */
    @JsonProperty("table")
    @JsonPropertyDescription("Name of the table")
    @NotNull
    private String table;
    /**
     * Date of execution of SQL query
     * (Required)
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Date of execution of SQL query")
    @NotNull
    private String date;
    /**
     * Database associated with the table in the query
     * 
     */
    @JsonProperty("databaseName")
    @JsonPropertyDescription("Database associated with the table in the query")
    private String databaseName;
    /**
     * Usage count of table
     * 
     */
    @JsonProperty("count")
    @JsonPropertyDescription("Usage count of table")
    private Integer count = 1;
    /**
     * Database schema of the associated with table
     * 
     */
    @JsonProperty("databaseSchema")
    @JsonPropertyDescription("Database schema of the associated with table")
    private String databaseSchema;
    /**
     * List of SQL Queries associated with table
     * 
     */
    @JsonProperty("sqlQueries")
    @JsonPropertyDescription("List of SQL Queries associated with table")
    @Valid
    private List<CreateQuery> sqlQueries = new ArrayList<CreateQuery>();
    /**
     * List of joins associated with table
     * 
     */
    @JsonProperty("joins")
    @JsonPropertyDescription("List of joins associated with table")
    @Valid
    private List<TableColumnJoin> joins = new ArrayList<TableColumnJoin>();
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
     * Name of the table
     * (Required)
     * 
     */
    @JsonProperty("table")
    public String getTable() {
        return table;
    }

    /**
     * Name of the table
     * (Required)
     * 
     */
    @JsonProperty("table")
    public void setTable(String table) {
        this.table = table;
    }

    public TableUsageCount withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Date of execution of SQL query
     * (Required)
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * Date of execution of SQL query
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public TableUsageCount withDate(String date) {
        this.date = date;
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

    public TableUsageCount withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Usage count of table
     * 
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * Usage count of table
     * 
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public TableUsageCount withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Database schema of the associated with table
     * 
     */
    @JsonProperty("databaseSchema")
    public String getDatabaseSchema() {
        return databaseSchema;
    }

    /**
     * Database schema of the associated with table
     * 
     */
    @JsonProperty("databaseSchema")
    public void setDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
    }

    public TableUsageCount withDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }

    /**
     * List of SQL Queries associated with table
     * 
     */
    @JsonProperty("sqlQueries")
    public List<CreateQuery> getSqlQueries() {
        return sqlQueries;
    }

    /**
     * List of SQL Queries associated with table
     * 
     */
    @JsonProperty("sqlQueries")
    public void setSqlQueries(List<CreateQuery> sqlQueries) {
        this.sqlQueries = sqlQueries;
    }

    public TableUsageCount withSqlQueries(List<CreateQuery> sqlQueries) {
        this.sqlQueries = sqlQueries;
        return this;
    }

    /**
     * List of joins associated with table
     * 
     */
    @JsonProperty("joins")
    public List<TableColumnJoin> getJoins() {
        return joins;
    }

    /**
     * List of joins associated with table
     * 
     */
    @JsonProperty("joins")
    public void setJoins(List<TableColumnJoin> joins) {
        this.joins = joins;
    }

    public TableUsageCount withJoins(List<TableColumnJoin> joins) {
        this.joins = joins;
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

    public TableUsageCount withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TableUsageCount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("table");
        sb.append('=');
        sb.append(((this.table == null)?"<null>":this.table));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("databaseName");
        sb.append('=');
        sb.append(((this.databaseName == null)?"<null>":this.databaseName));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("databaseSchema");
        sb.append('=');
        sb.append(((this.databaseSchema == null)?"<null>":this.databaseSchema));
        sb.append(',');
        sb.append("sqlQueries");
        sb.append('=');
        sb.append(((this.sqlQueries == null)?"<null>":this.sqlQueries));
        sb.append(',');
        sb.append("joins");
        sb.append('=');
        sb.append(((this.joins == null)?"<null>":this.joins));
        sb.append(',');
        sb.append("serviceName");
        sb.append('=');
        sb.append(((this.serviceName == null)?"<null>":this.serviceName));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.databaseSchema == null)? 0 :this.databaseSchema.hashCode()));
        result = ((result* 31)+((this.joins == null)? 0 :this.joins.hashCode()));
        result = ((result* 31)+((this.databaseName == null)? 0 :this.databaseName.hashCode()));
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.serviceName == null)? 0 :this.serviceName.hashCode()));
        result = ((result* 31)+((this.table == null)? 0 :this.table.hashCode()));
        result = ((result* 31)+((this.sqlQueries == null)? 0 :this.sqlQueries.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableUsageCount) == false) {
            return false;
        }
        TableUsageCount rhs = ((TableUsageCount) other);
        return (((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.databaseSchema == rhs.databaseSchema)||((this.databaseSchema!= null)&&this.databaseSchema.equals(rhs.databaseSchema))))&&((this.joins == rhs.joins)||((this.joins!= null)&&this.joins.equals(rhs.joins))))&&((this.databaseName == rhs.databaseName)||((this.databaseName!= null)&&this.databaseName.equals(rhs.databaseName))))&&((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count))))&&((this.serviceName == rhs.serviceName)||((this.serviceName!= null)&&this.serviceName.equals(rhs.serviceName))))&&((this.table == rhs.table)||((this.table!= null)&&this.table.equals(rhs.table))))&&((this.sqlQueries == rhs.sqlQueries)||((this.sqlQueries!= null)&&this.sqlQueries.equals(rhs.sqlQueries))));
    }

}
