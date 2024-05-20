package com.cityex.city;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CityWork {

   public List< City > populateFromFile(){
        try{

    FileReader fr=new FileReader("D:\\intellj codes\\CityEx\\src\\com\\cityex\\city\\cities.txt");
    BufferedReader br=new BufferedReader(fr);

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        return ;
   }
    catch(Exception e){
        System.out.println("Something went wrong.");

    }



}
