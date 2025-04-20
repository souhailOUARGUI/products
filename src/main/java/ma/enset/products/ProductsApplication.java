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


        /*******  Ajouter des patients  ********/
//    productRepository.save(new Product(null, "Computer", 4300, 3));
//    productRepository.save(new Product(null, "Phone", 1200, 10));
//    productRepository.save(new Product(null, "Tablet", 2500, 5));



    /*******   Consulter tous les patients      ******/
//    List<Product> productList = productRepository.findAll();
//    productList.forEach(p -> System.out.println(p) );



        /*******   Consulter un les patient      ******/
//    Product p = productRepository.findById(1L).get();
//    System.out.println("************");
//    System.out.println(p.getId());
//    System.out.println(p.getName());
//    System.out.println(p.getPrice());
//    System.out.println(p.getQuantity());
//    System.out.println("************");
//

        /*******   chercher  des patients      ******/
//        System.out.println("--------------------");
//        List<Product> productList1 = productRepository.findByNameContains("Comp");
//        productList1.forEach(p-> System.out.println(p));
//        System.out.println("--------------------");
//        List<Product> productList2 = productRepository.search("%P%");
//        productList2.forEach(p-> System.out.println(p));

//        List<Product>  productList3 = productRepository.findByPriceBetween(1000,2000);
//        productList3.forEach(p -> System.out.println(p));


        /*******   supprimer des patients      ******/
//        productRepository.deleteById(1L);
//        productRepository.deleteById(2L);
//        productRepository.deleteById(3L);

    }
}
