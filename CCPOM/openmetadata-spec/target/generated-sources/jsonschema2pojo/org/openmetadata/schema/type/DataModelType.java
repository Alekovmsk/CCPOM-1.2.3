
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the type used for describing different types of data models.Data Model types supported.
 * 
 */
@Generated("jsonschema2pojo")
public enum DataModelType {

    TableauDataModel("TableauDataModel"),
    SupersetDataModel("SupersetDataModel"),
    MetabaseDataModel("MetabaseDataModel"),
    LookMlView("LookMlView"),
    LookMlExplore("LookMlExplore"),
    PowerBIDataModel("PowerBIDataModel"),
    QlikSenseDataModel("QlikSenseDataModel");
    private final String value;
    private final static Map<String, DataModelType> CONSTANTS = new HashMap<String, DataModelType>();

    static {
        for (DataModelType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DataModelType(String value) {
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
    public static DataModelType fromValue(String value) {
        DataModelType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
