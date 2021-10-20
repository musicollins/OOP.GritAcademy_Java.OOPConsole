package com.demiurgos.DataAccess;

import com.demiurgos.Model.Employee;

import java.util.ArrayList;
import java.util.List;

public abstract class DataAccess_Base {
    public List<Employee> Employees;
    public DataAccess_Base() {
        Employees = new ArrayList<Employee>();
    }

    public abstract List<Employee> GetEmployees();
}
