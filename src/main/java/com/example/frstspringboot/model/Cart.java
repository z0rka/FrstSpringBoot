package com.example.frstspringboot.model;

import com.example.frstspringboot.objects.Product;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Kostiantyn Kvartyrmeister on 28.12.2022 Class cart that has list of choosen products
 */

@Service
@Scope("prototype")
@Getter
@RequiredArgsConstructor
public class Cart {

  private final ProductRepository repository;
  private final List<Product> cartProducts = new ArrayList<>();

  /**
   * Add product to cart by id
   *
   * @param id- id of the product
   */
  public void addById(int id) {
    cartProducts.add(repository
        .getProductList()
        .getAllProductList()
        .stream()
        .filter(product -> product.getId() == id)
        .findFirst()
        .get());
  }

  /**
   * Delete product from cart by id
   *
   * @param id- id of the product
   */

  public void deleteById(int id) {
    cartProducts.remove(repository
        .getProductList()
        .getAllProductList()
        .stream()
        .filter(product -> product.getId() == id)
        .findFirst()
        .get());
  }
}
