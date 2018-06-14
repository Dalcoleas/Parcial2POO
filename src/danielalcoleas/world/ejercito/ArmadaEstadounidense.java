/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world.ejercito;

/**
 *
 * @author daniel
 */
public class ArmadaEstadounidense implements Ejercito{

    private int vida, tiempoEspera, numFase, danio, costoDia, costoOro, costoPla;
    private String nombre;
    private boolean hab;

    public ArmadaEstadounidense() {
        this.vida = 1000;
        this.tiempoEspera = 2;
        this.numFase = 0;
        this.danio = 100;
        this.costoDia = 200;
        this.costoOro = 150;
        this.costoPla = 100;
        this.nombre = "Armada Estadounidense";
        this.hab = false;
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
