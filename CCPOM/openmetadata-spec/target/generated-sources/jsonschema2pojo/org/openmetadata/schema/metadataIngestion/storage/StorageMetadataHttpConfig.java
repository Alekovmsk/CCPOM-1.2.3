
package org.openmetadata.schema.metadataIngestion.storage;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Storage Metadata Http Config
 * <p>
 * Storage Metadata Manifest file HTTP path config.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "manifestHttpPath"
})
@Generated("jsonschema2pojo")
public class StorageMetadataHttpConfig {

    /**
     * Storage Metadata Manifest HTTP Path
     * <p>
     * Storage Metadata manifest http file path to extract locations to ingest from.
     * (Required)
     * 
     */
    @JsonProperty("manifestHttpPath")
    @JsonPropertyDescription("Storage Metadata manifest http file path to extract locations to ingest from.")
    @NotNull
    private String manifestHttpPath;

    /**
     * Storage Metadata Manifest HTTP Path
     * <p>
     * Storage Metadata manifest http file path to extract locations to ingest from.
     * (Required)
     * 
     */
    @JsonProperty("manifestHttpPath")
    public String getManifestHttpPath() {
        return manifestHttpPath;
    }

    /**
     * Storage Metadata Manifest HTTP Path
     * <p>
     * Storage Metadata manifest http file path to extract locations to ingest from.
     * (Required)
     * 
     */
    @JsonProperty("manifestHttpPath")
    public void setManifestHttpPath(String manifestHttpPath) {
        this.manifestHttpPath = manifestHttpPath;
    }

    public StorageMetadataHttpConfig withManifestHttpPath(String manifestHttpPath) {
        this.manifestHttpPath = manifestHttpPath;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StorageMetadataHttpConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("manifestHttpPath");
        sb.append('=');
        sb.append(((this.manifestHttpPath == null)?"<null>":this.manifestHttpPath));
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
        result = ((result* 31)+((this.manifestHttpPath == null)? 0 :this.manifestHttpPath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageMetadataHttpConfig) == false) {
            return false;
        }
        StorageMetadataHttpConfig rhs = ((StorageMetadataHttpConfig) other);
        return ((this.manifestHttpPath == rhs.manifestHttpPath)||((this.manifestHttpPath!= null)&&this.manifestHttpPath.equals(rhs.manifestHttpPath)));
    }

}
