
package org.openmetadata.schema.entity.services.ingestionPipelines;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Type of Pipeline - metadata, usage
 * 
 */
@Generated("jsonschema2pojo")
public enum PipelineType {

    METADATA("metadata"),
    USAGE("usage"),
    LINEAGE("lineage"),
    PROFILER("profiler"),
    TEST_SUITE("TestSuite"),
    DATA_INSIGHT("dataInsight"),
    ELASTIC_SEARCH_REINDEX("elasticSearchReindex"),
    DBT("dbt"),
    APPLICATION("Application");
    private final String value;
    private final static Map<String, PipelineType> CONSTANTS = new HashMap<String, PipelineType>();

    static {
        for (PipelineType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PipelineType(String value) {
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
    public static PipelineType fromValue(String value) {
        PipelineType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
