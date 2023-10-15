package com.Geekster.instaBackendApp.service;

import com.Geekster.instaBackendApp.model.Post;
import com.Geekster.instaBackendApp.repo.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    IPostRepo postRepo;

    public void createInstaPost(Post instaPost) {
        postRepo.save(instaPost);
    }

    public List<Post> getAllPost(Long id) {
        return postRepo.findAll();
    }
}
