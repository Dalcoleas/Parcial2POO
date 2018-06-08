/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world;

import danielalcoleas.world.edificacion.Edificacion;
import danielalcoleas.world.ejercito.Ejercito;
import danielalcoleas.world.razas.Raza;
import danielalcoleas.world.vehiculos.Vehiculo;



/**
 *
 * @author daniel
 */
public interface AbstractFactory {
    Edificacion getEdificacion(String type);
    Ejercito getEjercito(String type);
    Raza getRaza(String type);
    Vehiculo getVehiculo(String type);
    
    
}
