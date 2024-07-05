
package org.openmetadata.schema.services.connections.messaging;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.annotations.PasswordField;


/**
 * RedpandaConnection
 * <p>
 * Redpanda Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "bootstrapServers",
    "schemaRegistryURL",
    "saslUsername",
    "saslPassword",
    "saslMechanism",
    "basicAuthUserInfo",
    "consumerConfig",
    "schemaRegistryConfig",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class RedpandaConnection {

    /**
     * Redpanda service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Redpanda service type")
    private RedpandaConnection.RedpandaType type = RedpandaConnection.RedpandaType.fromValue("Redpanda");
    /**
     * Bootstrap Servers
     * <p>
     * Redpanda bootstrap servers. add them in comma separated values ex: host1:9092,host2:9092
     * (Required)
     * 
     */
    @JsonProperty("bootstrapServers")
    @JsonPropertyDescription("Redpanda bootstrap servers. add them in comma separated values ex: host1:9092,host2:9092")
    @NotNull
    private String bootstrapServers;
    /**
     * Schema Registry URL
     * <p>
     * Confluent Redpanda Schema Registry URL.
     * 
     */
    @JsonProperty("schemaRegistryURL")
    @JsonPropertyDescription("Confluent Redpanda Schema Registry URL.")
    private URI schemaRegistryURL;
    /**
     * SASL Username
     * <p>
     * sasl.username consumer config property
     * 
     */
    @JsonProperty("saslUsername")
    @JsonPropertyDescription("sasl.username consumer config property")
    private String saslUsername;
    /**
     * SASL Password
     * <p>
     * sasl.password consumer config property
     * 
     */
    @JsonProperty("saslPassword")
    @JsonPropertyDescription("sasl.password consumer config property")
    @PasswordField
    private String saslPassword;
    /**
     * SaslMechanismType
     * <p>
     * SASL Mechanism consumer config property
     * 
     */
    @JsonProperty("saslMechanism")
    @JsonPropertyDescription("SASL Mechanism consumer config property")
    private SaslMechanismType saslMechanism = SaslMechanismType.fromValue("PLAIN");
    /**
     * Basic Auth User Info
     * <p>
     * basic.auth.user.info schema registry config property, Client HTTP credentials in the form of username:password.
     * 
     */
    @JsonProperty("basicAuthUserInfo")
    @JsonPropertyDescription("basic.auth.user.info schema registry config property, Client HTTP credentials in the form of username:password.")
    @PasswordField
    private String basicAuthUserInfo;
    /**
     * Consumer Config
     * <p>
     * Confluent Redpanda Consumer Config
     * 
     */
    @JsonProperty("consumerConfig")
    @JsonPropertyDescription("Confluent Redpanda Consumer Config")
    @Valid
    private ConsumerConfig__1 consumerConfig;
    /**
     * Schema Registry Config
     * <p>
     * Confluent Redpanda Schema Registry Config.
     * 
     */
    @JsonProperty("schemaRegistryConfig")
    @JsonPropertyDescription("Confluent Redpanda Schema Registry Config.")
    @Valid
    private SchemaRegistryConfig__1 schemaRegistryConfig;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Redpanda service type
     * 
     */
    @JsonProperty("type")
    public RedpandaConnection.RedpandaType getType() {
        return type;
    }

    /**
     * Redpanda service type
     * 
     */
    @JsonProperty("type")
    public void setType(RedpandaConnection.RedpandaType type) {
        this.type = type;
    }

    public RedpandaConnection withType(RedpandaConnection.RedpandaType type) {
        this.type = type;
        return this;
    }

    /**
     * Bootstrap Servers
     * <p>
     * Redpanda bootstrap servers. add them in comma separated values ex: host1:9092,host2:9092
     * (Required)
     * 
     */
    @JsonProperty("bootstrapServers")
    public String getBootstrapServers() {
        return bootstrapServers;
    }

    /**
     * Bootstrap Servers
     * <p>
     * Redpanda bootstrap servers. add them in comma separated values ex: host1:9092,host2:9092
     * (Required)
     * 
     */
    @JsonProperty("bootstrapServers")
    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    public RedpandaConnection withBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
        return this;
    }

    /**
     * Schema Registry URL
     * <p>
     * Confluent Redpanda Schema Registry URL.
     * 
     */
    @JsonProperty("schemaRegistryURL")
    public URI getSchemaRegistryURL() {
        return schemaRegistryURL;
    }

    /**
     * Schema Registry URL
     * <p>
     * Confluent Redpanda Schema Registry URL.
     * 
     */
    @JsonProperty("schemaRegistryURL")
    public void setSchemaRegistryURL(URI schemaRegistryURL) {
        this.schemaRegistryURL = schemaRegistryURL;
    }

    public RedpandaConnection withSchemaRegistryURL(URI schemaRegistryURL) {
        this.schemaRegistryURL = schemaRegistryURL;
        return this;
    }

    /**
     * SASL Username
     * <p>
     * sasl.username consumer config property
     * 
     */
    @JsonProperty("saslUsername")
    public String getSaslUsername() {
        return saslUsername;
    }

    /**
     * SASL Username
     * <p>
     * sasl.username consumer config property
     * 
     */
    @JsonProperty("saslUsername")
    public void setSaslUsername(String saslUsername) {
        this.saslUsername = saslUsername;
    }

    public RedpandaConnection withSaslUsername(String saslUsername) {
        this.saslUsername = saslUsername;
        return this;
    }

    /**
     * SASL Password
     * <p>
     * sasl.password consumer config property
     * 
     */
    @JsonProperty("saslPassword")
    @PasswordField
    public String getSaslPassword() {
        return saslPassword;
    }

    /**
     * SASL Password
     * <p>
     * sasl.password consumer config property
     * 
     */
    @JsonProperty("saslPassword")
    @PasswordField
    public void setSaslPassword(String saslPassword) {
        this.saslPassword = saslPassword;
    }

    public RedpandaConnection withSaslPassword(String saslPassword) {
        this.saslPassword = saslPassword;
        return this;
    }

    /**
     * SaslMechanismType
     * <p>
     * SASL Mechanism consumer config property
     * 
     */
    @JsonProperty("saslMechanism")
    public SaslMechanismType getSaslMechanism() {
        return saslMechanism;
    }

    /**
     * SaslMechanismType
     * <p>
     * SASL Mechanism consumer config property
     * 
     */
    @JsonProperty("saslMechanism")
    public void setSaslMechanism(SaslMechanismType saslMechanism) {
        this.saslMechanism = saslMechanism;
    }

    public RedpandaConnection withSaslMechanism(SaslMechanismType saslMechanism) {
        this.saslMechanism = saslMechanism;
        return this;
    }

    /**
     * Basic Auth User Info
     * <p>
     * basic.auth.user.info schema registry config property, Client HTTP credentials in the form of username:password.
     * 
     */
    @JsonProperty("basicAuthUserInfo")
    @PasswordField
    public String getBasicAuthUserInfo() {
        return basicAuthUserInfo;
    }

    /**
     * Basic Auth User Info
     * <p>
     * basic.auth.user.info schema registry config property, Client HTTP credentials in the form of username:password.
     * 
     */
    @JsonProperty("basicAuthUserInfo")
    @PasswordField
    public void setBasicAuthUserInfo(String basicAuthUserInfo) {
        this.basicAuthUserInfo = basicAuthUserInfo;
    }

    public RedpandaConnection withBasicAuthUserInfo(String basicAuthUserInfo) {
        this.basicAuthUserInfo = basicAuthUserInfo;
        return this;
    }

    /**
     * Consumer Config
     * <p>
     * Confluent Redpanda Consumer Config
     * 
     */
    @JsonProperty("consumerConfig")
    public ConsumerConfig__1 getConsumerConfig() {
        return consumerConfig;
    }

    /**
     * Consumer Config
     * <p>
     * Confluent Redpanda Consumer Config
     * 
     */
    @JsonProperty("consumerConfig")
    public void setConsumerConfig(ConsumerConfig__1 consumerConfig) {
        this.consumerConfig = consumerConfig;
    }

    public RedpandaConnection withConsumerConfig(ConsumerConfig__1 consumerConfig) {
        this.consumerConfig = consumerConfig;
        return this;
    }

    /**
     * Schema Registry Config
     * <p>
     * Confluent Redpanda Schema Registry Config.
     * 
     */
    @JsonProperty("schemaRegistryConfig")
    public SchemaRegistryConfig__1 getSchemaRegistryConfig() {
        return schemaRegistryConfig;
    }

    /**
     * Schema Registry Config
     * <p>
     * Confluent Redpanda Schema Registry Config.
     * 
     */
    @JsonProperty("schemaRegistryConfig")
    public void setSchemaRegistryConfig(SchemaRegistryConfig__1 schemaRegistryConfig) {
        this.schemaRegistryConfig = schemaRegistryConfig;
    }

    public RedpandaConnection withSchemaRegistryConfig(SchemaRegistryConfig__1 schemaRegistryConfig) {
        this.schemaRegistryConfig = schemaRegistryConfig;
        return this;
    }

    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    public Boolean getSupportsMetadataExtraction() {
        return supportsMetadataExtraction;
    }

    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    public void setSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
    }

    public RedpandaConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RedpandaConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("bootstrapServers");
        sb.append('=');
        sb.append(((this.bootstrapServers == null)?"<null>":this.bootstrapServers));
        sb.append(',');
        sb.append("schemaRegistryURL");
        sb.append('=');
        sb.append(((this.schemaRegistryURL == null)?"<null>":this.schemaRegistryURL));
        sb.append(',');
        sb.append("saslUsername");
        sb.append('=');
        sb.append(((this.saslUsername == null)?"<null>":this.saslUsername));
        sb.append(',');
        sb.append("saslPassword");
        sb.append('=');
        sb.append(((this.saslPassword == null)?"<null>":this.saslPassword));
        sb.append(',');
        sb.append("saslMechanism");
        sb.append('=');
        sb.append(((this.saslMechanism == null)?"<null>":this.saslMechanism));
        sb.append(',');
        sb.append("basicAuthUserInfo");
        sb.append('=');
        sb.append(((this.basicAuthUserInfo == null)?"<null>":this.basicAuthUserInfo));
        sb.append(',');
        sb.append("consumerConfig");
        sb.append('=');
        sb.append(((this.consumerConfig == null)?"<null>":this.consumerConfig));
        sb.append(',');
        sb.append("schemaRegistryConfig");
        sb.append('=');
        sb.append(((this.schemaRegistryConfig == null)?"<null>":this.schemaRegistryConfig));
        sb.append(',');
        sb.append("supportsMetadataExtraction");
        sb.append('=');
        sb.append(((this.supportsMetadataExtraction == null)?"<null>":this.supportsMetadataExtraction));
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
        result = ((result* 31)+((this.schemaRegistryURL == null)? 0 :this.schemaRegistryURL.hashCode()));
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.consumerConfig == null)? 0 :this.consumerConfig.hashCode()));
        result = ((result* 31)+((this.bootstrapServers == null)? 0 :this.bootstrapServers.hashCode()));
        result = ((result* 31)+((this.saslPassword == null)? 0 :this.saslPassword.hashCode()));
        result = ((result* 31)+((this.basicAuthUserInfo == null)? 0 :this.basicAuthUserInfo.hashCode()));
        result = ((result* 31)+((this.saslUsername == null)? 0 :this.saslUsername.hashCode()));
        result = ((result* 31)+((this.saslMechanism == null)? 0 :this.saslMechanism.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.schemaRegistryConfig == null)? 0 :this.schemaRegistryConfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RedpandaConnection) == false) {
            return false;
        }
        RedpandaConnection rhs = ((RedpandaConnection) other);
        return (((((((((((this.schemaRegistryURL == rhs.schemaRegistryURL)||((this.schemaRegistryURL!= null)&&this.schemaRegistryURL.equals(rhs.schemaRegistryURL)))&&((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction))))&&((this.consumerConfig == rhs.consumerConfig)||((this.consumerConfig!= null)&&this.consumerConfig.equals(rhs.consumerConfig))))&&((this.bootstrapServers == rhs.bootstrapServers)||((this.bootstrapServers!= null)&&this.bootstrapServers.equals(rhs.bootstrapServers))))&&((this.saslPassword == rhs.saslPassword)||((this.saslPassword!= null)&&this.saslPassword.equals(rhs.saslPassword))))&&((this.basicAuthUserInfo == rhs.basicAuthUserInfo)||((this.basicAuthUserInfo!= null)&&this.basicAuthUserInfo.equals(rhs.basicAuthUserInfo))))&&((this.saslUsername == rhs.saslUsername)||((this.saslUsername!= null)&&this.saslUsername.equals(rhs.saslUsername))))&&((this.saslMechanism == rhs.saslMechanism)||((this.saslMechanism!= null)&&this.saslMechanism.equals(rhs.saslMechanism))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.schemaRegistryConfig == rhs.schemaRegistryConfig)||((this.schemaRegistryConfig!= null)&&this.schemaRegistryConfig.equals(rhs.schemaRegistryConfig))));
    }


    /**
     * Redpanda service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RedpandaType {

        REDPANDA("Redpanda");
        private final String value;
        private final static Map<String, RedpandaConnection.RedpandaType> CONSTANTS = new HashMap<String, RedpandaConnection.RedpandaType>();

        static {
            for (RedpandaConnection.RedpandaType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RedpandaType(String value) {
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
        public static RedpandaConnection.RedpandaType fromValue(String value) {
            RedpandaConnection.RedpandaType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
