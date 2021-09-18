package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;

import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class PizzaHotServiceProxy implements PizzaHotService {

    private PizzaHotServiceImpl pizzahotServiceImpl;
    private List<PizzaHotPizza> pizzasHot;

    public PizzaHotServiceProxy(){
        this.pizzahotServiceImpl = new PizzaHotServiceImpl();
    }


    @Override
    public List<PizzaHotPizza> getPizzas() {
        // TODO - implementar proxy
        if(pizzasHot.isEmpty()){
            pizzasHot = pizzahotServiceImpl.getPizzas();
            return pizzasHot;
        }else{
            return pizzasHot;
        }
    }

}
