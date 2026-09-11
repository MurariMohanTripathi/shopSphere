package com.shopsphere.domain.user.repository;

import com.shopsphere.domain.user.entity.Role;
import com.shopsphere.domain.user.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long>{
    Optional<Role> findByName(RoleName name);
}