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
public class CentroMando implements Edificacion {
    
    private double  maxDiamante, maxOro, maxPlata, diamante, oro, plata;
    private int vida, nivel, numFase, tiempoEspera;
    private String nombre;
    private boolean hab;
    
    public CentroMando(){
        this.maxDiamante = 10000;
        this.vida = 1000;
        this.maxOro = 5000;
        this.maxPlata = 3000;
        this.nombre = "Centro de Mando";
        this.oro = oro;
        this.plata = plata;
        this.diamante = diamante;
        this.hab = false;
        this.numFase = 0;
        this.tiempoEspera = 0;
        this.nivel = 0;
        
        
    }
    
    public void mejorarEdificacion(int niv){
        switch(niv){
            case 1:
                this.maxDiamante = 11000;
                this.maxOro = 5500;
                this.maxPlata = 3300;
                this.nivel = 1;
                this.numFase = 0;
                this.tiempoEspera = 2;
                break;
            case 2:
                this.maxDiamante = 14300;
                this.maxOro = 7150;
                this.maxPlata = 4290;
                this.nivel = 2;
                this.numFase = 0;
                this.tiempoEspera = 2;
                break;
            case 3:
                this.maxDiamante = 21450;
                this.maxOro = 10725;
                this.maxPlata = 6435;
                this.nivel = 3;
                this.numFase = 0;
                this.tiempoEspera = 3;
                break;
            default:
                break;   
        }
        
    }
    
    

    public float getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public double getMaxDiamante() {
        return maxDiamante;
    }

    public void setMaxDiamante(double maxDiamante) {
        this.maxDiamante = maxDiamante;
    }

    public double getMaxOro() {
        return maxOro;
    }

    public void setMaxOro(double maxOro) {
        this.maxOro = maxOro;
    }

    public double getMaxPlata() {
        return maxPlata;
    }

    public void setMaxPlata(double maxPlata) {
        this.maxPlata = maxPlata;
    }
    
    public double getDiamante() {
        return diamante;
    }

    public void setDiamante(double diamante) {
        this.diamante = diamante;
    }

    public double getOro() {
        return oro;
    }

    public void setOro(double oro) {
        this.oro = oro;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    @Override
    public void destruir() {
        System.out.println("Centro de Mando listo para la partida!");    
    }

    @Override
    public void construir() {
        System.out.println("Centro de mando destruido.");   
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }    
    
    public boolean verificarMax(){
        boolean prueba = true;
        
        if(this.diamante >= this.maxDiamante){
            System.out.println("Ya no tienes espacio para almacenar, por favor mejora tu Centro de Mando");
            prueba = false;
        }
        if (this.oro >= this.maxOro){
            System.out.println("Ya no tienes espacio para almacenar, por favor mejora tu Centro de Mando");
        }
        
        if (this.plata >= this.maxPlata){
            System.out.println("Ya no tienes espacio para almacenar, por favor mejora tu Centro de Mando");
        }
        
        return prueba;
    }

    @Override
    public int getCostoDia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCostoOro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCostoPla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    @Override
    public int getNumFase() {
        return numFase;
    }
    
    public void setNumFase(int numFase){
        this.numFase = numFase;
    }

    @Override
    public int getTiempoEspera() {
        return tiempoEspera;    
    }

    @Override
    public void setHab(boolean hab) {
        this.hab = hab;
    }
}
