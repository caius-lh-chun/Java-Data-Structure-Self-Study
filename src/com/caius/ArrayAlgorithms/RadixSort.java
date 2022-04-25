package com.caius.ArrayAlgorithms;

import com.caius.ArrayAlgorithms.Util.Helper;

public class RadixSort {
    public static void main(String[] args) {
        int[] intArray = {4725, 4586, 1330, 8792, 1594, 5729};
        Helper newHelper = new Helper(intArray);
        radixSort(intArray, 10, 4);
        newHelper.printArray();
    }

    public static void radixSort(int[] input, int radix, int width){
        for (int i = 0; i < width; i++){ //least significant to most significant digit
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;

        int[] countArray = new int[radix];

        for (int value:input){
            countArray[getDigit(position, value, radix)]++; //increment the element by 1 once returned
            //increment count by 1 after getting the radix
            //a conventional countArray as a result
            //adjusting count afterwards
                //each position - contains or less

        }
        //count array adjustment - number of values that have that or less than that digit
        for (int j = 1; j < radix; j++){
            countArray[j] += countArray[j-1];
            //adding up cumulatively
        }

        //work and copy right to left to preserve copies
        int[] temp = new int[numItems];
        for (int tempIndex = numItems-1; tempIndex>=0; tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
            //copied into temporary array

        }
        //copying back
        for (int tempIndex=0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix){
        return value /  (int) Math.pow(10, position) % radix;
        //Math.pow (raises 10 to position)
        //remainder
        //e.g. 10^(0)=1
            //divide 4725 / 1
                //4725 / 10 ~ 472 remainder 5
    }
}
