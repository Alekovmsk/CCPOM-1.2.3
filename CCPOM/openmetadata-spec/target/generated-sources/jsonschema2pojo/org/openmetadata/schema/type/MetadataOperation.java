
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines all possible operations on metadata of entities in OpenMetadata.
 * 
 */
@Generated("jsonschema2pojo")
public enum MetadataOperation {

    ALL("All"),
    CREATE("Create"),
    DELETE("Delete"),
    VIEW_ALL("ViewAll"),
    VIEW_BASIC("ViewBasic"),
    VIEW_USAGE("ViewUsage"),
    VIEW_TESTS("ViewTests"),
    VIEW_QUERIES("ViewQueries"),
    VIEW_DATA_PROFILE("ViewDataProfile"),
    VIEW_SAMPLE_DATA("ViewSampleData"),
    EDIT_ALL("EditAll"),
    EDIT_CUSTOM_FIELDS("EditCustomFields"),
    EDIT_DATA_PROFILE("EditDataProfile"),
    EDIT_DESCRIPTION("EditDescription"),
    EDIT_DISPLAY_NAME("EditDisplayName"),
    EDIT_LINEAGE("EditLineage"),
    EDIT_POLICY("EditPolicy"),
    EDIT_OWNER("EditOwner"),
    EDIT_QUERIES("EditQueries"),
    EDIT_REVIEWERS("EditReviewers"),
    EDIT_ROLE("EditRole"),
    EDIT_SAMPLE_DATA("EditSampleData"),
    EDIT_STATUS("EditStatus"),
    EDIT_TAGS("EditTags"),
    EDIT_TEAMS("EditTeams"),
    EDIT_TIER("EditTier"),
    EDIT_TESTS("EditTests"),
    EDIT_USAGE("EditUsage"),
    EDIT_USERS("EditUsers"),
    EDIT_LIFE_CYCLE("EditLifeCycle"),
    EDIT_KNOWLEDGE_PANEL("EditKnowledgePanel"),
    EDIT_PAGE("EditPage");
    private final String value;
    private final static Map<String, MetadataOperation> CONSTANTS = new HashMap<String, MetadataOperation>();

    static {
        for (MetadataOperation c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MetadataOperation(String value) {
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
    public static MetadataOperation fromValue(String value) {
        MetadataOperation constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
