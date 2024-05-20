package accessmod;

public class CustomerMain {
    public static void main(String[] args){
        Customer customer=new Customer(1,"ruchi");
        int id= customer.getId();
        String name= customer.getName();
       customer.setName("ruchitha");
        System.out.println("customer id="+id+" customer name="+customer.getName());
    }
}
