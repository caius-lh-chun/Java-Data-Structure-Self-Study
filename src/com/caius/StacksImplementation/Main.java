package com.caius.StacksImplementation;

import com.caius.POCClasses.Employee;

public class Main {
    public static void main(String[] args) {
        ArrayImpStack stack = new ArrayImpStack(10);
        stack.push(new Employee("caius","chun",123));
        stack.push(new Employee("winsy","lok",1234));
        stack.push(new Employee("raymond","tse",1235));
        stack.push(new Employee("ivan","ng",12356));
        stack.printStack();

        stack.pop();
        stack.printStack();
    }
}
