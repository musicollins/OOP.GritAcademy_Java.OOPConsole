package com.demiurgos.DataAccess;

import com.demiurgos.Model.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDataAccess_Text extends DataAccess_Base implements TextFileReaderHelper {
    private List<Employee> Employees;
    public EmployeeDataAccess_Text() {
        Employees = new ArrayList<Employee>();
        ReadFromTextFile();
    }

    @Override
    public List<Employee> GetEmployees(){
        System.out.println("TextFile Source");
        return Employees;
    }

    @Override
    public void ReadFromTextFile(){
        Scanner scanner;
        //File names = new File("./employees");
        File names = new File("./employees");
        try {
             scanner = new Scanner(names);
             while(scanner.hasNextLine())
             {
                 System.out.println("Reading File...");
                 Thread.sleep(2000);
                var name = scanner.nextLine();
                var email = CreateEmailAddresses(name);
                Employees.add(new Employee(name, email ));
             }
             scanner.close();

        } catch (FileNotFoundException | InterruptedException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }

    private String CreateEmailAddresses(String name){
        StringBuilder builder = new StringBuilder();
        builder.append(name.toLowerCase());
        builder.append("@gmail.com");
        return builder.toString();
    }
}
