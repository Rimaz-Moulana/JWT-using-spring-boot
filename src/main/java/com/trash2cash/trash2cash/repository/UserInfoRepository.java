package com.trash2cash.trash2cash.repository;

import  com.trash2cash.trash2cash.repository.UserInfoRepository;
import  com.trash2cash.trash2cash.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByEmail(String username);
}