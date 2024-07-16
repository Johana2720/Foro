package com.example.demo.controller;

import com.example.demo.model.Reply;
import com.example.demo.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/replies")
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    @PostMapping
    public Reply createReply(@RequestBody Reply reply) {
        return replyService.save(reply);
    }

    @GetMapping
    public List<Reply> getAllReplies() {
        return replyService.findAll();
    }
}

