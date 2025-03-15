package br.com.pricesense;

import org.springframework.boot.SpringApplication;

public class TestPriceSenseApplication {

  public static void main(String[] args) {
    SpringApplication.from(PriceSenseApplication::main)
        .with(TestcontainersConfiguration.class)
        .run(args);
  }
}
