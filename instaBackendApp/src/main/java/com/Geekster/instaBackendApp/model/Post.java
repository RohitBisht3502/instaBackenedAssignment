package com.Geekster.instaBackendApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private Timestamp postCreatedDate;
    private Timestamp postUpdatedDate;
    private String postData;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;
}
