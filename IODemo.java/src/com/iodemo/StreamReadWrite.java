package com.iodemo;

import java.io.*;

public class StreamReadWrite {
    public static void main(String[] args) {
        StreamReadWrite rewr=new StreamReadWrite();
        rewr.execute();
    }
    public void execute(){
        File file=new File("D:\\intellj codes\\IODemo.java\\src\\demo.txt");
        File file1=new File("D:\\intellj codes\\IODemo.java\\src\\programming.txt");
        FileInputStream filereader=null;
        FileOutputStream filewriter=null;
        try{
            filereader=new FileInputStream(file);
            filewriter=new FileOutputStream(file1);
            int value=0;
            int redcount=0;
            while((value= filereader.read())!=-1){
                filewriter.write(value);
                System.out.println(value);
                redcount++;
            }
            System.out.println("redcount"+redcount);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            close(filereader);
            close(filewriter);
        }
    }
    void close(InputStream filereader){
        try{
            if(filereader!=null){
                filereader.close();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    void close(OutputStream filewriter){
        try{
            if(filewriter!=null){
                filewriter.close();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
