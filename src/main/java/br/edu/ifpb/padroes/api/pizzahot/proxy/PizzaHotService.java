package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.domain.Pizza;

import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public interface PizzaHotService {

    public List<PizzaHotPizza> getPizzas();

}
