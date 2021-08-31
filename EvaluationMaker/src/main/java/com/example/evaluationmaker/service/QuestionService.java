package com.example.evaluationmaker.service;

import com.example.evaluationmaker.entity.Question;
import com.example.evaluationmaker.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository questionRepository;


    public List<Question> getAllQuestions (){
        return questionRepository.findAll();
    }

    public Question getQuestionById(long id) {return  questionRepository.findById(id).get();}

    public Question CreatQuestion(Question question) {
        return questionRepository.save(question);
    }

    public void deleteQuestion(long id) {
        questionRepository.deleteById(id);
    }

    public Question updateQuestion(long id, Question question) {
        Question oldQuestion = questionRepository.findById(id).get();

        oldQuestion.setSubject(question.getSubject());
        oldQuestion.setTitle(question.getTitle());
        oldQuestion.setWording(question.getWording());

        return questionRepository.save(oldQuestion);
    }
}
