package com.company;

import java.util.Scanner;

public class Task7 {
    public static void task7() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a;
        a = new int[n];
        a = OneArray.fillWhithRandome(a, 0, 50);
        OneArray.printArray(a);
        int sum = findSum(a);
        System.out.println("Количество нечетных элементов массива "+sum);
    }
    public static int findSum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i]%2 != 0) {
                sum = sum+1;
            }
        return sum;
    }
}
