
package org.openmetadata.schema.type;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.entity.type.Style;


/**
 * TagLabel
 * <p>
 * This schema defines the type for labeling an entity with a Tag.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tagFQN",
    "name",
    "displayName",
    "description",
    "style",
    "source",
    "labelType",
    "state",
    "href"
})
@Generated("jsonschema2pojo")
public class TagLabel {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tagFQN")
    @Size(max = 128)
    @NotNull
    private String tagFQN;
    /**
     * Name of the tag or glossary term.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the tag or glossary term.")
    private String name;
    /**
     * Display Name that identifies this tag.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this tag.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
     * 
     */
    @JsonProperty("style")
    @JsonPropertyDescription("UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.")
    @Valid
    private Style style;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("source")
    @NotNull
    private TagLabel.TagSource source = TagLabel.TagSource.fromValue("Classification");
    /**
     * Label type describes how a tag label was applied. 'Manual' indicates the tag label was applied by a person. 'Derived' indicates a tag label was derived using the associated tag relationship (see Classification.json for more details). 'Propagated` indicates a tag label was propagated from upstream based on lineage. 'Automated' is used when a tool was used to determine the tag label.
     * (Required)
     * 
     */
    @JsonProperty("labelType")
    @JsonPropertyDescription("Label type describes how a tag label was applied. 'Manual' indicates the tag label was applied by a person. 'Derived' indicates a tag label was derived using the associated tag relationship (see Classification.json for more details). 'Propagated` indicates a tag label was propagated from upstream based on lineage. 'Automated' is used when a tool was used to determine the tag label.")
    @NotNull
    private TagLabel.LabelType labelType = TagLabel.LabelType.fromValue("Manual");
    /**
     * 'Suggested' state is used when a tag label is suggested by users or tools. Owner of the entity must confirm the suggested labels before it is marked as 'Confirmed'.
     * (Required)
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("'Suggested' state is used when a tag label is suggested by users or tools. Owner of the entity must confirm the suggested labels before it is marked as 'Confirmed'.")
    @NotNull
    private TagLabel.State state = TagLabel.State.fromValue("Confirmed");
    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI href;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tagFQN")
    public String getTagFQN() {
        return tagFQN;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tagFQN")
    public void setTagFQN(String tagFQN) {
        this.tagFQN = tagFQN;
    }

    public TagLabel withTagFQN(String tagFQN) {
        this.tagFQN = tagFQN;
        return this;
    }

    /**
     * Name of the tag or glossary term.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the tag or glossary term.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public TagLabel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this tag.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this tag.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TagLabel withDisplayName(String displayName) {
        this.displayName = displayName;
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

    public TagLabel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
     * 
     */
    @JsonProperty("style")
    public Style getStyle() {
        return style;
    }

    /**
     * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
     * 
     */
    @JsonProperty("style")
    public void setStyle(Style style) {
        this.style = style;
    }

    public TagLabel withStyle(Style style) {
        this.style = style;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("source")
    public TagLabel.TagSource getSource() {
        return source;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(TagLabel.TagSource source) {
        this.source = source;
    }

    public TagLabel withSource(TagLabel.TagSource source) {
        this.source = source;
        return this;
    }

    /**
     * Label type describes how a tag label was applied. 'Manual' indicates the tag label was applied by a person. 'Derived' indicates a tag label was derived using the associated tag relationship (see Classification.json for more details). 'Propagated` indicates a tag label was propagated from upstream based on lineage. 'Automated' is used when a tool was used to determine the tag label.
     * (Required)
     * 
     */
    @JsonProperty("labelType")
    public TagLabel.LabelType getLabelType() {
        return labelType;
    }

    /**
     * Label type describes how a tag label was applied. 'Manual' indicates the tag label was applied by a person. 'Derived' indicates a tag label was derived using the associated tag relationship (see Classification.json for more details). 'Propagated` indicates a tag label was propagated from upstream based on lineage. 'Automated' is used when a tool was used to determine the tag label.
     * (Required)
     * 
     */
    @JsonProperty("labelType")
    public void setLabelType(TagLabel.LabelType labelType) {
        this.labelType = labelType;
    }

    public TagLabel withLabelType(TagLabel.LabelType labelType) {
        this.labelType = labelType;
        return this;
    }

    /**
     * 'Suggested' state is used when a tag label is suggested by users or tools. Owner of the entity must confirm the suggested labels before it is marked as 'Confirmed'.
     * (Required)
     * 
     */
    @JsonProperty("state")
    public TagLabel.State getState() {
        return state;
    }

    /**
     * 'Suggested' state is used when a tag label is suggested by users or tools. Owner of the entity must confirm the suggested labels before it is marked as 'Confirmed'.
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(TagLabel.State state) {
        this.state = state;
    }

    public TagLabel withState(TagLabel.State state) {
        this.state = state;
        return this;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    public URI getHref() {
        return href;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    public void setHref(URI href) {
        this.href = href;
    }

    public TagLabel withHref(URI href) {
        this.href = href;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TagLabel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tagFQN");
        sb.append('=');
        sb.append(((this.tagFQN == null)?"<null>":this.tagFQN));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("labelType");
        sb.append('=');
        sb.append(((this.labelType == null)?"<null>":this.labelType));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
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
        result = ((result* 31)+((this.tagFQN == null)? 0 :this.tagFQN.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.labelType == null)? 0 :this.labelType.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TagLabel) == false) {
            return false;
        }
        TagLabel rhs = ((TagLabel) other);
        return ((((((((((this.tagFQN == rhs.tagFQN)||((this.tagFQN!= null)&&this.tagFQN.equals(rhs.tagFQN)))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.labelType == rhs.labelType)||((this.labelType!= null)&&this.labelType.equals(rhs.labelType))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))));
    }


    /**
     * Label type describes how a tag label was applied. 'Manual' indicates the tag label was applied by a person. 'Derived' indicates a tag label was derived using the associated tag relationship (see Classification.json for more details). 'Propagated` indicates a tag label was propagated from upstream based on lineage. 'Automated' is used when a tool was used to determine the tag label.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum LabelType {

        MANUAL("Manual"),
        PROPAGATED("Propagated"),
        AUTOMATED("Automated"),
        DERIVED("Derived");
        private final String value;
        private final static Map<String, TagLabel.LabelType> CONSTANTS = new HashMap<String, TagLabel.LabelType>();

        static {
            for (TagLabel.LabelType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        LabelType(String value) {
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
        public static TagLabel.LabelType fromValue(String value) {
            TagLabel.LabelType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * 'Suggested' state is used when a tag label is suggested by users or tools. Owner of the entity must confirm the suggested labels before it is marked as 'Confirmed'.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum State {

        SUGGESTED("Suggested"),
        CONFIRMED("Confirmed");
        private final String value;
        private final static Map<String, TagLabel.State> CONSTANTS = new HashMap<String, TagLabel.State>();

        static {
            for (TagLabel.State c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        State(String value) {
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
        public static TagLabel.State fromValue(String value) {
            TagLabel.State constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("jsonschema2pojo")
    public enum TagSource {

        CLASSIFICATION("Classification"),
        GLOSSARY("Glossary"),
        DLACLASSIFICATION("Dlaclassification"),
        SPDCLASSIFICATION("Spdclassification"),
        AUTOSYSTEMCLASSIFICATION("Autosystemclassification"),
        USERESKCLASSIFICATION("Usereskclassification"),
        KNOWLEDGE_CENTER("KnowledgeCenter"),
        CLIENT_CENTER("ClientCenter");
        private final String value;
        private final static Map<String, TagLabel.TagSource> CONSTANTS = new HashMap<String, TagLabel.TagSource>();

        static {
            for (TagLabel.TagSource c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TagSource(String value) {
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
        public static TagLabel.TagSource fromValue(String value) {
            TagLabel.TagSource constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
