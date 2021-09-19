package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PizzsaDecorator implements Pizza {
    private Pizza pizzaDecorator;

    public PizzsaDecorator(Pizza pizzsaDecorator){
        this.pizzaDecorator = pizzsaDecorator;
    }

    @Override
    public Float getPrice() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
