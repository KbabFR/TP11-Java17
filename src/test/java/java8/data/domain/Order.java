package java8.data.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private Integer id;
    private Customer customer;
    private List<Pizza> pizzas = new ArrayList<>();

    public Order() {
    }

    public Order(Integer id, Customer customer, List<Pizza> pizzas) {
        this.id = id;
        this.customer = customer;
        this.pizzas = pizzas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Pizza> getPizzas() {
        return new ArrayList<>(pizzas);
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = new ArrayList<>(pizzas);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return id != null ? id.equals(order.id) : order.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
