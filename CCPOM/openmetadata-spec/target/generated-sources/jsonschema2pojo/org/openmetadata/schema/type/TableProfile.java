
package org.openmetadata.schema.type;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This schema defines the type to capture the table's data profile.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "profileSample",
    "profileSampleType",
    "columnCount",
    "rowCount",
    "sizeInByte",
    "createDateTime"
})
@Generated("jsonschema2pojo")
public class TableProfile {

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    @NotNull
    private Long timestamp;
    /**
     * Percentage of data or no. of rows we want to execute the profiler and tests on
     * 
     */
    @JsonProperty("profileSample")
    @JsonPropertyDescription("Percentage of data or no. of rows we want to execute the profiler and tests on")
    private Double profileSample = null;
    /**
     * Type of Profile Sample (percentage or rows)
     * 
     */
    @JsonProperty("profileSampleType")
    @JsonPropertyDescription("Type of Profile Sample (percentage or rows)")
    private org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType profileSampleType = org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType.fromValue("PERCENTAGE");
    /**
     * No.of columns in the table.
     * 
     */
    @JsonProperty("columnCount")
    @JsonPropertyDescription("No.of columns in the table.")
    private Double columnCount;
    /**
     * No.of rows in the table. This is always executed on the whole table.
     * 
     */
    @JsonProperty("rowCount")
    @JsonPropertyDescription("No.of rows in the table. This is always executed on the whole table.")
    private Double rowCount;
    /**
     * Table size in GB
     * 
     */
    @JsonProperty("sizeInByte")
    @JsonPropertyDescription("Table size in GB")
    private Double sizeInByte;
    /**
     * Table creation time.
     * 
     */
    @JsonProperty("createDateTime")
    @JsonPropertyDescription("Table creation time.")
    private Date createDateTime;

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public TableProfile withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Percentage of data or no. of rows we want to execute the profiler and tests on
     * 
     */
    @JsonProperty("profileSample")
    public Double getProfileSample() {
        return profileSample;
    }

    /**
     * Percentage of data or no. of rows we want to execute the profiler and tests on
     * 
     */
    @JsonProperty("profileSample")
    public void setProfileSample(Double profileSample) {
        this.profileSample = profileSample;
    }

    public TableProfile withProfileSample(Double profileSample) {
        this.profileSample = profileSample;
        return this;
    }

    /**
     * Type of Profile Sample (percentage or rows)
     * 
     */
    @JsonProperty("profileSampleType")
    public org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType getProfileSampleType() {
        return profileSampleType;
    }

    /**
     * Type of Profile Sample (percentage or rows)
     * 
     */
    @JsonProperty("profileSampleType")
    public void setProfileSampleType(org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType profileSampleType) {
        this.profileSampleType = profileSampleType;
    }

    public TableProfile withProfileSampleType(org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType profileSampleType) {
        this.profileSampleType = profileSampleType;
        return this;
    }

    /**
     * No.of columns in the table.
     * 
     */
    @JsonProperty("columnCount")
    public Double getColumnCount() {
        return columnCount;
    }

    /**
     * No.of columns in the table.
     * 
     */
    @JsonProperty("columnCount")
    public void setColumnCount(Double columnCount) {
        this.columnCount = columnCount;
    }

    public TableProfile withColumnCount(Double columnCount) {
        this.columnCount = columnCount;
        return this;
    }

    /**
     * No.of rows in the table. This is always executed on the whole table.
     * 
     */
    @JsonProperty("rowCount")
    public Double getRowCount() {
        return rowCount;
    }

    /**
     * No.of rows in the table. This is always executed on the whole table.
     * 
     */
    @JsonProperty("rowCount")
    public void setRowCount(Double rowCount) {
        this.rowCount = rowCount;
    }

    public TableProfile withRowCount(Double rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    /**
     * Table size in GB
     * 
     */
    @JsonProperty("sizeInByte")
    public Double getSizeInByte() {
        return sizeInByte;
    }

    /**
     * Table size in GB
     * 
     */
    @JsonProperty("sizeInByte")
    public void setSizeInByte(Double sizeInByte) {
        this.sizeInByte = sizeInByte;
    }

    public TableProfile withSizeInByte(Double sizeInByte) {
        this.sizeInByte = sizeInByte;
        return this;
    }

    /**
     * Table creation time.
     * 
     */
    @JsonProperty("createDateTime")
    public Date getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Table creation time.
     * 
     */
    @JsonProperty("createDateTime")
    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public TableProfile withCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TableProfile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("profileSample");
        sb.append('=');
        sb.append(((this.profileSample == null)?"<null>":this.profileSample));
        sb.append(',');
        sb.append("profileSampleType");
        sb.append('=');
        sb.append(((this.profileSampleType == null)?"<null>":this.profileSampleType));
        sb.append(',');
        sb.append("columnCount");
        sb.append('=');
        sb.append(((this.columnCount == null)?"<null>":this.columnCount));
        sb.append(',');
        sb.append("rowCount");
        sb.append('=');
        sb.append(((this.rowCount == null)?"<null>":this.rowCount));
        sb.append(',');
        sb.append("sizeInByte");
        sb.append('=');
        sb.append(((this.sizeInByte == null)?"<null>":this.sizeInByte));
        sb.append(',');
        sb.append("createDateTime");
        sb.append('=');
        sb.append(((this.createDateTime == null)?"<null>":this.createDateTime));
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
        result = ((result* 31)+((this.profileSampleType == null)? 0 :this.profileSampleType.hashCode()));
        result = ((result* 31)+((this.columnCount == null)? 0 :this.columnCount.hashCode()));
        result = ((result* 31)+((this.rowCount == null)? 0 :this.rowCount.hashCode()));
        result = ((result* 31)+((this.sizeInByte == null)? 0 :this.sizeInByte.hashCode()));
        result = ((result* 31)+((this.profileSample == null)? 0 :this.profileSample.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.createDateTime == null)? 0 :this.createDateTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableProfile) == false) {
            return false;
        }
        TableProfile rhs = ((TableProfile) other);
        return ((((((((this.profileSampleType == rhs.profileSampleType)||((this.profileSampleType!= null)&&this.profileSampleType.equals(rhs.profileSampleType)))&&((this.columnCount == rhs.columnCount)||((this.columnCount!= null)&&this.columnCount.equals(rhs.columnCount))))&&((this.rowCount == rhs.rowCount)||((this.rowCount!= null)&&this.rowCount.equals(rhs.rowCount))))&&((this.sizeInByte == rhs.sizeInByte)||((this.sizeInByte!= null)&&this.sizeInByte.equals(rhs.sizeInByte))))&&((this.profileSample == rhs.profileSample)||((this.profileSample!= null)&&this.profileSample.equals(rhs.profileSample))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.createDateTime == rhs.createDateTime)||((this.createDateTime!= null)&&this.createDateTime.equals(rhs.createDateTime))));
    }

}
