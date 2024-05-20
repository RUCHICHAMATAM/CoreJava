package com.trainingapps.Customerms.Dao;

import com.trainingapps.Customerms.entity.Customer;

public interface CustomerDao {
     void add(Customer customer);
     Customer FindById(long id);
     void update(Customer customerarg);
}
