package com.Geekster.instaBackendApp.repo;

import com.Geekster.instaBackendApp.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Long> {
}
