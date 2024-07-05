
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the type used for describing different types of charts.
 * 
 */
@Generated("jsonschema2pojo")
public enum ChartType {

    Line("Line"),
    Table("Table"),
    Bar("Bar"),
    Area("Area"),
    Pie("Pie"),
    Histogram("Histogram"),
    Scatter("Scatter"),
    Text("Text"),
    BoxPlot("BoxPlot"),
    Other("Other");
    private final String value;
    private final static Map<String, ChartType> CONSTANTS = new HashMap<String, ChartType>();

    static {
        for (ChartType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ChartType(String value) {
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
    public static ChartType fromValue(String value) {
        ChartType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
