
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * JDBC connection
 * <p>
 * This schema defines the type used for JDBC connection information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "driverClass",
    "connectionUrl",
    "userName",
    "password"
})
@Generated("jsonschema2pojo")
public class JdbcConnection {

    /**
     * Type used for JDBC driver class.
     * (Required)
     * 
     */
    @JsonProperty("driverClass")
    @JsonPropertyDescription("Type used for JDBC driver class.")
    @NotNull
    private String driverClass;
    /**
     * Type used for JDBC connection URL of format `url_scheme://<username>:<password>@<host>:<port>/<db_name>`.
     * (Required)
     * 
     */
    @JsonProperty("connectionUrl")
    @JsonPropertyDescription("Type used for JDBC connection URL of format `url_scheme://<username>:<password>@<host>:<port>/<db_name>`.")
    @NotNull
    private String connectionUrl;
    /**
     * Login user name.
     * (Required)
     * 
     */
    @JsonProperty("userName")
    @JsonPropertyDescription("Login user name.")
    @NotNull
    private String userName;
    /**
     * Login password.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Login password.")
    @NotNull
    private String password;

    /**
     * Type used for JDBC driver class.
     * (Required)
     * 
     */
    @JsonProperty("driverClass")
    public String getDriverClass() {
        return driverClass;
    }

    /**
     * Type used for JDBC driver class.
     * (Required)
     * 
     */
    @JsonProperty("driverClass")
    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public JdbcConnection withDriverClass(String driverClass) {
        this.driverClass = driverClass;
        return this;
    }

    /**
     * Type used for JDBC connection URL of format `url_scheme://<username>:<password>@<host>:<port>/<db_name>`.
     * (Required)
     * 
     */
    @JsonProperty("connectionUrl")
    public String getConnectionUrl() {
        return connectionUrl;
    }

    /**
     * Type used for JDBC connection URL of format `url_scheme://<username>:<password>@<host>:<port>/<db_name>`.
     * (Required)
     * 
     */
    @JsonProperty("connectionUrl")
    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public JdbcConnection withConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
        return this;
    }

    /**
     * Login user name.
     * (Required)
     * 
     */
    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * Login user name.
     * (Required)
     * 
     */
    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public JdbcConnection withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Login password.
     * (Required)
     * 
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * Login password.
     * (Required)
     * 
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public JdbcConnection withPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JdbcConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("driverClass");
        sb.append('=');
        sb.append(((this.driverClass == null)?"<null>":this.driverClass));
        sb.append(',');
        sb.append("connectionUrl");
        sb.append('=');
        sb.append(((this.connectionUrl == null)?"<null>":this.connectionUrl));
        sb.append(',');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
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
        result = ((result* 31)+((this.connectionUrl == null)? 0 :this.connectionUrl.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.userName == null)? 0 :this.userName.hashCode()));
        result = ((result* 31)+((this.driverClass == null)? 0 :this.driverClass.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JdbcConnection) == false) {
            return false;
        }
        JdbcConnection rhs = ((JdbcConnection) other);
        return (((((this.connectionUrl == rhs.connectionUrl)||((this.connectionUrl!= null)&&this.connectionUrl.equals(rhs.connectionUrl)))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.userName == rhs.userName)||((this.userName!= null)&&this.userName.equals(rhs.userName))))&&((this.driverClass == rhs.driverClass)||((this.driverClass!= null)&&this.driverClass.equals(rhs.driverClass))));
    }

}
