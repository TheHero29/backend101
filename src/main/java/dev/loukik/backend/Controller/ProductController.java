package dev.loukik.backend.Controller;

import dev.loukik.backend.Model.Product;
import dev.loukik.backend.Service.FakeStoreProductService;
import dev.loukik.backend.Service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    private ProductService productService;
    public ProductController(@Qualifier("selfProductService")ProductService productService){
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id)
    {
        //throw new RuntimeException("getting");
        Product product = productService.getProductById(id);
        ResponseEntity<Product> responseEntity;

        responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @ExceptionHandler(FileNotFoundException.class)
    public ResponseEntity<Void> handleSomeException(){
        return null;
    }


}
