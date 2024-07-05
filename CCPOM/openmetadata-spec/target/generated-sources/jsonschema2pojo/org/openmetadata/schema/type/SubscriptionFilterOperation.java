
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines all possible filter operations on metadata of entities in OpenMetadata.
 * 
 */
@Generated("jsonschema2pojo")
public enum SubscriptionFilterOperation {

    matchAnySource("matchAnySource"),
    matchAnyOwnerName("matchAnyOwnerName"),
    matchAnyEntityFqn("matchAnyEntityFqn"),
    matchAnyEntityId("matchAnyEntityId"),
    matchAnyEventType("matchAnyEventType"),
    matchTestResult("matchTestResult"),
    matchUpdatedBy("matchUpdatedBy"),
    matchIngestionPipelineState("matchIngestionPipelineState"),
    matchAnyFieldChange("matchAnyFieldChange");
    private final String value;
    private final static Map<String, SubscriptionFilterOperation> CONSTANTS = new HashMap<String, SubscriptionFilterOperation>();

    static {
        for (SubscriptionFilterOperation c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SubscriptionFilterOperation(String value) {
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
    public static SubscriptionFilterOperation fromValue(String value) {
        SubscriptionFilterOperation constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
