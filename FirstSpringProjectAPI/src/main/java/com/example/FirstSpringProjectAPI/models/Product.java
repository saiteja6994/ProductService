package com.example.FirstSpringProjectAPI.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private  Long Id;
    private String title;
    private String description;
    private double price;
    private String image;

    public void setCategory(Category category) {
    }


}
