/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world.razas;

/**
 *
 * @author daniel
 */
public class Coreanos extends Razas{
     this.nombre = "Coreano";

    public Coreanos(){
        
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public void raza() {
        System.out.println("Soy una raza");
    }
    
}
