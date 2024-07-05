
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Query Parser Data
 * <p>
 * This schema defines type of query parser data
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "parsedData"
})
@Generated("jsonschema2pojo")
public class QueryParserData {

    @JsonProperty("parsedData")
    @Valid
    private List<ParsedData> parsedData = new ArrayList<ParsedData>();

    @JsonProperty("parsedData")
    public List<ParsedData> getParsedData() {
        return parsedData;
    }

    @JsonProperty("parsedData")
    public void setParsedData(List<ParsedData> parsedData) {
        this.parsedData = parsedData;
    }

    public QueryParserData withParsedData(List<ParsedData> parsedData) {
        this.parsedData = parsedData;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QueryParserData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("parsedData");
        sb.append('=');
        sb.append(((this.parsedData == null)?"<null>":this.parsedData));
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
        result = ((result* 31)+((this.parsedData == null)? 0 :this.parsedData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QueryParserData) == false) {
            return false;
        }
        QueryParserData rhs = ((QueryParserData) other);
        return ((this.parsedData == rhs.parsedData)||((this.parsedData!= null)&&this.parsedData.equals(rhs.parsedData)));
    }

}
