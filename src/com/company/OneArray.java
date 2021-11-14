package com.company;
import java.util.Random;
import java.util.Scanner;

public class OneArray {
    public static int[] fillWhithRandome(int[] a, int start, int end) {
        // write your code here
        for (int i = 0; i < a.length; i++) {
            Random rnd = new Random();
            a[i] = rnd.nextInt(end - start)+start;
        }
        return a;
    }
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + ", ");
        System.out.println();
    }
    public static int findMinArray(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < min) {
                min = a[i];
            }
        return min;
    }
    public static int findMaxArray(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max) {
                max = a[i];
            }
        return max;
    }
    public static int[] reverce(int[] a) {
        int[] a1 = new int [a.length];
        for (int i = 0; i < a.length; i++) {
            a1[i]=a[a.length-1-i];
        }
        return a1;
    }
}


