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
public interface Ejercito {
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
    int getDaño();
    void setDaño(int daño);
    int getTiempoEspera();
    void setHab(boolean hab);
}
