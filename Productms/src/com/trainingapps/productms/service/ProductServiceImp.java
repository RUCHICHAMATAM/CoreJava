package com.trainingapps.productms.service;

import com.trainingapps.productms.dao.ProductDao;
import com.trainingapps.productms.dao.ProductDaoImp;
import com.trainingapps.productms.entity.Product;
import com.trainingapps.productms.exceptions.*;

public class ProductServiceImp implements ProductService{
    ProductDao productdao=new ProductDaoImp();
    public Product add(String name, double price){
        ValidateName(name);
        ValidatePrice(price);
        Product p=new Product(name,price);
        productdao.add(p);
        return p;
    }
    public Product FindById(int id){
        ValidateId(id);
       Product product= productdao.findbyid(id);
       if(product==null)
       {
           throw new ProductNotFoundException("product not found");
       }
        return product;
    }
    public Product update(int id,double price){
        ValidateId(id);
        ValidatePrice(price);
        Product p=productdao.findbyid(id);
        if(p==null){
            throw new ProductNotFoundException("product not found");
        }
       // productdao.update(p);
       // System.out.println(p.getPrice());
        p.setPrice(price);

        return p;

    }
   public  Product[] findall(){
        Product product[]= productdao.findall();
        return product;
   }
    void ValidateName(String name){
        if(name==null ||name.isEmpty()){
            throw new InvalidProductNameException("product name is null or empty");
        }
    }
    void ValidatePrice(double price){
        if(price<0)
        {
            throw new InvalidProductPriceException("product price is invalid");
        }

    }
   void ValidateId(int id)
   {
       if(id<=0)
       {
           throw new InvalidProductIdException("product id is invalid");
       }
   }



}
