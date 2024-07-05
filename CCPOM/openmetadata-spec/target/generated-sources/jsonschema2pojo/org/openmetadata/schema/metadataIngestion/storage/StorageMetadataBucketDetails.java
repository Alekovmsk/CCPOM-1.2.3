
package org.openmetadata.schema.metadataIngestion.storage;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Storage Metadata Bucket Details
 * <p>
 * Details of the bucket where the storage metadata manifest file is stored
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "containerName",
    "objectPrefix"
})
@Generated("jsonschema2pojo")
public class StorageMetadataBucketDetails {

    /**
     * Storage Metadata Container Name
     * <p>
     * Name of the top level container where the storage metadata file is stored
     * (Required)
     * 
     */
    @JsonProperty("containerName")
    @JsonPropertyDescription("Name of the top level container where the storage metadata file is stored")
    @NotNull
    private String containerName;
    /**
     * Storage Metadata Object Prefix
     * <p>
     * Path of the folder where the storage metadata file is stored. If the file is at the root, you can keep it empty.
     * 
     */
    @JsonProperty("objectPrefix")
    @JsonPropertyDescription("Path of the folder where the storage metadata file is stored. If the file is at the root, you can keep it empty.")
    private String objectPrefix;

    /**
     * Storage Metadata Container Name
     * <p>
     * Name of the top level container where the storage metadata file is stored
     * (Required)
     * 
     */
    @JsonProperty("containerName")
    public String getContainerName() {
        return containerName;
    }

    /**
     * Storage Metadata Container Name
     * <p>
     * Name of the top level container where the storage metadata file is stored
     * (Required)
     * 
     */
    @JsonProperty("containerName")
    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public StorageMetadataBucketDetails withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Storage Metadata Object Prefix
     * <p>
     * Path of the folder where the storage metadata file is stored. If the file is at the root, you can keep it empty.
     * 
     */
    @JsonProperty("objectPrefix")
    public String getObjectPrefix() {
        return objectPrefix;
    }

    /**
     * Storage Metadata Object Prefix
     * <p>
     * Path of the folder where the storage metadata file is stored. If the file is at the root, you can keep it empty.
     * 
     */
    @JsonProperty("objectPrefix")
    public void setObjectPrefix(String objectPrefix) {
        this.objectPrefix = objectPrefix;
    }

    public StorageMetadataBucketDetails withObjectPrefix(String objectPrefix) {
        this.objectPrefix = objectPrefix;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StorageMetadataBucketDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("containerName");
        sb.append('=');
        sb.append(((this.containerName == null)?"<null>":this.containerName));
        sb.append(',');
        sb.append("objectPrefix");
        sb.append('=');
        sb.append(((this.objectPrefix == null)?"<null>":this.objectPrefix));
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
        result = ((result* 31)+((this.objectPrefix == null)? 0 :this.objectPrefix.hashCode()));
        result = ((result* 31)+((this.containerName == null)? 0 :this.containerName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageMetadataBucketDetails) == false) {
            return false;
        }
        StorageMetadataBucketDetails rhs = ((StorageMetadataBucketDetails) other);
        return (((this.objectPrefix == rhs.objectPrefix)||((this.objectPrefix!= null)&&this.objectPrefix.equals(rhs.objectPrefix)))&&((this.containerName == rhs.containerName)||((this.containerName!= null)&&this.containerName.equals(rhs.containerName))));
    }

}
