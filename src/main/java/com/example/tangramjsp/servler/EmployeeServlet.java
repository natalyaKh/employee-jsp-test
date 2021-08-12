package com.example.tangramjsp.servler;

import com.example.tangramjsp.dto.RequestEmployeeDto;
import com.example.tangramjsp.dto.ResponseEmployeeDto;
import com.example.tangramjsp.dtoN.EmployeeDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;

/**
 * это документашка для тех, кто рскнет это читать
 */
// TODO: 13/08/2021  документашка - сделать, закачать
// TODO: 13/08/2021 deploy???
// TODO: 13/08/2021 почистить код
// TODO: 13/08/2021 логи
// TODO: 13/08/2021 скрипты для старта
//@WebServlet (name = "home", urlPatterns = {"/home"})
@WebServlet("/")
public class EmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private EmployeeDTO employeeDTO;
    public void init() {
        employeeDTO = new EmployeeDTO();
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
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertUser(request, response);
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

    private void listUser(HttpServletRequest request, HttpServletResponse response)
        throws SQLException, IOException, ServletException {
        List<ResponseEmployeeDto> employee = employeeDTO.selectAllEmployees();
        request.setAttribute("employees", employee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
        System.out.println(dispatcher);
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee-form.jsp");
        dispatcher.forward(request, response);
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response)
        throws SQLException, IOException {
        System.out.println("hihi");
        RequestEmployeeDto employeeDto = new RequestEmployeeDto(
            Long.valueOf(request.getParameter("tz")),
            request.getParameter("name"),
            request.getParameter("lastName"),
            request.getParameter("birthday"),
            request.getParameter("startWork")
            );
        employeeDTO.insertEmployee(employeeDto);
        response.sendRedirect("list");
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response)
        throws SQLException, IOException {
        long tz = Long.valueOf(request.getParameter("tz"));
        employeeDTO.deleteUser(tz);
        response.sendRedirect("list");

    }

}
