
package org.openmetadata.schema.metadataIngestion;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * MlModelServiceMetadataPipeline
 * <p>
 * MlModelService Metadata Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "mlModelFilterPattern",
    "markDeletedMlModels"
})
@Generated("jsonschema2pojo")
public class MlmodelServiceMetadataPipeline {

    /**
     * MlModel Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("MlModel Source Config Metadata Pipeline type")
    private MlmodelServiceMetadataPipeline.MlModelMetadataConfigType type = MlmodelServiceMetadataPipeline.MlModelMetadataConfigType.fromValue("MlModelMetadata");
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("mlModelFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern mlModelFilterPattern;
    /**
     * Mark Deleted ML Models
     * <p>
     * Optional configuration to soft delete MlModels in OpenMetadata if the source MlModels are deleted. Also, if the MlModel is deleted, all the associated entities like lineage, etc., with that MlModels will be deleted
     * 
     */
    @JsonProperty("markDeletedMlModels")
    @JsonPropertyDescription("Optional configuration to soft delete MlModels in OpenMetadata if the source MlModels are deleted. Also, if the MlModel is deleted, all the associated entities like lineage, etc., with that MlModels will be deleted")
    private Boolean markDeletedMlModels = true;

    /**
     * MlModel Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public MlmodelServiceMetadataPipeline.MlModelMetadataConfigType getType() {
        return type;
    }

    /**
     * MlModel Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public void setType(MlmodelServiceMetadataPipeline.MlModelMetadataConfigType type) {
        this.type = type;
    }

    public MlmodelServiceMetadataPipeline withType(MlmodelServiceMetadataPipeline.MlModelMetadataConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("mlModelFilterPattern")
    public FilterPattern getMlModelFilterPattern() {
        return mlModelFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("mlModelFilterPattern")
    public void setMlModelFilterPattern(FilterPattern mlModelFilterPattern) {
        this.mlModelFilterPattern = mlModelFilterPattern;
    }

    public MlmodelServiceMetadataPipeline withMlModelFilterPattern(FilterPattern mlModelFilterPattern) {
        this.mlModelFilterPattern = mlModelFilterPattern;
        return this;
    }

    /**
     * Mark Deleted ML Models
     * <p>
     * Optional configuration to soft delete MlModels in OpenMetadata if the source MlModels are deleted. Also, if the MlModel is deleted, all the associated entities like lineage, etc., with that MlModels will be deleted
     * 
     */
    @JsonProperty("markDeletedMlModels")
    public Boolean getMarkDeletedMlModels() {
        return markDeletedMlModels;
    }

    /**
     * Mark Deleted ML Models
     * <p>
     * Optional configuration to soft delete MlModels in OpenMetadata if the source MlModels are deleted. Also, if the MlModel is deleted, all the associated entities like lineage, etc., with that MlModels will be deleted
     * 
     */
    @JsonProperty("markDeletedMlModels")
    public void setMarkDeletedMlModels(Boolean markDeletedMlModels) {
        this.markDeletedMlModels = markDeletedMlModels;
    }

    public MlmodelServiceMetadataPipeline withMarkDeletedMlModels(Boolean markDeletedMlModels) {
        this.markDeletedMlModels = markDeletedMlModels;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MlmodelServiceMetadataPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("mlModelFilterPattern");
        sb.append('=');
        sb.append(((this.mlModelFilterPattern == null)?"<null>":this.mlModelFilterPattern));
        sb.append(',');
        sb.append("markDeletedMlModels");
        sb.append('=');
        sb.append(((this.markDeletedMlModels == null)?"<null>":this.markDeletedMlModels));
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
        result = ((result* 31)+((this.markDeletedMlModels == null)? 0 :this.markDeletedMlModels.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.mlModelFilterPattern == null)? 0 :this.mlModelFilterPattern.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MlmodelServiceMetadataPipeline) == false) {
            return false;
        }
        MlmodelServiceMetadataPipeline rhs = ((MlmodelServiceMetadataPipeline) other);
        return ((((this.markDeletedMlModels == rhs.markDeletedMlModels)||((this.markDeletedMlModels!= null)&&this.markDeletedMlModels.equals(rhs.markDeletedMlModels)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.mlModelFilterPattern == rhs.mlModelFilterPattern)||((this.mlModelFilterPattern!= null)&&this.mlModelFilterPattern.equals(rhs.mlModelFilterPattern))));
    }


    /**
     * MlModel Source Config Metadata Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MlModelMetadataConfigType {

        ML_MODEL_METADATA("MlModelMetadata");
        private final String value;
        private final static Map<String, MlmodelServiceMetadataPipeline.MlModelMetadataConfigType> CONSTANTS = new HashMap<String, MlmodelServiceMetadataPipeline.MlModelMetadataConfigType>();

        static {
            for (MlmodelServiceMetadataPipeline.MlModelMetadataConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MlModelMetadataConfigType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static MlmodelServiceMetadataPipeline.MlModelMetadataConfigType fromValue(String value) {
            MlmodelServiceMetadataPipeline.MlModelMetadataConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
