package ma.enset.products;

import ma.enset.products.entities.Product;
import ma.enset.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(ProductsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    productRepository.save(new Product(null, "Computer", 4300, 3));
    productRepository.save(new Product(null, "Phone", 1200, 10));
    productRepository.save(new Product(null, "Tablet", 2500, 5));

//    List<Product> productList = productRepository.findAll();
//    productList.forEach(p -> System.out.println(p) );

//    Product p = productRepository.findById(1L).get();
//    System.out.println("************");
//    System.out.println(p.getId());
//    System.out.println(p.getName());
//    System.out.println(p.getPrice());
//    System.out.println(p.getQuantity());
//    System.out.println("************");
//
        System.out.println("--------------------");
        List<Product> productList = productRepository.findByNameContains("Comp");
        productList.forEach(p-> System.out.println(p));
        System.out.println("--------------------");

    }
}
