package edu.unisabana.pizzafactory.model;

import edu.unisabana.pizzafactory.interfaces.Amasador;
import edu.unisabana.pizzafactory.interfaces.Horneador;
import edu.unisabana.pizzafactory.interfaces.Moldeador;
import edu.unisabana.pizzafactory.interfaces.PizzaFactory;

public class PFIntegral implements PizzaFactory{

    @Override
    public Amasador creaAmasador() {
        return new AmasadorPizzaIntregal();
    }

    @Override
    public Moldeador creaMoldeador () {
        return new MoldeadorPizzaIntegral();
    }

    @Override
    public Horneador creaHorneador () {
        return new HorneadorPizzaIntegral();
    }
    
}
