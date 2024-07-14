package com.quizwiz.quizwiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizwiz.quizwiz.model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}