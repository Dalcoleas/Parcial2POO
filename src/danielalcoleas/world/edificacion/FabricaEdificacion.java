/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world.edificacion;

import danielalcoleas.world.AbstractFactory;

import danielalcoleas.world.ejercito.Ejercito;
import danielalcoleas.world.razas.Raza;
import danielalcoleas.world.vehiculos.Vehiculo;

/**
 *
 * @author daniel
 */
public class FabricaEdificacion implements AbstractFactory{

    @Override
    public Edificacion getEdificacion(String type) {
        switch (type){
        case "cuartel":
            return new Cuartel();
        case "recolector1":
            return new Recolector1();
        case "recolector2":
            return new Recolector2();
        case "recolector3":
            return new Recolector3();
        case "taller1":
            return new Taller1();
        case "taller2":
            return new Taller2();
        case "taller3":
            return new Taller3();
        case "centroDeMando":
            return new CentroMando();
        }
        return null;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
