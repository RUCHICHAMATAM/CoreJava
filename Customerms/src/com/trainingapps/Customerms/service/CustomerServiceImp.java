package com.trainingapps.Customerms.service;

import com.trainingapps.Customerms.Dao.CustomerDao;
import com.trainingapps.Customerms.Dao.CustomerDaoImp;
import com.trainingapps.Customerms.entity.Customer;
import com.trainingapps.Customerms.exceptions.CustomerNotFoundException;
import com.trainingapps.Customerms.exceptions.InvalidCustomerAgeException;
import com.trainingapps.Customerms.exceptions.InvalidCustomerIdException;
import com.trainingapps.Customerms.exceptions.InvalidCustomerNameException;

public class CustomerServiceImp implements CustomerService{
    CustomerDao customerDao=new CustomerDaoImp();

    @Override
    public Customer add(String name, int age) {
        ValidateName(name);
        ValidateAge(age);
        Customer c=new Customer(name,age);
        customerDao.add(c);
        return c;
    }

    @Override
    public Customer FindCustomerById(long id) {
        ValidateId(id);
        Customer c1=customerDao.FindById(id);
        return c1;
    }

    @Override
    public Customer ChangeName(long id, String name) {
        ValidateId(id);
        ValidateName(name);
        Customer c2=customerDao.FindById(id);
        if(c2==null)
        {
            throw new CustomerNotFoundException("customer not found");
        }
        c2.setName(name);
        return c2;
    }
    void ValidateName(String name){
        if(name.length()>2 && name.isEmpty())
        {
            throw new InvalidCustomerNameException("invalid customer name");
        }

    }
    void ValidateAge(int age){
        if(age<15 && age>100){
            throw new InvalidCustomerAgeException("invalid customer age");
        }
    }
    void ValidateId(long id){
        if(id<=0){
            throw new InvalidCustomerIdException("invalid customer id");
        }
    }
}

