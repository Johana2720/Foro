package com.example.demo.service;

import com.example.demo.model.topic;
import com.example.demo.reposiroty.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    public topic save(topic topic) {
        return topicRepository.save(topic);
    }

    public List<topic> findAll() {
        return topicRepository.findAll();
    }
}

