package com.demiurgos.Model;

import java.util.UUID;

public class Employee {
    public UUID Id = UUID.randomUUID();
    public String Name;
    public String Email;

    public Employee(String name, String email) {
        Name = name;
        Email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
