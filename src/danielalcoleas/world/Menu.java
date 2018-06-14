/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world;

import java.util.Scanner;

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
    
    
    public void razas(){
        System.out.println("----Razas Disponibles----");
        System.out.println("1-Coreanos");
        System.out.println("2-Estadounidenses");
        System.out.println("3-Ingleses");
        System.out.println("4-Israelitas");
        System.out.println("5-Rusos");
    }
    

    
    public void menu(){

        AbstractFactory fac;
        
        fac = FactoryProducer.getFactory("edificacion");
        
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();        
        
        Scanner leer = new Scanner(System.in);
        
        boolean terminar= false;
        boolean opc1 =  true;


        
        while(opc1){    
        System.out.println("----------BIENVENIDO A DANIELALCOLEAS'WORLD----------");
        System.out.println("A continuación les muestro las opciones para el inicio de nuestra aventura.");
        System.out.println("1- Leer instrucciones e información del juego.");
        System.out.println("2- Informacion acerca de las razas disponibles.");
        System.out.println("3- Empezar el juego.");
        System.out.print("Elige tu opción: ");
        int opc = leer.nextInt();

            switch (opc){
                case 1:
                    Game();
                    break;
                case 2:
                    Razas();
                    break;
                case 3:
                    opc1 = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
                    break;
            }
        }
        
        leer.nextLine();
        System.out.println("");
        System.out.println("-----INICIO JUEGO-----");
        System.out.print("Ingresar nombre jugador 1: ");
        j1.setNombre(leer.nextLine());
        System.out.println("¿Que raza desea elegir?");
        razas();
        System.out.print("Seleccionar opcion: ");;
        j1.setRaza(leer.nextInt());
        j1.getEdificaciones().add(fac.getEdificacion("centroDeMando"));
        leer.nextLine();
        System.out.println("--------------------------");
        System.out.print("Ingresar nombre jugador 2: ");
        j2.setNombre(leer.nextLine());
        System.out.println("¿Que raza desea elegir?");
        razas();
        System.out.print("Seleccionar opcion: ");
        j2.setRaza(leer.nextInt());
        j2.getEdificaciones().add(fac.getEdificacion("centroDeMando"));

        while(!terminar){
            if(j1.getEdificaciones().isEmpty() || j2.getEdificaciones().isEmpty()){
                if(j2.getEdificaciones().isEmpty()){
                    System.out.println(j1.getNombre() + " ganaste!");
                }
                else{
                    System.out.println(j2.getNombre() + " ganaste!");
                }
                terminar = true;
                break;
            }
            
            System.out.println("-------------------");
            j1.chequearFase();
            j1.juego();
            
            System.out.println("-------------------");
            j2.chequearFase();
            j2.juego();
            
            j1.moverFase();
            j2.moverFase();

        }
        
    }
    
    public void Game(){
        System.out.println("Instrucciones e información del juego.");
        System.out.println("1-Al principio cada jugador seleccionará la raza que guste.");
        System.out.println("2-Cada raza tiene alguna habilidad especial. Ejm: Tropas con más vida, tropas con mas ataque, etc.");
        System.out.println("3-Cada jugador podrá seleccionar la opción que desee al iniciar el juego.");
        System.out.println("4-Ambos jugadores empiezan con los mismos recursos dispobibles.");
        System.out.println("5-Cada edificio/tropa/vehiculo tiene un tiempo de creación. Al finalizar, en pantalla se mostrará que está disponible para su uso.");
        System.out.println("6-El juego es manejado en fases, las cuales se completan luego de que ambos jugadores hayan ocupado su turno.");
        System.out.println("7-El juego termina cuando uno de los dos jugadores se quede sin edificios disponibles.");
        System.out.println(" ");
    }

    public void Razas(){
        System.out.println("----------INFORMACION ACERCA DE LAS RAZAS----------");
        System.out.println("1-Coreanos: Su armada se tarda menos tiempo en generarse");
        System.out.println("2-Estadounidenses: Su super soldado tiene mas vida que los de las demas razas");
        System.out.println("3-Ingleses: Su armada posee más vida que las demas armadas.");
        System.out.println("4-Israelitas: Su super soldado posee mas puntos de ataque que los demas super solados");
        System.out.println("5-Rusos: Su armada tiene mas puntos de ataque que las demas razas");
        System.out.println("ELIGE CON CUIDADO. UNA ELECCION PUEDE HACER LA DIFERENCIA!");
        System.out.println(" ");
    }
    
    
  
}
