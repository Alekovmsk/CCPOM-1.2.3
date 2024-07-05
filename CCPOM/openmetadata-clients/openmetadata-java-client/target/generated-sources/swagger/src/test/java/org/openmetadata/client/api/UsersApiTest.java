package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.model.AuthenticationMechanism;
import org.openmetadata.client.model.ChangePasswordRequest;
import org.openmetadata.client.model.CreatePersonalToken;
import org.openmetadata.client.model.CreateUser;
import org.openmetadata.client.model.CsvImportResult;
import org.openmetadata.client.model.EmailRequest;
import org.openmetadata.client.model.EntityHistory;
import org.openmetadata.client.model.EntityReference;
import org.openmetadata.client.model.GenerateTokenRequest;
import org.openmetadata.client.model.JWTAuthMechanism;
import org.openmetadata.client.model.JwtResponse;
import org.openmetadata.client.model.LoginRequest;
import org.openmetadata.client.model.LogoutRequest;
import org.openmetadata.client.model.PasswordResetRequest;
import org.openmetadata.client.model.PersonalAccessToken;
import org.openmetadata.client.model.PersonalAccessTokenList;
import org.openmetadata.client.model.RegistrationRequest;
import org.openmetadata.client.model.RestoreEntity;
import org.openmetadata.client.model.RevokePersonalTokenRequest;
import org.openmetadata.client.model.RevokeTokenRequest;
import org.openmetadata.client.model.TokenRefreshRequest;
import java.util.UUID;
import org.openmetadata.client.model.User;
import org.openmetadata.client.model.UserList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
class UsersApiTest {

