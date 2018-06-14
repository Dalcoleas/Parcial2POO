/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world.edificacion;

/**
 *
 * @author daniel
 */
public class Recolector1 implements Edificacion{
    
    private String nombre;
    private int vida, tiempoEspera, numFase, costoDia, costoOro, costoPla, recDia;
    private boolean hab;

    public Recolector1() {
        this.nombre = "Recolector Diamante";
        this.vida = 500;
        this.tiempoEspera = 1;
        this.numFase = 0;
        this.hab = false;
        this.costoOro = 200;
        this.costoDia = 300;
        this.costoPla = 100;
        this.recDia = 50;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    @Override
    public int getNumFase() {
        return numFase;
    }

    public void setNumFase(int numFase) {
        this.numFase = numFase;
    }

    public boolean isHab() {
        return hab;
    }

    @Override
    public void setHab(boolean hab) {
        this.hab = hab;
    }
    
    public int getRecDia() {
        return recDia;
    }

    public void setRecDia(int recDia) {
        this.recDia = recDia;
    }
   @Override
    public void construir(){
        System.out.println("En construcción...............");
    }

    @Override
    public void destruir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return nombre;    
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
        return costoPla;
    }

    @Override
    public int recDiamante() {
        return recDia;
    }

    @Override
    public int recOro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int recPlata() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
