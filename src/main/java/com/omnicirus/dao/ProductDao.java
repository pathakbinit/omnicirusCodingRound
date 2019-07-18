package com.omnicirus.dao;

import com.omnicirus.models.Product;
import com.omnicirus.models.ProductType;

import java.util.List;

public interface ProductDao {
    Product add(Product product);

    Product update(Product product);

    List<Product> listAllProducts();

    Product getProduct(Long id);

    Product deleteProduct(Long id);


    List<Product> listAllProductsByType(ProductType type);
}
