package com.demiurgos.DataAccess;

import com.demiurgos.Model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDataAccess_Database extends DataAccess_Base {

    public List<Employee> Employees;
    public EmployeeDataAccess_Database() {
        Employees = new ArrayList<Employee>();
    }

    public List<Employee> GetEmployees(){
        System.out.println("Database Source");
        Employees.add(new Employee("Rafael", "rafael@gmail.com"));
        Employees.add(new Employee("Juan", "juan@gmail.com"));
        Employees.add(new Employee("Ann", "ann@gmail.com"));

        return Employees;
    }
}
