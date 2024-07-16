package com.example.demo.controller;

import com.example.demo.model.topic;
import com.example.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {
    @Autowired
    private TopicService topicService;

    @PostMapping
    public topic createTopic(@RequestBody topic topic) {
        return topicService.save(topic);
    }

    @GetMapping
    public List<topic> getAllTopics() {
        return topicService.findAll();
    }
}
