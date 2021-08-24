package com.example.evaluationmaker.controller;

import com.example.evaluationmaker.entity.Question;
import com.example.evaluationmaker.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @PostMapping
    public void PostQuestion(){

    }

    @GetMapping("question")
    public List<Question> GetQuestions (){
        return questionService.getAllQuestions();
    }

}
