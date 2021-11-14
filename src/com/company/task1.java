package com.company;

import java.util.Scanner;

public class task1 {

    public static void task1() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a;
        a = new int[n];
        a = OneArray.fillWhithRandome(a, 0, 50);
        OneArray.printArray(a);
        int min = OneArray.findMinArray(a);
        System.out.println(min);
    }
}
