package com.example.frstspringboot.model;

import static java.lang.System.out;

import java.util.Scanner;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author Kostiantyn Kvartyrmeister on 28.12.2022
 * Controller of the app
 */

@Service
@AllArgsConstructor
public class ApplicationController {
  private ApplicationContext applicationContext;
  private Cart cart;

  /**
   * Method prints all the products and menu
   */
  private void menuPrinter() {
    out.println("Product list");
    cart.getRepository().getProductList().getAllProductList().forEach(product ->
        out.println(product.getId() + " " + product.getName() + " " + product.getPrice())
    );

    out.println("-".repeat(20));
    out.println("0.Exit");
    out.println("1.Add product to cart");
    out.println("2.Delete product from cart");
    out.println("3.Clear cart");
    out.println("4.Show products in cart");
    out.println("-".repeat(20));
    out.println("Choose option");
  }

  /**
   * Method gives user ability to work with cart
   */
  public void work() {
    int option = 1;
    int id;
    Scanner scanner = new Scanner(System.in);

    while (option != 0) {
      menuPrinter();
      option = scanner.nextInt();

      switch (option) {
        case 0 -> out.println("Have a good day! Bye");

        case 1 -> {
          out.println("Enter id");
          id = scanner.nextInt();
          cart.addById(id);
        }

        case 2 -> {
          out.println("Enter id");
          id = scanner.nextInt();
          cart.deleteById(id);
        }

        case 3 -> cart = applicationContext.getBean(Cart.class);

        case 4 -> {
          out.println("-".repeat(20));
          cart.getCartProducts().forEach(product -> out.println(
              product.getId() + " " + product.getName() + " " + product.getPrice()));
          out.println("-".repeat(20));
        }

        default -> out.println("Wrong option -_-");
      }
    }
  }
}
