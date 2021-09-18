package br.edu.ifpb.padroes.api.pizzahot;

import br.edu.ifpb.padroes.api.pizzahot.proxy.PizzaHotService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PizzaHotServiceImpl implements PizzaHotService {

    private Logger logger = Logger.getLogger(PizzaHotServiceImpl.class.getName());

    public List<PizzaHotPizza> getPizzas() {
        List<PizzaHotPizza> pizzas = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            pizzas = Arrays.asList(objectMapper.readValue(ClassLoader.getSystemClassLoader().getResourceAsStream("data/pizza-hot.json"), PizzaHotPizza[].class));
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Fail to read json", e);
        }
        return pizzas;
    }


}
