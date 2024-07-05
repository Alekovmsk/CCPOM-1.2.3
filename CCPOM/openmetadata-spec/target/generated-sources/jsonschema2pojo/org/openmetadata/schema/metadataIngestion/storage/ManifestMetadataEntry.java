
package org.openmetadata.schema.metadataIngestion.storage;

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
import org.openmetadata.schema.type.Column;


/**
 * Config properties for a container found in a user-supplied metadata config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "containerName",
    "dataPath",
    "structureFormat",
    "separator",
    "isPartitioned",
    "partitionColumns"
})
@Generated("jsonschema2pojo")
public class ManifestMetadataEntry {

    /**
     * Container Name
     * <p>
     * The top-level container name containing the data path to be ingested
     * (Required)
     * 
     */
    @JsonProperty("containerName")
    @JsonPropertyDescription("The top-level container name containing the data path to be ingested")
    @NotNull
    private String containerName;
    /**
     * Data path
     * <p>
     * The path where the data resides in the container, excluding the bucket name
     * (Required)
     * 
     */
    @JsonProperty("dataPath")
    @JsonPropertyDescription("The path where the data resides in the container, excluding the bucket name")
    @NotNull
    private String dataPath;
    /**
     * Schema format
     * <p>
     * What's the schema format for the container, eg. avro, parquet, csv.
     * 
     */
    @JsonProperty("structureFormat")
    @JsonPropertyDescription("What's the schema format for the container, eg. avro, parquet, csv.")
    private String structureFormat = null;
    /**
     * Separator
     * <p>
     * For delimited files such as CSV, what is the separator being used?
     * 
     */
    @JsonProperty("separator")
    @JsonPropertyDescription("For delimited files such as CSV, what is the separator being used?")
    private String separator = null;
    /**
     * Is Partitioned
     * <p>
     * Flag indicating whether the container's data is partitioned
     * 
     */
    @JsonProperty("isPartitioned")
    @JsonPropertyDescription("Flag indicating whether the container's data is partitioned")
    private Boolean isPartitioned = false;
    /**
     * Partition Columns
     * <p>
     * What are the partition columns in case the container's data is partitioned
     * 
     */
    @JsonProperty("partitionColumns")
    @JsonPropertyDescription("What are the partition columns in case the container's data is partitioned")
    @Valid
    private List<Column> partitionColumns = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Container Name
     * <p>
     * The top-level container name containing the data path to be ingested
     * (Required)
     * 
     */
    @JsonProperty("containerName")
    public String getContainerName() {
        return containerName;
    }

    /**
     * Container Name
     * <p>
     * The top-level container name containing the data path to be ingested
     * (Required)
     * 
     */
    @JsonProperty("containerName")
    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ManifestMetadataEntry withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Data path
     * <p>
     * The path where the data resides in the container, excluding the bucket name
     * (Required)
     * 
     */
    @JsonProperty("dataPath")
    public String getDataPath() {
        return dataPath;
    }

    /**
     * Data path
     * <p>
     * The path where the data resides in the container, excluding the bucket name
     * (Required)
     * 
     */
    @JsonProperty("dataPath")
    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }

    public ManifestMetadataEntry withDataPath(String dataPath) {
        this.dataPath = dataPath;
        return this;
    }

    /**
     * Schema format
     * <p>
     * What's the schema format for the container, eg. avro, parquet, csv.
     * 
     */
    @JsonProperty("structureFormat")
    public String getStructureFormat() {
        return structureFormat;
    }

    /**
     * Schema format
     * <p>
     * What's the schema format for the container, eg. avro, parquet, csv.
     * 
     */
    @JsonProperty("structureFormat")
    public void setStructureFormat(String structureFormat) {
        this.structureFormat = structureFormat;
    }

    public ManifestMetadataEntry withStructureFormat(String structureFormat) {
        this.structureFormat = structureFormat;
        return this;
    }

    /**
     * Separator
     * <p>
     * For delimited files such as CSV, what is the separator being used?
     * 
     */
    @JsonProperty("separator")
    public String getSeparator() {
        return separator;
    }

    /**
     * Separator
     * <p>
     * For delimited files such as CSV, what is the separator being used?
     * 
     */
    @JsonProperty("separator")
    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public ManifestMetadataEntry withSeparator(String separator) {
        this.separator = separator;
        return this;
    }

    /**
     * Is Partitioned
     * <p>
     * Flag indicating whether the container's data is partitioned
     * 
     */
    @JsonProperty("isPartitioned")
    public Boolean getIsPartitioned() {
        return isPartitioned;
    }

    /**
     * Is Partitioned
     * <p>
     * Flag indicating whether the container's data is partitioned
     * 
     */
    @JsonProperty("isPartitioned")
    public void setIsPartitioned(Boolean isPartitioned) {
        this.isPartitioned = isPartitioned;
    }

    public ManifestMetadataEntry withIsPartitioned(Boolean isPartitioned) {
        this.isPartitioned = isPartitioned;
        return this;
    }

    /**
     * Partition Columns
     * <p>
     * What are the partition columns in case the container's data is partitioned
     * 
     */
    @JsonProperty("partitionColumns")
    public List<Column> getPartitionColumns() {
        return partitionColumns;
    }

    /**
     * Partition Columns
     * <p>
     * What are the partition columns in case the container's data is partitioned
     * 
     */
    @JsonProperty("partitionColumns")
    public void setPartitionColumns(List<Column> partitionColumns) {
        this.partitionColumns = partitionColumns;
    }

    public ManifestMetadataEntry withPartitionColumns(List<Column> partitionColumns) {
        this.partitionColumns = partitionColumns;
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

    public ManifestMetadataEntry withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ManifestMetadataEntry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("containerName");
        sb.append('=');
        sb.append(((this.containerName == null)?"<null>":this.containerName));
        sb.append(',');
        sb.append("dataPath");
        sb.append('=');
        sb.append(((this.dataPath == null)?"<null>":this.dataPath));
        sb.append(',');
        sb.append("structureFormat");
        sb.append('=');
        sb.append(((this.structureFormat == null)?"<null>":this.structureFormat));
        sb.append(',');
        sb.append("separator");
        sb.append('=');
        sb.append(((this.separator == null)?"<null>":this.separator));
        sb.append(',');
        sb.append("isPartitioned");
        sb.append('=');
        sb.append(((this.isPartitioned == null)?"<null>":this.isPartitioned));
        sb.append(',');
        sb.append("partitionColumns");
        sb.append('=');
        sb.append(((this.partitionColumns == null)?"<null>":this.partitionColumns));
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
        result = ((result* 31)+((this.structureFormat == null)? 0 :this.structureFormat.hashCode()));
        result = ((result* 31)+((this.containerName == null)? 0 :this.containerName.hashCode()));
        result = ((result* 31)+((this.partitionColumns == null)? 0 :this.partitionColumns.hashCode()));
        result = ((result* 31)+((this.isPartitioned == null)? 0 :this.isPartitioned.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.separator == null)? 0 :this.separator.hashCode()));
        result = ((result* 31)+((this.dataPath == null)? 0 :this.dataPath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ManifestMetadataEntry) == false) {
            return false;
        }
        ManifestMetadataEntry rhs = ((ManifestMetadataEntry) other);
        return ((((((((this.structureFormat == rhs.structureFormat)||((this.structureFormat!= null)&&this.structureFormat.equals(rhs.structureFormat)))&&((this.containerName == rhs.containerName)||((this.containerName!= null)&&this.containerName.equals(rhs.containerName))))&&((this.partitionColumns == rhs.partitionColumns)||((this.partitionColumns!= null)&&this.partitionColumns.equals(rhs.partitionColumns))))&&((this.isPartitioned == rhs.isPartitioned)||((this.isPartitioned!= null)&&this.isPartitioned.equals(rhs.isPartitioned))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.separator == rhs.separator)||((this.separator!= null)&&this.separator.equals(rhs.separator))))&&((this.dataPath == rhs.dataPath)||((this.dataPath!= null)&&this.dataPath.equals(rhs.dataPath))));
    }

}
