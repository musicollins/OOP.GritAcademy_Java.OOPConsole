package com.demiurgos.ViewModel;

import com.demiurgos.DataAccess.DataAccess_Base;
import com.demiurgos.DataAccess.EmployeeDataAccess_Database;
import com.demiurgos.Model.Employee;

import java.util.ArrayList;
import java.util.List;


public class EmployeeViewModel {
    public List<Employee> Employees;
    private DataAccess_Base dataAccess;

    public EmployeeViewModel(DataAccess_Base dataAccess) {
        this.dataAccess = dataAccess;
        Employees = new ArrayList<Employee>();
    }



    public void LoadEmployees(){
        var employees = dataAccess.GetEmployees();
        Employees.addAll(employees);
    }
}
