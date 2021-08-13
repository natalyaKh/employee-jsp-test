package com.example.tangramjsp.constants;

/**
 * Class with info about connection to MySql DB
 */
public class ConnectToMySql {
    public static String JDBC_URL = "jdbc:mysql://localhost:3306/empl?useSSL=false";
    public static String JDBC_USER_NAME = "root";
    public static String JDBC_PASSWORD = "yellow00";



    public static  String INSERT_USERS_SQL = "INSERT INTO employees" +
        "  (tz, name, lastName, birthday, startWork) VALUES " +
        " (?, ?, ?, ?, ?);";

    public static  String SELECT_ALL_USERS = "select * from employees";
    public static  String DELETE_USERS_SQL = "delete from employees where tz = ?;";
}
