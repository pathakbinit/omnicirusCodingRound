package com.omnicirus.dao;

import com.omnicirus.models.ProductType;
import com.omnicirus.repository.ProductRepository;
import com.omnicirus.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductDaoImpl implements ProductDao {

	@Autowired
	ProductRepository productRepository;

	@Override
	public Product add(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product update(Product product) {
		Product updatedProduct = null;
		Product savedProduct = productRepository.findOne(product.getProductId());
		if (savedProduct != null) {
			System.out.printf("savedProduct :" + savedProduct);
			product.setProductId(savedProduct.getProductId());
			updatedProduct = productRepository.save(product);
		}
		return updatedProduct;
	}

	@Override
	public List<Product> listAllProducts() {
		List<Product> productList = productRepository.findAll();
		return productList;
	}

	@Override
	public Product getProduct(Long id) {
		return productRepository.findOne(id);
	}

	@Override
	public Product deleteProduct(Long id) {
		Product savedProduct = productRepository.findOne(id);
		if (savedProduct != null) {
			productRepository.delete(id);
		}
		return savedProduct;
	}

	@Override
	public List<Product> listAllProductsByType(ProductType type) {
		List<Product> products = productRepository.findAll();
		return products.stream().filter(p -> p.getProductType().equals(type)).collect(Collectors.toList());
	}
}
