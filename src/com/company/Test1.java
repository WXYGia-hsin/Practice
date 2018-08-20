package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/11/15 0015.
 */
public class Test1 {
    public  static int binarySearch(int x) {
        int[] a = {2, 3, 4, 5, 6, 8, 9};
        int left = a[0];
        int right = a[a.length - 1];
        while (left <= right) {
                    int middle = (left + right) / 2;
                    if (x == a[middle]) {
                        return middle;
                    }
                    if (x > a[middle]) {
                        left = middle + 1;
                    } else {
                        right = left - 1;
                    }
                }


       return -1;

    }


    public static void main(String[] args) {


         Scanner scanner=new Scanner(System.in);
         int x=scanner.nextInt();
         System.out.print("请输入搜素元素x："+binarySearch(x));
    }
}
