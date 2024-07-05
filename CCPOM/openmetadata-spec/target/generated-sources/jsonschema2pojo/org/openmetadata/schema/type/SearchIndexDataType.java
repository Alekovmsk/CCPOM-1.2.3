
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This enum defines the type of data stored in a searchIndex.
 * 
 */
@Generated("jsonschema2pojo")
public enum SearchIndexDataType {

    NUMBER("NUMBER"),
    TEXT("TEXT"),
    BINARY("BINARY"),
    TIMESTAMP("TIMESTAMP"),
    TIMESTAMPZ("TIMESTAMPZ"),
    TIME("TIME"),
    DATE("DATE"),
    DATETIME("DATETIME"),
    KEYWORD("KEYWORD"),
    ARRAY("ARRAY"),
    OBJECT("OBJECT"),
    FLATTENED("FLATTENED"),
    NESTED("NESTED"),
    JOIN("JOIN"),
    RANGE("RANGE"),
    IP("IP"),
    VERSION("VERSION"),
    MURMUR_3("MURMUR3"),
    AGGREGATE_METRIC_DOUBLE("AGGREGATE_METRIC_DOUBLE"),
    HISTOGRAM("HISTOGRAM"),
    ANNOTATED_TEXT("ANNOTATED-TEXT"),
    COMPLETION("COMPLETION"),
    SEARCH_AS_YOU_TYPE("SEARCH_AS_YOU_TYPE"),
    DENSE_VECTOR("DENSE_VECTOR"),
    RANK_FEATURE("RANK_FEATURE"),
    RANK_FEATURES("RANK_FEATURES"),
    GEO_POINT("GEO_POINT"),
    GEO_SHAPE("GEO_SHAPE"),
    POINT("POINT"),
    SHAPE("SHAPE"),
    PERCOLATOR("PERCOLATOR"),
    BOOLEAN("BOOLEAN"),
    CONSTANT_KEYWORD("CONSTANT_KEYWORD"),
    WILDCARD("WILDCARD"),
    LONG("LONG"),
    INTEGER("INTEGER"),
    SHORT("SHORT"),
    BYTE("BYTE"),
    DOUBLE("DOUBLE"),
    FLOAT("FLOAT"),
    HALF_FLOAT("HALF_FLOAT"),
    SCALED_FLOAT("SCALED_FLOAT"),
    UNSIGNED_LONG("UNSIGNED_LONG"),
    UNKNOWN("UNKNOWN");
    private final String value;
    private final static Map<String, SearchIndexDataType> CONSTANTS = new HashMap<String, SearchIndexDataType>();

    static {
        for (SearchIndexDataType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SearchIndexDataType(String value) {
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
    public static SearchIndexDataType fromValue(String value) {
        SearchIndexDataType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
