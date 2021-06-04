package com.hary.service;

import com.hary.model.Speaker;
import com.hary.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

//    public void setRepository(SpeakerRepository repository) {
//        this.repository = repository;
//    }

    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        this.repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
