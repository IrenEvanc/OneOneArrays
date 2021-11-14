package com.company;
import java.util.Scanner;
public class Task5 {

    public static void task5() {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a;
        a = new int[n];
        a = OneArray.fillWhithRandome(a, 0, 50);
        OneArray.printArray(a);
        int sum = findSum(a);
        System.out.println("Сумма элементов массива с нечетными индексами равна "+sum);
    }
    public static int findSum(int[] a) {
        // write your code here
        int sum = 0;
        int j=0;
        for (int i = 0; i < a.length; i++)
            if (i%2 != 0) {
                sum = sum+a[i];
            }
        return sum;
    }

}
