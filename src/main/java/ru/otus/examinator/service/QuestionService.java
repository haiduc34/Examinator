package ru.otus.examinator.service;

import ru.otus.examinator.entity.Question;
import ru.otus.examinator.repository.QuestionRepository;

import java.util.stream.Collectors;


public class QuestionService {

    private final QuestionRepository repository;

    public QuestionService(QuestionRepository repository) {
        this.repository = repository;
    }

    public String printAllQuestions() {

        String result = repository.findAll().stream()
                .map(Question::toString)
                .collect(Collectors.joining("\n==============\n"));

        return repository.findAll().toString();

    }
}
