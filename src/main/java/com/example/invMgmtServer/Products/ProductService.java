package com.example.invMgmtServer.Products;

import com.example.invMgmtServer.Products.Repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private IProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.getAllProducts();
    }


    public Product getProductById(Long id){
        return productRepository.getProductById(id);
    }


    public Product addProduct(Product product){
        return productRepository.save(product);
    }
}
