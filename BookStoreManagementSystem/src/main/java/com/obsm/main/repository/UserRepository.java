package com.obsm.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obsm.main.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
