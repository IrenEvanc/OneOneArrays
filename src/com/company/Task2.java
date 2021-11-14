package com.company;

import java.util.Scanner;

public class Task2 {
    public static void task2() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a;
        a = new int[n];
        a = OneArray.fillWhithRandome(a, 0, 50);
        OneArray.printArray(a);
        int max = OneArray.findMaxArray(a);
        System.out.println(max);
    }
}
