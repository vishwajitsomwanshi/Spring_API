package com.jspiders.productapi.service;

import com.jspiders.productapi.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService
{
    private List<Product> productList=new ArrayList<>();

    {
        productList.add(new Product(1,"Laptop",50000.20));
        productList.add(new Product(2,"mobile",1500.20));
        productList.add(new Product(3,"headphones",5000.20));
        productList.add(new Product(4,"watch",2000.20));

    }

    public List<Product> displayProduct(){
        return productList;
    }

    public  Product getProduct(int id){
        Product ref=null;
        for(Product p:productList)
        {
            if(p.getProductId()==id){
                ref=p;
            }
        }
        return ref;
    }
   public void addProduct(Product p){productList.add(p);
    }
    public void deleteProduct(int id){
        productList.removeIf(p->p.getProductId()==id);
    }
    public void updateProduct(int id,Product p){
         for(int i=0;i< productList.size();i++)
         {
             Product t=productList.get(i);
             if(t.getProductId()==id){
                 productList.set(i,t);
             }
         }
    }
}
