/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world;

import danielalcoleas.world.razas.*;

/**
 *
 * @author daniel
 */
public class Jugador {
    private String nombre;
    private Raza raza;
    
    public Jugador(){
        
    }

    public Jugador(String nombre, Raza raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(int opc) {
        
        AbstractFactory factory;

        factory = FactoryProducer.getFactory("raza");

        switch(opc){   
            case 1:
                this.raza = factory.getRaza("coreanos");
                break;
            case 2:
                this.raza = factory.getRaza("estadounidenses");
                break;
            case 3:
                this.raza = factory.getRaza("ingleses");
                break;
            case 4:
                this.raza =factory.getRaza("israelitas");
                break;
            case 5:
                this.raza = factory.getRaza("rusos");
                break;
            default:
                System.out.println("No valido");
                break;
            }     
    } 
    
}

