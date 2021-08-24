package com.example.evaluationmaker.repository;

import com.example.evaluationmaker.entity.Evaluation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationImpl extends CrudRepository<Evaluation, Long> {
}
