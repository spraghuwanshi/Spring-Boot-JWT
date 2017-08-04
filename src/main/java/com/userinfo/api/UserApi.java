package com.userinfo.api;

import com.userinfo.model.User;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-03T09:31:20.972Z")

@Api(value = "user", description = "the user API")
public interface UserApi {

    @ApiOperation(value = "Create user", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    @RequestMapping(value = "/user",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> createUser(@ApiParam(value = "Unique identifier from the service consumer. E.g. Reference number while creating a userinf0/Address from UI can be passed through all APIs to provide visibility across calls." ,required=true ) @RequestHeader(value="callId", required=true) String callId,
        @ApiParam(value = "Name of the channel - B2B/CES" ,required=true ) @RequestHeader(value="channel", required=true) String channel,
        @ApiParam(value = "UserID (Principal)" ,required=true ) @RequestHeader(value="x-mytoll-identity", required=true) String xMytollIdentity,
        @ApiParam(value = "Created user object" ,required=true ) @RequestBody User body);


    @ApiOperation(value = "Delete user", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
        @ApiResponse(code = 404, message = "User not found", response = Void.class) })
    @RequestMapping(value = "/user/{username}",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true ) @PathVariable("username") String username);


    @ApiOperation(value = "Get user by user name", notes = "", response = User.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid username supplied", response = User.class),
        @ApiResponse(code = 404, message = "User not found", response = User.class) })
    @RequestMapping(value = "/user/{username}",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<User> getUserByName(@ApiParam(value = "Unique identifier from the service consumer. E.g. Reference number while creating a userinf0/Address from UI can be passed through all APIs to provide visibility across calls." ,required=true ) @RequestHeader(value="callId", required=true) String callId,
        @ApiParam(value = "Name of the channel - B2B/CES" ,required=true ) @RequestHeader(value="channel", required=true) String channel,
        @ApiParam(value = "UserID (Principal)" ,required=true ) @RequestHeader(value="x-mytoll-identity", required=true) String xMytollIdentity,
        @ApiParam(value = "The name that needs to be fetched. Use user1 for testing.",required=true ) @PathVariable("username") String username);


    @ApiOperation(value = "Logs user into the system", notes = "", response = Void.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid username/password supplied", response = Void.class),
        @ApiResponse(code = 500, message = "Error Occured.", response = Void.class) })
    @RequestMapping(value = "/user/login",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Void> loginUser(@ApiParam(value = "Unique identifier from the service consumer. E.g. Reference number while creating a userinf0/Address from UI can be passed through all APIs to provide visibility across calls." ,required=true ) @RequestHeader(value="callId", required=true) String callId,
        @ApiParam(value = "Name of the channel - B2B/CES" ,required=true ) @RequestHeader(value="channel", required=true) String channel,
        @ApiParam(value = "UserID (Principal)" ,required=true ) @RequestHeader(value="x-mytoll-identity", required=true) String xMytollIdentity,
        @ApiParam(value = "The user name for login", required = true) @RequestParam(value = "username", required = true) String username,
        @ApiParam(value = "The password for login in clear text", required = true) @RequestParam(value = "password", required = true) String password);


    @ApiOperation(value = "Logs out current logged in user session", notes = "", response = Void.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    @RequestMapping(value = "/user/logout",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Void> logoutUser(@ApiParam(value = "Unique identifier from the service consumer. E.g. Reference number while creating a userinf0/Address from UI can be passed through all APIs to provide visibility across calls." ,required=true ) @RequestHeader(value="callId", required=true) String callId,
        @ApiParam(value = "Name of the channel - B2B/CES" ,required=true ) @RequestHeader(value="channel", required=true) String channel,
        @ApiParam(value = "UserID (Principal)" ,required=true ) @RequestHeader(value="x-mytoll-identity", required=true) String xMytollIdentity);


    @ApiOperation(value = "Updated user", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid user supplied", response = Void.class),
        @ApiResponse(code = 404, message = "User not found", response = Void.class) })
    @RequestMapping(value = "/user/{username}",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateUser(@ApiParam(value = "Unique identifier from the service consumer. E.g. Reference number while creating a userinf0/Address from UI can be passed through all APIs to provide visibility across calls." ,required=true ) @RequestHeader(value="callId", required=true) String callId,
        @ApiParam(value = "Name of the channel - B2B/CES" ,required=true ) @RequestHeader(value="channel", required=true) String channel,
        @ApiParam(value = "UserID (Principal)" ,required=true ) @RequestHeader(value="x-mytoll-identity", required=true) String xMytollIdentity,
        @ApiParam(value = "name that need to be updated",required=true ) @PathVariable("username") String username,
        @ApiParam(value = "Updated user object" ,required=true ) @RequestBody User body);

}
