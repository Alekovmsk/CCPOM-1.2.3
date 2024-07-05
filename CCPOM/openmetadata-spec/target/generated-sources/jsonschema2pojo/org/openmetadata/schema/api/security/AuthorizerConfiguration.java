
package org.openmetadata.schema.api.security;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * AuthorizerConfiguration
 * <p>
 * This schema defines the Authorization Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "className",
    "containerRequestFilter",
    "adminPrincipals",
    "botPrincipals",
    "testPrincipals",
    "allowedEmailRegistrationDomains",
    "principalDomain",
    "enforcePrincipalDomain",
    "enableSecureSocketConnection"
})
@Generated("jsonschema2pojo")
public class AuthorizerConfiguration {

    /**
     * Class Name for authorizer.
     * (Required)
     * 
     */
    @JsonProperty("className")
    @JsonPropertyDescription("Class Name for authorizer.")
    @NotNull
    private String className;
    /**
     * Filter for the request authorization.
     * (Required)
     * 
     */
    @JsonProperty("containerRequestFilter")
    @JsonPropertyDescription("Filter for the request authorization.")
    @NotNull
    private String containerRequestFilter;
    /**
     * List of unique admin principals.
     * (Required)
     * 
     */
    @JsonProperty("adminPrincipals")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("List of unique admin principals.")
    @Valid
    @NotNull
    private Set<String> adminPrincipals = new LinkedHashSet<String>();
    /**
     * **@Deprecated** List of unique bot principals
     * 
     */
    @JsonProperty("botPrincipals")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("**@Deprecated** List of unique bot principals")
    @Valid
    private Set<String> botPrincipals = null;
    /**
     * List of unique principals used as test users. **NOTE THIS IS ONLY FOR TEST SETUP AND NOT TO BE USED IN PRODUCTION SETUP**
     * 
     */
    @JsonProperty("testPrincipals")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("List of unique principals used as test users. **NOTE THIS IS ONLY FOR TEST SETUP AND NOT TO BE USED IN PRODUCTION SETUP**")
    @Valid
    private Set<String> testPrincipals = new LinkedHashSet<String>();
    /**
     * List of unique email domains that are allowed to signup on the platforms
     * 
     */
    @JsonProperty("allowedEmailRegistrationDomains")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("List of unique email domains that are allowed to signup on the platforms")
    @Valid
    private Set<String> allowedEmailRegistrationDomains = new LinkedHashSet<String>();
    /**
     * Principal Domain
     * (Required)
     * 
     */
    @JsonProperty("principalDomain")
    @JsonPropertyDescription("Principal Domain")
    @NotNull
    private String principalDomain;
    /**
     * Enable Enforce Principal Domain
     * (Required)
     * 
     */
    @JsonProperty("enforcePrincipalDomain")
    @JsonPropertyDescription("Enable Enforce Principal Domain")
    @NotNull
    private Boolean enforcePrincipalDomain;
    /**
     * Enable Secure Socket Connection.
     * (Required)
     * 
     */
    @JsonProperty("enableSecureSocketConnection")
    @JsonPropertyDescription("Enable Secure Socket Connection.")
    @NotNull
    private Boolean enableSecureSocketConnection;

    /**
     * Class Name for authorizer.
     * (Required)
     * 
     */
    @JsonProperty("className")
    public String getClassName() {
        return className;
    }

    /**
     * Class Name for authorizer.
     * (Required)
     * 
     */
    @JsonProperty("className")
    public void setClassName(String className) {
        this.className = className;
    }

    public AuthorizerConfiguration withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * Filter for the request authorization.
     * (Required)
     * 
     */
    @JsonProperty("containerRequestFilter")
    public String getContainerRequestFilter() {
        return containerRequestFilter;
    }

    /**
     * Filter for the request authorization.
     * (Required)
     * 
     */
    @JsonProperty("containerRequestFilter")
    public void setContainerRequestFilter(String containerRequestFilter) {
        this.containerRequestFilter = containerRequestFilter;
    }

    public AuthorizerConfiguration withContainerRequestFilter(String containerRequestFilter) {
        this.containerRequestFilter = containerRequestFilter;
        return this;
    }

    /**
     * List of unique admin principals.
     * (Required)
     * 
     */
    @JsonProperty("adminPrincipals")
    public Set<String> getAdminPrincipals() {
        return adminPrincipals;
    }

    /**
     * List of unique admin principals.
     * (Required)
     * 
     */
    @JsonProperty("adminPrincipals")
    public void setAdminPrincipals(Set<String> adminPrincipals) {
        this.adminPrincipals = adminPrincipals;
    }

