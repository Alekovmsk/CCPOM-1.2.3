
package org.openmetadata.schema.api.domains;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "elNumber",
    "name",
    "type",
    "loadMode",
    "loadObjectsList"
})
@Generated("jsonschema2pojo")
public class DataSourceEl {

    /**
     * Data source number
     * 
     */
    @JsonProperty("elNumber")
    @JsonPropertyDescription("Data source number")
    private String elNumber;
    /**
     * Data source name
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Data source name")
    private String name;
    /**
     * Data source type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Data source type")
    private String type;
    /**
     * Data source data load mode
     * 
     */
    @JsonProperty("loadMode")
    @JsonPropertyDescription("Data source data load mode")
    private String loadMode;
    /**
     * Data source list of loaded objects
     * 
     */
    @JsonProperty("loadObjectsList")
    @JsonPropertyDescription("Data source list of loaded objects")
    private String loadObjectsList;

    /**
     * Data source number
     * 
     */
    @JsonProperty("elNumber")
    public String getElNumber() {
        return elNumber;
    }

    /**
     * Data source number
     * 
     */
    @JsonProperty("elNumber")
    public void setElNumber(String elNumber) {
        this.elNumber = elNumber;
    }

    public DataSourceEl withElNumber(String elNumber) {
        this.elNumber = elNumber;
        return this;
    }

    /**
     * Data source name
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Data source name
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public DataSourceEl withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Data source type
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Data source type
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public DataSourceEl withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Data source data load mode
     * 
     */
    @JsonProperty("loadMode")
    public String getLoadMode() {
        return loadMode;
    }

    /**
     * Data source data load mode
     * 
     */
    @JsonProperty("loadMode")
    public void setLoadMode(String loadMode) {
        this.loadMode = loadMode;
    }

    public DataSourceEl withLoadMode(String loadMode) {
        this.loadMode = loadMode;
        return this;
    }

    /**
     * Data source list of loaded objects
     * 
     */
    @JsonProperty("loadObjectsList")
    public String getLoadObjectsList() {
        return loadObjectsList;
    }

    /**
     * Data source list of loaded objects
     * 
     */
    @JsonProperty("loadObjectsList")
    public void setLoadObjectsList(String loadObjectsList) {
        this.loadObjectsList = loadObjectsList;
    }

    public DataSourceEl withLoadObjectsList(String loadObjectsList) {
        this.loadObjectsList = loadObjectsList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataSourceEl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("elNumber");
        sb.append('=');
        sb.append(((this.elNumber == null)?"<null>":this.elNumber));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("loadMode");
        sb.append('=');
        sb.append(((this.loadMode == null)?"<null>":this.loadMode));
        sb.append(',');
        sb.append("loadObjectsList");
        sb.append('=');
        sb.append(((this.loadObjectsList == null)?"<null>":this.loadObjectsList));
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
        result = ((result* 31)+((this.loadObjectsList == null)? 0 :this.loadObjectsList.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.elNumber == null)? 0 :this.elNumber.hashCode()));
        result = ((result* 31)+((this.loadMode == null)? 0 :this.loadMode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataSourceEl) == false) {
            return false;
        }
        DataSourceEl rhs = ((DataSourceEl) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.loadObjectsList == rhs.loadObjectsList)||((this.loadObjectsList!= null)&&this.loadObjectsList.equals(rhs.loadObjectsList))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.elNumber == rhs.elNumber)||((this.elNumber!= null)&&this.elNumber.equals(rhs.elNumber))))&&((this.loadMode == rhs.loadMode)||((this.loadMode!= null)&&this.loadMode.equals(rhs.loadMode))));
    }

}
