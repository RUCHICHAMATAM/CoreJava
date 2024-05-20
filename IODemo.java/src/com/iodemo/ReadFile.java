package com.iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


import static javax.print.attribute.standard.MediaSizeName.D;

public class ReadFile {

    public static void main(String args[]) {
       try{
        File file = new File("D:\\intellj codes\\IODemo.java\\src\\demo.txt");
        File file1 = new File("D:\\intellj codes\\IODemo.java\\src\\names.txt");

            FileInputStream fin = new FileInputStream(file);
            FileOutputStream fin1 = new FileOutputStream(file1);
            int i = 0;
            int redcount = 0;
            while ((i = fin.read())!= -1) {
                System.out.println("file data");
                fin1.write(i);
                System.out.println(i);
                redcount++;
            }
           System.out.println("redcount=" + redcount);
            fin.close();

        } catch (Exception e) {
           System.out.println(e);
            ;
        }

    }
}


