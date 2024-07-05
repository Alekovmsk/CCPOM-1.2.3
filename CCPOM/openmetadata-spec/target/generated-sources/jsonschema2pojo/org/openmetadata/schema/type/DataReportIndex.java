
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Index where data are stored
 * 
 */
@Generated("jsonschema2pojo")
public enum DataReportIndex {

    ENTITY_REPORT_DATA_INDEX("entity_report_data_index"),
    WEB_ANALYTIC_ENTITY_VIEW_REPORT_DATA_INDEX("web_analytic_entity_view_report_data_index"),
    WEB_ANALYTIC_USER_ACTIVITY_REPORT_DATA_INDEX("web_analytic_user_activity_report_data_index"),
    RAW_COST_ANALYSIS_REPORT_DATA_INDEX("raw_cost_analysis_report_data_index"),
    AGGREGATED_COST_ANALYSIS_REPORT_DATA_INDEX("aggregated_cost_analysis_report_data_index");
    private final String value;
    private final static Map<String, DataReportIndex> CONSTANTS = new HashMap<String, DataReportIndex>();

    static {
        for (DataReportIndex c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DataReportIndex(String value) {
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
    public static DataReportIndex fromValue(String value) {
        DataReportIndex constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
