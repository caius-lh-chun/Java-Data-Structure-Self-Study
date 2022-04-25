package com.caius.JavaLists;

import com.caius.POCClasses.Employee;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront(){
        if (isEmpty()){
            return null;
        }

        EmployeeNode removeNode = head;
        head = head.getNext(); //head to become original next
        size--;
        removeNode.setNext(null);
        return removeNode;

    }

    public boolean isEmpty(){
        return head==null;
    }

    public int getSize() {
        return size;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.println("HEAD->");
        while(current!=null){
            System.out.println(current);
            current = current.getNext();
        }
    }
}
