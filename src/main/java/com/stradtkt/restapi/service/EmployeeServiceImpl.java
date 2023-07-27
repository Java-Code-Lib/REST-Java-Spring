package com.stradtkt.restapi.service;

import com.stradtkt.restapi.dao.EmployeeDAO;
import com.stradtkt.restapi.entity.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
