
package org.openmetadata.schema.email;

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
 * EmailRequest
 * <p>
 * This schema defines the Email Request for creating Email
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "senderName",
    "senderMail",
    "recipientMails",
    "ccMails",
    "bccMails",
    "subject",
    "contentType",
    "content"
})
@Generated("jsonschema2pojo")
public class EmailRequest {

    /**
     * Sender Name
     * 
     */
    @JsonProperty("senderName")
    @JsonPropertyDescription("Sender Name")
    private String senderName;
    /**
     * From Email Address
     * 
     */
    @JsonProperty("senderMail")
    @JsonPropertyDescription("From Email Address")
    private String senderMail;
    /**
     * List of Receiver Name with Email
     * 
     */
    @JsonProperty("recipientMails")
    @JsonPropertyDescription("List of Receiver Name with Email")
    @Valid
    private List<NameEmailPair> recipientMails = new ArrayList<NameEmailPair>();
    /**
     * List of CC
     * 
     */
    @JsonProperty("ccMails")
    @JsonPropertyDescription("List of CC")
    @Valid
    private List<NameEmailPair> ccMails = new ArrayList<NameEmailPair>();
    /**
     * List of BCC
     * 
     */
    @JsonProperty("bccMails")
    @JsonPropertyDescription("List of BCC")
    @Valid
    private List<NameEmailPair> bccMails = new ArrayList<NameEmailPair>();
    /**
     * Subject for Mail
     * (Required)
     * 
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("Subject for Mail")
    @NotNull
    private String subject;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contentType")
    @NotNull
    private EmailRequest.ContentType contentType = EmailRequest.ContentType.fromValue("plain");
    /**
     * Content for mail
     * 
     */
    @JsonProperty("content")
    @JsonPropertyDescription("Content for mail")
    private String content;

    /**
     * Sender Name
     * 
     */
    @JsonProperty("senderName")
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sender Name
     * 
     */
    @JsonProperty("senderName")
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public EmailRequest withSenderName(String senderName) {
        this.senderName = senderName;
        return this;
    }

    /**
     * From Email Address
     * 
     */
    @JsonProperty("senderMail")
    public String getSenderMail() {
        return senderMail;
    }

    /**
     * From Email Address
     * 
     */
    @JsonProperty("senderMail")
    public void setSenderMail(String senderMail) {
        this.senderMail = senderMail;
    }

    public EmailRequest withSenderMail(String senderMail) {
        this.senderMail = senderMail;
        return this;
    }

    /**
     * List of Receiver Name with Email
     * 
     */
    @JsonProperty("recipientMails")
    public List<NameEmailPair> getRecipientMails() {
        return recipientMails;
    }

    /**
     * List of Receiver Name with Email
     * 
     */
    @JsonProperty("recipientMails")
    public void setRecipientMails(List<NameEmailPair> recipientMails) {
        this.recipientMails = recipientMails;
    }

    public EmailRequest withRecipientMails(List<NameEmailPair> recipientMails) {
        this.recipientMails = recipientMails;
        return this;
    }

    /**
     * List of CC
     * 
     */
    @JsonProperty("ccMails")
    public List<NameEmailPair> getCcMails() {
        return ccMails;
    }

    /**
     * List of CC
     * 
     */
    @JsonProperty("ccMails")
    public void setCcMails(List<NameEmailPair> ccMails) {
        this.ccMails = ccMails;
    }

    public EmailRequest withCcMails(List<NameEmailPair> ccMails) {
        this.ccMails = ccMails;
        return this;
    }

    /**
     * List of BCC
     * 
     */
    @JsonProperty("bccMails")
    public List<NameEmailPair> getBccMails() {
        return bccMails;
    }

    /**
     * List of BCC
     * 
     */
    @JsonProperty("bccMails")
    public void setBccMails(List<NameEmailPair> bccMails) {
        this.bccMails = bccMails;
    }

    public EmailRequest withBccMails(List<NameEmailPair> bccMails) {
        this.bccMails = bccMails;
        return this;
    }

    /**
     * Subject for Mail
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * Subject for Mail
     * (Required)
     * 
     */
    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public EmailRequest withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contentType")
    public EmailRequest.ContentType getContentType() {
        return contentType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contentType")
    public void setContentType(EmailRequest.ContentType contentType) {
        this.contentType = contentType;
    }

    public EmailRequest withContentType(EmailRequest.ContentType contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Content for mail
     * 
     */
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     * Content for mail
     * 
     */
    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    public EmailRequest withContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmailRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("senderName");
        sb.append('=');
        sb.append(((this.senderName == null)?"<null>":this.senderName));
        sb.append(',');
        sb.append("senderMail");
        sb.append('=');
        sb.append(((this.senderMail == null)?"<null>":this.senderMail));
        sb.append(',');
        sb.append("recipientMails");
        sb.append('=');
        sb.append(((this.recipientMails == null)?"<null>":this.recipientMails));
        sb.append(',');
        sb.append("ccMails");
        sb.append('=');
        sb.append(((this.ccMails == null)?"<null>":this.ccMails));
        sb.append(',');
        sb.append("bccMails");
        sb.append('=');
        sb.append(((this.bccMails == null)?"<null>":this.bccMails));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null)?"<null>":this.subject));
        sb.append(',');
        sb.append("contentType");
        sb.append('=');
        sb.append(((this.contentType == null)?"<null>":this.contentType));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
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
        result = ((result* 31)+((this.senderName == null)? 0 :this.senderName.hashCode()));
        result = ((result* 31)+((this.subject == null)? 0 :this.subject.hashCode()));
        result = ((result* 31)+((this.recipientMails == null)? 0 :this.recipientMails.hashCode()));
        result = ((result* 31)+((this.bccMails == null)? 0 :this.bccMails.hashCode()));
        result = ((result* 31)+((this.contentType == null)? 0 :this.contentType.hashCode()));
        result = ((result* 31)+((this.senderMail == null)? 0 :this.senderMail.hashCode()));
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        result = ((result* 31)+((this.ccMails == null)? 0 :this.ccMails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmailRequest) == false) {
            return false;
        }
        EmailRequest rhs = ((EmailRequest) other);
        return (((((((((this.senderName == rhs.senderName)||((this.senderName!= null)&&this.senderName.equals(rhs.senderName)))&&((this.subject == rhs.subject)||((this.subject!= null)&&this.subject.equals(rhs.subject))))&&((this.recipientMails == rhs.recipientMails)||((this.recipientMails!= null)&&this.recipientMails.equals(rhs.recipientMails))))&&((this.bccMails == rhs.bccMails)||((this.bccMails!= null)&&this.bccMails.equals(rhs.bccMails))))&&((this.contentType == rhs.contentType)||((this.contentType!= null)&&this.contentType.equals(rhs.contentType))))&&((this.senderMail == rhs.senderMail)||((this.senderMail!= null)&&this.senderMail.equals(rhs.senderMail))))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))))&&((this.ccMails == rhs.ccMails)||((this.ccMails!= null)&&this.ccMails.equals(rhs.ccMails))));
    }

    @Generated("jsonschema2pojo")
    public enum ContentType {

        PLAIN("plain"),
        HTML("html");
        private final String value;
        private final static Map<String, EmailRequest.ContentType> CONSTANTS = new HashMap<String, EmailRequest.ContentType>();

        static {
            for (EmailRequest.ContentType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ContentType(String value) {
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
        public static EmailRequest.ContentType fromValue(String value) {
            EmailRequest.ContentType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
