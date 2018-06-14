/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world.vehiculos;

/**
 *
 * @author daniel
 */
public class Humvee extends Vehiculos{
    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void fabricar(){
        System.out.println("Humvee Fabricado");
    }
}
