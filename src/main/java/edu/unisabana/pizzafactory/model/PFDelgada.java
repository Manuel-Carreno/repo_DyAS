package edu.unisabana.pizzafactory.model;

import edu.unisabana.pizzafactory.interfaces.Amasador;
import edu.unisabana.pizzafactory.interfaces.Horneador;
import edu.unisabana.pizzafactory.interfaces.Moldeador;
import edu.unisabana.pizzafactory.interfaces.PizzaFactory;

public class PFDelgada implements PizzaFactory{

    @Override
    public Amasador creaAmasador () {
        return new AmasadorPizzaDelgada();
    }

    @Override
    public Moldeador creaMoldeador () {
        return new MoldeadorPizzaDelgada();
    }

    @Override 
    public Horneador creaHorneador () {
        return new HorneadorPizzaDelgada();
    }

    
}
