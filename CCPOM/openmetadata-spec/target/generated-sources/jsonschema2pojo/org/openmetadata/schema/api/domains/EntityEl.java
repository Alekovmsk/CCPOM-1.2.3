
package org.openmetadata.schema.api.domains;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "db",
    "schema",
    "name"
})
@Generated("jsonschema2pojo")
public class EntityEl {

    /**
     * Entity db
     * 
     */
    @JsonProperty("db")
    @JsonPropertyDescription("Entity db")
    private String db;
    /**
     * Entity schema
     * 
     */
    @JsonProperty("schema")
    @JsonPropertyDescription("Entity schema")
    private String schema;
    /**
     * Entity name
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Entity name")
    private String name;

    /**
     * Entity db
     * 
     */
    @JsonProperty("db")
    public String getDb() {
        return db;
    }

    /**
     * Entity db
     * 
     */
    @JsonProperty("db")
    public void setDb(String db) {
        this.db = db;
    }

    public EntityEl withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * Entity schema
     * 
     */
    @JsonProperty("schema")
    public String getSchema() {
        return schema;
    }

    /**
     * Entity schema
     * 
     */
    @JsonProperty("schema")
    public void setSchema(String schema) {
        this.schema = schema;
    }

    public EntityEl withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Entity name
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Entity name
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public EntityEl withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntityEl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("db");
        sb.append('=');
        sb.append(((this.db == null)?"<null>":this.db));
        sb.append(',');
        sb.append("schema");
        sb.append('=');
        sb.append(((this.schema == null)?"<null>":this.schema));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.schema == null)? 0 :this.schema.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.db == null)? 0 :this.db.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntityEl) == false) {
            return false;
        }
        EntityEl rhs = ((EntityEl) other);
        return ((((this.schema == rhs.schema)||((this.schema!= null)&&this.schema.equals(rhs.schema)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.db == rhs.db)||((this.db!= null)&&this.db.equals(rhs.db))));
    }

}
