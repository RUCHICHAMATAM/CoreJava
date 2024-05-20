package com.trainingapps.productms.dao;

import com.trainingapps.productms.entity.Product;

public interface ProductDao {
    void add(Product product);
    Product findbyid(int id);
    void update(Product productArg);
    Product[] findall();
}
