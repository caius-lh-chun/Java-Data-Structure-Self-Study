package com.caius.JavaLists;

import com.caius.POCClasses.Employee;

public class LinkedListImplementation {
    public static void main(String[] args) {
        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(new Employee("Caius","Chun",123));
        list.addToFront(new Employee("Barry","Choi",124));
        list.addToFront(new Employee("Ivan","Ng",147));
        //Ivan comes out first since we add him last and we add to Front
        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }
}
