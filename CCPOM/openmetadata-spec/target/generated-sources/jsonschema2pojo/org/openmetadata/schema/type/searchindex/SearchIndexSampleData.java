
package org.openmetadata.schema.type.searchindex;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This schema defines the type to capture sample data for a SearchIndex.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "messages"
})
@Generated("jsonschema2pojo")
public class SearchIndexSampleData {

    /**
     * List of local sample messages for a SearchIndex.
     * 
     */
    @JsonProperty("messages")
    @JsonPropertyDescription("List of local sample messages for a SearchIndex.")
    @Valid
    private List<String> messages = new ArrayList<String>();

    /**
     * List of local sample messages for a SearchIndex.
     * 
     */
    @JsonProperty("messages")
    public List<String> getMessages() {
        return messages;
    }

    /**
     * List of local sample messages for a SearchIndex.
     * 
     */
    @JsonProperty("messages")
    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public SearchIndexSampleData withMessages(List<String> messages) {
        this.messages = messages;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SearchIndexSampleData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("messages");
        sb.append('=');
        sb.append(((this.messages == null)?"<null>":this.messages));
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
        result = ((result* 31)+((this.messages == null)? 0 :this.messages.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SearchIndexSampleData) == false) {
            return false;
        }
        SearchIndexSampleData rhs = ((SearchIndexSampleData) other);
        return ((this.messages == rhs.messages)||((this.messages!= null)&&this.messages.equals(rhs.messages)));
    }

}
