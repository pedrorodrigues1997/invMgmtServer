package com.example.invMgmtServer.Products.Repository;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductQueryBuilderTest {


    @Test
    public void testCreateSelectQueryById(){

        String jpql = ProductQueryBuilder
                .select()
                .columns("p")
                .fromTable("Product p")
                .where("p.id = :id").build();

        assertEquals("SELECT p FROM Product p WHERE p.id = :id", jpql);
    }

    @Test
    public void testCreateSelectQueryByIdAndCount(){

        String jpql = ProductQueryBuilder
                .select()
                .columns("p", "COUNT(p)")
                .fromTable("Product p")
                .where("p.id = :id").build();

        assertEquals("SELECT p, COUNT(p) FROM Product p WHERE p.id = :id", jpql);
    }

    @Test
    public void testCreateSelectQueryByTypeAndOrderBy(){
        String jpql = ProductQueryBuilder
                .select()
                .columns("p")
                .fromTable("Product p")
                .where("p.productType = :productType").build();

        assertEquals("SELECT p FROM Product p WHERE p.productType = :productType", jpql);
    }



}