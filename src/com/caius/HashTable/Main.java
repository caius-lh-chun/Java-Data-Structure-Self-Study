package com.caius.HashTable;

import com.caius.JavaLists.EmployeeDoubleLinkedList;
import com.caius.POCClasses.Employee;

public class Main {
    public static void main(String[] args) {
        ChainedHashTable ht = new ChainedHashTable();
        ht.put("Chun",new Employee("Caius","Chun",123));
        ht.put("Ho",new Employee("Howard","Ho",123));
        ht.put("Lau",new Employee("Keith","Lau",123));
        ht.put("Chan",new Employee("Caius","Chan",223));
        ht.printHashTable();

        System.out.println("---------");
        ht.remove("Chun");
        ht.printHashTable();

        System.out.println("Getting Employee...");
        System.out.println(ht.get("Ho"));
    }
}
