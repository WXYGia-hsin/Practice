package com.company;

public class ThreadTest extends Thread{
    public static void main(String[] args) {
       ThreadTest threadTest=new ThreadTest();
        threadTest.start();

    }
    public  void run(){
        int i=0;
        while (i<5){
            System.out.println(++i);
        }
    }

}
