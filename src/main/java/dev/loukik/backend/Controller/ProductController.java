package dev.loukik.backend.Controller;

import dev.loukik.backend.Model.Product;
import dev.loukik.backend.Service.FakeStoreProductService;
import dev.loukik.backend.Service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    ProductService productService = new FakeStoreProductService();
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id)
    {
        //throw new RuntimeException("getting");
        return productService.getProductById(id);
    }
    @GetMapping("/")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }


}
