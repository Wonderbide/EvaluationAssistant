package com.example.evaluationmaker.repository;

import com.example.evaluationmaker.entity.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionImpl extends CrudRepository<Question, Long> {
    @Override
    List<Question> findAll();


}
