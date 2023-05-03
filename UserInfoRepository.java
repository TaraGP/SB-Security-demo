package com.JSecurityDemo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import com.JSecurityDemo.demo.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByName(String username);

}