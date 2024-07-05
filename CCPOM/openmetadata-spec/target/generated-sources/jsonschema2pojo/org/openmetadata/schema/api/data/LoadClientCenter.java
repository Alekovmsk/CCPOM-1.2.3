
package org.openmetadata.schema.api.data;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * loadClientCenter
 * <p>
 * Load a ClientCenter
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "createClientCenter",
    "createClients"
})
@Generated("jsonschema2pojo")
public class LoadClientCenter {

    /**
     * CreateClientCenterRequest
     * <p>
     * Create Client center entity request
     * (Required)
     * 
     */
    @JsonProperty("createClientCenter")
    @JsonPropertyDescription("Create Client center entity request")
    @Valid
    @NotNull
    private CreateClientCenter createClientCenter;
    @JsonProperty("createClients")
    @Size(min = 1)
    @Valid
    private List<CreateClientCenterClient> createClients = new ArrayList<CreateClientCenterClient>();

    /**
     * CreateClientCenterRequest
     * <p>
     * Create Client center entity request
     * (Required)
     * 
     */
    @JsonProperty("createClientCenter")
    public CreateClientCenter getCreateClientCenter() {
        return createClientCenter;
    }

    /**
     * CreateClientCenterRequest
     * <p>
     * Create Client center entity request
     * (Required)
     * 
     */
    @JsonProperty("createClientCenter")
    public void setCreateClientCenter(CreateClientCenter createClientCenter) {
        this.createClientCenter = createClientCenter;
    }

    public LoadClientCenter withCreateClientCenter(CreateClientCenter createClientCenter) {
        this.createClientCenter = createClientCenter;
        return this;
    }

    @JsonProperty("createClients")
    public List<CreateClientCenterClient> getCreateClients() {
        return createClients;
    }

    @JsonProperty("createClients")
    public void setCreateClients(List<CreateClientCenterClient> createClients) {
        this.createClients = createClients;
    }

    public LoadClientCenter withCreateClients(List<CreateClientCenterClient> createClients) {
        this.createClients = createClients;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoadClientCenter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("createClientCenter");
        sb.append('=');
        sb.append(((this.createClientCenter == null)?"<null>":this.createClientCenter));
        sb.append(',');
        sb.append("createClients");
        sb.append('=');
        sb.append(((this.createClients == null)?"<null>":this.createClients));
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
        result = ((result* 31)+((this.createClientCenter == null)? 0 :this.createClientCenter.hashCode()));
        result = ((result* 31)+((this.createClients == null)? 0 :this.createClients.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadClientCenter) == false) {
            return false;
        }
        LoadClientCenter rhs = ((LoadClientCenter) other);
        return (((this.createClientCenter == rhs.createClientCenter)||((this.createClientCenter!= null)&&this.createClientCenter.equals(rhs.createClientCenter)))&&((this.createClients == rhs.createClients)||((this.createClients!= null)&&this.createClients.equals(rhs.createClients))));
    }

}
