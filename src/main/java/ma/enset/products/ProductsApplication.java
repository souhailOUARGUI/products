package ma.enset.products;

import ma.enset.products.entities.product;
import ma.enset.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(ProductsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    productRepository.save(new product(null, "Computer", 4300, 3));
    productRepository.save(new product(null, "Phone", 1200, 10));
    productRepository.save(new product(null, "Tablet", 2500, 5));


    }
}
