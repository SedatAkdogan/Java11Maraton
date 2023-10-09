package com.sedat.service;

import com.sedat.repository.TimelineRepository;

public class TimelineService {
    TimelineRepository timelineRepository;

    public TimelineService() {
        this.timelineRepository= new TimelineRepository();
    }
}
