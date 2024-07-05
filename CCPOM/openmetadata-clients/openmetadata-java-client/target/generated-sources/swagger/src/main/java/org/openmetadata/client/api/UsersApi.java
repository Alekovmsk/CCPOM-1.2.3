package org.openmetadata.client.api;

import org.openmetadata.client.ApiClient;
import org.openmetadata.client.EncodingUtils;
import org.openmetadata.client.model.ApiResponse;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T13:40:41.122769+03:00[Europe/Moscow]")
public interface UsersApi extends ApiClient.Api {


  /**
   * Change Password For User
   * Create a new user.
   * @param changePasswordRequest  (optional)
   * @return User
   */
  @RequestLine("PUT /v1/users/changePassword")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  User changeUserPassword(ChangePasswordRequest changePasswordRequest);

  /**
   * Change Password For User
   * Similar to <code>changeUserPassword</code> but it also returns the http response headers .
   * Create a new user.
   * @param changePasswordRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/users/changePassword")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<User> changeUserPasswordWithHttpInfo(ChangePasswordRequest changePasswordRequest);



  /**
   * Check if a email is already in use
   * Check if a email is already in use
   * @param emailRequest  (optional)
   * @return Boolean
   */
  @RequestLine("POST /v1/users/checkEmailInUse")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Boolean checkEmailInUse(EmailRequest emailRequest);

  /**
   * Check if a email is already in use
   * Similar to <code>checkEmailInUse</code> but it also returns the http response headers .
   * Check if a email is already in use
   * @param emailRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/users/checkEmailInUse")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Boolean> checkEmailInUseWithHttpInfo(EmailRequest emailRequest);



  /**
   * Check if a mail is verified
   * Check if a mail is already in use
   * @param emailRequest  (optional)
   * @return Boolean
   */
  @RequestLine("POST /v1/users/checkEmailVerified")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Boolean checkEmailIsVerified(EmailRequest emailRequest);

  /**
   * Check if a mail is verified
   * Similar to <code>checkEmailIsVerified</code> but it also returns the http response headers .
   * Check if a mail is already in use
   * @param emailRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/users/checkEmailVerified")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Boolean> checkEmailIsVerifiedWithHttpInfo(EmailRequest emailRequest);



  /**
   * Confirm User Email
   * Confirm User Email
   * @param token Token sent for Email Confirmation (optional)
   */
  @RequestLine("PUT /v1/users/registrationConfirmation?token={token}")
  @Headers({
    "Accept: application/json",
  })
  void confirmUserEmail(@Param("token") String token);

