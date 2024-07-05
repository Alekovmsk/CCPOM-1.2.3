
package org.openmetadata.schema.api.kafka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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


/**
 * KafkaEventConfiguration
 * <p>
 * This schema defines the Kafka Event Publisher Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "topics",
    "acks",
    "retries",
    "lingerMS",
    "bufferMemory",
    "keySerializer",
    "valueSerializer",
    "securityProtocol",
    "SSLProtocol",
    "SSLTrustStoreLocation",
    "SSLTrustStorePassword",
    "SSLKeystoreLocation",
    "SSLKeystorePassword",
    "SSLKeyPassword"
})
@Generated("jsonschema2pojo")
public class KafkaEventConfiguration {

    /**
     * Topics of Kafka Producer
     * (Required)
     * 
     */
    @JsonProperty("topics")
    @JsonPropertyDescription("Topics of Kafka Producer")
    @Valid
    @NotNull
    private List<String> topics = new ArrayList<String>();
    /**
     * Acknowledgment
     * 
     */
    @JsonProperty("acks")
    @JsonPropertyDescription("Acknowledgment")
    private String acks = "all";
    /**
     * No. of retries
     * 
     */
    @JsonProperty("retries")
    @JsonPropertyDescription("No. of retries")
    private Integer retries = 3;
    /**
     * Artificial Delay in milliseconds
     * 
     */
    @JsonProperty("lingerMS")
    @JsonPropertyDescription("Artificial Delay in milliseconds")
    private Integer lingerMS = 1;
    /**
     * Buffer Memory
     * 
     */
    @JsonProperty("bufferMemory")
    @JsonPropertyDescription("Buffer Memory")
    private Integer bufferMemory = 33554432;
    /**
     * Serializer class for key
     * 
     */
    @JsonProperty("keySerializer")
    @JsonPropertyDescription("Serializer class for key")
    private String keySerializer = "org.apache.kafka.common.serialization.StringSerializer";
    /**
     * Serializer class for value
     * 
     */
    @JsonProperty("valueSerializer")
    @JsonPropertyDescription("Serializer class for value")
    private String valueSerializer = "org.apache.kafka.common.serialization.StringSerializer";
    /**
     * Kafka security protocol config
     * 
     */
    @JsonProperty("securityProtocol")
    @JsonPropertyDescription("Kafka security protocol config")
    private KafkaEventConfiguration.SecurityProtocol securityProtocol = KafkaEventConfiguration.SecurityProtocol.fromValue("PLAINTEXT");
    /**
     * Kafka SSL protocol config
     * 
     */
    @JsonProperty("SSLProtocol")
    @JsonPropertyDescription("Kafka SSL protocol config")
    private String sSLProtocol = "TLSv1.2";
    /**
     * Kafka SSL truststore location
     * 
     */
    @JsonProperty("SSLTrustStoreLocation")
    @JsonPropertyDescription("Kafka SSL truststore location")
    private String sSLTrustStoreLocation;
    /**
     * Kafka SSL truststore password
     * 
     */
    @JsonProperty("SSLTrustStorePassword")
    @JsonPropertyDescription("Kafka SSL truststore password")
    private String sSLTrustStorePassword;
    /**
     * Kafka SSL keystore location
     * 
     */
    @JsonProperty("SSLKeystoreLocation")
    @JsonPropertyDescription("Kafka SSL keystore location")
    private String sSLKeystoreLocation;
    /**
     * Kafka SSL keystore password
     * 
     */
    @JsonProperty("SSLKeystorePassword")
    @JsonPropertyDescription("Kafka SSL keystore password")
    private String sSLKeystorePassword;
    /**
     * Kafka SSL key password
     * 
     */
    @JsonProperty("SSLKeyPassword")
    @JsonPropertyDescription("Kafka SSL key password")
    private String sSLKeyPassword;

    /**
     * Topics of Kafka Producer
     * (Required)
     * 
     */
    @JsonProperty("topics")
    public List<String> getTopics() {
        return topics;
    }

    /**
     * Topics of Kafka Producer
     * (Required)
     * 
     */
    @JsonProperty("topics")
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public KafkaEventConfiguration withTopics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    /**
     * Acknowledgment
     * 
     */
    @JsonProperty("acks")
    public String getAcks() {
        return acks;
    }

    /**
     * Acknowledgment
     * 
     */
    @JsonProperty("acks")
    public void setAcks(String acks) {
        this.acks = acks;
    }

    public KafkaEventConfiguration withAcks(String acks) {
        this.acks = acks;
        return this;
    }

    /**
     * No. of retries
     * 
     */
    @JsonProperty("retries")
    public Integer getRetries() {
        return retries;
    }

    /**
     * No. of retries
     * 
     */
    @JsonProperty("retries")
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public KafkaEventConfiguration withRetries(Integer retries) {
        this.retries = retries;
        return this;
    }

    /**
     * Artificial Delay in milliseconds
     * 
     */
    @JsonProperty("lingerMS")
    public Integer getLingerMS() {
        return lingerMS;
    }

    /**
     * Artificial Delay in milliseconds
     * 
     */
    @JsonProperty("lingerMS")
    public void setLingerMS(Integer lingerMS) {
        this.lingerMS = lingerMS;
    }

    public KafkaEventConfiguration withLingerMS(Integer lingerMS) {
        this.lingerMS = lingerMS;
        return this;
    }

    /**
     * Buffer Memory
     * 
     */
    @JsonProperty("bufferMemory")
    public Integer getBufferMemory() {
        return bufferMemory;
    }

    /**
     * Buffer Memory
     * 
     */
    @JsonProperty("bufferMemory")
    public void setBufferMemory(Integer bufferMemory) {
        this.bufferMemory = bufferMemory;
    }

    public KafkaEventConfiguration withBufferMemory(Integer bufferMemory) {
        this.bufferMemory = bufferMemory;
        return this;
    }

    /**
     * Serializer class for key
     * 
     */
    @JsonProperty("keySerializer")
    public String getKeySerializer() {
        return keySerializer;
    }

    /**
     * Serializer class for key
     * 
     */
    @JsonProperty("keySerializer")
    public void setKeySerializer(String keySerializer) {
        this.keySerializer = keySerializer;
    }

    public KafkaEventConfiguration withKeySerializer(String keySerializer) {
        this.keySerializer = keySerializer;
        return this;
    }

    /**
     * Serializer class for value
     * 
     */
    @JsonProperty("valueSerializer")
    public String getValueSerializer() {
        return valueSerializer;
    }

    /**
     * Serializer class for value
     * 
     */
    @JsonProperty("valueSerializer")
    public void setValueSerializer(String valueSerializer) {
        this.valueSerializer = valueSerializer;
    }

    public KafkaEventConfiguration withValueSerializer(String valueSerializer) {
        this.valueSerializer = valueSerializer;
        return this;
    }

    /**
     * Kafka security protocol config
     * 
     */
    @JsonProperty("securityProtocol")
    public KafkaEventConfiguration.SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * Kafka security protocol config
     * 
     */
    @JsonProperty("securityProtocol")
    public void setSecurityProtocol(KafkaEventConfiguration.SecurityProtocol securityProtocol) {
        this.securityProtocol = securityProtocol;
    }

    public KafkaEventConfiguration withSecurityProtocol(KafkaEventConfiguration.SecurityProtocol securityProtocol) {
        this.securityProtocol = securityProtocol;
        return this;
    }

    /**
     * Kafka SSL protocol config
     * 
     */
    @JsonProperty("SSLProtocol")
    public String getSSLProtocol() {
        return sSLProtocol;
    }

    /**
     * Kafka SSL protocol config
     * 
     */
    @JsonProperty("SSLProtocol")
    public void setSSLProtocol(String sSLProtocol) {
        this.sSLProtocol = sSLProtocol;
    }

    public KafkaEventConfiguration withSSLProtocol(String sSLProtocol) {
        this.sSLProtocol = sSLProtocol;
        return this;
    }

    /**
     * Kafka SSL truststore location
     * 
     */
    @JsonProperty("SSLTrustStoreLocation")
    public String getSSLTrustStoreLocation() {
        return sSLTrustStoreLocation;
    }

    /**
     * Kafka SSL truststore location
     * 
     */
    @JsonProperty("SSLTrustStoreLocation")
    public void setSSLTrustStoreLocation(String sSLTrustStoreLocation) {
        this.sSLTrustStoreLocation = sSLTrustStoreLocation;
    }

    public KafkaEventConfiguration withSSLTrustStoreLocation(String sSLTrustStoreLocation) {
        this.sSLTrustStoreLocation = sSLTrustStoreLocation;
        return this;
    }

    /**
     * Kafka SSL truststore password
     * 
     */
    @JsonProperty("SSLTrustStorePassword")
    public String getSSLTrustStorePassword() {
        return sSLTrustStorePassword;
    }

    /**
     * Kafka SSL truststore password
     * 
     */
    @JsonProperty("SSLTrustStorePassword")
    public void setSSLTrustStorePassword(String sSLTrustStorePassword) {
        this.sSLTrustStorePassword = sSLTrustStorePassword;
    }

    public KafkaEventConfiguration withSSLTrustStorePassword(String sSLTrustStorePassword) {
        this.sSLTrustStorePassword = sSLTrustStorePassword;
        return this;
    }

    /**
     * Kafka SSL keystore location
     * 
     */
    @JsonProperty("SSLKeystoreLocation")
    public String getSSLKeystoreLocation() {
        return sSLKeystoreLocation;
    }

    /**
     * Kafka SSL keystore location
     * 
     */
    @JsonProperty("SSLKeystoreLocation")
    public void setSSLKeystoreLocation(String sSLKeystoreLocation) {
        this.sSLKeystoreLocation = sSLKeystoreLocation;
    }

    public KafkaEventConfiguration withSSLKeystoreLocation(String sSLKeystoreLocation) {
        this.sSLKeystoreLocation = sSLKeystoreLocation;
        return this;
    }

    /**
     * Kafka SSL keystore password
     * 
     */
    @JsonProperty("SSLKeystorePassword")
    public String getSSLKeystorePassword() {
        return sSLKeystorePassword;
    }

    /**
     * Kafka SSL keystore password
     * 
     */
    @JsonProperty("SSLKeystorePassword")
    public void setSSLKeystorePassword(String sSLKeystorePassword) {
        this.sSLKeystorePassword = sSLKeystorePassword;
    }

    public KafkaEventConfiguration withSSLKeystorePassword(String sSLKeystorePassword) {
        this.sSLKeystorePassword = sSLKeystorePassword;
        return this;
    }

    /**
     * Kafka SSL key password
     * 
     */
    @JsonProperty("SSLKeyPassword")
    public String getSSLKeyPassword() {
        return sSLKeyPassword;
    }

    /**
     * Kafka SSL key password
     * 
     */
    @JsonProperty("SSLKeyPassword")
    public void setSSLKeyPassword(String sSLKeyPassword) {
        this.sSLKeyPassword = sSLKeyPassword;
    }

    public KafkaEventConfiguration withSSLKeyPassword(String sSLKeyPassword) {
        this.sSLKeyPassword = sSLKeyPassword;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KafkaEventConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("topics");
        sb.append('=');
        sb.append(((this.topics == null)?"<null>":this.topics));
        sb.append(',');
        sb.append("acks");
        sb.append('=');
        sb.append(((this.acks == null)?"<null>":this.acks));
        sb.append(',');
        sb.append("retries");
        sb.append('=');
        sb.append(((this.retries == null)?"<null>":this.retries));
        sb.append(',');
        sb.append("lingerMS");
        sb.append('=');
        sb.append(((this.lingerMS == null)?"<null>":this.lingerMS));
        sb.append(',');
        sb.append("bufferMemory");
        sb.append('=');
        sb.append(((this.bufferMemory == null)?"<null>":this.bufferMemory));
        sb.append(',');
        sb.append("keySerializer");
        sb.append('=');
        sb.append(((this.keySerializer == null)?"<null>":this.keySerializer));
        sb.append(',');
        sb.append("valueSerializer");
        sb.append('=');
        sb.append(((this.valueSerializer == null)?"<null>":this.valueSerializer));
        sb.append(',');
        sb.append("securityProtocol");
        sb.append('=');
        sb.append(((this.securityProtocol == null)?"<null>":this.securityProtocol));
        sb.append(',');
        sb.append("sSLProtocol");
        sb.append('=');
        sb.append(((this.sSLProtocol == null)?"<null>":this.sSLProtocol));
        sb.append(',');
        sb.append("sSLTrustStoreLocation");
        sb.append('=');
        sb.append(((this.sSLTrustStoreLocation == null)?"<null>":this.sSLTrustStoreLocation));
        sb.append(',');
        sb.append("sSLTrustStorePassword");
        sb.append('=');
        sb.append(((this.sSLTrustStorePassword == null)?"<null>":this.sSLTrustStorePassword));
        sb.append(',');
        sb.append("sSLKeystoreLocation");
        sb.append('=');
        sb.append(((this.sSLKeystoreLocation == null)?"<null>":this.sSLKeystoreLocation));
        sb.append(',');
        sb.append("sSLKeystorePassword");
        sb.append('=');
        sb.append(((this.sSLKeystorePassword == null)?"<null>":this.sSLKeystorePassword));
        sb.append(',');
        sb.append("sSLKeyPassword");
        sb.append('=');
        sb.append(((this.sSLKeyPassword == null)?"<null>":this.sSLKeyPassword));
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
        result = ((result* 31)+((this.sSLKeystoreLocation == null)? 0 :this.sSLKeystoreLocation.hashCode()));
        result = ((result* 31)+((this.sSLProtocol == null)? 0 :this.sSLProtocol.hashCode()));
        result = ((result* 31)+((this.topics == null)? 0 :this.topics.hashCode()));
        result = ((result* 31)+((this.acks == null)? 0 :this.acks.hashCode()));
        result = ((result* 31)+((this.valueSerializer == null)? 0 :this.valueSerializer.hashCode()));
        result = ((result* 31)+((this.sSLTrustStoreLocation == null)? 0 :this.sSLTrustStoreLocation.hashCode()));
        result = ((result* 31)+((this.sSLKeystorePassword == null)? 0 :this.sSLKeystorePassword.hashCode()));
        result = ((result* 31)+((this.sSLTrustStorePassword == null)? 0 :this.sSLTrustStorePassword.hashCode()));
        result = ((result* 31)+((this.keySerializer == null)? 0 :this.keySerializer.hashCode()));
        result = ((result* 31)+((this.retries == null)? 0 :this.retries.hashCode()));
        result = ((result* 31)+((this.bufferMemory == null)? 0 :this.bufferMemory.hashCode()));
        result = ((result* 31)+((this.lingerMS == null)? 0 :this.lingerMS.hashCode()));
        result = ((result* 31)+((this.securityProtocol == null)? 0 :this.securityProtocol.hashCode()));
        result = ((result* 31)+((this.sSLKeyPassword == null)? 0 :this.sSLKeyPassword.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KafkaEventConfiguration) == false) {
            return false;
        }
        KafkaEventConfiguration rhs = ((KafkaEventConfiguration) other);
        return (((((((((((((((this.sSLKeystoreLocation == rhs.sSLKeystoreLocation)||((this.sSLKeystoreLocation!= null)&&this.sSLKeystoreLocation.equals(rhs.sSLKeystoreLocation)))&&((this.sSLProtocol == rhs.sSLProtocol)||((this.sSLProtocol!= null)&&this.sSLProtocol.equals(rhs.sSLProtocol))))&&((this.topics == rhs.topics)||((this.topics!= null)&&this.topics.equals(rhs.topics))))&&((this.acks == rhs.acks)||((this.acks!= null)&&this.acks.equals(rhs.acks))))&&((this.valueSerializer == rhs.valueSerializer)||((this.valueSerializer!= null)&&this.valueSerializer.equals(rhs.valueSerializer))))&&((this.sSLTrustStoreLocation == rhs.sSLTrustStoreLocation)||((this.sSLTrustStoreLocation!= null)&&this.sSLTrustStoreLocation.equals(rhs.sSLTrustStoreLocation))))&&((this.sSLKeystorePassword == rhs.sSLKeystorePassword)||((this.sSLKeystorePassword!= null)&&this.sSLKeystorePassword.equals(rhs.sSLKeystorePassword))))&&((this.sSLTrustStorePassword == rhs.sSLTrustStorePassword)||((this.sSLTrustStorePassword!= null)&&this.sSLTrustStorePassword.equals(rhs.sSLTrustStorePassword))))&&((this.keySerializer == rhs.keySerializer)||((this.keySerializer!= null)&&this.keySerializer.equals(rhs.keySerializer))))&&((this.retries == rhs.retries)||((this.retries!= null)&&this.retries.equals(rhs.retries))))&&((this.bufferMemory == rhs.bufferMemory)||((this.bufferMemory!= null)&&this.bufferMemory.equals(rhs.bufferMemory))))&&((this.lingerMS == rhs.lingerMS)||((this.lingerMS!= null)&&this.lingerMS.equals(rhs.lingerMS))))&&((this.securityProtocol == rhs.securityProtocol)||((this.securityProtocol!= null)&&this.securityProtocol.equals(rhs.securityProtocol))))&&((this.sSLKeyPassword == rhs.sSLKeyPassword)||((this.sSLKeyPassword!= null)&&this.sSLKeyPassword.equals(rhs.sSLKeyPassword))));
    }


    /**
     * Kafka security protocol config
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SecurityProtocol {

        PLAINTEXT("PLAINTEXT"),
        SSL("SSL");
        private final String value;
        private final static Map<String, KafkaEventConfiguration.SecurityProtocol> CONSTANTS = new HashMap<String, KafkaEventConfiguration.SecurityProtocol>();

        static {
            for (KafkaEventConfiguration.SecurityProtocol c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SecurityProtocol(String value) {
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
        public static KafkaEventConfiguration.SecurityProtocol fromValue(String value) {
            KafkaEventConfiguration.SecurityProtocol constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
