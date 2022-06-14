package ru.otus.examinator.repository;

import com.opencsv.*;
import com.opencsv.bean.*;
import org.springframework.core.io.Resource;
import ru.otus.examinator.entity.Question;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QuestionRepositoryImpl implements QuestionRepository{

    private final Resource resource;

    public QuestionRepositoryImpl(Resource resource) {
        this.resource = resource;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public List<Question> findAll() {
        try (Reader reader = new FileReader(resource.getFile())
             ) {

            CsvToBean<Question> csvToBean = new CsvToBeanBuilder(new CSVReader(reader))
                    .withType(Question.class)
                    .withSeparator(',')
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            return csvToBean.parse();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            return new ArrayList<>();

        }
    }

}
