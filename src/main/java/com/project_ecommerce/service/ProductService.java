package com.project_ecommerce.service;

import com.project_ecommerce.model.Product;
import com.project_ecommerce.model.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    public List<Product> getProducts() {
        return productDAO.findAll();
    }
}
