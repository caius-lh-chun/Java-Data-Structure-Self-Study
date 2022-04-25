package com.caius.ArrayAlgorithms;

public class BubbleSort {

    public static void main(String[] args) {

        int[] intArray = {20,35,-15,7,55,1,-22};

        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0;
                lastUnsortedIndex--){ //growing right to left, put largest to right
            //outer: bubble largest into sorted partition - into the end of array
            for (int i = 0; i <lastUnsortedIndex; i++){
                if (intArray[i]>intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }

        //Print post-sort
        for (int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }
    public static void swap(int[] array, int i, int j) {

        if(i==j){
            return;
            //do nothing if elements are equal
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp; //i and j swapped

    }
}
