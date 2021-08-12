package com.example.tangramjsp.dtoN;

import com.example.tangramjsp.dto.RequestEmployeeDto;
import com.example.tangramjsp.dto.ResponseEmployeeDto;

import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * AbstractDAO.java This DAO class provides CRUD database operations for the
 * table users in the database.
 */
public class EmployeeDTO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/empl?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "yellow00";


    private static final String INSERT_USERS_SQL = "INSERT INTO users" +
        "  (tz, name, lastName, birthday, startWork) VALUES " +
        " (?, ?, ?, ?, ?);";

    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USERS_SQL = "delete from users where tz = ?;";

    public EmployeeDTO() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    public void insertEmployee(RequestEmployeeDto empl) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setLong(1, empl.getTz());
            preparedStatement.setString(2, empl.getName());
            preparedStatement.setString(3, empl.getLastName());
            //        employee.setBirthday(LocalDate.parse(employeeDto.getBirthday()));
//        employee.setStartWork(LocalDate.parse(employeeDto.getStartWork()));
            preparedStatement.setDate(4, Date.valueOf(LocalDate.parse(empl.getBirthday())));
            preparedStatement.setDate(5, Date.valueOf(LocalDate.parse(empl.getStartWork())));
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public List<ResponseEmployeeDto> selectAllEmployees() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List<ResponseEmployeeDto> employees = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();
            System.err.println(rs);
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                long tz = rs.getLong("tz");
                System.err.println(tz);
                String name = rs.getString("name");
                System.err.println(name);
                String lastName = rs.getString("lastName");
                System.err.println(lastName);
                LocalDate birthday = rs.getDate("birthday").toLocalDate();
                System.err.println(birthday);
                Long workExperience = getExperiance(rs.getDate("startWork").toLocalDate());
                System.err.println(workExperience);

                employees.add(new ResponseEmployeeDto(tz, name, lastName, birthday, workExperience));
                employees.stream().forEach(System.out::println);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return employees;
    }

    private Long getExperiance(LocalDate startWork) {
        return ChronoUnit.YEARS.between(startWork, LocalDate.now());
    }

    public boolean deleteUser(long tz) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
            statement.setLong(1, tz);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
