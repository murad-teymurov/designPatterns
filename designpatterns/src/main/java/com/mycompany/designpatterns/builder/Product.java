package com.mycompany.designpatterns.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {

    private long id;
    private String name;
    private LocalDateTime localDateTime;
    private boolean inStock;
    private String description;
    private BigDecimal price;

    public Product() {

    }

    public Product(ProductBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.localDateTime = builder.localDateTime;
        this.inStock = builder.inStock;
        this.description = builder.description;
        this.price = builder.price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", localDateTime=" + localDateTime +
                ", inStock=" + inStock +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }


    public static class ProductBuilder{

        private long id;
        private String name;
        private LocalDateTime localDateTime;
        private boolean inStock;
        private String description;
        private BigDecimal price;

        public ProductBuilder id(Long id){
            this.id = id;
            return this;
        }
        public ProductBuilder name(String name){
            this.name = name;
            return this;
        }
        public ProductBuilder localDateTime(LocalDateTime localDateTime){
            this.localDateTime = localDateTime;
            return this;
        }
        public ProductBuilder inStock(boolean inStock){
            this.inStock = inStock;
            return this;
        }
        public ProductBuilder description(String description){
            this.description = description;
            return this;
        }
        public ProductBuilder price(BigDecimal price){
            this.price = price;
            return this;
        }

        public Product build(){
            Product product = new Product(this);
            return product;
        }

    }
}
