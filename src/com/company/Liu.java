package com.company;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 2017/11/2 0002.
 */
public class Liu {
    @Test
    public void copy(){

        try(  FileInputStream fileInputStream=new FileInputStream("H://配置猫.WMV");
              FileOutputStream fileOutputStream=new FileOutputStream("G://配置猫.WMV");) {
                int n=-1;
                byte[] buffer=new byte[1024*1024*20];
                while((n=fileInputStream.read())!=-1){
                    fileOutputStream.write(buffer,0,n);
                }
                long start=System.currentTimeMillis();
                long end=System.currentTimeMillis();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("mm:ss");
            System.out.print(simpleDateFormat.format(end-start));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
    @Test
    public void write(){
       // FileOutputStream fileOutputStream=null;
        try(FileOutputStream fileOutputStream=new FileOutputStream("F://1.txt")) {
            fileOutputStream.write("曹明".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }


    }
    @Test
    public void read(){
        try( FileInputStream fileInputStream=new FileInputStream("F://1.txt");) {
          byte [] buffer=new byte[1024];
          int a=-1;
          while ((fileInputStream.read(buffer)!=-1)){
              System.out.print(new String(buffer));

          }
         // fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
