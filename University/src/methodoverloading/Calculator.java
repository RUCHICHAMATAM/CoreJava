package methodoverloading;

public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public String add(String a,String b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public Double sub(double a, double b){
        return a-b;
    }
}
