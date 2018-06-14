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
public class Vehiculos implements Vehiculo{
    
    private int vida, ataque, defensa, costo;

    public Vehiculos(int vida, int ataque, int defensa, int costo) {
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.costo = costo;
    }
    
    public Vehiculos(){
        
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fabricar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
