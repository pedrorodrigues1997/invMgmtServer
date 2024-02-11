package com.example.invMgmtServer.Products.Repository;

import com.example.invMgmtServer.Products.Product;
import com.example.invMgmtServer.Utils.ProductType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IProductRepositoryImpl{

    @Autowired
    @Lazy
    IProductRepository productRepository;

    @PersistenceContext
    private EntityManager em;

    public List<Product> getAllAvailableProducts() {
        return productRepository.getAllProducts();
    }

    public List<Product> getAllProducts() {
        return null;
    }

    public Product addProduct(Product requestProduct) {
        return null;
    }

    public Product updateProduct(Product updatedProduct) {
        return null;
    }

    public Product getProductById(Long id) {
        String jpql = ProductQueryBuilder
                .select()
                .columns("p")
                .fromTable("Product p")
                .where("p.id = :id").build();

        Query query = em.createQuery(jpql);
        query.setParameter("id", id);
        return (Product) query.getResultList().stream().findFirst().orElse(null);
    }

    public Product getProductByName(String name) {
        return null;
    }

    public Product getProductByType(ProductType productType) {
        return null;
    }

    public Product getProductBySupplierId(Long supplierId) {
        return null;
    }


}
