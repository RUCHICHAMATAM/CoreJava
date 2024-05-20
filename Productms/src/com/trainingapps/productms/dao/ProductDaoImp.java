package com.trainingapps.productms.dao;

import com.trainingapps.productms.entity.Product;

public class ProductDaoImp implements ProductDao{
private Product store[]= new Product[10];
private int  genereteId;

private int index=0;
public int generateId(){
    ++genereteId;
    return genereteId;
}
    @Override
    public void add(Product product) {
    int id=generateId();
    product.setId(id);
    store[index]=product;
    index++;
    }

    @Override
    public Product findbyid(int id) {
        for(Product product:store)
        {
            if(product.getId()==id)
            {
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(Product productArg) {

        for(Product product:store)
        {
            if(product.getId()== productArg.getId())
            {
                store[product.getId()]=productArg;
                index++;
            }

        }

    }
    public Product[] findall(){
    Product product[]=new Product[index];
    for(int i=0;i<index;i++)
    {
        product[i]=store[i];
    }
    return product;
    }
}
