package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void task8() {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a;
        a = new int[n];
        a = OneArray.fillWhithRandome(a, 0, 50);
        OneArray.printArray(a);
        System.out.println(Arrays.toString(reverce(a)));
    }
    public static int[] reverce(int[] a) {
        int[] a1 = new int[a.length];
        int j = a.length / 2;
        for (int i = 0; i < a.length; i++) {
            if (a.length % 2 == 0)
                if (i < j) {
                    a1[i] = a[j + i];
                } else {
                    a1[i] = a[i - a.length / 2];
                }
            else if (i < j) {
                a1[i] = a[1 + j + i];
            } else if (i == j) {
                a1[i] = a[j];
            } else {
                a1[i] = a[i-1 - a.length / 2];
            }
        }
        return a1;
    }


}
