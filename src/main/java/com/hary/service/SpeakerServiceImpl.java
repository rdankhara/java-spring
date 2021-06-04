package com.hary.service;

import com.hary.model.Speaker;
import com.hary.repository.HibernateSpeakerRepositoryImpl;
import com.hary.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
