package com.company;

import java.io.*;

public class Filetest {
    public static void main(String[] args) {
        File file=new File("f:/1.txt");
//        if(file.exists()){
//            file.delete();
//            System.out.println("删除成功！");
//        }else{
//            try {
//                file.createNewFile();
//                System.out.println("创建成功！");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        try {
//            file.createNewFile();
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            byte a[]="好好学习！".getBytes();
            fileOutputStream.write(a);
//            byte b[]="lalal".getBytes();
//            fileOutputStream.write(b);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            byte c[]=new byte[1024];
            int c1=fileInputStream.read(c);
            System.out.println(new String(c,0,c1));
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
