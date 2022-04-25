package com.caius.ArrayAlgorithms;


import com.caius.ArrayAlgorithms.Util.Helper;

public class MergeSort {

    public static void main(String[] args) {
        int[] intArray = {20,35,-15, 8, 0};
        mergeSort(intArray,0, intArray.length);
    }

    public static void mergeSort(int[] input, int start, int end){
        //end always 1 greater than the index

        if (end - start < 2){
            return;
        }

        Helper helper2 = new Helper(input);

        helper2.printArray();
        int mid = (start + end)/2;
        mergeSort(input, start, mid); //recursion left side
        mergeSort(input, mid, end); //right side
        merge(input, start, mid, end); //left partitioned and right partitioned by the time this is called
        helper2.printArray();
    }

    public static void merge(int[] input, int start, int mid, int end){

        if(input[mid-1] <= input[mid]){
            return;
            //always merging sorted arrays
            //mid - first element in the right side
            //mid - 1: last element in left
            //if less than or equal, we know they're sorted already
        }

        System.out.println(start);
        System.out.println(mid);
        System.out.println(end);
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        Helper tempArray = new Helper(temp);

        while(i<mid && j < end){
            System.out.println("tempIndex " + tempIndex);
            System.out.println("i " + i);
            System.out.println("j " + j);
            tempArray.printArray();
            temp[tempIndex++] = input[i] <= input[j] ? input[i++]:input[j++];
            //assign smaller of the two, then increment the index
            System.out.println("tempIndex " + tempIndex);
            System.out.println("i " + i);
            System.out.println("j " + j);
            tempArray.printArray();
            //i vs j, if less than or equal, write i
        }

        //optimization, left over in the right means it's greater than everything
        //elements left over in thr lEFT needs to be handled since position will be changed
        //source, position, destination, destinationPos, noOfArraysCopied
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }
}
