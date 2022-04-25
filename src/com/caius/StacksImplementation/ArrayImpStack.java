package com.caius.StacksImplementation;

import com.caius.POCClasses.Employee;

import java.util.EmptyStackException;

public class ArrayImpStack {

    private Employee[] stack;
    private int top;//where top of the array is
    //length adn greater than 1 index

    public ArrayImpStack(int capacity){
        stack = new Employee[capacity]; //how big the backing array will be
    }

    public void push(Employee employee){

        if (top == stack.length){
            //array is full, need to resize
            Employee[] newArray = new Employee[2*stack.length]; //resize it to twice
            //reduce amount of times needed to resize
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;

        } //O(n)

        stack[top++] = employee; //O(1)

    }

    public Employee pop(){
        if (isEmpty()){
            throw new EmptyStackException(); //tryna pop empty stack
        }

        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public boolean isEmpty(){
        return (top == 0);
    }

    public Employee peek(){
        if (isEmpty()){
            throw new EmptyStackException(); //tryna pop empty stack
        }

        return stack[top-1]; //don't decrement operator
        //don't change the value
    }

    public int size(){
        return top;
    }

    public void printStack(){
        for (int i = top - 1; i >=0; i--){
            System.out.println((stack[i]));
        }
    }
}
