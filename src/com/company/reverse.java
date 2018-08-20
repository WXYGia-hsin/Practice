package com.company;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {

     int [] a={10,21,3,5,6,8};
        a = sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static int[] sort(int [] num,int left,int right){
        int i,j,t,temp;
        if(left>right){
            return num;
        }else{
            temp=num[left];
            i=left;
            j=right;
            while(num[j]>=temp && i<j){
                j--;
            }
            while(num[i]<=temp && i<j){
                i++;
            }
        } if(i<j){//判断两数下标有没有相遇
            //若没有相遇
            //交换两数的位置
            t = num[i];
            num[i] = num[j];
            num[j] = t;
            return sort(num,left,right);
        }else{
            num[left] = num[i];
            num[i] = temp;
            sort(num, left, i-1);
            sort(num, j+1, right);
            return num;
        }

    }
}