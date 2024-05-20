package com.customer;

class CustomerMain {
    public static void main(String args[]){
        Customer customers[] =new Customer[2];
        RegularCustomer customer1= new RegularCustomer(1,"ruchitha",22,"Rs.5000 off on diwali shopping");
         customer1.setName("ruchi");
         BusinessCustomer customer2=new BusinessCustomer(2,"rajitha",23,5.5);
         customer2.setAge(21);
         customers[0]=customer1;
         customers[1]=customer2;
         for(Customer iterated:customers){


             boolean isReg=iterated instanceof RegularCustomer;
             if(isReg){
                 RegularCustomer regcust=(RegularCustomer) iterated;
                 int id= iterated.getId();
                 String name= iterated.getName();
                 int age= iterated.getAge();
                 String offer=regcust.getOffer();
                 System.out.println(id+" "+name+" "+age+" "+offer);

             }
             boolean isBus=iterated instanceof BusinessCustomer;
             if(isBus){
                BusinessCustomer buscust=(BusinessCustomer) iterated;
                 int id= iterated.getId();
                 String name= iterated.getName();
                 int age= iterated.getAge();
                  double discount=buscust.getDiscount();
                 System.out.println(id+" "+name+" "+age+" "+discount);


             }
         }
    }
}
