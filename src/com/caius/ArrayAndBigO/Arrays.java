package com.caius.ArrayAndBigO;

public class Arrays {

    public static void main(String[] args) {
        int[] intArray = new int[7]; //7 integer array
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        //If we know Index:
        System.out.println("-22 is " + intArray[6]);

        //worst time complexity
        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] == -22){
                index = i;
            }
        }
        System.out.println("-22 is " + intArray[index]);
    }
}
