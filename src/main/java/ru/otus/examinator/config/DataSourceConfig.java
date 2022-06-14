package ru.otus.examinator.config;

import org.springframework.context.ApplicationContext;

public class DataSourceConfig {

    public ApplicationContext ctx;

    public DataSourceConfig(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    public ApplicationContext getCtx() {
        return ctx;
    }
}
