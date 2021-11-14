package com.company;

import java.util.Scanner;

public class Task4 {
    public static void task4() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a;
        a = new int[n];
        a = OneArray.fillWhithRandome(a, 0, 50);
        OneArray.printArray(a);
        int max = findMaxArray(a);
        System.out.println("Индекс максимального элемента массива - "+max);
    }
    public static int findMaxArray(int[] a) {
        int max = a[0];
        int j=0;
        for (int i = 1; i < a.length; i++)
            if (a[i] > max) {
                max=a[i];
                j=i;
            }
        return j;
    }

}
