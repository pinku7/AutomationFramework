package com;


import java.util.Scanner;

/**
 * Created by sangi on 11-09-2019.
 */
public class Test1 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myInteger = getInstance(5);
        int[] sorted = sortIntegers(myInteger);
        printArray(sorted);

    }

    private static int[] getInstance(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter "+ capacity +" integer values : \r");
        for (int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        return  array;
    }

    public static  void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println("Element "+ i +" contents "+array[i]);
        }
    }

    public static  int[] sortIntegers(int[] array){
    /*    int[] sortedArray = new int[array.length];
        for (int i=0;i<array.length;i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {

        flag = false;
        for (int i=0;i<sortedArray.length-1;i++){
            if (sortedArray[i] < sortedArray[i+1]){
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i+1];
                sortedArray[i+1] = temp;
                flag = true;
            }
        }
        }*/
        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return  array;
    }
}

