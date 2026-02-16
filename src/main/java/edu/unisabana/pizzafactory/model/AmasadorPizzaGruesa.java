package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.interfaces.Amasador;

public class AmasadorPizzaGruesa implements Amasador {
    
     
    
    public void amasar() {
        Logger.getLogger(AmasadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza gruesa con masa gruesa.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
}
