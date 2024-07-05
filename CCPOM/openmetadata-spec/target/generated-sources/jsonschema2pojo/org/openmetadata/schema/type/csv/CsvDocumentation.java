
package org.openmetadata.schema.type.csv;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * csvDocumentation
 * <p>
 * Documentation for CSV file that describes headers and example values.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "summary",
    "headers"
})
@Generated("jsonschema2pojo")
public class CsvDocumentation {

    /**
     * Summary documentation for CSV file.
     * (Required)
     * 
     */
    @JsonProperty("summary")
    @JsonPropertyDescription("Summary documentation for CSV file.")
    @NotNull
    private String summary;
    /**
     * Documentation for CSV file header
     * (Required)
     * 
     */
    @JsonProperty("headers")
    @JsonPropertyDescription("Documentation for CSV file header")
    @Valid
    @NotNull
    private List<CsvHeader> headers = new ArrayList<CsvHeader>();

    /**
     * Summary documentation for CSV file.
     * (Required)
     * 
     */
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    /**
     * Summary documentation for CSV file.
     * (Required)
     * 
     */
    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public CsvDocumentation withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Documentation for CSV file header
     * (Required)
     * 
     */
    @JsonProperty("headers")
    public List<CsvHeader> getHeaders() {
        return headers;
    }

    /**
     * Documentation for CSV file header
     * (Required)
     * 
     */
    @JsonProperty("headers")
    public void setHeaders(List<CsvHeader> headers) {
        this.headers = headers;
    }

    public CsvDocumentation withHeaders(List<CsvHeader> headers) {
        this.headers = headers;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CsvDocumentation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("headers");
        sb.append('=');
        sb.append(((this.headers == null)?"<null>":this.headers));
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
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.headers == null)? 0 :this.headers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CsvDocumentation) == false) {
            return false;
        }
        CsvDocumentation rhs = ((CsvDocumentation) other);
        return (((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary)))&&((this.headers == rhs.headers)||((this.headers!= null)&&this.headers.equals(rhs.headers))));
    }

}
