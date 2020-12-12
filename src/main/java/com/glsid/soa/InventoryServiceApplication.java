package com.glsid.soa;

import com.glsid.soa.entities.Product;
import com.glsid.soa.respositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
          productRepository.save(new Product(null, "Azuz Gamer 2020",12000 ,200));
          productRepository.save(new Product(null, "Souris razer 2021",500 ,270));
          productRepository.save(new Product(null, "SSD 256 Go",600 ,230));
          productRepository.findAll().forEach(p -> {
              System.out.println("Name : " + p.getName());
          });
        };
    }
}
