
package org.openmetadata.schema.settings;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines all possible filters enum in OpenMetadata.
 * 
 */
@Generated("jsonschema2pojo")
public enum SettingsType {

    AUTHORIZER_CONFIGURATION("authorizerConfiguration"),
    AUTHENTICATION_CONFIGURATION("authenticationConfiguration"),
    JWT_TOKEN_CONFIGURATION("jwtTokenConfiguration"),
    ELASTICSEARCH("elasticsearch"),
    EVENT_HANDLER_CONFIGURATION("eventHandlerConfiguration"),
    AIRFLOW_CONFIGURATION("airflowConfiguration"),
    FERNET_CONFIGURATION("fernetConfiguration"),
    SLACK_EVENT_PUBLISHERS("slackEventPublishers"),
    SECRETS_MANAGER_CONFIGURATION("secretsManagerConfiguration"),
    SANDBOX_MODE_ENABLED("sandboxModeEnabled"),
    SLACK_CHAT("slackChat"),
    EMAIL_CONFIGURATION("emailConfiguration"),
    CUSTOM_LOGO_CONFIGURATION("customLogoConfiguration"),
    LOGIN_CONFIGURATION("loginConfiguration"),
    SLACK_APP_CONFIGURATION("slackAppConfiguration"),
    SLACK_BOT("slackBot"),
    SLACK_INSTALLER("slackInstaller");
    private final String value;
    private final static Map<String, SettingsType> CONSTANTS = new HashMap<String, SettingsType>();

    static {
        for (SettingsType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SettingsType(String value) {
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
    public static SettingsType fromValue(String value) {
        SettingsType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
