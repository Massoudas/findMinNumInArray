package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int[] getArray(int count){
        int number;
        int[] array= new int[count] ;
        System.out.println("Enter your numbers: ");
        for ( int i=0; i<array.length; i++){
           number = scanner.nextInt();
            scanner.nextLine();
            array[i]=number;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    public static int findMin(int[] array){
        int value=array[0];
        int min=array[0];
        for (int i=0; i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("the minimum number in this array is: "+ min);
        return min;
    }

    public static void main(String[] args) {

        findMin(getArray(6));
    }
}
