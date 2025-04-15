package com.devsuperior.projeto;

import com.devsuperior.model.Order;
import com.devsuperior.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class ProjetoApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(ProjetoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do pedido:");
        System.out.print("Código: ");
        int code = sc.nextInt();

        System.out.print("Valor básico: ");
        double basic = sc.nextDouble();

        System.out.print("Desconto (%): ");
        double discount = sc.nextDouble();

        Order order = new Order(code, basic, discount);

        double total = orderService.total(order);

        System.out.println();
        System.out.println("Pedido código " + order.getCode());
        System.out.printf("Valor total: R$ %.2f%n", total);

        sc.close();
    }
}
