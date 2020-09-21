package com.forum.MyForum.repo;


import com.forum.MyForum.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
}

