
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This enum captures all the relationships between Catalog entities. Note that the relationship from is a Strong entity and to is Weak entity when possible.Rules for changing enums since the ordinal position is stored in the database: (1) Don't remove an enum, since the database might have stored the enum ordinal number. (2) When adding a new enum, add it as the last enum to preserve the ordinal positions of the existing enums.
 * 
 */
@Generated("jsonschema2pojo")
public enum Relationship {

    CONTAINS("contains"),
    CREATED("createdBy"),
    REPLIED_TO("repliedTo"),
    IS_ABOUT("isAbout"),
    ADDRESSED_TO("addressedTo"),
    MENTIONED_IN("mentionedIn"),
    TESTED_BY("testedBy"),
    USES("uses"),
    OWNS("owns"),
    PARENT_OF("parentOf"),
    HAS("has"),
    FOLLOWS("follows"),
    JOINED_WITH("joinedWith"),
    UPSTREAM("upstream"),
    APPLIED_TO("appliedTo"),
    RELATED_TO("relatedTo"),
    REVIEWS("reviews"),
    REACTED_TO("reactedTo"),
    VOTED("voted"),
    EXPERT("expert"),
    EDITED_BY("editedBy"),
    DEFAULTS_TO("defaultsTo"),
    COMES_FROM("comesFrom");
    private final String value;
    private final static Map<String, Relationship> CONSTANTS = new HashMap<String, Relationship>();

    static {
        for (Relationship c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Relationship(String value) {
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
    public static Relationship fromValue(String value) {
        Relationship constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
