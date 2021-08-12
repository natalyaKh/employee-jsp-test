//package com.example.tangramjsp.service.validator;
//
//import com.example.tangramjsp.model.Employee;
//import com.example.tangramjsp.repo.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// * class that implements {@link ValidateEmployeeService}
// */
//@Service
//public class ValidateEmployeeServiceImpl implements ValidateEmployeeService {
//
//    @Autowired
//    EmployeeRepository employeeRepository;
//
//    @Override
//    public Employee checkEmployeeByTz(long tz) {
//        return  employeeRepository.findByTz(tz).orElse(null);
//    }
//}
