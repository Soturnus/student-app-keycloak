package com.soturno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soturno.entity.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long>{

}
