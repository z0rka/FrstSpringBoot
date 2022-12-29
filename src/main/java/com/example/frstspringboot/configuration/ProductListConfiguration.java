package com.example.frstspringboot.configuration;

import com.example.frstspringboot.objects.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kostiantyn Kvartyrmeister on 28.12.2022
 * Configuration class that has all the products and list of products beans
 */
@Configuration
public class ProductListConfiguration {

  @Bean
  public Product cocaColaProduct() {
    return new Product(1, "Coca cola", 45L);
  }

  @Bean
  public Product pepsiProduct() {
    return new Product(2, "Pepsi", 42L);
  }

  @Bean
  public Product fantaProduct() {
    return new Product(3, "Fanta", 44L);
  }

  @Bean
  public Product spriteProduct() {
    return new Product(4, "Sprite", 47L);
  }

  @Bean
  public Product waterProduct() {
    return new Product(5, "Water", 15L);
  }

  @Bean
  public ProductList products() {
    List<Product> productList = new ArrayList<>();

    productList.add(cocaColaProduct());
    productList.add(pepsiProduct());
    productList.add(fantaProduct());
    productList.add(spriteProduct());
    productList.add(waterProduct());

    return new ProductList(productList);
  }
}
