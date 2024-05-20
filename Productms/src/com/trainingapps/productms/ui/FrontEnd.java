package com.trainingapps.productms.ui;

import com.trainingapps.productms.entity.Product;
import com.trainingapps.productms.exceptions.InvalidProductIdException;
import com.trainingapps.productms.exceptions.InvalidProductNameException;
import com.trainingapps.productms.exceptions.InvalidProductPriceException;
import com.trainingapps.productms.exceptions.ProductNotFoundException;
import com.trainingapps.productms.service.ProductService;
import com.trainingapps.productms.service.ProductServiceImp;

public class FrontEnd {

      private ProductService productService = new ProductServiceImp();
      public  void runUI() {
            try {
                System.out.println("add product");
                Product p1 = productService.add("samsung", 30000);
                display(p1);
                Product p2 = productService.add("motorola", 25000);
                display(p2);
                System.out.println("finding product by id");
                Product p3 = productService.FindById(p1.getId());
                display(p3);
                System.out.println("update product by id");
                Product p4 = productService.update(2, 230000);
                display(p4);
                System.out.println("display all products");
                Product p5[]= productService.findall();
                displayallproducts(p5);
            }
            catch(ProductNotFoundException e){
                System.out.println(e.getMessage());
            }
            catch(InvalidProductIdException e){
                System.out.println(e.getMessage());
            }
            catch(InvalidProductNameException e){
                System.out.println(e.getMessage());
            }catch(InvalidProductPriceException e){
                System.out.println(e.getMessage());
            }
            catch(Exception e) {
                e.getStackTrace();

                System.out.println(e.getMessage());
            }
            }
        void display(Product product)
        {
            System.out.println("productid= "+product.getId()+" productname= "+product.getName()+" productprice= "+product.getPrice());
        }
        void displayallproducts(Product[] products){
          for(Product product:products){
              System.out.println(" productid= "+product.getId()+" productname= "+product.getName()+" productprice= "+product.getPrice());
          }
        }




}
