package com.hary.service;

import com.hary.model.Speaker;
import com.hary.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

//    public SpeakerServiceImpl(SpeakerRepository repository) {
//        this.repository = repository;
//    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

}
