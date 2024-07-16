package com.example.demo.reposiroty;


import com.example.demo.model.topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<topic, Long> {}

