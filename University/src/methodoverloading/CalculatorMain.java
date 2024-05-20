package methodoverloading;

public class CalculatorMain {
    public static void main(String[] args){
        Calculator calcy=new Calculator();

        int resultint= calcy.add(2,4);
       int resultsubint= calcy.sub(2,1);
      double resultdoublesub=  calcy.sub(9.00,5.49);
       String resultstringadd= calcy.add("ruchi","tha");
        System.out.println("add int="+resultint);
        System.out.println("sub int="+resultsubint);
        System.out.println("double sub="+resultdoublesub);
        System.out.println("string add="+resultstringadd);


    }
}
