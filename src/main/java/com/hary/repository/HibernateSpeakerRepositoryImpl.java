package com.hary.repository;

import com.hary.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Value("#{ T(java.lang.Math).random() * 100}")
    private double seedNumber;

    @Autowired
    private Calendar calendar;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Bryan");
        speaker.setLastName("Adams");
        speaker.setSeedNumber(seedNumber);
        speakers.add(speaker);

        //FactoryBean sample code
        System.out.println("calendar:" + calendar.getTime());
        return speakers;
    }
}
