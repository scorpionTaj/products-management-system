package ma.tajeddine.productsmanagementsystem.repository;

import ma.tajeddine.productsmanagementsystem.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
