
package org.openmetadata.schema.system.ui;

import java.util.HashMap;
import java.util.List;
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
import org.openmetadata.schema.type.EntityReference;


/**
 * Team
 * <p>
 * This schema defines the Page entity. A Page is a landing page, schema page to customize in OpenMetadata.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entityType",
    "pageType",
    "layout",
    "persona",
    "domain",
    "knowledgePanels"
})
@Generated("jsonschema2pojo")
public class Page {

    /**
     * Entity Type.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    @JsonPropertyDescription("Entity Type.")
    @NotNull
    private Page.EntityType entityType = Page.EntityType.fromValue("Page");
    /**
     * This schema defines the type used for describing different types of pages.
     * (Required)
     * 
     */
    @JsonProperty("pageType")
    @JsonPropertyDescription("This schema defines the type used for describing different types of pages.")
    @NotNull
    private PageType pageType;
    /**
     * Configuration for the Knowledge Panel.
     * (Required)
     * 
     */
    @JsonProperty("layout")
    @JsonPropertyDescription("Configuration for the Knowledge Panel.")
    @Valid
    @NotNull
    private Layout layout;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("persona")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference persona;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference domain;
    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("knowledgePanels")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private List<EntityReference> knowledgePanels = null;

    /**
     * Entity Type.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    public Page.EntityType getEntityType() {
        return entityType;
    }

    /**
     * Entity Type.
     * (Required)
     * 
     */
    @JsonProperty("entityType")
    public void setEntityType(Page.EntityType entityType) {
        this.entityType = entityType;
    }

    public Page withEntityType(Page.EntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * This schema defines the type used for describing different types of pages.
     * (Required)
     * 
     */
    @JsonProperty("pageType")
    public PageType getPageType() {
        return pageType;
    }

    /**
     * This schema defines the type used for describing different types of pages.
     * (Required)
     * 
     */
    @JsonProperty("pageType")
    public void setPageType(PageType pageType) {
        this.pageType = pageType;
    }

    public Page withPageType(PageType pageType) {
        this.pageType = pageType;
        return this;
    }

    /**
     * Configuration for the Knowledge Panel.
     * (Required)
     * 
     */
    @JsonProperty("layout")
    public Layout getLayout() {
        return layout;
    }

    /**
     * Configuration for the Knowledge Panel.
     * (Required)
     * 
     */
    @JsonProperty("layout")
    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public Page withLayout(Layout layout) {
        this.layout = layout;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("persona")
    public EntityReference getPersona() {
        return persona;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("persona")
    public void setPersona(EntityReference persona) {
        this.persona = persona;
    }

    public Page withPersona(EntityReference persona) {
        this.persona = persona;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("domain")
    public EntityReference getDomain() {
        return domain;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(EntityReference domain) {
        this.domain = domain;
    }

    public Page withDomain(EntityReference domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("knowledgePanels")
    public List<EntityReference> getKnowledgePanels() {
        return knowledgePanels;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("knowledgePanels")
    public void setKnowledgePanels(List<EntityReference> knowledgePanels) {
        this.knowledgePanels = knowledgePanels;
    }

    public Page withKnowledgePanels(List<EntityReference> knowledgePanels) {
        this.knowledgePanels = knowledgePanels;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Page.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("pageType");
        sb.append('=');
        sb.append(((this.pageType == null)?"<null>":this.pageType));
        sb.append(',');
        sb.append("layout");
        sb.append('=');
        sb.append(((this.layout == null)?"<null>":this.layout));
        sb.append(',');
        sb.append("persona");
        sb.append('=');
        sb.append(((this.persona == null)?"<null>":this.persona));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
        sb.append(',');
        sb.append("knowledgePanels");
        sb.append('=');
        sb.append(((this.knowledgePanels == null)?"<null>":this.knowledgePanels));
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
        result = ((result* 31)+((this.layout == null)? 0 :this.layout.hashCode()));
        result = ((result* 31)+((this.pageType == null)? 0 :this.pageType.hashCode()));
        result = ((result* 31)+((this.persona == null)? 0 :this.persona.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.knowledgePanels == null)? 0 :this.knowledgePanels.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Page) == false) {
            return false;
        }
        Page rhs = ((Page) other);
        return (((((((this.layout == rhs.layout)||((this.layout!= null)&&this.layout.equals(rhs.layout)))&&((this.pageType == rhs.pageType)||((this.pageType!= null)&&this.pageType.equals(rhs.pageType))))&&((this.persona == rhs.persona)||((this.persona!= null)&&this.persona.equals(rhs.persona))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.knowledgePanels == rhs.knowledgePanels)||((this.knowledgePanels!= null)&&this.knowledgePanels.equals(rhs.knowledgePanels))));
    }


    /**
     * Entity Type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum EntityType {

        PAGE("Page");
        private final String value;
        private final static Map<String, Page.EntityType> CONSTANTS = new HashMap<String, Page.EntityType>();

        static {
            for (Page.EntityType c: values()) {
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
        public static Page.EntityType fromValue(String value) {
            Page.EntityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
