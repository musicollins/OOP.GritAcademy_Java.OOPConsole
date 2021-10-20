package com.demiurgos;

import com.demiurgos.DataAccess.EmployeeDataAccess_Database;
import com.demiurgos.DataAccess.EmployeeDataAccess_Text;
import com.demiurgos.ViewModel.EmployeeViewModel;

import java.net.URISyntaxException;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args){
        for (var name : args){
            out.println(name);
        }
        EmployeeDataAccess_Text dataAccess = null;

            dataAccess = new EmployeeDataAccess_Text();

            dataAccess.ReadFromTextFile();

        var viewModel = new EmployeeViewModel(dataAccess);

        viewModel.LoadEmployees();
        viewModel.Employees.forEach(e -> out.println(e.toString()));


    }
}
