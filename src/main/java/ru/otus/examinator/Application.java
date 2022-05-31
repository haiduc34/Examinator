package ru.otus.examinator;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.examinator.service.QuestionService;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        QuestionService questionService= context.getBean(QuestionService.class);

        System.out.println(questionService.printAllQuestions());

    }

}
