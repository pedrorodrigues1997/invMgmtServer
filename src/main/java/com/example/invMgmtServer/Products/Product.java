package com.example.invMgmtServer.Products;

import com.example.invMgmtServer.Utils.ProductType;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "productName")
    private String productName;

    @Column(name = "productType")
    private ProductType productType;

    @Column(name = "creationDate")
    private Date creationDate;

    @Column(name = "saleDate")
    private Date saleDate;

    @Column(name = "acquisitionCost")
    private Integer acquisitionCost;

    @Column(name = "available" , nullable = false)
    private Boolean available;

    @Column(name = "supplierId")
    private Long supplierId;

    @Column(name = "orderId")
    private Long orderId;


    public Product() {
    }


    public static Product createProduct() {
        return new Product();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Integer getAcquisitionCost() {
        return acquisitionCost;
    }

    public void setAcquisitionCost(Integer acquisitionCost) {
        this.acquisitionCost = acquisitionCost;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productType=" + productType +
                ", creationDate=" + creationDate +
                ", saleDate=" + saleDate +
                ", acquisitionCost=" + acquisitionCost +
                ", isAvailable=" + available +
                ", supplierId=" + supplierId +
                ", orderId=" + orderId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(productName, product.productName) && productType == product.productType && Objects.equals(creationDate, product.creationDate) && Objects.equals(saleDate, product.saleDate) && Objects.equals(acquisitionCost, product.acquisitionCost) && Objects.equals(available, product.available) && Objects.equals(supplierId, product.supplierId) && Objects.equals(orderId, product.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, productType, creationDate, saleDate, acquisitionCost, available, supplierId, orderId);
    }
}
