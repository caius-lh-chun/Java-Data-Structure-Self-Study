package com.caius.JavaLists;

import com.caius.POCClasses.Employee;

public class EmployeeNodeDouble {
    //no generic implementation, just POC

    private Employee employee;
    private EmployeeNodeDouble next;
    private EmployeeNodeDouble previous;

    public EmployeeNodeDouble(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNodeDouble getNext() {
        return next;
    }

    public void setNext(EmployeeNodeDouble next) {
        this.next = next;
    }

    public EmployeeNodeDouble getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNodeDouble previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
