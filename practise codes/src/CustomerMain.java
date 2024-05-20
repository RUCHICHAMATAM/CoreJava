public class CustomerMain {
    public static void main(String[] args) {
        Customer customers[] = new Customer[3];
        Customer customer1 = new Customer();
        customer1.setId(1234);
        customer1.setName("ruchitha");
        customer1.setAge(23);
        customer1.setBalance(50000);
        customer1.credit(3000);
        customer1.debit(2000);
        Customer customer2=new Customer();
        customer2.setId(22345); ;
        customer2.setName("ruchitha");
        customer2.setAge(34);
        customer2.setBalance(45000);
        customer2.credit(4000);
        customer2.debit(7000);
        Customer customer3 = new Customer(12345,25,"rajruch",90000);

        customers[0]=customer1;
        customers[1]=customer2;
        customers[2]=customer3;
        System.out.println("id "+"   "+"name"+"    "+"age"+"   "+"balance");


        for(int i=0;i<customers.length;i++)
        {
            System.out.println(customers[i].getId()+" "+customers[i].getName()+" "+customers[i].getAge()+" "+customers[i].getBalance());
        }


    }
}
