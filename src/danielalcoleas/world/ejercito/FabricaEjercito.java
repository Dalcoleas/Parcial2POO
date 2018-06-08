/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world.ejercito;

import danielalcoleas.world.AbstractFactory;
import danielalcoleas.world.edificacion.Edificacion;
import danielalcoleas.world.razas.Raza;
import danielalcoleas.world.vehiculos.Vehiculo;

/**
 *
 * @author daniel
 */
public class FabricaEjercito implements AbstractFactory{


    @Override
    public Edificacion getEdificacion(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ejercito getEjercito(String type) {
        switch (type) {
            case "armadaCoreana":
                return new ArmadaCoreana();
            case "armadaEstadounidense":
                return new ArmadaEstadounidense();
            case "armadaInglesa":
                return new ArmadaInglesa();
            case "armadaIsraeli":
                return new ArmadaIsraeli();
            case "armadaRusa":
                return new ArmadaRusa();
            case "kimJong":
                return new KimJong();
            case "mj":
                return new MJ();
            case "churchill":
                return new Churchill();
            case "wonderGal":
                return new WonderGal();
            case "putinDestroyer":
                return new PutinDestroyer();
        }
        return null;
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
