
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.entity.policies.accessControl.Rule;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "operation",
    "access",
    "rule",
    "policy",
    "role"
})
@Generated("jsonschema2pojo")
public class Permission {

    /**
     * This schema defines all possible operations on metadata of entities in OpenMetadata.
     * 
     */
    @JsonProperty("operation")
    @JsonPropertyDescription("This schema defines all possible operations on metadata of entities in OpenMetadata.")
    private MetadataOperation operation;
    /**
     * Access decided after evaluating rules in a policy. Note the access is defined in the order of precedence.
     * 
     */
    @JsonProperty("access")
    @JsonPropertyDescription("Access decided after evaluating rules in a policy. Note the access is defined in the order of precedence.")
    private Permission.Access access;
    /**
     * Rule
     * <p>
     * Describes an Access Control Rule for OpenMetadata Metadata Operations. All non-null user (subject) and entity (object) attributes are evaluated with logical AND.
     * 
     */
    @JsonProperty("rule")
    @JsonPropertyDescription("Describes an Access Control Rule for OpenMetadata Metadata Operations. All non-null user (subject) and entity (object) attributes are evaluated with logical AND.")
    @Valid
    private Rule rule;
    /**
     * Name of the policy where the `rule` is from.
     * 
     */
    @JsonProperty("policy")
    @JsonPropertyDescription("Name of the policy where the `rule` is from.")
    private String policy;
    /**
     * Name of the role where the `policy` is from. If this is not role based policy, `role` is set to null
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("Name of the role where the `policy` is from. If this is not role based policy, `role` is set to null")
    private String role;

    /**
     * This schema defines all possible operations on metadata of entities in OpenMetadata.
     * 
     */
    @JsonProperty("operation")
    public MetadataOperation getOperation() {
        return operation;
    }

    /**
     * This schema defines all possible operations on metadata of entities in OpenMetadata.
     * 
     */
    @JsonProperty("operation")
    public void setOperation(MetadataOperation operation) {
        this.operation = operation;
    }

    public Permission withOperation(MetadataOperation operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Access decided after evaluating rules in a policy. Note the access is defined in the order of precedence.
     * 
     */
    @JsonProperty("access")
    public Permission.Access getAccess() {
        return access;
    }

    /**
     * Access decided after evaluating rules in a policy. Note the access is defined in the order of precedence.
     * 
     */
    @JsonProperty("access")
    public void setAccess(Permission.Access access) {
        this.access = access;
    }

    public Permission withAccess(Permission.Access access) {
        this.access = access;
        return this;
    }

    /**
     * Rule
     * <p>
     * Describes an Access Control Rule for OpenMetadata Metadata Operations. All non-null user (subject) and entity (object) attributes are evaluated with logical AND.
     * 
     */
    @JsonProperty("rule")
    public Rule getRule() {
        return rule;
    }

    /**
     * Rule
     * <p>
     * Describes an Access Control Rule for OpenMetadata Metadata Operations. All non-null user (subject) and entity (object) attributes are evaluated with logical AND.
     * 
     */
    @JsonProperty("rule")
    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public Permission withRule(Rule rule) {
        this.rule = rule;
        return this;
    }

    /**
     * Name of the policy where the `rule` is from.
     * 
     */
    @JsonProperty("policy")
    public String getPolicy() {
        return policy;
    }

    /**
     * Name of the policy where the `rule` is from.
     * 
     */
    @JsonProperty("policy")
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public Permission withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Name of the role where the `policy` is from. If this is not role based policy, `role` is set to null
     * 
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    /**
     * Name of the role where the `policy` is from. If this is not role based policy, `role` is set to null
     * 
     */
    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    public Permission withRole(String role) {
        this.role = role;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Permission.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("operation");
        sb.append('=');
        sb.append(((this.operation == null)?"<null>":this.operation));
        sb.append(',');
        sb.append("access");
        sb.append('=');
        sb.append(((this.access == null)?"<null>":this.access));
        sb.append(',');
        sb.append("rule");
        sb.append('=');
        sb.append(((this.rule == null)?"<null>":this.rule));
        sb.append(',');
        sb.append("policy");
        sb.append('=');
        sb.append(((this.policy == null)?"<null>":this.policy));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
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
        result = ((result* 31)+((this.rule == null)? 0 :this.rule.hashCode()));
        result = ((result* 31)+((this.access == null)? 0 :this.access.hashCode()));
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this.operation == null)? 0 :this.operation.hashCode()));
        result = ((result* 31)+((this.policy == null)? 0 :this.policy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Permission) == false) {
            return false;
        }
        Permission rhs = ((Permission) other);
        return ((((((this.rule == rhs.rule)||((this.rule!= null)&&this.rule.equals(rhs.rule)))&&((this.access == rhs.access)||((this.access!= null)&&this.access.equals(rhs.access))))&&((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role))))&&((this.operation == rhs.operation)||((this.operation!= null)&&this.operation.equals(rhs.operation))))&&((this.policy == rhs.policy)||((this.policy!= null)&&this.policy.equals(rhs.policy))));
    }


    /**
     * Access decided after evaluating rules in a policy. Note the access is defined in the order of precedence.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Access {

        DENY("deny"),
        ALLOW("allow"),
        CONDITIONAL_DENY("conditionalDeny"),
        CONDITIONAL_ALLOW("conditionalAllow"),
        NOT_ALLOW("notAllow");
        private final String value;
        private final static Map<String, Permission.Access> CONSTANTS = new HashMap<String, Permission.Access>();

        static {
            for (Permission.Access c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Access(String value) {
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
        public static Permission.Access fromValue(String value) {
            Permission.Access constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
