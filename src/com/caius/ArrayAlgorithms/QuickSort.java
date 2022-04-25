package com.caius.ArrayAlgorithms;

import com.caius.ArrayAlgorithms.Util.Helper;

public class QuickSort {

    public static void main(String[] args) {

        int[] intArray = {20,35,-15,7,55,1,-22};
        Helper helper = new Helper(intArray);
        helper.printArray();
        quickSort(intArray,0, intArray.length);
        helper.printArray();

    }

    public static void quickSort (int[] input,int start,int end){

        if(end - start < 2){
            return; //1 element array, no action
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex+1, end);

    }

    public static int partition(int[] input, int start, int end){

        int pivot = input[start];
        int i = start;
        int j = end;
        Helper partiHelper = new Helper(input);
        while (i<j){
            //haven't crossed over - while

            while(i<j && input[--j]>=pivot); //while - until found input[--j] <= pivot,
            //won't drop out of loop
            if (i < j){
                input[i]=input[j];
                partiHelper.printArray();
            }

            while(i<j && input[++i]<=pivot);
            if (i < j){
                input[j]=input[i];
                partiHelper.printArray();
            }
        }

        input[j] = pivot;
        partiHelper.printArray();
        System.out.println("returned " + j);
        return j;


    }
}
