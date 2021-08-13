package com.example.tangramjsp.constants;

public class ConnectToPostgress {
    public static String JDBC_URL = "jdbc:postgresql://ec2-34-234-12-149.compute-1.amazonaws.com:5432/d50m74ec73iqmq?useSSL=false";
    public static String JDBC_USER_NAME = "fhgygfhkmieoti";
    public static String JDBC_PASSWORD = "155810d583b48b8676aa696349bafdb344793bdba561f51dd85948bf32f29979";
    public static String JDBC_DRIVER = "org.hibernate.dialect.PostgreSQLDialect";


    public static  String INSERT_USERS_SQL = "INSERT INTO d50m74ec73iqmq.employees" +
        "  (tz, name, lastName, birthday, startWork) VALUES " +
        " (?, ?, ?, ?, ?);";

    public static  String SELECT_ALL_USERS = "select * from d50m74ec73iqmq.employees";
    public static  String DELETE_USERS_SQL = "delete from d50m74ec73iqmq.employees where tz = ?;";
}

