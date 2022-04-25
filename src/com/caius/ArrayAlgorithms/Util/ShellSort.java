package com.caius.ArrayAlgorithms.Util;
import com.caius.ArrayAlgorithms.Util.Helper;
public class ShellSort {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};
        Helper helper = new Helper(intArray);
        helper.printArray();
        for (int gap = intArray.length/2; gap>0; gap/=2){

            for (int i = gap; i < intArray.length; i++){
                int newElement = intArray[i]; //intArray[gap]

                int j = i;

                while (j >= gap && intArray[j-gap] > newElement){
                    intArray[j] = intArray[j-gap];
                    helper.printArray();
                    j-=gap;
                }

                intArray[j]=newElement;
                helper.printArray();

            }

        }
    }
}
