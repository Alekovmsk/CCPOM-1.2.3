
package org.openmetadata.schema.metadataIngestion.storage;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Storage Metadata Local Config
 * <p>
 * Storage Metadata Manifest file path config.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "manifestFilePath"
})
@Generated("jsonschema2pojo")
public class StorageMetadataLocalConfig {

    /**
     * Storage Metadata Manifest File Path
     * <p>
     * Storage Metadata manifest file path to extract locations to ingest from.
     * (Required)
     * 
     */
    @JsonProperty("manifestFilePath")
    @JsonPropertyDescription("Storage Metadata manifest file path to extract locations to ingest from.")
    @NotNull
    private String manifestFilePath;

    /**
     * Storage Metadata Manifest File Path
     * <p>
     * Storage Metadata manifest file path to extract locations to ingest from.
     * (Required)
     * 
     */
    @JsonProperty("manifestFilePath")
    public String getManifestFilePath() {
        return manifestFilePath;
    }

    /**
     * Storage Metadata Manifest File Path
     * <p>
     * Storage Metadata manifest file path to extract locations to ingest from.
     * (Required)
     * 
     */
    @JsonProperty("manifestFilePath")
    public void setManifestFilePath(String manifestFilePath) {
        this.manifestFilePath = manifestFilePath;
    }

    public StorageMetadataLocalConfig withManifestFilePath(String manifestFilePath) {
        this.manifestFilePath = manifestFilePath;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StorageMetadataLocalConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("manifestFilePath");
        sb.append('=');
        sb.append(((this.manifestFilePath == null)?"<null>":this.manifestFilePath));
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
        result = ((result* 31)+((this.manifestFilePath == null)? 0 :this.manifestFilePath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageMetadataLocalConfig) == false) {
            return false;
        }
        StorageMetadataLocalConfig rhs = ((StorageMetadataLocalConfig) other);
        return ((this.manifestFilePath == rhs.manifestFilePath)||((this.manifestFilePath!= null)&&this.manifestFilePath.equals(rhs.manifestFilePath)));
    }

}
