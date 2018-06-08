/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world;

import danielalcoleas.world.edificacion.FabricaEdificacion;
import danielalcoleas.world.ejercito.FabricaEjercito;
import danielalcoleas.world.razas.FabricaRazas;
import danielalcoleas.world.vehiculos.FabricaVehiculo;

/**
 *
 * @author daniel
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "raza":
                return new FabricaRazas();
            case "ejercito":
                return new FabricaEjercito();
            case "edificacion":
                return new FabricaEdificacion();
            case "vehiculo":
                return new FabricaVehiculo();    
        }
        
        return null;
    }

}
