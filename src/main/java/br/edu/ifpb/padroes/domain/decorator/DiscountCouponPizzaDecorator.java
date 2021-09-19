package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountCouponPizzaDecorator implements Pizza {
    private Pizza pizzaWrappe;

    public DiscountCouponPizzaDecorator(Pizza pizzaWrappe) {
        this.pizzaWrappe = pizzaWrappe;
    }

    @Override
    public Float getPrice() {
        Float value = (pizzaWrappe.getPrice() + 0.25f);

        return value;
    }

    @Override
    public String getName() {
        return null;
    }

}
