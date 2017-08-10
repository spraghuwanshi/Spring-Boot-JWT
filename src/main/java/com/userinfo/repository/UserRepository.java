package com.userinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userinfo.service.dto.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
