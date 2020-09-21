package com.forum.MyForum.repo;

import com.forum.MyForum.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {
    Users findByLogin(String login);
}

