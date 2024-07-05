
package org.openmetadata.schema.metadataIngestion.storage;

import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ManifestMetadataConfig
 * <p>
 * Definition of the manifest file containing entries to be ingested across multiple buckets as object storage entries
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entries"
})
@Generated("jsonschema2pojo")
public class ManifestMetadataConfig {

    /**
     * List of metadata entries for the bucket containing information about where data resides and its structure
     * (Required)
     * 
     */
    @JsonProperty("entries")
    @JsonPropertyDescription("List of metadata entries for the bucket containing information about where data resides and its structure")
    @Valid
    @NotNull
    private List<ManifestMetadataEntry> entries = null;

    /**
     * List of metadata entries for the bucket containing information about where data resides and its structure
     * (Required)
     * 
     */
    @JsonProperty("entries")
    public List<ManifestMetadataEntry> getEntries() {
        return entries;
    }

    /**
     * List of metadata entries for the bucket containing information about where data resides and its structure
     * (Required)
     * 
     */
    @JsonProperty("entries")
    public void setEntries(List<ManifestMetadataEntry> entries) {
        this.entries = entries;
    }

    public ManifestMetadataConfig withEntries(List<ManifestMetadataEntry> entries) {
        this.entries = entries;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ManifestMetadataConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entries");
        sb.append('=');
        sb.append(((this.entries == null)?"<null>":this.entries));
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
        result = ((result* 31)+((this.entries == null)? 0 :this.entries.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ManifestMetadataConfig) == false) {
            return false;
        }
        ManifestMetadataConfig rhs = ((ManifestMetadataConfig) other);
        return ((this.entries == rhs.entries)||((this.entries!= null)&&this.entries.equals(rhs.entries)));
    }

}
