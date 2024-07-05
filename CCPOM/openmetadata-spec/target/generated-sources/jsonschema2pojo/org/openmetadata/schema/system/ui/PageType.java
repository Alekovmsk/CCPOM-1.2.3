
package org.openmetadata.schema.system.ui;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the type used for describing different types of pages.
 * 
 */
@Generated("jsonschema2pojo")
public enum PageType {

    LANDING_PAGE("LandingPage"),
    TABLE_LANDING_PAGE("TableLandingPage"),
    STORED_PROCEDURE_LANDING_PAGE("StoredProcedureLandingPage"),
    DATABASE_LANDING_PAGE("DatabaseLandingPage"),
    DATABASE_SCHEMA_LANDING_PAGE("DatabaseSchemaLandingPage"),
    TOPIC_LANDING_PAGE("TopicLandingPage"),
    PIPELINE_LANDING_PAGE("PipelineLandingPage"),
    DASHBOARD_LANDING_PAGE("DashboardLandingPage"),
    DASHBOARD_DATA_MODEL_LANDING_PAGE("DashboardDataModelLandingPage"),
    CONTAINER_LANDING_PAGE("ContainerLandingPage"),
    SEARCH_INDEX_LANDING_PAGE("SearchIndexLandingPage"),
    GLOSSARY_LANDING_PAGE("GlossaryLandingPage"),
    GLOSSARY_TERM_LANDING_PAGE("GlossaryTermLandingPage"),
    DOMAIN_LANDING_PAGE("DomainLandingPage");
    private final String value;
    private final static Map<String, PageType> CONSTANTS = new HashMap<String, PageType>();

    static {
        for (PageType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PageType(String value) {
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
    public static PageType fromValue(String value) {
        PageType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
