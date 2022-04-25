package com.caius.JavaLists;

import com.caius.POCClasses.Employee;

public class EmployeeDoubleLinkedList {
    private EmployeeNodeDouble head;
    private EmployeeNodeDouble tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNodeDouble node = new EmployeeNodeDouble(employee);
        node.setNext(head);

        if (isEmpty()){
            tail = node; //add to empty list
        }
        else{
            head.setPrevious(node);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNodeDouble node = new EmployeeNodeDouble(employee);
        if (isEmpty()){
            head = node;
        }
        else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size ++;
    }

    public EmployeeNodeDouble removeFromFront(){
        if (isEmpty()){
            return null;
        }

        EmployeeNodeDouble removeNode = head;

        if (head.getNext() == null){
            tail = null;
        }
        else{
            head.getNext().setPrevious(null);
        }

        head = head.getNext(); //head to become original next
        size--;
        removeNode.setNext(null);
        return removeNode;

    }

    public EmployeeNodeDouble removeFromEnd(){
        if (isEmpty()){
            return null;
        }

        EmployeeNodeDouble removeNode = tail;

        if(tail.getPrevious()==null){
            head = null;
        }
        else{
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious(); //old tail's previous as new tail
        size--;
        removeNode.setPrevious(null);
        return removeNode;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int getSize() {
        return size;
    }

    public void printList(){
        EmployeeNodeDouble current = head;
        while(current!=null){
            System.out.println(current);
            current = current.getNext();
        }
    }
}
