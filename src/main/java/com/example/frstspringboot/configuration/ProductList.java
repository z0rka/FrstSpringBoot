package com.example.frstspringboot.configuration;

import com.example.frstspringboot.objects.Product;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Kostiantyn Kvartyrmeister on 28.12.2022
 * List of products in the shop
 */
@Data
@AllArgsConstructor
public class ProductList {

  private final List<Product> allProductList;
}
