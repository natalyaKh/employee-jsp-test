//package com.example.tangramjsp.controller;
//
//import com.example.tangramjsp.constants.Constants;
//import com.example.tangramjsp.dto.RequestEmployeeDto;
//import com.example.tangramjsp.dto.ResponseEmployeeDto;
//import com.example.tangramjsp.enums.Status;
//import com.example.tangramjsp.exeptions.EmployeeNotFoundException;
//import com.example.tangramjsp.exeptions.NotUniqueEmployeeException;
//import com.example.tangramjsp.model.Employee;
//import com.example.tangramjsp.service.employee.EmployeeService;
//import com.example.tangramjsp.service.validator.ValidateEmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//
//@Controller
//public class EmployeeController {
//
//    @Autowired
//    private EmployeeService employeeService;
//    @Autowired
//    private ValidateEmployeeService validaService;
//
//    /**
//     * @throws {@link NotUniqueEmployeeException} if employee with this tz exists in DB
//     * @param employeeDto {@link RequestEmployeeDto}
//     * @return {@link HttpStatus} is OK
//     */
////    @RequestMapping(value = "/employee", method = RequestMethod.POST)
////    public ResponseEntity addEmployee(@RequestBody @Valid RequestEmployeeDto employeeDto) {
////        Employee employee =  validaService.checkEmployeeByTz(employeeDto.getTz());
////        if(employee != null){
////            throw new NotUniqueEmployeeException(Constants.EMPLOYEE_WITH_TZ + employeeDto.getTz()
////                + Constants.EXISTS);
////        }
////        Status rez = employeeService.saveEmployee(employeeDto);
////        return new ResponseEntity(HttpStatus.CREATED);
////    }
//
//    /**
//     * @return list of {@link ResponseEmployeeDto} employees
//     */
//    @RequestMapping(path = "/", method = RequestMethod.GET)
//    public String getAllEmployees(Model model) {
//        List<ResponseEmployeeDto> rez = employeeService.getAllEmployees();
//        model.addAttribute("employee", rez);
//        return  "index";
////        return new ResponseEntity(rez, HttpStatus.OK);
//    }
//
//    /**
//     * @param tz teudat zeut of employee
//     * @return {@link HttpStatus} is OK
//     * @throws {@link EmployeeNotFoundException} if employee with this tz not exists in DB
//     */
//    @RequestMapping(value = "/employee/{tz}", method = RequestMethod.DELETE)
//    public ResponseEntity deleteEmployeeByTZ(@PathVariable("tz") String tz) {
//        Employee employee = validaService.checkEmployeeByTz(Long.valueOf(tz));
//        if (employee == null) {
//            throw new EmployeeNotFoundException(Constants.EMPLOYEE_WITH_TZ + tz + Constants.NOT_FOUND);
//        }
//        Status rez = employeeService.deleteEmployeeById(employee);
//        return new ResponseEntity(HttpStatus.OK);
//    }
//
//    /**
//     * @return {@link LocalDateTime} time of server
//     */
//    @RequestMapping(value = "/time", method = RequestMethod.GET)
//    public LocalDateTime getServerTime(Model model) {
//        model.addAttribute(LocalDateTime.now());
//        return LocalDateTime.now();
//    }
//}
//
