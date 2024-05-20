package StringTask;

public class ShortestWord {
 String findshortword(String[] strArray){

       String shortword=strArray[0];
       for(int i=0;i< strArray.length;i++){
           int len=strArray[i].length();
           if(len<shortword.length()){
               shortword=strArray[i];
           }
       }
       return shortword;
 }
}
