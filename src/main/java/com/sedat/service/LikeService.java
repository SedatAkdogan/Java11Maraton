package com.sedat.service;

import com.sedat.repository.LikeRepository;
import com.sedat.repository.entity.Like;

public class LikeService {
    LikeRepository likeRepository;

    public LikeService() {
        this.likeRepository=new LikeRepository();
    }


    public Like save(Like like) {
        return likeRepository.save(like);
    }


}
