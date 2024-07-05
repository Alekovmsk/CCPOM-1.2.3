
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Description of the change.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fieldsAdded",
    "fieldsUpdated",
    "fieldsDeleted",
    "previousVersion"
})
@Generated("jsonschema2pojo")
public class ChangeDescription {

    /**
     * Names of fields added during the version changes.
     * 
     */
    @JsonProperty("fieldsAdded")
    @JsonPropertyDescription("Names of fields added during the version changes.")
    @Valid
    private List<FieldChange> fieldsAdded = new ArrayList<FieldChange>();
    /**
     * Fields modified during the version changes with old and new values.
     * 
     */
    @JsonProperty("fieldsUpdated")
    @JsonPropertyDescription("Fields modified during the version changes with old and new values.")
    @Valid
    private List<FieldChange> fieldsUpdated = new ArrayList<FieldChange>();
    /**
     * Fields deleted during the version changes with old value before deleted.
     * 
     */
    @JsonProperty("fieldsDeleted")
    @JsonPropertyDescription("Fields deleted during the version changes with old value before deleted.")
    @Valid
    private List<FieldChange> fieldsDeleted = new ArrayList<FieldChange>();
    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("previousVersion")
    @JsonPropertyDescription("Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.")
    private Double previousVersion = 0.1D;

    /**
     * Names of fields added during the version changes.
     * 
     */
    @JsonProperty("fieldsAdded")
    public List<FieldChange> getFieldsAdded() {
        return fieldsAdded;
    }

    /**
     * Names of fields added during the version changes.
     * 
     */
    @JsonProperty("fieldsAdded")
    public void setFieldsAdded(List<FieldChange> fieldsAdded) {
        this.fieldsAdded = fieldsAdded;
    }

    public ChangeDescription withFieldsAdded(List<FieldChange> fieldsAdded) {
        this.fieldsAdded = fieldsAdded;
        return this;
    }

    /**
     * Fields modified during the version changes with old and new values.
     * 
     */
    @JsonProperty("fieldsUpdated")
    public List<FieldChange> getFieldsUpdated() {
        return fieldsUpdated;
    }

    /**
     * Fields modified during the version changes with old and new values.
     * 
     */
    @JsonProperty("fieldsUpdated")
    public void setFieldsUpdated(List<FieldChange> fieldsUpdated) {
        this.fieldsUpdated = fieldsUpdated;
    }

    public ChangeDescription withFieldsUpdated(List<FieldChange> fieldsUpdated) {
        this.fieldsUpdated = fieldsUpdated;
        return this;
    }

    /**
     * Fields deleted during the version changes with old value before deleted.
     * 
     */
    @JsonProperty("fieldsDeleted")
    public List<FieldChange> getFieldsDeleted() {
        return fieldsDeleted;
    }

    /**
     * Fields deleted during the version changes with old value before deleted.
     * 
     */
    @JsonProperty("fieldsDeleted")
    public void setFieldsDeleted(List<FieldChange> fieldsDeleted) {
        this.fieldsDeleted = fieldsDeleted;
    }

    public ChangeDescription withFieldsDeleted(List<FieldChange> fieldsDeleted) {
        this.fieldsDeleted = fieldsDeleted;
        return this;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("previousVersion")
    public Double getPreviousVersion() {
        return previousVersion;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("previousVersion")
    public void setPreviousVersion(Double previousVersion) {
        this.previousVersion = previousVersion;
    }

    public ChangeDescription withPreviousVersion(Double previousVersion) {
        this.previousVersion = previousVersion;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChangeDescription.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fieldsAdded");
        sb.append('=');
        sb.append(((this.fieldsAdded == null)?"<null>":this.fieldsAdded));
        sb.append(',');
        sb.append("fieldsUpdated");
        sb.append('=');
        sb.append(((this.fieldsUpdated == null)?"<null>":this.fieldsUpdated));
        sb.append(',');
        sb.append("fieldsDeleted");
        sb.append('=');
        sb.append(((this.fieldsDeleted == null)?"<null>":this.fieldsDeleted));
        sb.append(',');
        sb.append("previousVersion");
        sb.append('=');
        sb.append(((this.previousVersion == null)?"<null>":this.previousVersion));
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
        result = ((result* 31)+((this.fieldsAdded == null)? 0 :this.fieldsAdded.hashCode()));
        result = ((result* 31)+((this.fieldsUpdated == null)? 0 :this.fieldsUpdated.hashCode()));
        result = ((result* 31)+((this.fieldsDeleted == null)? 0 :this.fieldsDeleted.hashCode()));
        result = ((result* 31)+((this.previousVersion == null)? 0 :this.previousVersion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChangeDescription) == false) {
            return false;
        }
        ChangeDescription rhs = ((ChangeDescription) other);
        return (((((this.fieldsAdded == rhs.fieldsAdded)||((this.fieldsAdded!= null)&&this.fieldsAdded.equals(rhs.fieldsAdded)))&&((this.fieldsUpdated == rhs.fieldsUpdated)||((this.fieldsUpdated!= null)&&this.fieldsUpdated.equals(rhs.fieldsUpdated))))&&((this.fieldsDeleted == rhs.fieldsDeleted)||((this.fieldsDeleted!= null)&&this.fieldsDeleted.equals(rhs.fieldsDeleted))))&&((this.previousVersion == rhs.previousVersion)||((this.previousVersion!= null)&&this.previousVersion.equals(rhs.previousVersion))));
    }

}
