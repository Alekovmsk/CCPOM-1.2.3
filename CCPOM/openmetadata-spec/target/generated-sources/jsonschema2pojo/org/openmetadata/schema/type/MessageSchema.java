
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Topic
 * <p>
 * This schema defines the Topic entity. A topic is a feed into which message are published to by publishers and read from by consumers in a messaging service.@om-entity-type
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "schemaText",
    "schemaType",
    "schemaFields"
})
@Generated("jsonschema2pojo")
public class MessageSchema {

    /**
     * Schema used for message serialization. Optional as some topics may not have associated schemas.
     * 
     */
    @JsonProperty("schemaText")
    @JsonPropertyDescription("Schema used for message serialization. Optional as some topics may not have associated schemas.")
    private String schemaText;
    /**
     * Schema type used for the message.
     * 
     */
    @JsonProperty("schemaType")
    @JsonPropertyDescription("Schema type used for the message.")
    private SchemaType schemaType;
    /**
     * Columns in this table.
     * 
     */
    @JsonProperty("schemaFields")
    @JsonPropertyDescription("Columns in this table.")
    @Valid
    private List<Field> schemaFields = new ArrayList<Field>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Schema used for message serialization. Optional as some topics may not have associated schemas.
     * 
     */
    @JsonProperty("schemaText")
    public String getSchemaText() {
        return schemaText;
    }

    /**
     * Schema used for message serialization. Optional as some topics may not have associated schemas.
     * 
     */
    @JsonProperty("schemaText")
    public void setSchemaText(String schemaText) {
        this.schemaText = schemaText;
    }

    public MessageSchema withSchemaText(String schemaText) {
        this.schemaText = schemaText;
        return this;
    }

    /**
     * Schema type used for the message.
     * 
     */
    @JsonProperty("schemaType")
    public SchemaType getSchemaType() {
        return schemaType;
    }

    /**
     * Schema type used for the message.
     * 
     */
    @JsonProperty("schemaType")
    public void setSchemaType(SchemaType schemaType) {
        this.schemaType = schemaType;
    }

    public MessageSchema withSchemaType(SchemaType schemaType) {
        this.schemaType = schemaType;
        return this;
    }

    /**
     * Columns in this table.
     * 
     */
    @JsonProperty("schemaFields")
    public List<Field> getSchemaFields() {
        return schemaFields;
    }

    /**
     * Columns in this table.
     * 
     */
    @JsonProperty("schemaFields")
    public void setSchemaFields(List<Field> schemaFields) {
        this.schemaFields = schemaFields;
    }

    public MessageSchema withSchemaFields(List<Field> schemaFields) {
        this.schemaFields = schemaFields;
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

    public MessageSchema withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MessageSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("schemaText");
        sb.append('=');
        sb.append(((this.schemaText == null)?"<null>":this.schemaText));
        sb.append(',');
        sb.append("schemaType");
        sb.append('=');
        sb.append(((this.schemaType == null)?"<null>":this.schemaType));
        sb.append(',');
        sb.append("schemaFields");
        sb.append('=');
        sb.append(((this.schemaFields == null)?"<null>":this.schemaFields));
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
        result = ((result* 31)+((this.schemaType == null)? 0 :this.schemaType.hashCode()));
        result = ((result* 31)+((this.schemaFields == null)? 0 :this.schemaFields.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.schemaText == null)? 0 :this.schemaText.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MessageSchema) == false) {
            return false;
        }
        MessageSchema rhs = ((MessageSchema) other);
        return (((((this.schemaType == rhs.schemaType)||((this.schemaType!= null)&&this.schemaType.equals(rhs.schemaType)))&&((this.schemaFields == rhs.schemaFields)||((this.schemaFields!= null)&&this.schemaFields.equals(rhs.schemaFields))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.schemaText == rhs.schemaText)||((this.schemaText!= null)&&this.schemaText.equals(rhs.schemaText))));
    }

}
