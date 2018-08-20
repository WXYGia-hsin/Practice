package com.company;

import org.junit.Test;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/11/29 0029.
 */
public class Tanxin {
    @Test
    public void a(){
        System.out.print("一共几堆纸牌：");
        Scanner in=new Scanner(System.in);
        int heapCount;
        heapCount=in.nextInt();
        System.out.println("请分别输入" + heapCount + "堆纸牌的个数：");
    }


}