    public AuthorizerConfiguration withAdminPrincipals(Set<String> adminPrincipals) {
        this.adminPrincipals = adminPrincipals;
        return this;
    }

    /**
     * **@Deprecated** List of unique bot principals
     * 
     */
    @JsonProperty("botPrincipals")
    public Set<String> getBotPrincipals() {
        return botPrincipals;
    }

    /**
     * **@Deprecated** List of unique bot principals
     * 
     */
    @JsonProperty("botPrincipals")
    public void setBotPrincipals(Set<String> botPrincipals) {
        this.botPrincipals = botPrincipals;
    }

    public AuthorizerConfiguration withBotPrincipals(Set<String> botPrincipals) {
        this.botPrincipals = botPrincipals;
        return this;
    }

    /**
     * List of unique principals used as test users. **NOTE THIS IS ONLY FOR TEST SETUP AND NOT TO BE USED IN PRODUCTION SETUP**
     * 
     */
    @JsonProperty("testPrincipals")
    public Set<String> getTestPrincipals() {
        return testPrincipals;
    }

    /**
     * List of unique principals used as test users. **NOTE THIS IS ONLY FOR TEST SETUP AND NOT TO BE USED IN PRODUCTION SETUP**
     * 
     */
    @JsonProperty("testPrincipals")
    public void setTestPrincipals(Set<String> testPrincipals) {
        this.testPrincipals = testPrincipals;
    }

    public AuthorizerConfiguration withTestPrincipals(Set<String> testPrincipals) {
        this.testPrincipals = testPrincipals;
        return this;
    }

    /**
     * List of unique email domains that are allowed to signup on the platforms
     * 
     */
    @JsonProperty("allowedEmailRegistrationDomains")
    public Set<String> getAllowedEmailRegistrationDomains() {
        return allowedEmailRegistrationDomains;
    }

    /**
     * List of unique email domains that are allowed to signup on the platforms
     * 
     */
    @JsonProperty("allowedEmailRegistrationDomains")
    public void setAllowedEmailRegistrationDomains(Set<String> allowedEmailRegistrationDomains) {
        this.allowedEmailRegistrationDomains = allowedEmailRegistrationDomains;
    }

    public AuthorizerConfiguration withAllowedEmailRegistrationDomains(Set<String> allowedEmailRegistrationDomains) {
        this.allowedEmailRegistrationDomains = allowedEmailRegistrationDomains;
        return this;
    }

    /**
     * Principal Domain
     * (Required)
     * 
     */
    @JsonProperty("principalDomain")
    public String getPrincipalDomain() {
        return principalDomain;
    }

    /**
     * Principal Domain
     * (Required)
     * 
     */
    @JsonProperty("principalDomain")
    public void setPrincipalDomain(String principalDomain) {
        this.principalDomain = principalDomain;
    }

    public AuthorizerConfiguration withPrincipalDomain(String principalDomain) {
        this.principalDomain = principalDomain;
        return this;
    }

    /**
     * Enable Enforce Principal Domain
     * (Required)
     * 
     */
    @JsonProperty("enforcePrincipalDomain")
    public Boolean getEnforcePrincipalDomain() {
        return enforcePrincipalDomain;
    }

    /**
     * Enable Enforce Principal Domain
     * (Required)
     * 
     */
    @JsonProperty("enforcePrincipalDomain")
    public void setEnforcePrincipalDomain(Boolean enforcePrincipalDomain) {
        this.enforcePrincipalDomain = enforcePrincipalDomain;
    }

    public AuthorizerConfiguration withEnforcePrincipalDomain(Boolean enforcePrincipalDomain) {
        this.enforcePrincipalDomain = enforcePrincipalDomain;
        return this;
    }

    /**
     * Enable Secure Socket Connection.
     * (Required)
     * 
     */
    @JsonProperty("enableSecureSocketConnection")
    public Boolean getEnableSecureSocketConnection() {
        return enableSecureSocketConnection;
    }

    /**
     * Enable Secure Socket Connection.
     * (Required)
     * 
     */
    @JsonProperty("enableSecureSocketConnection")
    public void setEnableSecureSocketConnection(Boolean enableSecureSocketConnection) {
        this.enableSecureSocketConnection = enableSecureSocketConnection;
    }

