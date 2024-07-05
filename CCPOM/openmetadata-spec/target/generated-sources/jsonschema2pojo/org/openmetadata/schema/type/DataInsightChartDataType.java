
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Data type of the parameter (int, date etc.).
 * 
 */
@Generated("jsonschema2pojo")
public enum DataInsightChartDataType {

    NUMBER("NUMBER"),
    INT("INT"),
    FLOAT("FLOAT"),
    DOUBLE("DOUBLE"),
    DECIMAL("DECIMAL"),
    TIMESTAMP("TIMESTAMP"),
    TIME("TIME"),
    DATE("DATE"),
    DATETIME("DATETIME"),
    ARRAY("ARRAY"),
    MAP("MAP"),
    SET("SET"),
    STRING("STRING"),
    BOOLEAN("BOOLEAN"),
    PERCENTAGE("PERCENTAGE");
    private final String value;
    private final static Map<String, DataInsightChartDataType> CONSTANTS = new HashMap<String, DataInsightChartDataType>();

    static {
        for (DataInsightChartDataType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DataInsightChartDataType(String value) {
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
    public static DataInsightChartDataType fromValue(String value) {
        DataInsightChartDataType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
