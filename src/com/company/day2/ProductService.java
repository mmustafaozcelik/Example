package com.company.day2;

import java.util.Optional;

public class ProductService {
    public static void main(String[] args) {
        Product product = new Product(1,null);
        Optional.ofNullable(product.productName).orElseThrow(
                () -> new RuntimeException(Constant.PRODUCT_NOT_FOUND)
        );
    }
}