    public AuthorizerConfiguration withEnableSecureSocketConnection(Boolean enableSecureSocketConnection) {
        this.enableSecureSocketConnection = enableSecureSocketConnection;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AuthorizerConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("className");
        sb.append('=');
        sb.append(((this.className == null)?"<null>":this.className));
        sb.append(',');
        sb.append("containerRequestFilter");
        sb.append('=');
        sb.append(((this.containerRequestFilter == null)?"<null>":this.containerRequestFilter));
        sb.append(',');
        sb.append("adminPrincipals");
        sb.append('=');
        sb.append(((this.adminPrincipals == null)?"<null>":this.adminPrincipals));
        sb.append(',');
        sb.append("botPrincipals");
        sb.append('=');
        sb.append(((this.botPrincipals == null)?"<null>":this.botPrincipals));
        sb.append(',');
        sb.append("testPrincipals");
        sb.append('=');
        sb.append(((this.testPrincipals == null)?"<null>":this.testPrincipals));
        sb.append(',');
        sb.append("allowedEmailRegistrationDomains");
        sb.append('=');
        sb.append(((this.allowedEmailRegistrationDomains == null)?"<null>":this.allowedEmailRegistrationDomains));
        sb.append(',');
        sb.append("principalDomain");
        sb.append('=');
        sb.append(((this.principalDomain == null)?"<null>":this.principalDomain));
        sb.append(',');
        sb.append("enforcePrincipalDomain");
        sb.append('=');
        sb.append(((this.enforcePrincipalDomain == null)?"<null>":this.enforcePrincipalDomain));
        sb.append(',');
        sb.append("enableSecureSocketConnection");
        sb.append('=');
        sb.append(((this.enableSecureSocketConnection == null)?"<null>":this.enableSecureSocketConnection));
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
        result = ((result* 31)+((this.containerRequestFilter == null)? 0 :this.containerRequestFilter.hashCode()));
        result = ((result* 31)+((this.enforcePrincipalDomain == null)? 0 :this.enforcePrincipalDomain.hashCode()));
        result = ((result* 31)+((this.principalDomain == null)? 0 :this.principalDomain.hashCode()));
        result = ((result* 31)+((this.adminPrincipals == null)? 0 :this.adminPrincipals.hashCode()));
        result = ((result* 31)+((this.testPrincipals == null)? 0 :this.testPrincipals.hashCode()));
        result = ((result* 31)+((this.className == null)? 0 :this.className.hashCode()));
        result = ((result* 31)+((this.allowedEmailRegistrationDomains == null)? 0 :this.allowedEmailRegistrationDomains.hashCode()));
        result = ((result* 31)+((this.botPrincipals == null)? 0 :this.botPrincipals.hashCode()));
        result = ((result* 31)+((this.enableSecureSocketConnection == null)? 0 :this.enableSecureSocketConnection.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthorizerConfiguration) == false) {
            return false;
        }
        AuthorizerConfiguration rhs = ((AuthorizerConfiguration) other);
        return ((((((((((this.containerRequestFilter == rhs.containerRequestFilter)||((this.containerRequestFilter!= null)&&this.containerRequestFilter.equals(rhs.containerRequestFilter)))&&((this.enforcePrincipalDomain == rhs.enforcePrincipalDomain)||((this.enforcePrincipalDomain!= null)&&this.enforcePrincipalDomain.equals(rhs.enforcePrincipalDomain))))&&((this.principalDomain == rhs.principalDomain)||((this.principalDomain!= null)&&this.principalDomain.equals(rhs.principalDomain))))&&((this.adminPrincipals == rhs.adminPrincipals)||((this.adminPrincipals!= null)&&this.adminPrincipals.equals(rhs.adminPrincipals))))&&((this.testPrincipals == rhs.testPrincipals)||((this.testPrincipals!= null)&&this.testPrincipals.equals(rhs.testPrincipals))))&&((this.className == rhs.className)||((this.className!= null)&&this.className.equals(rhs.className))))&&((this.allowedEmailRegistrationDomains == rhs.allowedEmailRegistrationDomains)||((this.allowedEmailRegistrationDomains!= null)&&this.allowedEmailRegistrationDomains.equals(rhs.allowedEmailRegistrationDomains))))&&((this.botPrincipals == rhs.botPrincipals)||((this.botPrincipals!= null)&&this.botPrincipals.equals(rhs.botPrincipals))))&&((this.enableSecureSocketConnection == rhs.enableSecureSocketConnection)||((this.enableSecureSocketConnection!= null)&&this.enableSecureSocketConnection.equals(rhs.enableSecureSocketConnection))));
    }

}
