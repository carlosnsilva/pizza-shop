package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PizzaPanPizzaDecorator implements Pizza {

    public PizzaPanPizzaDecorator(Pizza pizzaWrappe) {
        this.pizzaWrappe = pizzaWrappe;
    }

    private Pizza pizzaWrappe;
    @Override
    public Float getPrice() {
        Float value = (pizzaWrappe.getPrice() + 1.15f);

        return value;
    }

    @Override
    public String getName() {
        String name = pizzaWrappe.getName() + " (pan pizza)";

        return name;
    }
}
