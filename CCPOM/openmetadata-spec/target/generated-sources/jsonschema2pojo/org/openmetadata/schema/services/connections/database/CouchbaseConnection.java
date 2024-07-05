
package org.openmetadata.schema.services.connections.database;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.annotations.PasswordField;


/**
 * Couchbase Connection
 * <p>
 * Couchbase Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "scheme",
    "bucket",
    "username",
    "password",
    "hostport"
})
@Generated("jsonschema2pojo")
public class CouchbaseConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private CouchbaseConnection.CouchbaseType type = CouchbaseConnection.CouchbaseType.fromValue("Couchbase");
    /**
     * Couchbase driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("Couchbase driver scheme options.")
    private CouchbaseConnection.CouchbaseScheme scheme = CouchbaseConnection.CouchbaseScheme.fromValue("couchbase");
    /**
     * Connection Bucket
     * <p>
     * Couchbase connection Bucket options.
     * 
     */
    @JsonProperty("bucket")
    @JsonPropertyDescription("Couchbase connection Bucket options.")
    private String bucket;
    /**
     * Username
     * <p>
     * Username to connect to Couchbase. This user should have privileges to read all the metadata in Couchbase.
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Username to connect to Couchbase. This user should have privileges to read all the metadata in Couchbase.")
    @NotNull
    private String username;
    /**
     * Password
     * <p>
     * Password to connect to Couchbase.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password to connect to Couchbase.")
    @PasswordField
    @NotNull
    private String password;
    /**
     * Hostport
     * <p>
     * Hostname of the Couchbase service.
     * (Required)
     * 
     */
    @JsonProperty("hostport")
    @JsonPropertyDescription("Hostname of the Couchbase service.")
    @NotNull
    private String hostport;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public CouchbaseConnection.CouchbaseType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(CouchbaseConnection.CouchbaseType type) {
        this.type = type;
    }

    public CouchbaseConnection withType(CouchbaseConnection.CouchbaseType type) {
        this.type = type;
        return this;
    }

    /**
     * Couchbase driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public CouchbaseConnection.CouchbaseScheme getScheme() {
        return scheme;
    }

    /**
     * Couchbase driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(CouchbaseConnection.CouchbaseScheme scheme) {
        this.scheme = scheme;
    }

    public CouchbaseConnection withScheme(CouchbaseConnection.CouchbaseScheme scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Connection Bucket
     * <p>
     * Couchbase connection Bucket options.
     * 
     */
    @JsonProperty("bucket")
    public String getBucket() {
        return bucket;
    }

    /**
     * Connection Bucket
     * <p>
     * Couchbase connection Bucket options.
     * 
     */
    @JsonProperty("bucket")
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public CouchbaseConnection withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * Username
     * <p>
     * Username to connect to Couchbase. This user should have privileges to read all the metadata in Couchbase.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Username
     * <p>
     * Username to connect to Couchbase. This user should have privileges to read all the metadata in Couchbase.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public CouchbaseConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Password
     * <p>
     * Password to connect to Couchbase.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public String getPassword() {
        return password;
    }

    /**
     * Password
     * <p>
     * Password to connect to Couchbase.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public CouchbaseConnection withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Hostport
     * <p>
     * Hostname of the Couchbase service.
     * (Required)
     * 
     */
    @JsonProperty("hostport")
    public String getHostport() {
        return hostport;
    }

    /**
     * Hostport
     * <p>
     * Hostname of the Couchbase service.
     * (Required)
     * 
     */
    @JsonProperty("hostport")
    public void setHostport(String hostport) {
        this.hostport = hostport;
    }

    public CouchbaseConnection withHostport(String hostport) {
        this.hostport = hostport;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CouchbaseConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("scheme");
        sb.append('=');
        sb.append(((this.scheme == null)?"<null>":this.scheme));
        sb.append(',');
        sb.append("bucket");
        sb.append('=');
        sb.append(((this.bucket == null)?"<null>":this.bucket));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("hostport");
        sb.append('=');
        sb.append(((this.hostport == null)?"<null>":this.hostport));
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
        result = ((result* 31)+((this.bucket == null)? 0 :this.bucket.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.hostport == null)? 0 :this.hostport.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CouchbaseConnection) == false) {
            return false;
        }
        CouchbaseConnection rhs = ((CouchbaseConnection) other);
        return (((((((this.bucket == rhs.bucket)||((this.bucket!= null)&&this.bucket.equals(rhs.bucket)))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.hostport == rhs.hostport)||((this.hostport!= null)&&this.hostport.equals(rhs.hostport))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * Couchbase driver scheme options.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum CouchbaseScheme {

        COUCHBASE("couchbase");
        private final String value;
        private final static Map<String, CouchbaseConnection.CouchbaseScheme> CONSTANTS = new HashMap<String, CouchbaseConnection.CouchbaseScheme>();

        static {
            for (CouchbaseConnection.CouchbaseScheme c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CouchbaseScheme(String value) {
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
        public static CouchbaseConnection.CouchbaseScheme fromValue(String value) {
            CouchbaseConnection.CouchbaseScheme constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum CouchbaseType {

        COUCHBASE("Couchbase");
        private final String value;
        private final static Map<String, CouchbaseConnection.CouchbaseType> CONSTANTS = new HashMap<String, CouchbaseConnection.CouchbaseType>();

        static {
            for (CouchbaseConnection.CouchbaseType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CouchbaseType(String value) {
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
        public static CouchbaseConnection.CouchbaseType fromValue(String value) {
            CouchbaseConnection.CouchbaseType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
