package com.omnicirus.services;

import com.omnicirus.dao.ProductDao;
import com.omnicirus.models.Product;
import com.omnicirus.models.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product add(Product product) {
        System.out.println("product = [" + product + "]");
        productDao.add(product);
        return product;
    }

    @Override
    public List<Product> listAllProducts() {
        return productDao.listAllProducts();
    }

    @Override
    public Product getProduct(Long id) {
        return productDao.getProduct(id);

    }

    @Override
    public Product deleteProduct(Long id) {
        return productDao.deleteProduct(id);
    }

    @Override
    public Product updateSavedProduct(Product item) {
        return productDao.update(item);
    }

    @Override
    public List<Product> listAllProductsByType(ProductType type) {
        return productDao.listAllProductsByType(type);
    }
}
