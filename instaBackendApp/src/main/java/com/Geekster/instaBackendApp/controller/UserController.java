package com.Geekster.instaBackendApp.controller;

import com.Geekster.instaBackendApp.model.Post;
import com.Geekster.instaBackendApp.model.User;
import com.Geekster.instaBackendApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("User/sign")
    public String userSignUp(@RequestBody User newUser){
       return userService.userSignUp(newUser);
    }

    //sign in
    @PostMapping("user/signIn/{email}/{password}")
    public String userSignIn(@PathVariable String email, @PathVariable String password)
    {
        return userService.userSignIn(email,password);
    }

    //sign out
    @DeleteMapping("user/signOut")
    public String userSignOut(@RequestParam String email, @RequestParam String token)
    {
        return userService.userSignOut(email,token);
    }

    @PostMapping("InstaPost")
    public String createInstaPost(@RequestParam String email,@RequestParam String tokenValue, @RequestBody Post instaPost)
    {
        return userService.createInstaPost(email,tokenValue,instaPost);
    }

    @GetMapping("post/{id}")
    public List<Post> getAllPost(@PathVariable Long id){
        return userService.getAllPost(id);
    }
}
