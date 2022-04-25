package com.caius.ArrayAlgorithms.Util;

public class Helper {
    private int[] array;

    public Helper(int[] array) {
        this.array = array;
    }

    //swap helper class
    public void swap (int i, int j){
        if (i == j){
            return;
        }

        int temp = this.array[i];
        this.array[i] = this.array[j];
        this.array[j] = temp;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void printArray(){
        StringBuilder arrayString = new StringBuilder();
        arrayString.append("Array: [ ");

        for(int i=0;i<this.array.length;i++){


            arrayString.append(this.array[i]+" ");
        }

        arrayString.append("]");

        System.out.println(arrayString);
    }
}
