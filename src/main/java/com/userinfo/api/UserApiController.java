package com.userinfo.api;

import com.userinfo.service.dto.UserDTO;

import javax.inject.Inject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.userinfo.service.dto.UserDTO;
import com.userinfo.service.handler.UserByNameHandler;

@Controller
public class UserApiController implements UserApi {
	
	@Inject
	private UserByNameHandler userByNameHandler;
	
	@Inject
	private UserDTO UserDTO;
	


    public ResponseEntity<Void> createUser(
    	@RequestHeader(value="callId", required=true) String callId,
        @RequestHeader(value="channel", required=true) String channel,
        @RequestHeader(value="x-mytoll-identity", required=true) String xMytollIdentity,
        @RequestBody UserDTO body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteUser(
    		@PathVariable("username") String username) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<UserDTO> getUserByName(
    	@RequestHeader(value="callId", required=true) String callId,
        @RequestHeader(value="channel", required=true) String channel,
        @RequestHeader(value="x-mytoll-identity", required=true) String xMytollIdentity,
        @PathVariable("username") String username) {
    	UserDTO responce=userByNameHandler.getUserByName(username);
        return new ResponseEntity<UserDTO>(HttpStatus.OK);
    }

    public ResponseEntity<Void> loginUser(
        @RequestHeader(value="callId", required=true) String callId,
        @RequestHeader(value="channel", required=true) String channel,
        @RequestHeader(value="x-mytoll-identity", required=true) String xMytollIdentity,
        @RequestParam(value = "username", required = true) String username,
        @RequestParam(value = "password", required = true) String password) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> logoutUser(
    	@RequestHeader(value="callId", required=true) String callId,
        @RequestHeader(value="channel", required=true) String channel,
        @RequestHeader(value="x-mytoll-identity", required=true) String xMytollIdentity) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateUser(
    	@RequestHeader(value="callId", required=true) String callId,
        @RequestHeader(value="channel", required=true) String channel,
        @RequestHeader(value="x-mytoll-identity", required=true) String xMytollIdentity,
        @PathVariable("username") String username,
        @RequestBody UserDTO body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
