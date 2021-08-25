package com.example.evaluationmaker.controller;

import com.example.evaluationmaker.entity.Question;
import com.example.evaluationmaker.service.QuestionService;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "question")
public class QuestionController {

    private final QuestionService questionService;

    @Autowired
    public QuestionController (QuestionService questionService){
        this.questionService = questionService;
    }

    @PostMapping("save_question")
    public void PostQuestion(@RequestBody Question question){
        questionService.CreatQuestion(question);
    }

    @GetMapping("find_question")
    public List<Question> GetQuestions (){
        return questionService.getAllQuestions();
    }

    @DeleteMapping("delete_question")
    public void DeleteQuestion(@RequestBody long id){
        questionService.deleteQuestion(id);
    }

    @PatchMapping("update_question/{questionID}")
    public Question UpdateQuestion(
            @PathVariable(value = "questionID") long questionID,
            @RequestBody Question question){
        return questionService.updateQuestion(questionID, question);
    }

}
