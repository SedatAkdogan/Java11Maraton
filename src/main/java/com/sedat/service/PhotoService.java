package com.sedat.service;

import com.sedat.repository.PhotoRepository;

public class PhotoService {
    PhotoRepository photoRepository;

    public PhotoService() {
        this.photoRepository=new PhotoRepository();
    }
}
