package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.user.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
