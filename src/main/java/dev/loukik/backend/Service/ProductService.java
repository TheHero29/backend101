package dev.loukik.backend.Service;

import dev.loukik.backend.Model.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getAllProducts();
}
