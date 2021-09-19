package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class StuffedCrustPizzaDecorator implements Pizza {

    private Pizza pizzaWrappe;

    public StuffedCrustPizzaDecorator(Pizza pizzaWrappe) {
        this.pizzaWrappe = pizzaWrappe;
    }

    @Override
    public Float getPrice() {
        Float value = (pizzaWrappe.getPrice() + 1.20f);

        return value;
    }

    @Override
    public String getName() {
        String name = pizzaWrappe.getName() + " (stuffed crust)";

        return name;
    }
}
