package ru.otus.examinator;



import org.junit.jupiter.api.Test;
import org.springframework.core.io.FileSystemResource;
import ru.otus.examinator.repository.QuestionRepository;
import ru.otus.examinator.repository.QuestionRepositoryImpl;

class ApplicationTests {

    QuestionRepository questionRepository = new QuestionRepositoryImpl(new FileSystemResource("QuestionsAnswers.csv"));




    @Test
    void contextLoads() {
       /* Assertions.assertFalse(questionRepository.findAll().isEmpty());*/

    }

}
