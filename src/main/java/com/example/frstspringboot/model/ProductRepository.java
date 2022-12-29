package com.example.frstspringboot.model;

import com.example.frstspringboot.configuration.ProductList;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @author Kostiantyn Kvartyrmeister on 28.12.2022
 * Repository with list of products
 */

@Getter
@Repository
@RequiredArgsConstructor

public class ProductRepository {

  private final ProductList productList;
}
