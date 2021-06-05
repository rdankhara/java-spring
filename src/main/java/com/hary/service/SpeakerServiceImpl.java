package com.hary.service;

import com.hary.model.Speaker;
import com.hary.repository.HibernateSpeakerRepositoryImpl;
import com.hary.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.PropertyResolver;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no arg constructor");
    }

    @Autowired()
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        this.repository = repository;
    }

    @PostConstruct
    private void initialized() {
        System.out.println("Invoked after construction");
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
