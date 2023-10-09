package com.sedat.controller;

import com.sedat.repository.entity.Like;
import com.sedat.repository.entity.User;
import com.sedat.service.LikeService;
import com.sedat.service.PostService;

import static com.sedat.utility.Constants.*;

import java.util.Scanner;

public class LikeController {
    LikeService likeService;
    PostService postService;
    Scanner scanner;

    public LikeController() {
        this.likeService =new LikeService();
        this.scanner = new Scanner(System.in);
        this.postService = new PostService();
    }

    public Like begeniYap(User user) {

        Long userId=user.getId();
        Long postId = 0L;
        System.out.println("Begeni yapacaginiz postun Id'sini giriniz");
        postId = Long.parseLong(scanner.nextLine());

        Like like = Like.builder()
                .userId(userId)
                .postId(postId)
                .baseEntity(getBaseEntity())
                .build();

        return  likeService.save(like);
//        postService.findById(postId).ifPresent(post -> {
//            post.setLikeCount(post.getLikeCount()+1);
//            postService.save(post);
//        });


    }

}