    private UsersApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(UsersApi.class);
    }

    
    /**
     * Change Password For User
     *
     * Create a new user.
     */
    @Test
    void changeUserPasswordTest() {
        ChangePasswordRequest changePasswordRequest = null;
        // User response = api.changeUserPassword(changePasswordRequest);

        // TODO: test validations
    }

    
    /**
     * Check if a email is already in use
     *
     * Check if a email is already in use
     */
    @Test
    void checkEmailInUseTest() {
        EmailRequest emailRequest = null;
        // Boolean response = api.checkEmailInUse(emailRequest);

        // TODO: test validations
    }

    
    /**
     * Check if a mail is verified
     *
     * Check if a mail is already in use
     */
    @Test
    void checkEmailIsVerifiedTest() {
        EmailRequest emailRequest = null;
        // Boolean response = api.checkEmailIsVerified(emailRequest);

        // TODO: test validations
    }

    
    /**
     * Confirm User Email
     *
     * Confirm User Email
     */
    @Test
    void confirmUserEmailTest() {
        String token = null;
        // api.confirmUserEmail(token);

        // TODO: test validations
    }

    /**
     * Confirm User Email
     *
     * Confirm User Email
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void confirmUserEmailTestQueryMap() {
        UsersApi.ConfirmUserEmailQueryParams queryParams = new UsersApi.ConfirmUserEmailQueryParams()
            .token(null);
        // api.confirmUserEmail(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update user
     *
     * Create or Update a user.
     */
    @Test
    void createOrUpdateUserTest() {
        CreateUser createUser = null;
        // CreateUser response = api.createOrUpdateUser(createUser);

        // TODO: test validations
    }

    
    /**
     * Provide access token to User
     *
     * Provide access token to User
     */
    @Test
    void createPersonalAccessTokenTest() {
        CreatePersonalToken createPersonalToken = null;
        // PersonalAccessToken response = api.createPersonalAccessToken(createPersonalToken);

        // TODO: test validations
    }

    
    /**
     * Create a user
     *
     * Create a new user.
     */
    @Test
    void createUserTest() {
        CreateUser createUser = null;
        // User response = api.createUser(createUser);

        // TODO: test validations
    }

    
    /**
     * Delete a user
     *
     * Users can&#39;t be deleted but are soft-deleted.
     */
    @Test
    void deleteUserTest() {
        UUID id = null;
        Boolean hardDelete = null;
        // api.deleteUser(id, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a user
     *
     * Users can&#39;t be deleted but are soft-deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteUserTestQueryMap() {
        UUID id = null;
        UsersApi.DeleteUserQueryParams queryParams = new UsersApi.DeleteUserQueryParams()
            .hardDelete(null);
        // api.deleteUser(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete a user
     *
     * Users can&#39;t be deleted but are soft-deleted.
     */
    @Test
    void deleteUserByNameTest() {
        String name = null;
        Boolean hardDelete = null;
        // api.deleteUserByName(name, hardDelete);

        // TODO: test validations
    }

    /**
     * Delete a user
     *
     * Users can&#39;t be deleted but are soft-deleted.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void deleteUserByNameTestQueryMap() {
        String name = null;
        UsersApi.DeleteUserByNameQueryParams queryParams = new UsersApi.DeleteUserByNameQueryParams()
            .hardDelete(null);
        // api.deleteUserByName(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Export users in a team in CSV format
     *
     * 
     */
    @Test
    void exportUsersTest() {
        String team = null;
        // String response = api.exportUsers(team);

        // TODO: test validations
    }

    /**
     * Export users in a team in CSV format
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void exportUsersTestQueryMap() {
        UsersApi.ExportUsersQueryParams queryParams = new UsersApi.ExportUsersQueryParams()
            .team(null);
        // String response = api.exportUsers(queryParams);

    // TODO: test validations
    }
    
    /**
     * Generate JWT Token for a Bot User
     *
     * Generate JWT Token for a Bot User.
     */
    @Test
    void generateJWTTokenForBotUserTest() {
        UUID id = null;
        GenerateTokenRequest generateTokenRequest = null;
        // String response = api.generateJWTTokenForBotUser(id, generateTokenRequest);

        // TODO: test validations
    }

    
    /**
     * Generate Password Reset Link
     *
     * Generate Password Reset Link
     */
    @Test
    void generatePasswordResetLinkTest() {
        EmailRequest emailRequest = null;
        // api.generatePasswordResetLink(emailRequest);

        // TODO: test validations
    }

    
    /**
     * Generate a random password
     *
     * Generate a random password
     */
    @Test
    void generateRandomPwdTest() {
        // api.generateRandomPwd();

        // TODO: test validations
    }

    
    /**
     * Get Authentication Mechanism for a Bot User
     *
     * Get Authentication Mechanism for a Bot User.
     */
    @Test
    void getAuthenticationMechanismBotUserTest() {
        UUID id = null;
        // AuthenticationMechanism response = api.getAuthenticationMechanismBotUser(id);

        // TODO: test validations
    }

    
    /**
     * Get CSV documentation for user import/export
     *
     * 
     */
    @Test
    void getCsvDocumentation4Test() {
        // String response = api.getCsvDocumentation4();

        // TODO: test validations
    }

    
    /**
     * Get current logged in user
     *
     * Get the user who is authenticated and is currently logged in.
     */
    @Test
    void getCurrentLoggedInUserTest() {
        String fields = null;
        // User response = api.getCurrentLoggedInUser(fields);

        // TODO: test validations
    }

    /**
     * Get current logged in user
     *
     * Get the user who is authenticated and is currently logged in.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getCurrentLoggedInUserTestQueryMap() {
        UsersApi.GetCurrentLoggedInUserQueryParams queryParams = new UsersApi.GetCurrentLoggedInUserQueryParams()
            .fields(null);
        // User response = api.getCurrentLoggedInUser(queryParams);

    // TODO: test validations
    }
    
    /**
     * Get group type of teams for current logged in user
     *
     * Get the group type of teams of user who is authenticated and is currently logged in.
     */
    @Test
    void getCurrentLoggedInUserGroupTeamsTest() {
        // List<EntityReference> response = api.getCurrentLoggedInUserGroupTeams();

        // TODO: test validations
    }

    
    /**
     * Get JWT Token for a Bot User
     *
     * Get JWT Token for a Bot User.
     */
    @Test
    void getJWTTokenForBotUserTest() {
        UUID id = null;
        // JWTAuthMechanism response = api.getJWTTokenForBotUser(id);

        // TODO: test validations
    }

    
    /**
     * Get personal access token to User
     *
     * Get a personal access token
     */
    @Test
    void getPersonalAccessTokenTest() {
        String username = null;
        // PersonalAccessTokenList response = api.getPersonalAccessToken(username);

        // TODO: test validations
    }

    /**
     * Get personal access token to User
     *
     * Get a personal access token
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getPersonalAccessTokenTestQueryMap() {
        UsersApi.GetPersonalAccessTokenQueryParams queryParams = new UsersApi.GetPersonalAccessTokenQueryParams()
            .username(null);
        // PersonalAccessTokenList response = api.getPersonalAccessToken(queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a version of the user
     *
     * Get a version of the user by given &#x60;id&#x60;
     */
    @Test
    void getSpecificUserVersionTest() {
        UUID id = null;
        String version = null;
        // User response = api.getSpecificUserVersion(id, version);

        // TODO: test validations
    }

    
    /**
     * Get a user by name
     *
     * Get a user by &#x60;name&#x60;.
     */
    @Test
    void getUserByFQNTest() {
        String name = null;
        String fields = null;
        String include = null;
        // User response = api.getUserByFQN(name, fields, include);

        // TODO: test validations
    }

    /**
     * Get a user by name
     *
     * Get a user by &#x60;name&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getUserByFQNTestQueryMap() {
        String name = null;
        UsersApi.GetUserByFQNQueryParams queryParams = new UsersApi.GetUserByFQNQueryParams()
            .fields(null)
            .include(null);
        // User response = api.getUserByFQN(name, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a user
     *
     * Get a user by &#x60;id&#x60;
     */
    @Test
    void getUserByIDTest() {
        UUID id = null;
        String fields = null;
        String include = null;
        // User response = api.getUserByID(id, fields, include);

        // TODO: test validations
    }

    /**
     * Get a user
     *
     * Get a user by &#x60;id&#x60;
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getUserByIDTestQueryMap() {
        UUID id = null;
        UsersApi.GetUserByIDQueryParams queryParams = new UsersApi.GetUserByIDQueryParams()
            .fields(null)
            .include(null);
        // User response = api.getUserByID(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Import from CSV to create, and update teams.
     *
     * 
     */
    @Test
    void importTeams1Test() {
        String team = null;
        Boolean dryRun = null;
        String body = null;
        // CsvImportResult response = api.importTeams1(team, dryRun, body);

        // TODO: test validations
    }

    /**
     * Import from CSV to create, and update teams.
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void importTeams1TestQueryMap() {
        String body = null;
        UsersApi.ImportTeams1QueryParams queryParams = new UsersApi.ImportTeams1QueryParams()
            .team(null)
            .dryRun(null);
        // CsvImportResult response = api.importTeams1(body, queryParams);

    // TODO: test validations
    }
    
    /**
     * List user versions
     *
     * Get a list of all the versions of a user identified by &#x60;id&#x60;
     */
    @Test
    void listAllUserVersionTest() {
        UUID id = null;
        // EntityHistory response = api.listAllUserVersion(id);

        // TODO: test validations
    }

    
    /**
     * List users
     *
     * Get a list of users. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     */
    @Test
    void listUsersTest() {
        String fields = null;
        String team = null;
        Integer limit = null;
        String before = null;
        String after = null;
        Boolean isAdmin = null;
        Boolean isBot = null;
        String include = null;
        // UserList response = api.listUsers(fields, team, limit, before, after, isAdmin, isBot, include);

        // TODO: test validations
    }

    /**
     * List users
     *
     * Get a list of users. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listUsersTestQueryMap() {
        UsersApi.ListUsersQueryParams queryParams = new UsersApi.ListUsersQueryParams()
            .fields(null)
            .team(null)
            .limit(null)
            .before(null)
            .after(null)
            .isAdmin(null)
            .isBot(null)
            .include(null);
        // UserList response = api.listUsers(queryParams);

    // TODO: test validations
    }
    
    /**
     * Login User with email (plain-text) and Password (encoded in base 64)
     *
     * Login User with email(plain-text) and Password (encoded in base 64)
     */
    @Test
    void loginUserWithPwdTest() {
        LoginRequest loginRequest = null;
        // JwtResponse response = api.loginUserWithPwd(loginRequest);

        // TODO: test validations
    }

    
    /**
     * Logout a User(Only called for saml and basic Auth)
     *
     * Logout a User(Only called for saml and basic Auth)
     */
    @Test
    void logoutUserTest() {
        LogoutRequest logoutRequest = null;
        // api.logoutUser(logoutRequest);

        // TODO: test validations
    }

    
    /**
     * Update a user
     *
     * Update an existing user using JsonPatch.
     */
    @Test
    void patchUserTest() {
        UUID id = null;
        Object body = null;
        // api.patchUser(id, body);

        // TODO: test validations
    }

    
    /**
     * Provide access token to User with refresh token
     *
     * Provide access token to User with refresh token
     */
    @Test
    void refreshTokenTest() {
        TokenRefreshRequest tokenRefreshRequest = null;
        // JwtResponse response = api.refreshToken(tokenRefreshRequest);

        // TODO: test validations
    }

    
    /**
     * Register User
     *
     * Register a new User
     */
    @Test
    void registerUserTest() {
        RegistrationRequest registrationRequest = null;
        // api.registerUser(registrationRequest);

        // TODO: test validations
    }

    
    /**
     * Resend Registration Token
     *
     * Resend Registration Token
     */
    @Test
    void resendRegistrationTokenTest() {
        String user = null;
        // api.resendRegistrationToken(user);

        // TODO: test validations
    }

    /**
     * Resend Registration Token
     *
     * Resend Registration Token
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void resendRegistrationTokenTestQueryMap() {
        UsersApi.ResendRegistrationTokenQueryParams queryParams = new UsersApi.ResendRegistrationTokenQueryParams()
            .user(null);
        // api.resendRegistrationToken(queryParams);

    // TODO: test validations
    }
    
    /**
     * Reset Password For User
     *
     * Reset User Password
     */
    @Test
    void resetUserPasswordTest() {
        PasswordResetRequest passwordResetRequest = null;
        // User response = api.resetUserPassword(passwordResetRequest);

        // TODO: test validations
    }

    
    /**
     * Restore a soft deleted User.
     *
     * Restore a soft deleted User.
     */
    @Test
    void restore35Test() {
        RestoreEntity restoreEntity = null;
        // User response = api.restore35(restoreEntity);

        // TODO: test validations
    }

    
    /**
     * Revoke JWT Token for a Bot User
     *
     * Revoke JWT Token for a Bot User.
     */
    @Test
    void revokeJWTTokenForBotUserTest() {
        RevokeTokenRequest revokeTokenRequest = null;
        // JWTAuthMechanism response = api.revokeJWTTokenForBotUser(revokeTokenRequest);

        // TODO: test validations
    }

    
    /**
     * Revoke personal access token to User
     *
     * Revoke personal access token
     */
    @Test
    void revokePersonalAccessTokenTest() {
        String username = null;
        Boolean removeAll = null;
        RevokePersonalTokenRequest revokePersonalTokenRequest = null;
        // PersonalAccessTokenList response = api.revokePersonalAccessToken(username, removeAll, revokePersonalTokenRequest);

        // TODO: test validations
    }

    /**
     * Revoke personal access token to User
     *
     * Revoke personal access token
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void revokePersonalAccessTokenTestQueryMap() {
        RevokePersonalTokenRequest revokePersonalTokenRequest = null;
        UsersApi.RevokePersonalAccessTokenQueryParams queryParams = new UsersApi.RevokePersonalAccessTokenQueryParams()
            .username(null)
            .removeAll(null);
        // PersonalAccessTokenList response = api.revokePersonalAccessToken(revokePersonalTokenRequest, queryParams);

    // TODO: test validations
    }
    
}
