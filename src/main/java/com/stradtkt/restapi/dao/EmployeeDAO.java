package com.stradtkt.restapi.dao;

import com.stradtkt.restapi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
