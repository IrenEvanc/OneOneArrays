package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void task9() {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a;
        a = new int[n];
        a = OneArray.fillWhithRandome(a, 0, 50);
        OneArray.printArray(a);
        System.out.println(Arrays.toString(SortBubble(a)));
    }
    public static int[] SortBubble(int[] a) {
        for (int k = 0; k < a.length-1; k++) {
            for (int i = 0; i < a.length-1-k; i++) {
                if (a[i]>a[i+1]){
                    int temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;}
            }
        }
        return a;
    }
}
