
package org.openmetadata.schema.type;

import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This schema defines the type for an ML Feature used in an ML Model.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "dataType",
    "description",
    "fullyQualifiedName",
    "featureSources",
    "featureAlgorithm",
    "tags"
})
@Generated("jsonschema2pojo")
public class MlFeature {

    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name that identifies an entity.")
    @Pattern(regexp = "^(?U)[\\w'\\- .&()%]+$")
    @Size(min = 1, max = 128)
    private String name;
    /**
     * This enum defines the type of data stored in a ML Feature.
     * 
     */
    @JsonProperty("dataType")
    @JsonPropertyDescription("This enum defines the type of data stored in a ML Feature.")
    private MlFeatureDataType dataType;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
    /**
     * Columns used to create the ML Feature.
     * 
     */
    @JsonProperty("featureSources")
    @JsonPropertyDescription("Columns used to create the ML Feature.")
    @Valid
    private List<MlFeatureSource> featureSources = null;
    /**
     * Description of the algorithm used to compute the feature, e.g., PCA, bucketing...
     * 
     */
    @JsonProperty("featureAlgorithm")
    @JsonPropertyDescription("Description of the algorithm used to compute the feature, e.g., PCA, bucketing...")
    private String featureAlgorithm;
    /**
     * Tags associated with the feature.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags associated with the feature.")
    @Valid
    private List<TagLabel> tags = null;

    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name that identifies an entity.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public MlFeature withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * This enum defines the type of data stored in a ML Feature.
     * 
     */
    @JsonProperty("dataType")
    public MlFeatureDataType getDataType() {
        return dataType;
    }

    /**
     * This enum defines the type of data stored in a ML Feature.
     * 
     */
    @JsonProperty("dataType")
    public void setDataType(MlFeatureDataType dataType) {
        this.dataType = dataType;
    }

    public MlFeature withDataType(MlFeatureDataType dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public MlFeature withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public MlFeature withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Columns used to create the ML Feature.
     * 
     */
    @JsonProperty("featureSources")
    public List<MlFeatureSource> getFeatureSources() {
        return featureSources;
    }

    /**
     * Columns used to create the ML Feature.
     * 
     */
    @JsonProperty("featureSources")
    public void setFeatureSources(List<MlFeatureSource> featureSources) {
        this.featureSources = featureSources;
    }

    public MlFeature withFeatureSources(List<MlFeatureSource> featureSources) {
        this.featureSources = featureSources;
        return this;
    }

    /**
     * Description of the algorithm used to compute the feature, e.g., PCA, bucketing...
     * 
     */
    @JsonProperty("featureAlgorithm")
    public String getFeatureAlgorithm() {
        return featureAlgorithm;
    }

    /**
     * Description of the algorithm used to compute the feature, e.g., PCA, bucketing...
     * 
     */
    @JsonProperty("featureAlgorithm")
    public void setFeatureAlgorithm(String featureAlgorithm) {
        this.featureAlgorithm = featureAlgorithm;
    }

    public MlFeature withFeatureAlgorithm(String featureAlgorithm) {
        this.featureAlgorithm = featureAlgorithm;
        return this;
    }

    /**
     * Tags associated with the feature.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags associated with the feature.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public MlFeature withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MlFeature.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("dataType");
        sb.append('=');
        sb.append(((this.dataType == null)?"<null>":this.dataType));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("featureSources");
        sb.append('=');
        sb.append(((this.featureSources == null)?"<null>":this.featureSources));
        sb.append(',');
        sb.append("featureAlgorithm");
        sb.append('=');
        sb.append(((this.featureAlgorithm == null)?"<null>":this.featureAlgorithm));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
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
        result = ((result* 31)+((this.featureSources == null)? 0 :this.featureSources.hashCode()));
        result = ((result* 31)+((this.featureAlgorithm == null)? 0 :this.featureAlgorithm.hashCode()));
        result = ((result* 31)+((this.dataType == null)? 0 :this.dataType.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MlFeature) == false) {
            return false;
        }
        MlFeature rhs = ((MlFeature) other);
        return ((((((((this.featureSources == rhs.featureSources)||((this.featureSources!= null)&&this.featureSources.equals(rhs.featureSources)))&&((this.featureAlgorithm == rhs.featureAlgorithm)||((this.featureAlgorithm!= null)&&this.featureAlgorithm.equals(rhs.featureAlgorithm))))&&((this.dataType == rhs.dataType)||((this.dataType!= null)&&this.dataType.equals(rhs.dataType))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
