package com.trainingapps.Customerms.service;

import com.trainingapps.Customerms.entity.Customer;

public interface CustomerService {
    Customer add(String name,int age);
    Customer FindCustomerById(long id);
    Customer ChangeName(long id,String name);
}
