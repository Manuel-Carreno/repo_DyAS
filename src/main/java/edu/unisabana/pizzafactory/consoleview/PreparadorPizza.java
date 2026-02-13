
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.interfaces.PizzaFactory;
//import edu.unisabana.pizzafactory.model.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
//import edu.unisabana.pizzafactory.model.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Ingrediente;
//import edu.unisabana.pizzafactory.model.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.PFGruesa;
import edu.unisabana.pizzafactory.model.Tamano;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import edu.unisabana.pizzafactory.interfaces.Amasador;
import edu.unisabana.pizzafactory.interfaces.Horneador;
import edu.unisabana.pizzafactory.interfaces.Moldeador;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]){
        try {
            Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
            PreparadorPizza pp=new PreparadorPizza();  
            PizzaFactory fabrica = new PFGruesa();          
            pp.prepararPizza(fabrica, ingredientes, Tamano.MEDIANO);
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
                
    }
    
    
    public void prepararPizza(PizzaFactory fabrica, Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {
        Amasador am = fabrica.creaAmasador();
        Horneador hpd = fabrica.creaHorneador();
        Moldeador mp = fabrica.creaMoldeador();
        am.amasar();
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.molderarPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }
	aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
        
        
    }


}
