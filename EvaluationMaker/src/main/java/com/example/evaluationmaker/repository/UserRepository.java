package com.example.evaluationmaker.repository;

import com.example.evaluationmaker.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserRepository extends CrudRepository<User, Long > {
    @Override
    Set<User> findAll();
}
