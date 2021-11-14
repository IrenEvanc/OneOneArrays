package com.company;

import java.util.Scanner;

public class Task3 {
    public static void task3() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a;
        a = new int[n];
        a = OneArray.fillWhithRandome(a, 0, 50);
        OneArray.printArray(a);
        int min = findMinArray(a);
        System.out.println("Индекс минимального элемента массива - "+min);
    }
    public static int findMinArray(int[] a) {
        int min = a[0];
        int j=0;
        for (int i = 1; i < a.length; i++)
            if (a[i] < min) {
                min = a[i];
                j=i;
            }
        return j;
    }
}
