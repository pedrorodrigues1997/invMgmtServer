package com.example.invMgmtServer.Products.Repository;

import com.example.invMgmtServer.Products.Product;
import com.example.invMgmtServer.Utils.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
    List<Product> getAllAvailableProducts();

    List<Product> getAllProducts();

    Product addProduct(Product requestProduct);

    Product updateProduct(Product updatedProduct);

    Product getProductById(Long id);

    Product getProductByName(String name);

    Product getProductByType(ProductType productType);

    Product getProductBySupplierId(Long supplierId);
}
