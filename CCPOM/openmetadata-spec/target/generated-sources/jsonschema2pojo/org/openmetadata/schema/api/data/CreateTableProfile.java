
package org.openmetadata.schema.api.data;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.ColumnProfile;
import org.openmetadata.schema.type.SystemProfile;
import org.openmetadata.schema.type.TableProfile;


/**
 * CreateTableProfileRequest
 * <p>
 * Schema corresponding to a table profile that belongs to a table
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tableProfile",
    "columnProfile",
    "systemProfile"
})
@Generated("jsonschema2pojo")
public class CreateTableProfile {

    /**
     * This schema defines the type to capture the table's data profile.
     * (Required)
     * 
     */
    @JsonProperty("tableProfile")
    @JsonPropertyDescription("This schema defines the type to capture the table's data profile.")
    @Valid
    @NotNull
    private TableProfile tableProfile;
    /**
     * List of local column profiles of the table.
     * 
     */
    @JsonProperty("columnProfile")
    @JsonPropertyDescription("List of local column profiles of the table.")
    @Valid
    private List<ColumnProfile> columnProfile = new ArrayList<ColumnProfile>();
    /**
     * List of system profiles for the table.
     * 
     */
    @JsonProperty("systemProfile")
    @JsonPropertyDescription("List of system profiles for the table.")
    @Valid
    private List<SystemProfile> systemProfile = new ArrayList<SystemProfile>();

    /**
     * This schema defines the type to capture the table's data profile.
     * (Required)
     * 
     */
    @JsonProperty("tableProfile")
    public TableProfile getTableProfile() {
        return tableProfile;
    }

    /**
     * This schema defines the type to capture the table's data profile.
     * (Required)
     * 
     */
    @JsonProperty("tableProfile")
    public void setTableProfile(TableProfile tableProfile) {
        this.tableProfile = tableProfile;
    }

    public CreateTableProfile withTableProfile(TableProfile tableProfile) {
        this.tableProfile = tableProfile;
        return this;
    }

    /**
     * List of local column profiles of the table.
     * 
     */
    @JsonProperty("columnProfile")
    public List<ColumnProfile> getColumnProfile() {
        return columnProfile;
    }

    /**
     * List of local column profiles of the table.
     * 
     */
    @JsonProperty("columnProfile")
    public void setColumnProfile(List<ColumnProfile> columnProfile) {
        this.columnProfile = columnProfile;
    }

    public CreateTableProfile withColumnProfile(List<ColumnProfile> columnProfile) {
        this.columnProfile = columnProfile;
        return this;
    }

    /**
     * List of system profiles for the table.
     * 
     */
    @JsonProperty("systemProfile")
    public List<SystemProfile> getSystemProfile() {
        return systemProfile;
    }

    /**
     * List of system profiles for the table.
     * 
     */
    @JsonProperty("systemProfile")
    public void setSystemProfile(List<SystemProfile> systemProfile) {
        this.systemProfile = systemProfile;
    }

    public CreateTableProfile withSystemProfile(List<SystemProfile> systemProfile) {
        this.systemProfile = systemProfile;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateTableProfile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tableProfile");
        sb.append('=');
        sb.append(((this.tableProfile == null)?"<null>":this.tableProfile));
        sb.append(',');
        sb.append("columnProfile");
        sb.append('=');
        sb.append(((this.columnProfile == null)?"<null>":this.columnProfile));
        sb.append(',');
        sb.append("systemProfile");
        sb.append('=');
        sb.append(((this.systemProfile == null)?"<null>":this.systemProfile));
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
        result = ((result* 31)+((this.columnProfile == null)? 0 :this.columnProfile.hashCode()));
        result = ((result* 31)+((this.tableProfile == null)? 0 :this.tableProfile.hashCode()));
        result = ((result* 31)+((this.systemProfile == null)? 0 :this.systemProfile.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateTableProfile) == false) {
            return false;
        }
        CreateTableProfile rhs = ((CreateTableProfile) other);
        return ((((this.columnProfile == rhs.columnProfile)||((this.columnProfile!= null)&&this.columnProfile.equals(rhs.columnProfile)))&&((this.tableProfile == rhs.tableProfile)||((this.tableProfile!= null)&&this.tableProfile.equals(rhs.tableProfile))))&&((this.systemProfile == rhs.systemProfile)||((this.systemProfile!= null)&&this.systemProfile.equals(rhs.systemProfile))));
    }

}
