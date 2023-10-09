package com.sedat.controller;

import com.sedat.service.TimelineService;

public class TimelineController {
    TimelineService timelineService;

    public TimelineController() {
        this.timelineService= new TimelineService();
    }
}
