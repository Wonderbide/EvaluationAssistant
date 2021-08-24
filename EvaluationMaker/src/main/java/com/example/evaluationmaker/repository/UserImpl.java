package com.example.evaluationmaker.repository;

import com.example.evaluationmaker.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserImpl extends CrudRepository<User, Long > {
}
