package com.example.evaluationmaker.service;

import com.example.evaluationmaker.entity.Question;
import com.example.evaluationmaker.repository.QuestionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuestionService {
    @Autowired
    QuestionImpl questionRepository;


    public List<Question> getAllQuestions (){
        return questionRepository.findAll();
    }
}
