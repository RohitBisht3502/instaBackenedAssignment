package com.Geekster.instaBackendApp.repo;

import com.Geekster.instaBackendApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Long> {
    User findFirstByUserEmail(String newEmail);
}
