
package org.openmetadata.schema.api.data;

import java.net.URI;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "endpoint"
})
@Generated("jsonschema2pojo")
public class TermReference {

    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name that identifies the source of an external glossary term. Example `HealthCare.gov`.")
    private String name;
    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("endpoint")
    @JsonPropertyDescription("Name that identifies the source of an external glossary term. Example `HealthCare.gov`.")
    private URI endpoint;

    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public TermReference withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("endpoint")
    public URI getEndpoint() {
        return endpoint;
    }

    /**
     * Name that identifies the source of an external glossary term. Example `HealthCare.gov`.
     * 
     */
    @JsonProperty("endpoint")
    public void setEndpoint(URI endpoint) {
        this.endpoint = endpoint;
    }

    public TermReference withEndpoint(URI endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TermReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("endpoint");
        sb.append('=');
        sb.append(((this.endpoint == null)?"<null>":this.endpoint));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.endpoint == null)? 0 :this.endpoint.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TermReference) == false) {
            return false;
        }
        TermReference rhs = ((TermReference) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.endpoint == rhs.endpoint)||((this.endpoint!= null)&&this.endpoint.equals(rhs.endpoint))));
    }

}
