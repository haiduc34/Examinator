package ru.otus.examinator.entity;


import com.opencsv.bean.CsvBindByName;

public class Question {

    @CsvBindByName
    private Long id;

    @CsvBindByName
    private String question;

    @CsvBindByName
    private String variants;

    @CsvBindByName
    private String answer;

    @Override
    public String toString() {
        return  id + ". " +
                question + "\n" +
                "variants: " + variants + ";\n" +
                "answer: " + answer;
    }
}
