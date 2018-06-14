/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world.vehiculos;

import danielalcoleas.world.AbstractFactory;
import danielalcoleas.world.edificacion.Edificacion;
import danielalcoleas.world.ejercito.Ejercito;
import danielalcoleas.world.razas.Raza;

/**
 *
 * @author daniel
 */
public class FabricaVehiculo implements AbstractFactory{
    
    
    @Override
    public Edificacion getEdificacion(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ejercito getEjercito(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Raza getRaza(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehiculo getVehiculo(String type) {
        switch (type) {
            case "humvee":
                return new Humvee();
            case "stryker":
                return new Stryker();
            case "challenger":
                return new Challenger();
        }
        return null;
    }
    
}
