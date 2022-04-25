package com.caius.ArrayAlgorithms;
import com.caius.ArrayAlgorithms.Util.Helper;

public class InsertionSort {

    public static void main(String[] args) {

        int[] intArray = {20,35,-15,7,55,1,-22};
        Helper helper = new Helper(intArray);
        helper.printArray();
        for(int firstUnsorted = 1; firstUnsorted < intArray.length;
        firstUnsorted++){

            int newElement = intArray[firstUnsorted];//insert not swap

            int i; //for loop

            for (i = firstUnsorted; i>0 && intArray[i-1]>newElement; i--){
                //keep looking for insertion point
                //compare from right to left since assume 0 is sorted already
                //condition: i > 0 since 0 assume sorted and
                // if inArray[i-1]>newElement, meaning need to shift left
                intArray[i] = intArray[i-1]; //shifting left to right, not inserted yet
                helper.printArray();
            }
            intArray[i] = newElement; //swap
            helper.printArray();

        }

    }
}
