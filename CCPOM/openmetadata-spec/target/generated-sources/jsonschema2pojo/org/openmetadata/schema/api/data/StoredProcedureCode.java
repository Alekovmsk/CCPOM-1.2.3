
package org.openmetadata.schema.api.data;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.StoredProcedureLanguage;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "language",
    "code"
})
@Generated("jsonschema2pojo")
public class StoredProcedureCode {

    /**
     * This schema defines the type of the language used for Stored Procedure's Code.
     * 
     */
    @JsonProperty("language")
    @JsonPropertyDescription("This schema defines the type of the language used for Stored Procedure's Code.")
    private StoredProcedureLanguage language;
    /**
     * This schema defines the type of the language used for Stored Procedure's Code.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("This schema defines the type of the language used for Stored Procedure's Code.")
    private String code;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * This schema defines the type of the language used for Stored Procedure's Code.
     * 
     */
    @JsonProperty("language")
    public StoredProcedureLanguage getLanguage() {
        return language;
    }

    /**
     * This schema defines the type of the language used for Stored Procedure's Code.
     * 
     */
    @JsonProperty("language")
    public void setLanguage(StoredProcedureLanguage language) {
        this.language = language;
    }

    public StoredProcedureCode withLanguage(StoredProcedureLanguage language) {
        this.language = language;
        return this;
    }

    /**
     * This schema defines the type of the language used for Stored Procedure's Code.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * This schema defines the type of the language used for Stored Procedure's Code.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public StoredProcedureCode withCode(String code) {
        this.code = code;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public StoredProcedureCode withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StoredProcedureCode.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StoredProcedureCode) == false) {
            return false;
        }
        StoredProcedureCode rhs = ((StoredProcedureCode) other);
        return ((((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
