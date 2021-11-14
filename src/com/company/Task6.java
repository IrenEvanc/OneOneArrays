package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

    public static void task6() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a;
        a = new int[n];
        a = OneArray.fillWhithRandome(a, 0, 50);
        OneArray.printArray(a);
        System.out.println(Arrays.toString(OneArray.reverce(a)));
    }

}
