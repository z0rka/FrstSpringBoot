package com.example.frstspringboot.objects;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Kostiantyn Kvartyrmeister on 28.12.2022
 * Class product
 */

@Data
@AllArgsConstructor
public class Product {

  int id;
  String name;
  Long price;

}
