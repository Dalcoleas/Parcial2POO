/*n
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world.edificacion;

/**
 *
 * @author daniel
 */
public interface Edificacion {

    void construir();
    void destruir();
    String getNombre();
    int getCostoDia();
    int getCostoOro();
    int getCostoPla();
    int recDiamante();
    int recOro();
    int recPlata();
    int getNumFase();
    int getTiempoEspera();
    void setHab(boolean hab);
}
