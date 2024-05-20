package StringTask;
import java.lang.*;
import java.util.Arrays;

public class StringImp {
    int countvowels(String input){
        int count=0;
        input=input.toLowerCase();
        for(int i=0;i<input.length();i++){
        char ch=input.charAt(i);
        if(isVowel(ch)){

            ++count;
        }
        }
        return count;
    }
    boolean isVowel(char ch){
        return(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');

    }
    String Uniquevowel(String input){
        input=input.toLowerCase();
        String uniquevowels="";
        for(int j=0;j<input.length();j++) {
            char ch = input.charAt(j);
            String str = "" + ch;
            boolean contain = uniquevowels.contains(str);
            if (contain) {
                continue;

            }
            if (isVowel(ch)) {
                uniquevowels = uniquevowels + ch;
            }
        }
            if(uniquevowels.isEmpty()){
                return "no vowels are present";
            }
            return uniquevowels;


    }
    String reversestring(String input){
        String reversestring="";
        for(int i=input.length()-1;i>=0;i--){
            char ch=input.charAt(i);
            reversestring=reversestring+ch;
        }
        return  reversestring;
    }
    String sortString(String input){
        char sortString[] = input.toCharArray();
        Arrays.sort(sortString);
        return new String(sortString);
    }
    String orderedstring(String input){
       String orderedstring=sortString(input);
       return orderedstring;

    }
    String subtractedstring(String input1,String input2){
       int substring=input1.indexOf(input2);
       if(substring==-1){
           return "input2 is not a substring of input1";
       }
       else {
           return "input2 is a substring of input1";
       }
    }
    double changetonumberstring(String input){
        double num= Double.parseDouble( input.replace("-",".") );
        return num;
    }
    String partslengthgreaterthan3(String input){
        String parts[]=input.split("-");
        String partssplit="";
        for(int i=0;i<parts.length;i++){
            if(parts[i].length()>3){
                partssplit=partssplit+parts[i]+",";
            }


        }
        return partssplit;
    }

}
