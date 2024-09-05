package com.example.FirstSpringProjectAPI.Service;

import com.example.FirstSpringProjectAPI.DTO.FakeStoreProductDTO;
import com.example.FirstSpringProjectAPI.models.Category;
import com.example.FirstSpringProjectAPI.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service//object is created at time of initialization
public class FakeStoreProductService implements ProductService{
    private RestTemplate restTemplate;
    FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }
    private  Product convertFakeStoreDtoToProduct(FakeStoreProductDTO dto){
        Product product=new Product();
        product.setId(dto.getId());
        product.setPrice(dto.getPrice());
        product.setDescription(dto.getDescription());
        product.setTitle(dto.getTitle());
        product.setImage(dto.getImage());

        Category category=new Category();
        category.setDesc(dto.getCategory());
        product.setCategory(category);

        return product;
    }
    @Override
    public Product getProductByid(Long id) {

        //call the fakestore API here to get the product with given ID
        FakeStoreProductDTO fakeStoreProductDTO=restTemplate.getForObject("https://fakestoreapi.com/products/1"+id, FakeStoreProductDTO.class);
        //convert fakestore DTO to product obj
        if(fakeStoreProductDTO==null) return null;
        return convertFakeStoreDtoToProduct(fakeStoreProductDTO);
    }

    @Override
    public List<Product> getAllproducts() {
        return new ArrayList<>();
    }
}
