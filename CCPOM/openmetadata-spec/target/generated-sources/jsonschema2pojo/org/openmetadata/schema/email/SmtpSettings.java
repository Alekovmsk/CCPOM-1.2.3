
package org.openmetadata.schema.email;

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


/**
 * SmtpSettings
 * <p>
 * This schema defines the SMTP Settings for sending Email
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "emailingEntity",
    "supportUrl",
    "enableSmtpServer",
    "openMetadataUrl",
    "senderMail",
    "serverEndpoint",
    "serverPort",
    "username",
    "password",
    "transportationStrategy"
})
@Generated("jsonschema2pojo")
public class SmtpSettings {

    /**
     * Emailing Entity
     * 
     */
    @JsonProperty("emailingEntity")
    @JsonPropertyDescription("Emailing Entity")
    private String emailingEntity = "OpenMetadata";
    /**
     * Support Url
     * 
     */
    @JsonProperty("supportUrl")
    @JsonPropertyDescription("Support Url")
    private String supportUrl = "https://slack.open-metadata.org";
    /**
     * If this is enable password will details will be shared on mail
     * 
     */
    @JsonProperty("enableSmtpServer")
    @JsonPropertyDescription("If this is enable password will details will be shared on mail")
    private Boolean enableSmtpServer = false;
    /**
     * Openmetadata Server Endpoint
     * (Required)
     * 
     */
    @JsonProperty("openMetadataUrl")
    @JsonPropertyDescription("Openmetadata Server Endpoint")
    @NotNull
    private String openMetadataUrl;
    /**
     * Mail of the sender
     * (Required)
     * 
     */
    @JsonProperty("senderMail")
    @JsonPropertyDescription("Mail of the sender")
    @NotNull
    private String senderMail;
    /**
     * Smtp Server Endpoint
     * (Required)
     * 
     */
    @JsonProperty("serverEndpoint")
    @JsonPropertyDescription("Smtp Server Endpoint")
    @NotNull
    private String serverEndpoint;
    /**
     * Smtp Server Port
     * (Required)
     * 
     */
    @JsonProperty("serverPort")
    @JsonPropertyDescription("Smtp Server Port")
    @NotNull
    private Integer serverPort;
    /**
     * Smtp Server Username
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Smtp Server Username")
    @NotNull
    private String username;
    /**
     * Smtp Server Password
     * (Required)
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Smtp Server Password")
    @NotNull
    private String password;
    @JsonProperty("transportationStrategy")
    private SmtpSettings.TransportationStrategy transportationStrategy = SmtpSettings.TransportationStrategy.fromValue("SMTP");

    /**
     * Emailing Entity
     * 
     */
    @JsonProperty("emailingEntity")
    public String getEmailingEntity() {
        return emailingEntity;
    }

    /**
     * Emailing Entity
     * 
     */
    @JsonProperty("emailingEntity")
    public void setEmailingEntity(String emailingEntity) {
        this.emailingEntity = emailingEntity;
    }

    public SmtpSettings withEmailingEntity(String emailingEntity) {
        this.emailingEntity = emailingEntity;
        return this;
    }

    /**
     * Support Url
     * 
     */
    @JsonProperty("supportUrl")
    public String getSupportUrl() {
        return supportUrl;
    }

    /**
     * Support Url
     * 
     */
    @JsonProperty("supportUrl")
    public void setSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
    }

    public SmtpSettings withSupportUrl(String supportUrl) {
        this.supportUrl = supportUrl;
        return this;
    }

    /**
     * If this is enable password will details will be shared on mail
     * 
     */
    @JsonProperty("enableSmtpServer")
    public Boolean getEnableSmtpServer() {
        return enableSmtpServer;
    }

    /**
     * If this is enable password will details will be shared on mail
     * 
     */
    @JsonProperty("enableSmtpServer")
    public void setEnableSmtpServer(Boolean enableSmtpServer) {
        this.enableSmtpServer = enableSmtpServer;
    }

    public SmtpSettings withEnableSmtpServer(Boolean enableSmtpServer) {
        this.enableSmtpServer = enableSmtpServer;
        return this;
    }

    /**
     * Openmetadata Server Endpoint
     * (Required)
     * 
     */
    @JsonProperty("openMetadataUrl")
    public String getOpenMetadataUrl() {
        return openMetadataUrl;
    }

    /**
     * Openmetadata Server Endpoint
     * (Required)
     * 
     */
    @JsonProperty("openMetadataUrl")
    public void setOpenMetadataUrl(String openMetadataUrl) {
        this.openMetadataUrl = openMetadataUrl;
    }

    public SmtpSettings withOpenMetadataUrl(String openMetadataUrl) {
        this.openMetadataUrl = openMetadataUrl;
        return this;
    }

    /**
     * Mail of the sender
     * (Required)
     * 
     */
    @JsonProperty("senderMail")
    public String getSenderMail() {
        return senderMail;
    }

    /**
     * Mail of the sender
     * (Required)
     * 
     */
    @JsonProperty("senderMail")
    public void setSenderMail(String senderMail) {
        this.senderMail = senderMail;
    }

    public SmtpSettings withSenderMail(String senderMail) {
        this.senderMail = senderMail;
        return this;
    }

    /**
     * Smtp Server Endpoint
     * (Required)
     * 
     */
    @JsonProperty("serverEndpoint")
    public String getServerEndpoint() {
        return serverEndpoint;
    }

    /**
     * Smtp Server Endpoint
     * (Required)
     * 
     */
    @JsonProperty("serverEndpoint")
    public void setServerEndpoint(String serverEndpoint) {
        this.serverEndpoint = serverEndpoint;
    }

    public SmtpSettings withServerEndpoint(String serverEndpoint) {
        this.serverEndpoint = serverEndpoint;
        return this;
    }

    /**
     * Smtp Server Port
     * (Required)
     * 
     */
    @JsonProperty("serverPort")
    public Integer getServerPort() {
        return serverPort;
    }

    /**
     * Smtp Server Port
     * (Required)
     * 
     */
    @JsonProperty("serverPort")
    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    public SmtpSettings withServerPort(Integer serverPort) {
        this.serverPort = serverPort;
        return this;
    }

    /**
     * Smtp Server Username
     * (Required)
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Smtp Server Username
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public SmtpSettings withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Smtp Server Password
     * (Required)
     * 
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * Smtp Server Password
     * (Required)
     * 
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public SmtpSettings withPassword(String password) {
        this.password = password;
        return this;
    }

    @JsonProperty("transportationStrategy")
    public SmtpSettings.TransportationStrategy getTransportationStrategy() {
        return transportationStrategy;
    }

    @JsonProperty("transportationStrategy")
    public void setTransportationStrategy(SmtpSettings.TransportationStrategy transportationStrategy) {
        this.transportationStrategy = transportationStrategy;
    }

    public SmtpSettings withTransportationStrategy(SmtpSettings.TransportationStrategy transportationStrategy) {
        this.transportationStrategy = transportationStrategy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SmtpSettings.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("emailingEntity");
        sb.append('=');
        sb.append(((this.emailingEntity == null)?"<null>":this.emailingEntity));
        sb.append(',');
        sb.append("supportUrl");
        sb.append('=');
        sb.append(((this.supportUrl == null)?"<null>":this.supportUrl));
        sb.append(',');
        sb.append("enableSmtpServer");
        sb.append('=');
        sb.append(((this.enableSmtpServer == null)?"<null>":this.enableSmtpServer));
        sb.append(',');
        sb.append("openMetadataUrl");
        sb.append('=');
        sb.append(((this.openMetadataUrl == null)?"<null>":this.openMetadataUrl));
        sb.append(',');
        sb.append("senderMail");
        sb.append('=');
        sb.append(((this.senderMail == null)?"<null>":this.senderMail));
        sb.append(',');
        sb.append("serverEndpoint");
        sb.append('=');
        sb.append(((this.serverEndpoint == null)?"<null>":this.serverEndpoint));
        sb.append(',');
        sb.append("serverPort");
        sb.append('=');
        sb.append(((this.serverPort == null)?"<null>":this.serverPort));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("transportationStrategy");
        sb.append('=');
        sb.append(((this.transportationStrategy == null)?"<null>":this.transportationStrategy));
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
        result = ((result* 31)+((this.enableSmtpServer == null)? 0 :this.enableSmtpServer.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.emailingEntity == null)? 0 :this.emailingEntity.hashCode()));
        result = ((result* 31)+((this.serverEndpoint == null)? 0 :this.serverEndpoint.hashCode()));
        result = ((result* 31)+((this.supportUrl == null)? 0 :this.supportUrl.hashCode()));
        result = ((result* 31)+((this.openMetadataUrl == null)? 0 :this.openMetadataUrl.hashCode()));
        result = ((result* 31)+((this.transportationStrategy == null)? 0 :this.transportationStrategy.hashCode()));
        result = ((result* 31)+((this.serverPort == null)? 0 :this.serverPort.hashCode()));
        result = ((result* 31)+((this.senderMail == null)? 0 :this.senderMail.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SmtpSettings) == false) {
            return false;
        }
        SmtpSettings rhs = ((SmtpSettings) other);
        return (((((((((((this.enableSmtpServer == rhs.enableSmtpServer)||((this.enableSmtpServer!= null)&&this.enableSmtpServer.equals(rhs.enableSmtpServer)))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.emailingEntity == rhs.emailingEntity)||((this.emailingEntity!= null)&&this.emailingEntity.equals(rhs.emailingEntity))))&&((this.serverEndpoint == rhs.serverEndpoint)||((this.serverEndpoint!= null)&&this.serverEndpoint.equals(rhs.serverEndpoint))))&&((this.supportUrl == rhs.supportUrl)||((this.supportUrl!= null)&&this.supportUrl.equals(rhs.supportUrl))))&&((this.openMetadataUrl == rhs.openMetadataUrl)||((this.openMetadataUrl!= null)&&this.openMetadataUrl.equals(rhs.openMetadataUrl))))&&((this.transportationStrategy == rhs.transportationStrategy)||((this.transportationStrategy!= null)&&this.transportationStrategy.equals(rhs.transportationStrategy))))&&((this.serverPort == rhs.serverPort)||((this.serverPort!= null)&&this.serverPort.equals(rhs.serverPort))))&&((this.senderMail == rhs.senderMail)||((this.senderMail!= null)&&this.senderMail.equals(rhs.senderMail))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

    @Generated("jsonschema2pojo")
    public enum TransportationStrategy {

        SMTP("SMTP"),
        SMTPS("SMTPS"),
        SMTP_TLS("SMTP_TLS");
        private final String value;
        private final static Map<String, SmtpSettings.TransportationStrategy> CONSTANTS = new HashMap<String, SmtpSettings.TransportationStrategy>();

        static {
            for (SmtpSettings.TransportationStrategy c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TransportationStrategy(String value) {
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
        public static SmtpSettings.TransportationStrategy fromValue(String value) {
            SmtpSettings.TransportationStrategy constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
