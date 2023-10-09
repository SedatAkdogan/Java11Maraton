package com.sedat.service;

import com.sedat.repository.PostRepository;
import com.sedat.repository.entity.Post;

import java.util.List;
import java.util.Optional;

public class PostService {
    PostRepository postRepository;

    public PostService() {
        this.postRepository=new PostRepository();
    }


    public Post save(Post post) {
        return postRepository.save(post);
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public List<Post> birKisiyeAitPostlar(Long userId) {

        return postRepository.birKisiyeAitPostlar(userId);
    }

    public Optional<Post> findById(Long postId) {
        return postRepository.findById(postId);
    }
}
