package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void task10() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a;
        a = new int[n];
        a = OneArray.fillWhithRandome(a, 0, 50);
        OneArray.printArray(a);
        System.out.println(Arrays.toString(SortInsert(a)));
    }
    public static int[] SortInsert(int[] a) {
        for (int k = 0; k < a.length; k++) {
            int b= a[k];
            int i = k-1;
            for (; i >=0; i--) {
                if (b>a[i]){
                    a[i+1]=a[i];
                } else {break;}
            }
            a[i+1]=b;
        }
        return a;
    }
}
