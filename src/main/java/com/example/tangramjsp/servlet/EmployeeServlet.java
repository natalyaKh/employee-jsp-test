package com.example.tangramjsp.servlet;

import com.example.tangramjsp.constants.LoggerConstants;
import com.example.tangramjsp.dto.RequestEmployeeDto;
import com.example.tangramjsp.dto.ResponseEmployeeDto;
import com.example.tangramjsp.repo.EmployeeRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * это документашка для тех, кто рскнет это читать
 */
// TODO: 13/08/2021  документашка - сделать, закачать
// TODO: 13/08/2021 deploy???
// TODO: 13/08/2021 почистить код
// TODO: 13/08/2021 скрипты для старта


@WebServlet("/")
public class EmployeeServlet extends HttpServlet {

    static final Logger logger = Logger.getLogger(EmployeeServlet.class.getName());

    private static final long serialVersionUID = 1L;
    private EmployeeRepository employeeRepository;
    public void init() {
        employeeRepository = new EmployeeRepository();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/insert":
                    addEmployee(request, response);
                    break;
                case "/delete":
                    deleteUser(request, response);
                    break;
                default:
                    listUser(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    /**
     * method that returns list of all {@link com.example.tangramjsp.model.Employee} from DB
     * @param request {@link HttpServletRequest}
     * @param response {@link HttpServletResponse}
     * @throws SQLException
     * @throws IOException
     * @throws ServletException
     */
    private void listUser(HttpServletRequest request, HttpServletResponse response)
        throws SQLException, IOException, ServletException {
        logger.log(Level.INFO, LoggerConstants.GOT_REQUEST_FOR_OPERATION + LoggerConstants.GET_ALL);
        List<ResponseEmployeeDto> employee = employeeRepository.selectAllEmployees();
        request.setAttribute("employees", employee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
        dispatcher.forward(request, response);
    }


    /**
     * method that creates {@link com.example.tangramjsp.model.Employee}
     * @param request {@link HttpServletRequest}
     * @param response {@link HttpServletResponse}
     * @throws SQLException
     * @throws IOException
     */
    private void addEmployee(HttpServletRequest request, HttpServletResponse response)
        throws SQLException, IOException {
        logger.log(Level.INFO, LoggerConstants.GOT_REQUEST_FOR_OPERATION + LoggerConstants.CREATE);
        RequestEmployeeDto employeeDto = new RequestEmployeeDto(
            Long.valueOf(request.getParameter("tz")),
            request.getParameter("name"),
            request.getParameter("lastName"),
            request.getParameter("birthday"),
            request.getParameter("startWork")
            );
        employeeRepository.insertEmployee(employeeDto);
        response.sendRedirect("list");
    }

    /**
     * method that deletes {@link com.example.tangramjsp.model.Employee}
     * @param request {@link HttpServletRequest}
     * @param response {@link HttpServletResponse}
     * @throws SQLException
     * @throws IOException
     */
    private void deleteUser(HttpServletRequest request, HttpServletResponse response)
        throws SQLException, IOException {
        logger.log(Level.INFO, LoggerConstants.GOT_REQUEST_FOR_OPERATION + LoggerConstants.DELETE);
        long tz = Long.valueOf(request.getParameter("tz"));
        employeeRepository.deleteEmployeeByTz(tz);
        response.sendRedirect("list");

    }

}
