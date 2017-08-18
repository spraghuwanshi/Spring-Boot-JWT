package com.userinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userinfo.service.dto.UserDTO;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Long> {

}
