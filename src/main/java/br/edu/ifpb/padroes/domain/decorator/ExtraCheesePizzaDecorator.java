package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraCheesePizzaDecorator implements Pizza {

    private Pizza pizzaWrappe;

    @Override
    public Float getPrice() {
        Float value = (pizzaWrappe.getPrice() + 1.10f);

        return value;
    }

    public ExtraCheesePizzaDecorator(Pizza pizzaWrappe) {
        this.pizzaWrappe = pizzaWrappe;
    }

    @Override
    public String getName() {
        String name = pizzaWrappe.getName() + " (extra cheese)";

        return name;
    }
}
