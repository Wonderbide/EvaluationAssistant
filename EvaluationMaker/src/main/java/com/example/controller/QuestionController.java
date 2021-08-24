package com.example.controller;

import com.example.entity.Question;
import com.example.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class QuestionController {

    @Autowired
    QuestionService questionService;

//    @PostMapping
//    public void PostQuestion(){
//
//    }

//    @GetMapping("question")
//    public List<Question> GetQuestions (){
//        return questionService.getAllQuestions();
//    }
@GetMapping("caca")
public String GetQuestions (){
    return "questionService.getAllQuestions()";
}

}
