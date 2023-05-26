package com.jspiders.productapi.controller;

import com.jspiders.productapi.model.Product;
import com.jspiders.productapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController
{
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> dispalyProduct()
    {
        return service.displayProduct();
    }
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id){
        return service.getProduct(id);
    }
   @PostMapping("/products/")
    public void addProducts(@RequestBody Product p)
    {
        service.addProduct(p);
    }
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id)
    {
        service.deleteProduct(id);
    }
   @PutMapping("products/{id}")
    public void updateProduct(@PathVariable int id,@RequestBody Product p)
    {
        service.updateProduct(id,p);
    }

}
