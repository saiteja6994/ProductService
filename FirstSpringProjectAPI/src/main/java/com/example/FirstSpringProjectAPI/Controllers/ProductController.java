package com.example.FirstSpringProjectAPI.Controllers;

import com.example.FirstSpringProjectAPI.Service.ProductService;
import com.example.FirstSpringProjectAPI.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController //this controller going to host rest HTTP API's
//localhost:8080/products
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    ProductController(ProductService productService){
        this.productService=productService;
    }

    //localhost:8080/products/1
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){

        return productService.getProductByid(id);
    }
    
    @GetMapping()
    public ArrayList<Product> getAllProducts(){

        return new ArrayList<>();
    }

    //create Product
    //delete Product
    //update Product -> partial update(PATCH)
    //replace Product
}
