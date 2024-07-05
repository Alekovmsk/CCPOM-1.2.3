
package org.openmetadata.schema.metadataIngestion;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * DataInsightPipeline
 * <p>
 * Data Insight Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type"
})
@Generated("jsonschema2pojo")
public class DataInsightPipeline {

    /**
     * Pipeline Source Config Metadata Pipeline type
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Pipeline Source Config Metadata Pipeline type")
    @NotNull
    private DataInsightPipeline.DataInsightConfigType type = DataInsightPipeline.DataInsightConfigType.fromValue("dataInsight");

    /**
     * Pipeline Source Config Metadata Pipeline type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public DataInsightPipeline.DataInsightConfigType getType() {
        return type;
    }

    /**
     * Pipeline Source Config Metadata Pipeline type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(DataInsightPipeline.DataInsightConfigType type) {
        this.type = type;
    }

    public DataInsightPipeline withType(DataInsightPipeline.DataInsightConfigType type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataInsightPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataInsightPipeline) == false) {
            return false;
        }
        DataInsightPipeline rhs = ((DataInsightPipeline) other);
        return ((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)));
    }


    /**
     * Pipeline Source Config Metadata Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DataInsightConfigType {

        DATA_INSIGHT("dataInsight");
        private final String value;
        private final static Map<String, DataInsightPipeline.DataInsightConfigType> CONSTANTS = new HashMap<String, DataInsightPipeline.DataInsightConfigType>();

        static {
            for (DataInsightPipeline.DataInsightConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DataInsightConfigType(String value) {
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
        public static DataInsightPipeline.DataInsightConfigType fromValue(String value) {
            DataInsightPipeline.DataInsightConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
