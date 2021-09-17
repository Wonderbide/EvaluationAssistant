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

    @CrossOrigin
    @PostMapping("save_question")
    public void PostQuestion(@RequestBody Question question){
        questionService.CreatQuestion(question);
    }

    @CrossOrigin
    @GetMapping("find_question")
    public List<Question> GetQuestions (){
        return questionService.getAllQuestions();
    }

    @CrossOrigin
    @DeleteMapping("delete_question/{questionID}")
    public void DeleteQuestion(@PathVariable(value = "questionID") long id){
        questionService.deleteQuestion(id);
    }

    @CrossOrigin
    @PatchMapping("update_question/{questionID}")
    public Question UpdateQuestion(
            @PathVariable(value = "questionID") long questionID,
            @RequestBody Question question){
        return questionService.updateQuestion(questionID, question);
    }

}
