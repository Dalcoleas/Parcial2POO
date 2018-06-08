/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world;

import danielalcoleas.world.razas.FabricaRazas;
import danielalcoleas.world.razas.Raza;

/**
 *
 * @author daniel
 */
public class DanielAlcoleasWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*AbstractFactory factory;
        factory = FactoryProducer.getFactory("raza");
        Raza ingles = factory.getRaza("ingleses");
        
        ingles.raza();*/
       
        Menu menu = Menu.getInstance();
        
        menu.menu();
    }
    
}
