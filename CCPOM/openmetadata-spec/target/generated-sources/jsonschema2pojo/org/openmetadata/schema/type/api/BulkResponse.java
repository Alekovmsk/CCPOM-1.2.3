
package org.openmetadata.schema.type.api;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Request that can be processed successfully.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "request",
    "message"
})
@Generated("jsonschema2pojo")
public class BulkResponse {

    /**
     * Request that can be processed successfully.
     * 
     */
    @JsonProperty("request")
    @JsonPropertyDescription("Request that can be processed successfully.")
    private Object request;
    /**
     * Message for the request.
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Message for the request.")
    private String message;

    /**
     * Request that can be processed successfully.
     * 
     */
    @JsonProperty("request")
    public Object getRequest() {
        return request;
    }

    /**
     * Request that can be processed successfully.
     * 
     */
    @JsonProperty("request")
    public void setRequest(Object request) {
        this.request = request;
    }

    public BulkResponse withRequest(Object request) {
        this.request = request;
        return this;
    }

    /**
     * Message for the request.
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Message for the request.
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public BulkResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BulkResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
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
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BulkResponse) == false) {
            return false;
        }
        BulkResponse rhs = ((BulkResponse) other);
        return (((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message)))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))));
    }

}
