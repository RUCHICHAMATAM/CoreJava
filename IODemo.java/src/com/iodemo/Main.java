package com.iodemo;


import java.io.File;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        File file=new File("D:\\intellj codes\\IODemo.java\\src\\programming.txt");
        boolean isdir=file.isDirectory();
        boolean isfile=file.isFile();
        boolean isexsists=file.exists();
        System.out.println("is directory of file="+isdir+" is file of file="+isfile+" is exsists="+isexsists);
        File file1=new File("D:\\intellj codes\\IODemo.java\\src");
        boolean isdir1=file1.isDirectory();
        boolean isfile1=file1.isFile();
        boolean isexsists1=file1.exists();
        System.out.println("is directory of file1="+isdir1+" is file of file1="+isfile1+" is exsists1="+isexsists1);
        File files[]=file1.listFiles();
        for(File f:files){
            System.out.println("file name in mydir="+f.getName());
        }

    }
}