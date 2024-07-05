
package org.openmetadata.schema.metadataIngestion;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * ApplicationPipeline
 * <p>
 * Application Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "entityFullyQualifiedName"
})
@Generated("jsonschema2pojo")
public class ApplicationPipeline {

    /**
     * Pipeline Source Config For Application Pipeline type
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Pipeline Source Config For Application Pipeline type")
    @NotNull
    private ApplicationPipeline.TestSuiteConfigType type = ApplicationPipeline.TestSuiteConfigType.fromValue("Application");
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("entityFullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    @NotNull
    private String entityFullyQualifiedName;

    /**
     * Pipeline Source Config For Application Pipeline type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public ApplicationPipeline.TestSuiteConfigType getType() {
        return type;
    }

    /**
     * Pipeline Source Config For Application Pipeline type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(ApplicationPipeline.TestSuiteConfigType type) {
        this.type = type;
    }

    public ApplicationPipeline withType(ApplicationPipeline.TestSuiteConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("entityFullyQualifiedName")
    public String getEntityFullyQualifiedName() {
        return entityFullyQualifiedName;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("entityFullyQualifiedName")
    public void setEntityFullyQualifiedName(String entityFullyQualifiedName) {
        this.entityFullyQualifiedName = entityFullyQualifiedName;
    }

    public ApplicationPipeline withEntityFullyQualifiedName(String entityFullyQualifiedName) {
        this.entityFullyQualifiedName = entityFullyQualifiedName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("entityFullyQualifiedName");
        sb.append('=');
        sb.append(((this.entityFullyQualifiedName == null)?"<null>":this.entityFullyQualifiedName));
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
        result = ((result* 31)+((this.entityFullyQualifiedName == null)? 0 :this.entityFullyQualifiedName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationPipeline) == false) {
            return false;
        }
        ApplicationPipeline rhs = ((ApplicationPipeline) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.entityFullyQualifiedName == rhs.entityFullyQualifiedName)||((this.entityFullyQualifiedName!= null)&&this.entityFullyQualifiedName.equals(rhs.entityFullyQualifiedName))));
    }


    /**
     * Pipeline Source Config For Application Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum TestSuiteConfigType {

        APPLICATION("Application");
        private final String value;
        private final static Map<String, ApplicationPipeline.TestSuiteConfigType> CONSTANTS = new HashMap<String, ApplicationPipeline.TestSuiteConfigType>();

        static {
            for (ApplicationPipeline.TestSuiteConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TestSuiteConfigType(String value) {
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
        public static ApplicationPipeline.TestSuiteConfigType fromValue(String value) {
            ApplicationPipeline.TestSuiteConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
