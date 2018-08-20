package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            System.out.println("键盘输出的内容是："+scanner.next());
//        }
        try {
            Scanner scanner=new Scanner(new File("F:/1.txt"));
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
