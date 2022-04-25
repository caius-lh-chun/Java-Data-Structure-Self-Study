package com.caius.Buckets;


import com.caius.ArrayAlgorithms.Util.Helper;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] array = {54, 46, 83, 66, 95, 92, 43};
        Helper helper1 = new Helper(array);
        bucketSort(array);


        helper1.printArray();

    }

    public static void bucketSort(int[] input) {
        System.out.println("Bucket Sorting...");
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<Integer>(); //inside each is ArrayList
        }

        for (int i = 0; i < input.length; i++) {
            System.out.println(hash(input[i])+":"+input[i]);
            buckets[hash(input[i])].add(input[i]);
            //hash -> which buckets - index of list
            //add into the ArrayList
        }

        for (List bucket : buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            //traverse buckets array
            for (int value : buckets[i]) {
                //traverse inside-ArrayList
                System.out.print(j + ":" + value);
                input[j++] = value;
                System.out.print(j + ":" + value);
                System.out.println("");
            }
        }
    }

    public static int hash(int value) {
        return value / (int) 10; //return 10s value

    }
}
