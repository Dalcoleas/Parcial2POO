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
public class Humvee implements Vehiculo{
    
    private int vida, tiempoEspera, numFase, danio, costoDia, costoOro, costoPla;
    private String nombre;
    private boolean hab;

    public Humvee() {
        this.vida = 1000;
        this.tiempoEspera = 1;
        this.numFase = 0;
        this.danio = 100;
        this.costoDia = 300;
        this.costoOro = 250;
        this.costoPla = 150;
        this.nombre = "Humvee";
        this.hab = false;
    }

    
    
    
    @Override
    public void atacar() {
        System.out.println("Atacando....");   
    }
    
    @Override
    public void fabricar(){
        System.out.println("Fabricando....");
    }

    
    @Override
    public int getDanio() {
        return danio;
    }

    @Override
    public void setDanio(int danio) {
        this.danio = danio;
    }

    @Override
    public void atacarEdificio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarTropas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void entrenarArmada() {
        System.out.println("Entrenando.....");    
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void entrenarSoldado() {
        System.out.println("Entranando....");    
    }

    @Override
    public int getCostoDia() {
        return costoDia;   
    }

    @Override
    public int getCostoOro() {
        return costoOro;    
    }

    @Override
    public int getCostoPla() {
        return costoPla;    }

    @Override
    public int getNumFase() {
        return numFase;    
    }

    @Override
    public int getTiempoEspera() {
        return tiempoEspera;   
    }

    @Override
    public void setHab(boolean hab) {
        this.hab = hab;    
    }

    @Override
    public int getVida() {
        return vida;    
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void setNumFase(int numFase) {
        this.numFase = numFase;    
    }
}
