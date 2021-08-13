package com.example.tangramjsp.script;

/**
 * Script for creating new tables in DB
 */
public class CreateTable {
    public static final String EMPLOYEE = "create table IF NOT EXISTS employees (\n" +
        " id  int(3) NOT NULL AUTO_INCREMENT,\n" +
        " tz BIGINT NOT NULL UNIQUE,\n" +
        " name varchar(120) NOT NULL,\n" +
        " lastName varchar(220) NOT NULL,\n" +
        " birthday DATE NOT NULL,\n" +
        " startWork DATE NOT NULL,\n" +
        " PRIMARY KEY (id)\n" +
        ");";;
}
