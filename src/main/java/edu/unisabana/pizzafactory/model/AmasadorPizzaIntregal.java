package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.interfaces.Amasador;

public class AmasadorPizzaIntregal implements Amasador{
     
    
    public void amasar() {
        Logger.getLogger(AmasadorPizzaIntregal.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza integral con masa integral.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
    
}
