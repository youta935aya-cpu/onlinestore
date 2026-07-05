package com.example.onlinestore.business.services;

import java.util.List;
import java.util.Optional;

import com.example.onlinestore.dao.entities.Product;

public interface ProductService {
    // Retrieves a product by ID.
    public Product getProductById(Long id);

    // Retrieves a product by Code.
    public Product getProductByCode(String id);

    // Adds a new product.
    public Product addProduct(Product P)  throws Exception;

    // Updates an existing product.
    public Product updatePorduct(Long id, Product P)  throws Exception;

    // Deletes a product by their ID.
    public void deleteProduct(Long id);

    // Retrieves all products.
    public List<Product> getAllProduct();

}