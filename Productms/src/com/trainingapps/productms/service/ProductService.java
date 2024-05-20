package com.trainingapps.productms.service;

import com.trainingapps.productms.entity.Product;
import com.trainingapps.productms.exceptions.ProductNotFoundException;

public interface ProductService {
    Product add(String name,double price);
    Product FindById(int id) ;
    Product update(int id,double price) ;
    Product[] findall();

}
