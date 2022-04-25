package com.caius.HashTable;

import com.caius.POCClasses.Employee;

public class StoredEmployee {
    public String key; //raw key
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}
