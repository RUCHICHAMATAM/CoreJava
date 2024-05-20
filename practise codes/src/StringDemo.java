import java.lang.String;
public class StringDemo {
    public static void main(String[] args){
       String str="hello";
        char ch=str.charAt(0);
        System.out.println("ch="+ch);
        char str1[]=str.toCharArray();
        System.out.println(str1);
        int elstrtindex=str.indexOf("l");
        System.out.println("el start index="+elstrtindex);
        StringBuilder str2=new StringBuilder("hi");
        StringBuilder str3=str2.append("hello");
        System.out.println(str3);
    }
}