  /**
   * Confirm User Email
   * Similar to <code>confirmUserEmail</code> but it also returns the http response headers .
   * Confirm User Email
   * @param token Token sent for Email Confirmation (optional)
   */
  @RequestLine("PUT /v1/users/registrationConfirmation?token={token}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> confirmUserEmailWithHttpInfo(@Param("token") String token);


  /**
   * Confirm User Email
   * Confirm User Email
   * Note, this is equivalent to the other <code>confirmUserEmail</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConfirmUserEmailQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>token - Token sent for Email Confirmation (optional)</li>
   *   </ul>
   */
  @RequestLine("PUT /v1/users/registrationConfirmation?token={token}")
  @Headers({
  "Accept: application/json",
  })
  void confirmUserEmail(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Confirm User Email
  * Confirm User Email
  * Note, this is equivalent to the other <code>confirmUserEmail</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>token - Token sent for Email Confirmation (optional)</li>
      *   </ul>
      */
      @RequestLine("PUT /v1/users/registrationConfirmation?token={token}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> confirmUserEmailWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>confirmUserEmail</code> method in a fluent style.
   */
  public static class ConfirmUserEmailQueryParams extends HashMap<String, Object> {
    public ConfirmUserEmailQueryParams token(final String value) {
      put("token", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update user
   * Create or Update a user.
   * @param createUser  (optional)
   * @return CreateUser
   */
  @RequestLine("PUT /v1/users")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateUser createOrUpdateUser(CreateUser createUser);

  /**
   * Update user
   * Similar to <code>createOrUpdateUser</code> but it also returns the http response headers .
   * Create or Update a user.
   * @param createUser  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/users")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateUser> createOrUpdateUserWithHttpInfo(CreateUser createUser);



  /**
   * Provide access token to User
   * Provide access token to User
   * @param createPersonalToken  (optional)
   * @return PersonalAccessToken
   */
  @RequestLine("PUT /v1/users/security/token")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonalAccessToken createPersonalAccessToken(CreatePersonalToken createPersonalToken);

  /**
   * Provide access token to User
   * Similar to <code>createPersonalAccessToken</code> but it also returns the http response headers .
   * Provide access token to User
   * @param createPersonalToken  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/users/security/token")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonalAccessToken> createPersonalAccessTokenWithHttpInfo(CreatePersonalToken createPersonalToken);



  /**
   * Create a user
   * Create a new user.
   * @param createUser  (optional)
   * @return User
   */
  @RequestLine("POST /v1/users")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  User createUser(CreateUser createUser);

  /**
   * Create a user
   * Similar to <code>createUser</code> but it also returns the http response headers .
   * Create a new user.
   * @param createUser  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/users")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<User> createUserWithHttpInfo(CreateUser createUser);



  /**
   * Delete a user
   * Users can&#39;t be deleted but are soft-deleted.
   * @param id Id of the user (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/users/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteUser(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a user
   * Similar to <code>deleteUser</code> but it also returns the http response headers .
   * Users can&#39;t be deleted but are soft-deleted.
   * @param id Id of the user (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/users/{id}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteUserWithHttpInfo(@Param("id") UUID id, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a user
   * Users can&#39;t be deleted but are soft-deleted.
   * Note, this is equivalent to the other <code>deleteUser</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteUserQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the user (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/users/{id}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteUser(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a user
  * Users can&#39;t be deleted but are soft-deleted.
  * Note, this is equivalent to the other <code>deleteUser</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the user (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/users/{id}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteUserWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteUser</code> method in a fluent style.
   */
  public static class DeleteUserQueryParams extends HashMap<String, Object> {
    public DeleteUserQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete a user
   * Users can&#39;t be deleted but are soft-deleted.
   * @param name Name of the user (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/users/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  void deleteUserByName(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);

  /**
   * Delete a user
   * Similar to <code>deleteUserByName</code> but it also returns the http response headers .
   * Users can&#39;t be deleted but are soft-deleted.
   * @param name Name of the user (required)
   * @param hardDelete Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   */
  @RequestLine("DELETE /v1/users/name/{name}?hardDelete={hardDelete}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteUserByNameWithHttpInfo(@Param("name") String name, @Param("hardDelete") Boolean hardDelete);


  /**
   * Delete a user
   * Users can&#39;t be deleted but are soft-deleted.
   * Note, this is equivalent to the other <code>deleteUserByName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteUserByNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the user (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   */
  @RequestLine("DELETE /v1/users/name/{name}?hardDelete={hardDelete}")
  @Headers({
  "Accept: application/json",
  })
  void deleteUserByName(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Delete a user
  * Users can&#39;t be deleted but are soft-deleted.
  * Note, this is equivalent to the other <code>deleteUserByName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the user (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>hardDelete - Hard delete the entity. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
      */
      @RequestLine("DELETE /v1/users/name/{name}?hardDelete={hardDelete}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> deleteUserByNameWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteUserByName</code> method in a fluent style.
   */
  public static class DeleteUserByNameQueryParams extends HashMap<String, Object> {
    public DeleteUserByNameQueryParams hardDelete(final Boolean value) {
      put("hardDelete", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Export users in a team in CSV format
   * 
   * @param team Name of the team to under which the users are imported to (required)
   * @return String
   */
  @RequestLine("GET /v1/users/export?team={team}")
  @Headers({
    "Accept: application/json",
  })
  String exportUsers(@Param("team") String team);

  /**
   * Export users in a team in CSV format
   * Similar to <code>exportUsers</code> but it also returns the http response headers .
   * 
   * @param team Name of the team to under which the users are imported to (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/users/export?team={team}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<String> exportUsersWithHttpInfo(@Param("team") String team);


  /**
   * Export users in a team in CSV format
   * 
   * Note, this is equivalent to the other <code>exportUsers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ExportUsersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>team - Name of the team to under which the users are imported to (required)</li>
   *   </ul>
   * @return String
   */
  @RequestLine("GET /v1/users/export?team={team}")
  @Headers({
  "Accept: application/json",
  })
  String exportUsers(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Export users in a team in CSV format
  * 
  * Note, this is equivalent to the other <code>exportUsers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>team - Name of the team to under which the users are imported to (required)</li>
      *   </ul>
          * @return String
      */
      @RequestLine("GET /v1/users/export?team={team}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<String> exportUsersWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>exportUsers</code> method in a fluent style.
   */
  public static class ExportUsersQueryParams extends HashMap<String, Object> {
    public ExportUsersQueryParams team(final String value) {
      put("team", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Generate JWT Token for a Bot User
   * Generate JWT Token for a Bot User.
   * @param id Id of the user (required)
   * @param generateTokenRequest  (optional)
   * @return String
   */
  @RequestLine("PUT /v1/users/generateToken/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  String generateJWTTokenForBotUser(@Param("id") UUID id, GenerateTokenRequest generateTokenRequest);

  /**
   * Generate JWT Token for a Bot User
   * Similar to <code>generateJWTTokenForBotUser</code> but it also returns the http response headers .
   * Generate JWT Token for a Bot User.
   * @param id Id of the user (required)
   * @param generateTokenRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/users/generateToken/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<String> generateJWTTokenForBotUserWithHttpInfo(@Param("id") UUID id, GenerateTokenRequest generateTokenRequest);



  /**
   * Generate Password Reset Link
   * Generate Password Reset Link
   * @param emailRequest  (optional)
   */
  @RequestLine("POST /v1/users/generatePasswordResetLink")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void generatePasswordResetLink(EmailRequest emailRequest);

  /**
   * Generate Password Reset Link
   * Similar to <code>generatePasswordResetLink</code> but it also returns the http response headers .
   * Generate Password Reset Link
   * @param emailRequest  (optional)
   */
  @RequestLine("POST /v1/users/generatePasswordResetLink")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> generatePasswordResetLinkWithHttpInfo(EmailRequest emailRequest);



  /**
   * Generate a random password
   * Generate a random password
   */
  @RequestLine("GET /v1/users/generateRandomPwd")
  @Headers({
    "Accept: application/json",
  })
  void generateRandomPwd();

  /**
   * Generate a random password
   * Similar to <code>generateRandomPwd</code> but it also returns the http response headers .
   * Generate a random password
   */
  @RequestLine("GET /v1/users/generateRandomPwd")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> generateRandomPwdWithHttpInfo();



  /**
   * Get Authentication Mechanism for a Bot User
   * Get Authentication Mechanism for a Bot User.
   * @param id Id of the user (required)
   * @return AuthenticationMechanism
   */
  @RequestLine("GET /v1/users/auth-mechanism/{id}")
  @Headers({
    "Accept: application/json",
  })
  AuthenticationMechanism getAuthenticationMechanismBotUser(@Param("id") UUID id);

  /**
   * Get Authentication Mechanism for a Bot User
   * Similar to <code>getAuthenticationMechanismBotUser</code> but it also returns the http response headers .
   * Get Authentication Mechanism for a Bot User.
   * @param id Id of the user (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/users/auth-mechanism/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AuthenticationMechanism> getAuthenticationMechanismBotUserWithHttpInfo(@Param("id") UUID id);



  /**
   * Get CSV documentation for user import/export
   * 
   * @return String
   */
  @RequestLine("GET /v1/users/documentation/csv")
  @Headers({
    "Accept: application/json",
  })
  String getCsvDocumentation4();

  /**
   * Get CSV documentation for user import/export
   * Similar to <code>getCsvDocumentation4</code> but it also returns the http response headers .
   * 
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/users/documentation/csv")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<String> getCsvDocumentation4WithHttpInfo();



  /**
   * Get current logged in user
   * Get the user who is authenticated and is currently logged in.
   * @param fields Fields requested in the returned resource (optional)
   * @return User
   */
  @RequestLine("GET /v1/users/loggedInUser?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  User getCurrentLoggedInUser(@Param("fields") String fields);

  /**
   * Get current logged in user
   * Similar to <code>getCurrentLoggedInUser</code> but it also returns the http response headers .
   * Get the user who is authenticated and is currently logged in.
   * @param fields Fields requested in the returned resource (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/users/loggedInUser?fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<User> getCurrentLoggedInUserWithHttpInfo(@Param("fields") String fields);


  /**
   * Get current logged in user
   * Get the user who is authenticated and is currently logged in.
   * Note, this is equivalent to the other <code>getCurrentLoggedInUser</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCurrentLoggedInUserQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   </ul>
   * @return User
   */
  @RequestLine("GET /v1/users/loggedInUser?fields={fields}")
  @Headers({
  "Accept: application/json",
  })
  User getCurrentLoggedInUser(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get current logged in user
  * Get the user who is authenticated and is currently logged in.
  * Note, this is equivalent to the other <code>getCurrentLoggedInUser</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
      *   </ul>
          * @return User
      */
      @RequestLine("GET /v1/users/loggedInUser?fields={fields}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<User> getCurrentLoggedInUserWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getCurrentLoggedInUser</code> method in a fluent style.
   */
  public static class GetCurrentLoggedInUserQueryParams extends HashMap<String, Object> {
    public GetCurrentLoggedInUserQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get group type of teams for current logged in user
   * Get the group type of teams of user who is authenticated and is currently logged in.
   * @return List&lt;EntityReference&gt;
   */
  @RequestLine("GET /v1/users/loggedInUser/groupTeams")
  @Headers({
    "Accept: application/json",
  })
  List<EntityReference> getCurrentLoggedInUserGroupTeams();

  /**
   * Get group type of teams for current logged in user
   * Similar to <code>getCurrentLoggedInUserGroupTeams</code> but it also returns the http response headers .
   * Get the group type of teams of user who is authenticated and is currently logged in.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/users/loggedInUser/groupTeams")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<EntityReference>> getCurrentLoggedInUserGroupTeamsWithHttpInfo();



  /**
   * Get JWT Token for a Bot User
   * Get JWT Token for a Bot User.
   * @param id Id of the user (required)
   * @return JWTAuthMechanism
   */
  @RequestLine("GET /v1/users/token/{id}")
  @Headers({
    "Accept: application/json",
  })
  JWTAuthMechanism getJWTTokenForBotUser(@Param("id") UUID id);

  /**
   * Get JWT Token for a Bot User
   * Similar to <code>getJWTTokenForBotUser</code> but it also returns the http response headers .
   * Get JWT Token for a Bot User.
   * @param id Id of the user (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/users/token/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<JWTAuthMechanism> getJWTTokenForBotUserWithHttpInfo(@Param("id") UUID id);



  /**
   * Get personal access token to User
   * Get a personal access token
   * @param username User Name of the User for which to get. (Default &#x3D; &#x60;false&#x60;) (optional)
   * @return PersonalAccessTokenList
   */
  @RequestLine("GET /v1/users/security/token?username={username}")
  @Headers({
    "Accept: application/json",
  })
  PersonalAccessTokenList getPersonalAccessToken(@Param("username") String username);

  /**
   * Get personal access token to User
   * Similar to <code>getPersonalAccessToken</code> but it also returns the http response headers .
   * Get a personal access token
   * @param username User Name of the User for which to get. (Default &#x3D; &#x60;false&#x60;) (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/users/security/token?username={username}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PersonalAccessTokenList> getPersonalAccessTokenWithHttpInfo(@Param("username") String username);


  /**
   * Get personal access token to User
   * Get a personal access token
   * Note, this is equivalent to the other <code>getPersonalAccessToken</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPersonalAccessTokenQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>username - User Name of the User for which to get. (Default &#x3D; &#x60;false&#x60;) (optional)</li>
   *   </ul>
   * @return PersonalAccessTokenList
   */
  @RequestLine("GET /v1/users/security/token?username={username}")
  @Headers({
  "Accept: application/json",
  })
  PersonalAccessTokenList getPersonalAccessToken(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get personal access token to User
  * Get a personal access token
  * Note, this is equivalent to the other <code>getPersonalAccessToken</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>username - User Name of the User for which to get. (Default &#x3D; &#x60;false&#x60;) (optional)</li>
      *   </ul>
          * @return PersonalAccessTokenList
      */
      @RequestLine("GET /v1/users/security/token?username={username}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PersonalAccessTokenList> getPersonalAccessTokenWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getPersonalAccessToken</code> method in a fluent style.
   */
  public static class GetPersonalAccessTokenQueryParams extends HashMap<String, Object> {
    public GetPersonalAccessTokenQueryParams username(final String value) {
      put("username", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a version of the user
   * Get a version of the user by given &#x60;id&#x60;
   * @param id Id of the user (required)
   * @param version User version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return User
   */
  @RequestLine("GET /v1/users/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  User getSpecificUserVersion(@Param("id") UUID id, @Param("version") String version);

  /**
   * Get a version of the user
   * Similar to <code>getSpecificUserVersion</code> but it also returns the http response headers .
   * Get a version of the user by given &#x60;id&#x60;
   * @param id Id of the user (required)
   * @param version User version number in the form &#x60;major&#x60;.&#x60;minor&#x60; (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/users/{id}/versions/{version}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<User> getSpecificUserVersionWithHttpInfo(@Param("id") UUID id, @Param("version") String version);



  /**
   * Get a user by name
   * Get a user by &#x60;name&#x60;.
   * @param name Name of the user (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return User
   */
  @RequestLine("GET /v1/users/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  User getUserByFQN(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a user by name
   * Similar to <code>getUserByFQN</code> but it also returns the http response headers .
   * Get a user by &#x60;name&#x60;.
   * @param name Name of the user (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/users/name/{name}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<User> getUserByFQNWithHttpInfo(@Param("name") String name, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a user by name
   * Get a user by &#x60;name&#x60;.
   * Note, this is equivalent to the other <code>getUserByFQN</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetUserByFQNQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param name Name of the user (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return User
   */
  @RequestLine("GET /v1/users/name/{name}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  User getUserByFQN(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a user by name
  * Get a user by &#x60;name&#x60;.
  * Note, this is equivalent to the other <code>getUserByFQN</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param name Name of the user (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return User
      */
      @RequestLine("GET /v1/users/name/{name}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<User> getUserByFQNWithHttpInfo(@Param("name") String name, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getUserByFQN</code> method in a fluent style.
   */
  public static class GetUserByFQNQueryParams extends HashMap<String, Object> {
    public GetUserByFQNQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetUserByFQNQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a user
   * Get a user by &#x60;id&#x60;
   * @param id Id of the user (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return User
   */
  @RequestLine("GET /v1/users/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  User getUserByID(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);

  /**
   * Get a user
   * Similar to <code>getUserByID</code> but it also returns the http response headers .
   * Get a user by &#x60;id&#x60;
   * @param id Id of the user (required)
   * @param fields Fields requested in the returned resource (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/users/{id}?fields={fields}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<User> getUserByIDWithHttpInfo(@Param("id") UUID id, @Param("fields") String fields, @Param("include") String include);


  /**
   * Get a user
   * Get a user by &#x60;id&#x60;
   * Note, this is equivalent to the other <code>getUserByID</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetUserByIDQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id Id of the user (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return User
   */
  @RequestLine("GET /v1/users/{id}?fields={fields}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  User getUserByID(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Get a user
  * Get a user by &#x60;id&#x60;
  * Note, this is equivalent to the other <code>getUserByID</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id Id of the user (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return User
      */
      @RequestLine("GET /v1/users/{id}?fields={fields}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<User> getUserByIDWithHttpInfo(@Param("id") UUID id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getUserByID</code> method in a fluent style.
   */
  public static class GetUserByIDQueryParams extends HashMap<String, Object> {
    public GetUserByIDQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public GetUserByIDQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Import from CSV to create, and update teams.
   * 
   * @param team Name of the team to under which the users are imported to (required)
   * @param dryRun Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)
   * @param body  (optional)
   * @return CsvImportResult
   */
  @RequestLine("PUT /v1/users/import?team={team}&dryRun={dryRun}")
  @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
  })
  CsvImportResult importTeams1(@Param("team") String team, @Param("dryRun") Boolean dryRun, String body);

  /**
   * Import from CSV to create, and update teams.
   * Similar to <code>importTeams1</code> but it also returns the http response headers .
   * 
   * @param team Name of the team to under which the users are imported to (required)
   * @param dryRun Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)
   * @param body  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/users/import?team={team}&dryRun={dryRun}")
  @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
  })
  ApiResponse<CsvImportResult> importTeams1WithHttpInfo(@Param("team") String team, @Param("dryRun") Boolean dryRun, String body);


  /**
   * Import from CSV to create, and update teams.
   * 
   * Note, this is equivalent to the other <code>importTeams1</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ImportTeams1QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>team - Name of the team to under which the users are imported to (required)</li>
   *   <li>dryRun - Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)</li>
   *   </ul>
   * @return CsvImportResult
   */
  @RequestLine("PUT /v1/users/import?team={team}&dryRun={dryRun}")
  @Headers({
  "Content-Type: text/plain",
  "Accept: application/json",
  })
  CsvImportResult importTeams1(String body, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Import from CSV to create, and update teams.
  * 
  * Note, this is equivalent to the other <code>importTeams1</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>team - Name of the team to under which the users are imported to (required)</li>
          *   <li>dryRun - Dry-run when true is used for validating the CSV without really importing it. (default&#x3D;true) (optional, default to true)</li>
      *   </ul>
          * @return CsvImportResult
      */
      @RequestLine("PUT /v1/users/import?team={team}&dryRun={dryRun}")
      @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
      })
   ApiResponse<CsvImportResult> importTeams1WithHttpInfo(String body, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>importTeams1</code> method in a fluent style.
   */
  public static class ImportTeams1QueryParams extends HashMap<String, Object> {
    public ImportTeams1QueryParams team(final String value) {
      put("team", EncodingUtils.encode(value));
      return this;
    }
    public ImportTeams1QueryParams dryRun(final Boolean value) {
      put("dryRun", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List user versions
   * Get a list of all the versions of a user identified by &#x60;id&#x60;
   * @param id Id of the user (required)
   * @return EntityHistory
   */
  @RequestLine("GET /v1/users/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  EntityHistory listAllUserVersion(@Param("id") UUID id);

  /**
   * List user versions
   * Similar to <code>listAllUserVersion</code> but it also returns the http response headers .
   * Get a list of all the versions of a user identified by &#x60;id&#x60;
   * @param id Id of the user (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/users/{id}/versions")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EntityHistory> listAllUserVersionWithHttpInfo(@Param("id") UUID id);



  /**
   * List users
   * Get a list of users. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param team Filter users by team (optional)
   * @param limit Limit the number users returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of users before this cursor (optional)
   * @param after Returns list of users after this cursor (optional)
   * @param isAdmin Returns list of admin users if set to true (optional)
   * @param isBot Returns list of bot users if set to true (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return UserList
   */
  @RequestLine("GET /v1/users?fields={fields}&team={team}&limit={limit}&before={before}&after={after}&isAdmin={isAdmin}&isBot={isBot}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  UserList listUsers(@Param("fields") String fields, @Param("team") String team, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("isAdmin") Boolean isAdmin, @Param("isBot") Boolean isBot, @Param("include") String include);

  /**
   * List users
   * Similar to <code>listUsers</code> but it also returns the http response headers .
   * Get a list of users. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * @param fields Fields requested in the returned resource (optional)
   * @param team Filter users by team (optional)
   * @param limit Limit the number users returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)
   * @param before Returns list of users before this cursor (optional)
   * @param after Returns list of users after this cursor (optional)
   * @param isAdmin Returns list of admin users if set to true (optional)
   * @param isBot Returns list of bot users if set to true (optional)
   * @param include Include all, deleted, or non-deleted entities. (optional, default to non-deleted)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v1/users?fields={fields}&team={team}&limit={limit}&before={before}&after={after}&isAdmin={isAdmin}&isBot={isBot}&include={include}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<UserList> listUsersWithHttpInfo(@Param("fields") String fields, @Param("team") String team, @Param("limit") Integer limit, @Param("before") String before, @Param("after") String after, @Param("isAdmin") Boolean isAdmin, @Param("isBot") Boolean isBot, @Param("include") String include);


  /**
   * List users
   * Get a list of users. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
   * Note, this is equivalent to the other <code>listUsers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListUsersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Fields requested in the returned resource (optional)</li>
   *   <li>team - Filter users by team (optional)</li>
   *   <li>limit - Limit the number users returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
   *   <li>before - Returns list of users before this cursor (optional)</li>
   *   <li>after - Returns list of users after this cursor (optional)</li>
   *   <li>isAdmin - Returns list of admin users if set to true (optional)</li>
   *   <li>isBot - Returns list of bot users if set to true (optional)</li>
   *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
   *   </ul>
   * @return UserList
   */
  @RequestLine("GET /v1/users?fields={fields}&team={team}&limit={limit}&before={before}&after={after}&isAdmin={isAdmin}&isBot={isBot}&include={include}")
  @Headers({
  "Accept: application/json",
  })
  UserList listUsers(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * List users
  * Get a list of users. Use &#x60;fields&#x60; parameter to get only necessary fields. Use cursor-based pagination to limit the number entries in the list using &#x60;limit&#x60; and &#x60;before&#x60; or &#x60;after&#x60; query params.
  * Note, this is equivalent to the other <code>listUsers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>fields - Fields requested in the returned resource (optional)</li>
          *   <li>team - Filter users by team (optional)</li>
          *   <li>limit - Limit the number users returned. (1 to 1000000, default &#x3D; 10) (optional, default to 10)</li>
          *   <li>before - Returns list of users before this cursor (optional)</li>
          *   <li>after - Returns list of users after this cursor (optional)</li>
          *   <li>isAdmin - Returns list of admin users if set to true (optional)</li>
          *   <li>isBot - Returns list of bot users if set to true (optional)</li>
          *   <li>include - Include all, deleted, or non-deleted entities. (optional, default to non-deleted)</li>
      *   </ul>
          * @return UserList
      */
      @RequestLine("GET /v1/users?fields={fields}&team={team}&limit={limit}&before={before}&after={after}&isAdmin={isAdmin}&isBot={isBot}&include={include}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<UserList> listUsersWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listUsers</code> method in a fluent style.
   */
  public static class ListUsersQueryParams extends HashMap<String, Object> {
    public ListUsersQueryParams fields(final String value) {
      put("fields", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersQueryParams team(final String value) {
      put("team", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersQueryParams before(final String value) {
      put("before", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersQueryParams after(final String value) {
      put("after", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersQueryParams isAdmin(final Boolean value) {
      put("isAdmin", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersQueryParams isBot(final Boolean value) {
      put("isBot", EncodingUtils.encode(value));
      return this;
    }
    public ListUsersQueryParams include(final String value) {
      put("include", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Login User with email (plain-text) and Password (encoded in base 64)
   * Login User with email(plain-text) and Password (encoded in base 64)
   * @param loginRequest  (optional)
   * @return JwtResponse
   */
  @RequestLine("POST /v1/users/login")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JwtResponse loginUserWithPwd(LoginRequest loginRequest);

  /**
   * Login User with email (plain-text) and Password (encoded in base 64)
   * Similar to <code>loginUserWithPwd</code> but it also returns the http response headers .
   * Login User with email(plain-text) and Password (encoded in base 64)
   * @param loginRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/users/login")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JwtResponse> loginUserWithPwdWithHttpInfo(LoginRequest loginRequest);



  /**
   * Logout a User(Only called for saml and basic Auth)
   * Logout a User(Only called for saml and basic Auth)
   * @param logoutRequest  (optional)
   */
  @RequestLine("POST /v1/users/logout")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void logoutUser(LogoutRequest logoutRequest);

  /**
   * Logout a User(Only called for saml and basic Auth)
   * Similar to <code>logoutUser</code> but it also returns the http response headers .
   * Logout a User(Only called for saml and basic Auth)
   * @param logoutRequest  (optional)
   */
  @RequestLine("POST /v1/users/logout")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> logoutUserWithHttpInfo(LogoutRequest logoutRequest);



  /**
   * Update a user
   * Update an existing user using JsonPatch.
   * @param id Id of the user (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a user Documentation</a>
   */
  @RequestLine("PATCH /v1/users/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  void patchUser(@Param("id") UUID id, Object body);

  /**
   * Update a user
   * Similar to <code>patchUser</code> but it also returns the http response headers .
   * Update an existing user using JsonPatch.
   * @param id Id of the user (required)
   * @param body JsonPatch with array of operations (optional)
   * JsonPatch RFC
   * @see <a href="https://tools.ietf.org/html/rfc6902">Update a user Documentation</a>
   */
  @RequestLine("PATCH /v1/users/{id}")
  @Headers({
    "Content-Type: application/json-patch+json",
    "Accept: application/json",
  })
  ApiResponse<Void> patchUserWithHttpInfo(@Param("id") UUID id, Object body);



  /**
   * Provide access token to User with refresh token
   * Provide access token to User with refresh token
   * @param tokenRefreshRequest  (optional)
   * @return JwtResponse
   */
  @RequestLine("POST /v1/users/refresh")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JwtResponse refreshToken(TokenRefreshRequest tokenRefreshRequest);

  /**
   * Provide access token to User with refresh token
   * Similar to <code>refreshToken</code> but it also returns the http response headers .
   * Provide access token to User with refresh token
   * @param tokenRefreshRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/users/refresh")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JwtResponse> refreshTokenWithHttpInfo(TokenRefreshRequest tokenRefreshRequest);



  /**
   * Register User
   * Register a new User
   * @param registrationRequest  (optional)
   */
  @RequestLine("POST /v1/users/signup")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void registerUser(RegistrationRequest registrationRequest);

  /**
   * Register User
   * Similar to <code>registerUser</code> but it also returns the http response headers .
   * Register a new User
   * @param registrationRequest  (optional)
   */
  @RequestLine("POST /v1/users/signup")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> registerUserWithHttpInfo(RegistrationRequest registrationRequest);



  /**
   * Resend Registration Token
   * Resend Registration Token
   * @param user Token sent for Email Confirmation Earlier (optional)
   */
  @RequestLine("PUT /v1/users/resendRegistrationToken?user={user}")
  @Headers({
    "Accept: application/json",
  })
  void resendRegistrationToken(@Param("user") String user);

  /**
   * Resend Registration Token
   * Similar to <code>resendRegistrationToken</code> but it also returns the http response headers .
   * Resend Registration Token
   * @param user Token sent for Email Confirmation Earlier (optional)
   */
  @RequestLine("PUT /v1/users/resendRegistrationToken?user={user}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> resendRegistrationTokenWithHttpInfo(@Param("user") String user);


  /**
   * Resend Registration Token
   * Resend Registration Token
   * Note, this is equivalent to the other <code>resendRegistrationToken</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResendRegistrationTokenQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>user - Token sent for Email Confirmation Earlier (optional)</li>
   *   </ul>
   */
  @RequestLine("PUT /v1/users/resendRegistrationToken?user={user}")
  @Headers({
  "Accept: application/json",
  })
  void resendRegistrationToken(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Resend Registration Token
  * Resend Registration Token
  * Note, this is equivalent to the other <code>resendRegistrationToken</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>user - Token sent for Email Confirmation Earlier (optional)</li>
      *   </ul>
      */
      @RequestLine("PUT /v1/users/resendRegistrationToken?user={user}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> resendRegistrationTokenWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resendRegistrationToken</code> method in a fluent style.
   */
  public static class ResendRegistrationTokenQueryParams extends HashMap<String, Object> {
    public ResendRegistrationTokenQueryParams user(final String value) {
      put("user", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reset Password For User
   * Reset User Password
   * @param passwordResetRequest  (optional)
   * @return User
   */
  @RequestLine("POST /v1/users/password/reset")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  User resetUserPassword(PasswordResetRequest passwordResetRequest);

  /**
   * Reset Password For User
   * Similar to <code>resetUserPassword</code> but it also returns the http response headers .
   * Reset User Password
   * @param passwordResetRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v1/users/password/reset")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<User> resetUserPasswordWithHttpInfo(PasswordResetRequest passwordResetRequest);



  /**
   * Restore a soft deleted User.
   * Restore a soft deleted User.
   * @param restoreEntity  (optional)
   * @return User
   */
  @RequestLine("PUT /v1/users/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  User restore35(RestoreEntity restoreEntity);

  /**
   * Restore a soft deleted User.
   * Similar to <code>restore35</code> but it also returns the http response headers .
   * Restore a soft deleted User.
   * @param restoreEntity  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/users/restore")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<User> restore35WithHttpInfo(RestoreEntity restoreEntity);



  /**
   * Revoke JWT Token for a Bot User
   * Revoke JWT Token for a Bot User.
   * @param revokeTokenRequest  (optional)
   * @return JWTAuthMechanism
   */
  @RequestLine("PUT /v1/users/revokeToken")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JWTAuthMechanism revokeJWTTokenForBotUser(RevokeTokenRequest revokeTokenRequest);

  /**
   * Revoke JWT Token for a Bot User
   * Similar to <code>revokeJWTTokenForBotUser</code> but it also returns the http response headers .
   * Revoke JWT Token for a Bot User.
   * @param revokeTokenRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/users/revokeToken")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JWTAuthMechanism> revokeJWTTokenForBotUserWithHttpInfo(RevokeTokenRequest revokeTokenRequest);



  /**
   * Revoke personal access token to User
   * Revoke personal access token
   * @param username Username in case admin is revoking. (Default &#x3D; &#x60;false&#x60;) (optional)
   * @param removeAll Remove All tokens of the user. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param revokePersonalTokenRequest  (optional)
   * @return PersonalAccessTokenList
   */
  @RequestLine("PUT /v1/users/security/token/revoke?username={username}&removeAll={removeAll}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PersonalAccessTokenList revokePersonalAccessToken(@Param("username") String username, @Param("removeAll") Boolean removeAll, RevokePersonalTokenRequest revokePersonalTokenRequest);

  /**
   * Revoke personal access token to User
   * Similar to <code>revokePersonalAccessToken</code> but it also returns the http response headers .
   * Revoke personal access token
   * @param username Username in case admin is revoking. (Default &#x3D; &#x60;false&#x60;) (optional)
   * @param removeAll Remove All tokens of the user. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)
   * @param revokePersonalTokenRequest  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v1/users/security/token/revoke?username={username}&removeAll={removeAll}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PersonalAccessTokenList> revokePersonalAccessTokenWithHttpInfo(@Param("username") String username, @Param("removeAll") Boolean removeAll, RevokePersonalTokenRequest revokePersonalTokenRequest);


  /**
   * Revoke personal access token to User
   * Revoke personal access token
   * Note, this is equivalent to the other <code>revokePersonalAccessToken</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RevokePersonalAccessTokenQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param revokePersonalTokenRequest  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>username - Username in case admin is revoking. (Default &#x3D; &#x60;false&#x60;) (optional)</li>
   *   <li>removeAll - Remove All tokens of the user. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
   *   </ul>
   * @return PersonalAccessTokenList
   */
  @RequestLine("PUT /v1/users/security/token/revoke?username={username}&removeAll={removeAll}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PersonalAccessTokenList revokePersonalAccessToken(RevokePersonalTokenRequest revokePersonalTokenRequest, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * Revoke personal access token to User
  * Revoke personal access token
  * Note, this is equivalent to the other <code>revokePersonalAccessToken</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param revokePersonalTokenRequest  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>username - Username in case admin is revoking. (Default &#x3D; &#x60;false&#x60;) (optional)</li>
          *   <li>removeAll - Remove All tokens of the user. (Default &#x3D; &#x60;false&#x60;) (optional, default to false)</li>
      *   </ul>
          * @return PersonalAccessTokenList
      */
      @RequestLine("PUT /v1/users/security/token/revoke?username={username}&removeAll={removeAll}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PersonalAccessTokenList> revokePersonalAccessTokenWithHttpInfo(RevokePersonalTokenRequest revokePersonalTokenRequest, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>revokePersonalAccessToken</code> method in a fluent style.
   */
  public static class RevokePersonalAccessTokenQueryParams extends HashMap<String, Object> {
    public RevokePersonalAccessTokenQueryParams username(final String value) {
      put("username", EncodingUtils.encode(value));
      return this;
    }
    public RevokePersonalAccessTokenQueryParams removeAll(final Boolean value) {
      put("removeAll", EncodingUtils.encode(value));
      return this;
    }
  }
}
