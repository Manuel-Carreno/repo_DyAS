package edu.unisabana.pizzafactory.interfaces;


public interface PizzaFactory { //en la factory se gestiona todo (amasar, moldear y hornear) indep. de la masa, es el mismo proceso
    Amasador creaAmasador();
    Horneador creaHorneador();
    Moldeador creaMoldeador();

}
