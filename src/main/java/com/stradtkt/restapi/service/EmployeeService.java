package com.stradtkt.restapi.service;

import com.stradtkt.restapi.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
