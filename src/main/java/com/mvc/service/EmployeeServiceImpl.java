package com.mvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.EmployeeDao;
import com.mvc.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public void setemployeeDAO(EmployeeDao employeeDAO) {
        this.employeeDao = employeeDAO;
    }

    @Override
    @Transactional
    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }

    @Override
    @Transactional
    public List<Employee> listEmployees() {
        return this.employeeDao.listEmployees();
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {
        return employeeDao.getEmployeeById(id);
    }

    @Override
    @Transactional
    public void removeEmployee(int id) {
        employeeDao.removeEmployee(id);
    }

}