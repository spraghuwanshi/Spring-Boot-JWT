package com.userinfo.api;

import com.userinfo.service.dto.UserDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserApi {

	@RequestMapping(value = "/user", 
			produces = { "application/json", "application/xml" }, 
			consumes = {"application/json" }, 
			method = RequestMethod.POST)
	ResponseEntity<Void> createUser(@RequestHeader(value = "callId", required = true) String callId,
			@RequestHeader(value = "channel", required = true) String channel,
			@RequestHeader(value = "x-mytoll-identity", required = true) String xMytollIdentity,
			@RequestBody UserDTO body);

	@RequestMapping(value = "/user/{username}", 
			produces = { "application/json", "application/xml" }, 
			consumes = {"application/json" }, 
			method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteUser(@PathVariable("username") String username);

	@RequestMapping(value = "/user/{username}", 
			produces = { "application/json", "application/xml" }, 
			consumes = {"application/json" }, 
			method = RequestMethod.GET)
	ResponseEntity<UserDTO> getUserByName(@RequestHeader(value = "callId", required = true) String callId,
			@RequestHeader(value = "channel", required = true) String channel,
			@RequestHeader(value = "x-mytoll-identity", required = true) String xMytollIdentity,
			@PathVariable("username") String username);

	@RequestMapping(value = "/user/login", 
			produces = { "application/json", "application/xml" }, 
			consumes = {"application/json" }, 
			method = RequestMethod.GET)
	ResponseEntity<Void> loginUser(@RequestHeader(value = "callId", required = true) String callId,
			@RequestHeader(value = "channel", required = true) String channel,
			@RequestHeader(value = "x-mytoll-identity", required = true) String xMytollIdentity,
			@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password);

	@RequestMapping(value = "/user/logout", 
			produces = { "application/json", "application/xml" }, 
			consumes = {"application/json" }, 
			method = RequestMethod.GET)
	ResponseEntity<Void> logoutUser(@RequestHeader(value = "callId", required = true) String callId,
			@RequestHeader(value = "channel", required = true) String channel,
			@RequestHeader(value = "x-mytoll-identity", required = true) String xMytollIdentity);

	@RequestMapping(value = "/user/{username}", 
			produces = { "application/json", "application/xml" }, 
			consumes = {"application/json" }, 
			method = RequestMethod.PUT)
	ResponseEntity<Void> updateUser(@RequestHeader(value = "callId", required = true) String callId,
			@RequestHeader(value = "channel", required = true) String channel,
			@RequestHeader(value = "x-mytoll-identity", required = true) String xMytollIdentity,
			@PathVariable("username") String username, @RequestBody UserDTO body);

}
