package ma.enset.products.web;


import ma.enset.products.entities.Product;
import ma.enset.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProoductRestService {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products/{id}")
    public Product findProductById(@PathVariable Long id){
        return productRepository.findById(id).get();
    }

    @GetMapping("/products")
    public List<Product>  products(){
        return productRepository.findAll();
    }

}
