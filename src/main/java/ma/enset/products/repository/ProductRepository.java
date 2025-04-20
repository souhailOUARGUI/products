package ma.enset.products.repository;

import ma.enset.products.entities.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<product, Long> {

}
