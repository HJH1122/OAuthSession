package com.example.oauthsession.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.oauthsession.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
    UserEntity findByUsername(String username);
}
