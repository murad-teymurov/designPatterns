package com.mycompany.designpatterns.builder;

public class Main {
    public static void main(String[] args) {

        Product product = new Product.ProductBuilder()
                .id(1L)
                .name("name")
                .description("something")
                .build();


        System.out.println(product);
    }
}
