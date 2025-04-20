package ma.enset.products.repository;

import ma.enset.products.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("select p from Product p where p.name like :x")
    List<Product> search(@Param("x") String mc);


    List<Product> findByNameContains(String mc);
    List<Product> findByPriceBetween(double min, double max);

}
