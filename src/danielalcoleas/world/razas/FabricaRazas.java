/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world.razas;

import danielalcoleas.world.AbstractFactory;
import danielalcoleas.world.edificacion.Edificacion;
import danielalcoleas.world.ejercito.Ejercito;
import danielalcoleas.world.vehiculos.Vehiculo;

/**
 *
 * @author daniel
 */
public class FabricaRazas implements AbstractFactory{


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
        switch (type) {
            case "coreanos":
                return new Coreanos();
            case "estadounidenses":
                return new Estadounidenses();
            case "israelitas":
                return new Israelitas();
            case "rusos":
                return new Rusos();
            case "ingleses":
                return new Ingleses();
        }
        return null;
    }

    @Override
    public Vehiculo getVehiculo(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
