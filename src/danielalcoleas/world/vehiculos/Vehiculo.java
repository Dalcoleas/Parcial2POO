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
public interface Vehiculo {
    void atacar();
    void fabricar();
    String getNombre();
    void atacarEdificio();
    void atacarTropas();
    void entrenarArmada();
    void entrenarSoldado();
    int getCostoDia();
    int getCostoOro();
    int getCostoPla();
    int getVida();
    void setVida(int vida);
    int getNumFase();
    void setNumFase(int numFase);
    int getDanio();
    void setDanio(int danio);
    int getTiempoEspera();
    void setHab(boolean hab);
    
}
