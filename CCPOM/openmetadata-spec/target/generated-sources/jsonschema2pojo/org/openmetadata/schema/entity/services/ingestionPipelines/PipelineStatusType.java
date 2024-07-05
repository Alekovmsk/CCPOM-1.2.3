
package org.openmetadata.schema.entity.services.ingestionPipelines;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Pipeline status denotes if its failed or succeeded.
 * 
 */
@Generated("jsonschema2pojo")
public enum PipelineStatusType {

    QUEUED("queued"),
    SUCCESS("success"),
    FAILED("failed"),
    RUNNING("running"),
    PARTIAL_SUCCESS("partialSuccess");
    private final String value;
    private final static Map<String, PipelineStatusType> CONSTANTS = new HashMap<String, PipelineStatusType>();

    static {
        for (PipelineStatusType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PipelineStatusType(String value) {
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
    public static PipelineStatusType fromValue(String value) {
        PipelineStatusType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
