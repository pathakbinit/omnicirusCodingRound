package com.omnicirus.services;

import com.omnicirus.models.Product;
import com.omnicirus.models.ProductType;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    Product add(Product product);

    List<Product> listAllProducts();

    Product getProduct(Long id);

    Product deleteProduct(Long id);

    Product updateSavedProduct(Product product);

    List<Product> listAllProductsByType(ProductType type);

}
