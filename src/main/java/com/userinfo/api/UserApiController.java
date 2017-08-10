package com.userinfo.api;

import com.userinfo.service.dto.User;

import io.swagger.annotations.*;

import javax.inject.Inject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.userinfo.service.dto.UserByNameDTO;
import com.userinfo.service.handler.UserByNameHandler;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-08T07:00:35.342Z")

@Controller
public class UserApiController implements UserApi {
	
	@Inject
	private UserByNameDTO userByNameDTO;

    public ResponseEntity<Void> createUser(@ApiParam(value = "Unique identifier from the service consumer. E.g. Reference number while creating a userinf0/Address from UI can be passed through all APIs to provide visibility across calls." ,required=true ) @RequestHeader(value="callId", required=true) String callId,
        @ApiParam(value = "Name of the channel - B2B/CES" ,required=true ) @RequestHeader(value="channel", required=true) String channel,
        @ApiParam(value = "UserID (Principal)" ,required=true ) @RequestHeader(value="x-mytoll-identity", required=true) String xMytollIdentity,
        @ApiParam(value = "Created user object" ,required=true ) @RequestBody User body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true ) @PathVariable("username") String username) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<UserByNameDTO> getUserByName(@ApiParam(value = "Unique identifier from the service consumer. E.g. Reference number while creating a userinf0/Address from UI can be passed through all APIs to provide visibility across calls." ,required=true ) @RequestHeader(value="callId", required=true) String callId,
        @ApiParam(value = "Name of the channel - B2B/CES" ,required=true ) @RequestHeader(value="channel", required=true) String channel,
        @ApiParam(value = "UserID (Principal)" ,required=true ) @RequestHeader(value="x-mytoll-identity", required=true) String xMytollIdentity,
        @ApiParam(value = "The name that needs to be fetched. Use user1 for testing.",required=true ) @PathVariable("username") String username) {
        UserByNameDTO responce=userByNameDTO.getUserByName(username);
        return new ResponseEntity<UserByNameDTO>(HttpStatus.OK);
    }

    public ResponseEntity<Void> loginUser(@ApiParam(value = "Unique identifier from the service consumer. E.g. Reference number while creating a userinf0/Address from UI can be passed through all APIs to provide visibility across calls." ,required=true ) @RequestHeader(value="callId", required=true) String callId,
        @ApiParam(value = "Name of the channel - B2B/CES" ,required=true ) @RequestHeader(value="channel", required=true) String channel,
        @ApiParam(value = "UserID (Principal)" ,required=true ) @RequestHeader(value="x-mytoll-identity", required=true) String xMytollIdentity,
        @ApiParam(value = "The user name for login", required = true) @RequestParam(value = "username", required = true) String username,
        @ApiParam(value = "The password for login in clear text", required = true) @RequestParam(value = "password", required = true) String password) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> logoutUser(@ApiParam(value = "Unique identifier from the service consumer. E.g. Reference number while creating a userinf0/Address from UI can be passed through all APIs to provide visibility across calls." ,required=true ) @RequestHeader(value="callId", required=true) String callId,
        @ApiParam(value = "Name of the channel - B2B/CES" ,required=true ) @RequestHeader(value="channel", required=true) String channel,
        @ApiParam(value = "UserID (Principal)" ,required=true ) @RequestHeader(value="x-mytoll-identity", required=true) String xMytollIdentity) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateUser(@ApiParam(value = "Unique identifier from the service consumer. E.g. Reference number while creating a userinf0/Address from UI can be passed through all APIs to provide visibility across calls." ,required=true ) @RequestHeader(value="callId", required=true) String callId,
        @ApiParam(value = "Name of the channel - B2B/CES" ,required=true ) @RequestHeader(value="channel", required=true) String channel,
        @ApiParam(value = "UserID (Principal)" ,required=true ) @RequestHeader(value="x-mytoll-identity", required=true) String xMytollIdentity,
        @ApiParam(value = "name that need to be updated",required=true ) @PathVariable("username") String username,
        @ApiParam(value = "Updated user object" ,required=true ) @RequestBody User body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
