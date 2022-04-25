package com.caius.JavaLists;

import com.caius.POCClasses.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPOC {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        //List: replace specific class implementation
        //ArrayList or others
        employeeList.add(new Employee("Caius","Chun",123));
        employeeList.add(new Employee("Barry","Choi",124));
        employeeList.add(new Employee("Ivan","Ng",147));

        employeeList.forEach(employee -> System.out.println(employee.toString()));

        System.out.println(employeeList.get(1)); //array backing list, random access
        //done in constant time

        System.out.println(employeeList.isEmpty()); //is list empty

        //toArray
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeArray){
            System.out.println(employee.toString());
        }

        System.out.println(employeeList.contains(new Employee("Caius","Chun",123)));
        //return false because haven't implemented the equal methods in the employee class
        System.out.println(employeeList.indexOf(new Employee("Ivan","Ng",147)));
    }
}
