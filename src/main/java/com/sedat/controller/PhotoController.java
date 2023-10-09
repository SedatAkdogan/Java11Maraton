package com.sedat.controller;

import com.sedat.service.PhotoService;

public class PhotoController {
    PhotoService photoService;

    public PhotoController() {
        this.photoService=new PhotoService();
    }
}
