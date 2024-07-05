
package org.openmetadata.schema.type.csv;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * csvFile
 * <p>
 * Represents a CSV file.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "headers",
    "records"
})
@Generated("jsonschema2pojo")
public class CsvFile {

    @JsonProperty("headers")
    @Valid
    private List<CsvHeader> headers = new ArrayList<CsvHeader>();
    @JsonProperty("records")
    @Valid
    private List<List<String>> records = new ArrayList<List<String>>();

    @JsonProperty("headers")
    public List<CsvHeader> getHeaders() {
        return headers;
    }

    @JsonProperty("headers")
    public void setHeaders(List<CsvHeader> headers) {
        this.headers = headers;
    }

    public CsvFile withHeaders(List<CsvHeader> headers) {
        this.headers = headers;
        return this;
    }

    @JsonProperty("records")
    public List<List<String>> getRecords() {
        return records;
    }

    @JsonProperty("records")
    public void setRecords(List<List<String>> records) {
        this.records = records;
    }

    public CsvFile withRecords(List<List<String>> records) {
        this.records = records;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CsvFile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("headers");
        sb.append('=');
        sb.append(((this.headers == null)?"<null>":this.headers));
        sb.append(',');
        sb.append("records");
        sb.append('=');
        sb.append(((this.records == null)?"<null>":this.records));
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
        result = ((result* 31)+((this.headers == null)? 0 :this.headers.hashCode()));
        result = ((result* 31)+((this.records == null)? 0 :this.records.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CsvFile) == false) {
            return false;
        }
        CsvFile rhs = ((CsvFile) other);
        return (((this.headers == rhs.headers)||((this.headers!= null)&&this.headers.equals(rhs.headers)))&&((this.records == rhs.records)||((this.records!= null)&&this.records.equals(rhs.records))));
    }

}
