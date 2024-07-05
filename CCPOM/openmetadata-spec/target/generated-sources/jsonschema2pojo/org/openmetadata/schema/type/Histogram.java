
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Histogram of a column.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "boundaries",
    "frequencies"
})
@Generated("jsonschema2pojo")
public class Histogram {

    /**
     * Boundaries of Histogram.
     * 
     */
    @JsonProperty("boundaries")
    @JsonPropertyDescription("Boundaries of Histogram.")
    @Valid
    private List<Object> boundaries = new ArrayList<Object>();
    /**
     * Frequencies of Histogram.
     * 
     */
    @JsonProperty("frequencies")
    @JsonPropertyDescription("Frequencies of Histogram.")
    @Valid
    private List<Object> frequencies = new ArrayList<Object>();

    /**
     * Boundaries of Histogram.
     * 
     */
    @JsonProperty("boundaries")
    public List<Object> getBoundaries() {
        return boundaries;
    }

    /**
     * Boundaries of Histogram.
     * 
     */
    @JsonProperty("boundaries")
    public void setBoundaries(List<Object> boundaries) {
        this.boundaries = boundaries;
    }

    public Histogram withBoundaries(List<Object> boundaries) {
        this.boundaries = boundaries;
        return this;
    }

    /**
     * Frequencies of Histogram.
     * 
     */
    @JsonProperty("frequencies")
    public List<Object> getFrequencies() {
        return frequencies;
    }

    /**
     * Frequencies of Histogram.
     * 
     */
    @JsonProperty("frequencies")
    public void setFrequencies(List<Object> frequencies) {
        this.frequencies = frequencies;
    }

    public Histogram withFrequencies(List<Object> frequencies) {
        this.frequencies = frequencies;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Histogram.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("boundaries");
        sb.append('=');
        sb.append(((this.boundaries == null)?"<null>":this.boundaries));
        sb.append(',');
        sb.append("frequencies");
        sb.append('=');
        sb.append(((this.frequencies == null)?"<null>":this.frequencies));
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
        result = ((result* 31)+((this.boundaries == null)? 0 :this.boundaries.hashCode()));
        result = ((result* 31)+((this.frequencies == null)? 0 :this.frequencies.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Histogram) == false) {
            return false;
        }
        Histogram rhs = ((Histogram) other);
        return (((this.boundaries == rhs.boundaries)||((this.boundaries!= null)&&this.boundaries.equals(rhs.boundaries)))&&((this.frequencies == rhs.frequencies)||((this.frequencies!= null)&&this.frequencies.equals(rhs.frequencies))));
    }

}
