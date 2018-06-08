/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world;

import danielalcoleas.world.edificacion.Edificacion;
import danielalcoleas.world.razas.*;
import java.util.Scanner;
import danielalcoleas.world.vehiculos.Vehiculo;

/**
 *
 * @author daniel
 */
public class Menu {
    private static Menu menu;
    
    private Menu(){
        
    }
    
    public static Menu getInstance(){
        if(menu ==null){
            menu = new Menu();
        }
        return menu;
    }
    
    public void opciones(){
        System.out.println("----Opciones Jugador----");
        System.out.println("1-");
        System.out.println("");
        System.out.println("");
        
    }
    
    public void razas(){
        System.out.println("----Razas Disponibles----");
        System.out.println("1-Coreanos");
        System.out.println("2-Estadounidenses");
        System.out.println("3-Ingleses");
        System.out.println("4-Israelitas");
        System.out.println("5-Rusos");
    }
    
    public void vehiculos(){
        System.out.println("----Vehiculos Disponibles----");
        System.out.println("1-Humvee");
        System.out.println("2-Challenger");
        System.out.println("3-Stryker");
    }
    
    public void menu(){
        AbstractFactory fac, fac1,fac2,fac3;
        fac = FactoryProducer.getFactory("edificacion");
        fac1 = FactoryProducer.getFactory("ejercito");
        fac2 = FactoryProducer.getFactory("vehiculo");
        
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar nombre jugador 1: ");
        j1.setNombre(leer.nextLine());
        System.out.println("¿Que raza desea elegir?");
        razas();
        System.out.println("Seleccionar opcion: ");
        j1.setRaza(leer.nextInt());
        
        leer.nextLine();
        
        System.out.println("Ingresar nombre jugador 2: ");
        j2.setNombre(leer.nextLine());
        System.out.println("¿Que raza desea elegir?");
        razas();
        System.out.println("Seleccionar opcion");
        j2.setRaza(leer.nextInt());

        
        System.out.println("Jugador 1: " + j1.getNombre() + " Raza: " + j1.getRaza());
        System.out.println("Jugador 2: "+ j2.getNombre()+ " Raza: "+ j2.getRaza().getNombre());
        /*while(opc != 20){
            opciones();
            
            opc = leer.nextInt();
            
            switch(opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    
            }
        }*/

    }
}
