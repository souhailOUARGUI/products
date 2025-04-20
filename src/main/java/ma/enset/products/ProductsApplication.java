package ma.enset.products;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProductsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
