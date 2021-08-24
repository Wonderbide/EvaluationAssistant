package com.example.service;

import com.example.entity.Question;
import com.example.repository.QuestionImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuestionService {
    @Autowired
    QuestionImpl questionRepository;


    public List<Question> getAllQuestions (){
        return questionRepository.findAll();
    }
}
