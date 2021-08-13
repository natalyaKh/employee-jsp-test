package com.example.tangramjsp.repo;

import com.example.tangramjsp.constants.LoggerConstants;
import com.example.tangramjsp.dto.RequestEmployeeDto;
import com.example.tangramjsp.dto.ResponseEmployeeDto;

import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * AbstractDAO.java This DAO class provides database operations for the
 * table employees in the database.
 */
public class EmployeeRepository {
    static Logger logger = Logger.getLogger(EmployeeRepository.class.getName());

    private String jdbcURL = "jdbc:mysql://localhost:3306/empl?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "yellow00";


    private static final String INSERT_USERS_SQL = "INSERT INTO users" +
        "  (tz, name, lastName, birthday, startWork) VALUES " +
        " (?, ?, ?, ?, ?);";

    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USERS_SQL = "delete from users where tz = ?;";

    public EmployeeRepository() {
    }

    /**
     * method that creates connection to DB
     * @return {@link Connection} link for connect to DB
     * @throws  {@link SQLException), {@link ClassNotFoundException}
     */
    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            logger.log(Level.WARNING, e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            logger.log(Level.WARNING, e.getMessage());
            e.printStackTrace();
        }
        logger.log(Level.INFO, LoggerConstants.CREATED_CONNECTION_WITH_DB);
        return connection;
    }

    /**
     * method that save new {@link com.example.tangramjsp.model.Employee} to DB
     * @param empl {@link RequestEmployeeDto}
     * @throws {@link SQLException)
     */
    public void insertEmployee(RequestEmployeeDto empl){
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setLong(1, empl.getTz());
            preparedStatement.setString(2, empl.getName());
            preparedStatement.setString(3, empl.getLastName());
            preparedStatement.setDate(4, Date.valueOf(LocalDate.parse(empl.getBirthday())));
            preparedStatement.setDate(5, Date.valueOf(LocalDate.parse(empl.getStartWork())));
            logger.log(Level.INFO, LoggerConstants.EMPLOYEE_WITH_TZ + empl.getTz() + LoggerConstants.CREATED);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            logger.log(Level.WARNING, e.getMessage());
            printSQLException(e);
        }
    }

    /**
     * method that got all employees from DB
     * @return list of {@link ResponseEmployeeDto}
     * @throws {@link SQLException)
     */
    public List<ResponseEmployeeDto> selectAllEmployees() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List<ResponseEmployeeDto> employees = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                long tz = rs.getLong("tz");
                String name = rs.getString("name");
                String lastName = rs.getString("lastName");
                LocalDate birthday = rs.getDate("birthday").toLocalDate();
                Long workExperience = getExperience(rs.getDate("startWork").toLocalDate());

                employees.add(new ResponseEmployeeDto(tz, name, lastName, birthday, workExperience));
            }
        } catch (SQLException e) {
            logger.log(Level.WARNING, e.getMessage());
            printSQLException(e);
        }
        logger.log(Level.INFO, LoggerConstants.ALL_EMPLOYEES_FROM_DB);
        return employees;
    }

    /**
     * @param tz - unique tz of {@link com.example.tangramjsp.model.Employee}
     * @return
     * @throws SQLException
     */
    public boolean deleteEmployeeByTz(long tz) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
            statement.setLong(1, tz);
            rowDeleted = statement.executeUpdate() > 0;
        }
        logger.log(Level.INFO, LoggerConstants.EMPLOYEE_WITH_TZ + tz + LoggerConstants.DELETED);
        return rowDeleted;
    }

    /**
     * @param startWork - date when employee started work
     * @return how years employee worked
     */
    private Long getExperience(LocalDate startWork) {
        return ChronoUnit.YEARS.between(startWork, LocalDate.now());
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                logger.log(Level.WARNING, "SQLState: " + ((SQLException) e).getSQLState());
                logger.log(Level.WARNING, "Error Code: " + ((SQLException) e).getErrorCode());
                logger.log(Level.WARNING, "Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    logger.log(Level.WARNING, "Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
