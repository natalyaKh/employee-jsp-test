package com.example.tangramjsp.script;

/**
 * Script for creating new tables in DB
 */
public class CreateTablePostgress {
    public static final String EMPLOYEE = "create table IF NOT EXISTS employees (id serial NOT NULL, tz BIGINT NOT NULL UNIQUE, name varchar(120) NOT NULL, lastName varchar(220) NOT NULL, birthday DATE NOT NULL, startWork DATE NOT NULL, PRIMARY KEY (id))";
}
