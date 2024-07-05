
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * TableConstraint
 * <p>
 * This enum defines the type for table constraint.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "constraintType",
    "columns",
    "referredColumns"
})
@Generated("jsonschema2pojo")
public class TableConstraint {

    @JsonProperty("constraintType")
    private TableConstraint.ConstraintType constraintType;
    /**
     * List of column names corresponding to the constraint.
     * 
     */
    @JsonProperty("columns")
    @JsonPropertyDescription("List of column names corresponding to the constraint.")
    @Valid
    private List<String> columns = new ArrayList<String>();
    /**
     * List of referred columns for the constraint.
     * 
     */
    @JsonProperty("referredColumns")
    @JsonPropertyDescription("List of referred columns for the constraint.")
    @Valid
    private List<String> referredColumns = null;

    @JsonProperty("constraintType")
    public TableConstraint.ConstraintType getConstraintType() {
        return constraintType;
    }

    @JsonProperty("constraintType")
    public void setConstraintType(TableConstraint.ConstraintType constraintType) {
        this.constraintType = constraintType;
    }

    public TableConstraint withConstraintType(TableConstraint.ConstraintType constraintType) {
        this.constraintType = constraintType;
        return this;
    }

    /**
     * List of column names corresponding to the constraint.
     * 
     */
    @JsonProperty("columns")
    public List<String> getColumns() {
        return columns;
    }

    /**
     * List of column names corresponding to the constraint.
     * 
     */
    @JsonProperty("columns")
    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public TableConstraint withColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * List of referred columns for the constraint.
     * 
     */
    @JsonProperty("referredColumns")
    public List<String> getReferredColumns() {
        return referredColumns;
    }

    /**
     * List of referred columns for the constraint.
     * 
     */
    @JsonProperty("referredColumns")
    public void setReferredColumns(List<String> referredColumns) {
        this.referredColumns = referredColumns;
    }

    public TableConstraint withReferredColumns(List<String> referredColumns) {
        this.referredColumns = referredColumns;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TableConstraint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("constraintType");
        sb.append('=');
        sb.append(((this.constraintType == null)?"<null>":this.constraintType));
        sb.append(',');
        sb.append("columns");
        sb.append('=');
        sb.append(((this.columns == null)?"<null>":this.columns));
        sb.append(',');
        sb.append("referredColumns");
        sb.append('=');
        sb.append(((this.referredColumns == null)?"<null>":this.referredColumns));
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
        result = ((result* 31)+((this.constraintType == null)? 0 :this.constraintType.hashCode()));
        result = ((result* 31)+((this.referredColumns == null)? 0 :this.referredColumns.hashCode()));
        result = ((result* 31)+((this.columns == null)? 0 :this.columns.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableConstraint) == false) {
            return false;
        }
        TableConstraint rhs = ((TableConstraint) other);
        return ((((this.constraintType == rhs.constraintType)||((this.constraintType!= null)&&this.constraintType.equals(rhs.constraintType)))&&((this.referredColumns == rhs.referredColumns)||((this.referredColumns!= null)&&this.referredColumns.equals(rhs.referredColumns))))&&((this.columns == rhs.columns)||((this.columns!= null)&&this.columns.equals(rhs.columns))));
    }

    @Generated("jsonschema2pojo")
    public enum ConstraintType {

        UNIQUE("UNIQUE"),
        PRIMARY_KEY("PRIMARY_KEY"),
        FOREIGN_KEY("FOREIGN_KEY"),
        SORT_KEY("SORT_KEY"),
        DIST_KEY("DIST_KEY");
        private final String value;
        private final static Map<String, TableConstraint.ConstraintType> CONSTANTS = new HashMap<String, TableConstraint.ConstraintType>();

        static {
            for (TableConstraint.ConstraintType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ConstraintType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static TableConstraint.ConstraintType fromValue(String value) {
            TableConstraint.ConstraintType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
