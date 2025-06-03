package ma.tajeddine.productsmanagementsystem;

import ma.tajeddine.productsmanagementsystem.entites.Product;
import ma.tajeddine.productsmanagementsystem.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductsManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsManagementSystemApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ProductRepository repository, ProductRepository productRepository) {
        return args -> {
            // Save some products
            repository.save(Product.builder().name("Laptop").price(1200.00).quantity(10).build());
            repository.save(Product.builder().name("Smartphone").price(800.00).quantity(25).build());
            repository.save(Product.builder().name("Tablet").price(300.00).quantity(15).build());
            repository.save(Product.builder().name("Smartwatch").price(200.00).quantity(30).build());
            repository.save(Product.builder().name("Headphones").price(150.00).quantity(50).build());
            repository.save(Product.builder().name("Bluetooth Speaker").price(100.00).quantity(20).build());
            repository.save(Product.builder().name("External Hard Drive").price(120.00).quantity(40).build());
            repository.save(Product.builder().name("USB Flash Drive").price(30.00).quantity(100).build());
            repository.save(Product.builder().name("Monitor").price(250.00).quantity(15).build());

            // Fetch all products
            System.out.println("Products found with findAll():");
            productRepository.findAll().forEach( product -> System.out.println(product.toString()));
        };
    }
}
