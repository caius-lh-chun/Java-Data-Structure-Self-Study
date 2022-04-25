package com.caius.ArrayAlgorithms;

import com.caius.ArrayAlgorithms.Util.Helper;

public class SelectionSort {
    public static void main(String[] args) {

        int[] intArray = {20,35,-15,7,55,1,-22};
        Helper helper = new Helper(intArray);
        helper.printArray();

        for (int lastUnsortedIndex = intArray.length-1;
            lastUnsortedIndex>0;lastUnsortedIndex--){

            int largestIndex = 0; //init

            for (int i=1; i<=lastUnsortedIndex; i++){
                //compare every element <= opeator
                if (intArray[i]>intArray[largestIndex]){
                    largestIndex=i;
                    //get largest then swap
                }
            }

            helper.swap(largestIndex,lastUnsortedIndex);
            helper.printArray();
        }

//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }

    }
}
