package ru.otus.examinator.repository;

import ru.otus.examinator.entity.Question;

import java.util.List;

public interface QuestionRepository {

    List<Question> findAll ();

}
