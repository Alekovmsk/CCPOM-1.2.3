
package org.openmetadata.schema.system.ui;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Team
 * <p>
 * This schema defines the KnowledgePanel entity. A Knowledge panel is an information box used for UX customization in OpenMetadata.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entityType",
    "configuration"
})
@Generated("jsonschema2pojo")
public class KnowledgePanel {

    /**
     * Entity Type.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    @JsonPropertyDescription("Entity Type.")
    @NotNull
    private KnowledgePanel.EntityType entityType = KnowledgePanel.EntityType.fromValue("KnowledgePanel");
    /**
     * Configuration for the Knowledge Panel.
     * 
     */
    @JsonProperty("configuration")
    @JsonPropertyDescription("Configuration for the Knowledge Panel.")
    @Valid
    private Configuration configuration;

    /**
     * Entity Type.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    public KnowledgePanel.EntityType getEntityType() {
        return entityType;
    }

    /**
     * Entity Type.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    public void setEntityType(KnowledgePanel.EntityType entityType) {
        this.entityType = entityType;
    }

    public KnowledgePanel withEntityType(KnowledgePanel.EntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Configuration for the Knowledge Panel.
     * 
     */
    @JsonProperty("configuration")
    public Configuration getConfiguration() {
        return configuration;
    }

    /**
     * Configuration for the Knowledge Panel.
     * 
     */
    @JsonProperty("configuration")
    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public KnowledgePanel withConfiguration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KnowledgePanel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("configuration");
        sb.append('=');
        sb.append(((this.configuration == null)?"<null>":this.configuration));
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
        result = ((result* 31)+((this.configuration == null)? 0 :this.configuration.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KnowledgePanel) == false) {
            return false;
        }
        KnowledgePanel rhs = ((KnowledgePanel) other);
        return (((this.configuration == rhs.configuration)||((this.configuration!= null)&&this.configuration.equals(rhs.configuration)))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))));
    }


    /**
     * Entity Type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum EntityType {

        KNOWLEDGE_PANEL("KnowledgePanel");
        private final String value;
        private final static Map<String, KnowledgePanel.EntityType> CONSTANTS = new HashMap<String, KnowledgePanel.EntityType>();

        static {
            for (KnowledgePanel.EntityType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EntityType(String value) {
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
        public static KnowledgePanel.EntityType fromValue(String value) {
            KnowledgePanel.EntityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
