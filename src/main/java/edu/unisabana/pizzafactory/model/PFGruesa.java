package edu.unisabana.pizzafactory.model;

import edu.unisabana.pizzafactory.interfaces.Amasador;
import edu.unisabana.pizzafactory.interfaces.Horneador;
import edu.unisabana.pizzafactory.interfaces.Moldeador;
import edu.unisabana.pizzafactory.interfaces.PizzaFactory;

public class PFGruesa  implements PizzaFactory{

    @Override
    public Amasador creaAmasador () {
        return new AmasadorPizzaGruesa();
    }

    @Override
    public Moldeador creaMoldeador () {
        return new MoldeadorPizzaGruesa();
    }

    @Override 
    public Horneador creaHorneador () {
        return new HorneadorPizzaGruesa();
    }
    

    
}
