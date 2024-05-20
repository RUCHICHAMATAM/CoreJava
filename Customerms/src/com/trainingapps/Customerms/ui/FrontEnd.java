package com.trainingapps.Customerms.ui;

import com.trainingapps.Customerms.entity.Customer;
import com.trainingapps.Customerms.exceptions.InvalidCustomerAgeException;
import com.trainingapps.Customerms.exceptions.InvalidCustomerIdException;
import com.trainingapps.Customerms.exceptions.InvalidCustomerNameException;
import com.trainingapps.Customerms.service.CustomerService;
import com.trainingapps.Customerms.service.CustomerServiceImp;

public class FrontEnd {
    CustomerService customerService=new CustomerServiceImp();
   public  void runUI(){
        try{
        System.out.println("adding customers");
       Customer c1=customerService.add("ruchitha",21);
        display(c1);
        Customer c2=customerService.add("rajitha",22);
        display(c2);
        System.out.println("find customer by id");
        Customer c3=customerService.FindCustomerById(c1.getId());
        display(c3);
        System.out.println("change customer name");
        Customer c4=customerService.ChangeName(1, "ruchitha chamatam");
         //   System.out.println(c4.getName());
       display(c4);
        }
        catch(InvalidCustomerIdException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidCustomerNameException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidCustomerAgeException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    void display(Customer c)
    {
        System.out.println("customerid= "+c.getId()+" customername= "+c.getName()+" customerage= "+c.getAge());
    }
}
