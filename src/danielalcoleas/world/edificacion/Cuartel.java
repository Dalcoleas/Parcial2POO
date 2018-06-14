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
public class Cuartel implements Edificacion{
    private String nombre;
    private int vida, tiempoEspera, numFase, costoDia, costoOro, costoPla;
    private boolean hab;

    public Cuartel() {
        this.nombre = "Cuartel";
        this.vida = 500;
        this.tiempoEspera = 1;
        this.numFase = 0;
        this.hab = false;
        this.costoOro = 200;
        this.costoDia = 300;
        this.costoPla = 100;
    }

    @Override
    public int getCostoPla() {
        return costoPla;
    }

    public void setCostoPla(int costoPla) {
        this.costoPla = costoPla;
    }

    @Override
    public int getCostoDia() {
        return costoDia;
    }

    public void setCostoDia(int costoDia) {
        this.costoDia = costoDia;
    }

    @Override
    public int getCostoOro() {
        return costoOro;
    }

    public void setCostoOro(int costoOro) {
        this.costoOro = costoOro;
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
    public int recDiamante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
