package com.example.FirstSpringProjectAPI.Service;

import com.example.FirstSpringProjectAPI.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductByid(Long id);

    List<Product> getAllproducts();
}
