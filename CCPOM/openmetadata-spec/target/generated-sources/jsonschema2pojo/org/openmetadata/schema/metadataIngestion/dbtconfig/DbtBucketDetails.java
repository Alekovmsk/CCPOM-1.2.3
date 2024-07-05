
package org.openmetadata.schema.metadataIngestion.dbtconfig;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DBT Bucket Details
 * <p>
 * Details of the bucket where the dbt files are stored
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dbtBucketName",
    "dbtObjectPrefix"
})
@Generated("jsonschema2pojo")
public class DbtBucketDetails {

    /**
     * DBT Bucket Name
     * <p>
     * Name of the bucket where the dbt files are stored
     * 
     */
    @JsonProperty("dbtBucketName")
    @JsonPropertyDescription("Name of the bucket where the dbt files are stored")
    private String dbtBucketName;
    /**
     * DBT Object Prefix
     * <p>
     * Path of the folder where the dbt files are stored
     * 
     */
    @JsonProperty("dbtObjectPrefix")
    @JsonPropertyDescription("Path of the folder where the dbt files are stored")
    private String dbtObjectPrefix;

    /**
     * DBT Bucket Name
     * <p>
     * Name of the bucket where the dbt files are stored
     * 
     */
    @JsonProperty("dbtBucketName")
    public String getDbtBucketName() {
        return dbtBucketName;
    }

    /**
     * DBT Bucket Name
     * <p>
     * Name of the bucket where the dbt files are stored
     * 
     */
    @JsonProperty("dbtBucketName")
    public void setDbtBucketName(String dbtBucketName) {
        this.dbtBucketName = dbtBucketName;
    }

    public DbtBucketDetails withDbtBucketName(String dbtBucketName) {
        this.dbtBucketName = dbtBucketName;
        return this;
    }

    /**
     * DBT Object Prefix
     * <p>
     * Path of the folder where the dbt files are stored
     * 
     */
    @JsonProperty("dbtObjectPrefix")
    public String getDbtObjectPrefix() {
        return dbtObjectPrefix;
    }

    /**
     * DBT Object Prefix
     * <p>
     * Path of the folder where the dbt files are stored
     * 
     */
    @JsonProperty("dbtObjectPrefix")
    public void setDbtObjectPrefix(String dbtObjectPrefix) {
        this.dbtObjectPrefix = dbtObjectPrefix;
    }

    public DbtBucketDetails withDbtObjectPrefix(String dbtObjectPrefix) {
        this.dbtObjectPrefix = dbtObjectPrefix;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DbtBucketDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dbtBucketName");
        sb.append('=');
        sb.append(((this.dbtBucketName == null)?"<null>":this.dbtBucketName));
        sb.append(',');
        sb.append("dbtObjectPrefix");
        sb.append('=');
        sb.append(((this.dbtObjectPrefix == null)?"<null>":this.dbtObjectPrefix));
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
        result = ((result* 31)+((this.dbtObjectPrefix == null)? 0 :this.dbtObjectPrefix.hashCode()));
        result = ((result* 31)+((this.dbtBucketName == null)? 0 :this.dbtBucketName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DbtBucketDetails) == false) {
            return false;
        }
        DbtBucketDetails rhs = ((DbtBucketDetails) other);
        return (((this.dbtObjectPrefix == rhs.dbtObjectPrefix)||((this.dbtObjectPrefix!= null)&&this.dbtObjectPrefix.equals(rhs.dbtObjectPrefix)))&&((this.dbtBucketName == rhs.dbtBucketName)||((this.dbtBucketName!= null)&&this.dbtBucketName.equals(rhs.dbtBucketName))));
    }

}
