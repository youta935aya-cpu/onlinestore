package com.example.onlinestore.business.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinestore.business.services.ProductService;
import com.example.onlinestore.dao.entities.Product;
import com.example.onlinestore.dao.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
	ProductRepository productRepository;

    @Override
    public Product getProductById(Long id) {
       
      return   this.productRepository.findById(id).orElse(null);
    }
    
    @Override
    public Product getProductByCode(String code) {
       
      return   this.productRepository.findByCode(code).orElse(null);
    }

    @Override
    public Product addProduct(Product product) throws Exception {
      return this.productRepository.save(product);
    }

    @Override
    public Product updatePorduct(Long id, Product product)  throws Exception {

      if(this.getProductById(id)!=null)
       return this.productRepository.save(product);

      return null;
    }

    @Override
    public void deleteProduct(Long id) {
      if(this.getProductById(id)!=null)
          this.productRepository.deleteById(id);
    }

    @Override
    public List<Product> getAllProduct() {
        return this.productRepository.findAll();
    }
    
}