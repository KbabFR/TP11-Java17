package java8.data;

import java8.data.domain.Customer;
import java8.data.domain.Gender;
import java8.data.domain.Order;
import java8.data.domain.Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Data {

    private List<Pizza> pizzas;
    private List<Customer> customers;
    private List<Order> orders;

    public Data() {
        Pizza peperoni = new Pizza(1, "Pépéroni", 1250);
        Pizza margherita = new Pizza(2, "Margherita", 1300);
        Pizza reine = new Pizza(3, "La Reine", 1000);
        Pizza fromages = new Pizza(4, "La 4 Fromages", 1200);
        Pizza cannibale = new Pizza(5, "La Cannibale", 1550);
        Pizza savoyarde = new Pizza(6, "La Savoyarde", 1275);
        Pizza orientale = new Pizza(7, "L'orientale", 1375);
        Pizza indienne = new Pizza(8, "L'indienne", 900);

        pizzas = Arrays.asList(peperoni, margherita, reine, fromages, cannibale, savoyarde, orientale, indienne);

        Customer johnny = new Customer(1, "Johnny", "Hallyday", Gender.M);
        Customer marion = new Customer(2, "Marion", "Cotillard", Gender.F);
        Customer alexandra = new Customer(3, "Alexandra", "Lamy", Gender.F);
        Customer cyril = new Customer(4, "Cyril", "Hanouna", Gender.M);
        Customer sophie = new Customer(5, "Sophie", "Marceau", Gender.F);

        customers = Arrays.asList(johnny, marion, alexandra, cyril, sophie);

        orders = Arrays.asList(new Order(1, johnny, Arrays.asList(peperoni)),
                new Order(2, johnny, Arrays.asList(peperoni)),
                new Order(3, johnny, Arrays.asList(peperoni)),
                new Order(4, marion, Arrays.asList(reine, fromages)),
                new Order(5, marion, Arrays.asList(fromages)),
                new Order(6, marion, Arrays.asList(reine)),
                new Order(7, marion, Arrays.asList(orientale)),
                new Order(8, johnny, Arrays.asList(orientale)));
    }

    public List<Pizza> getPizzas() {
        return new ArrayList<>(pizzas);
    }

    public List<Customer> getCustomers() {
        return new ArrayList<>(customers);
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    public List<Pizza> getPizzas(int n) {
        return IntStream.rangeClosed(0, n).mapToObj(i -> new Pizza(i, "PIZZA_" + n, n)).collect(Collectors.toList());
    }
}
