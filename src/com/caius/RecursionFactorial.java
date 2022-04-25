package com.caius;

public class RecursionFactorial {
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(3));
    }

    //1! = 0! * 1
    //2! = 2 * 1!
    //3! = 3 * 2!

    public static int iterativeFactorial(int num){
        if (num == 0){
            return 1;
        }

        int factorial = 1;

        for (int i = 1; i<=num; i++){
            factorial*=i; //
        }
        return factorial;
    }

    public static int recursiveFactorial(int num){
        if (num == 0){
            return 1;
        }

        return num*recursiveFactorial(num - 1);
        //e.g. num = 3
        // 3 * num = 2
        //num = 2, 2* num = 1
        //num = 1, 1 * num = 0
        //1
        //3 * 2 * 1 * 1
    }
}
