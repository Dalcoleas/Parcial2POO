/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielalcoleas.world;

import danielalcoleas.world.edificacion.*;
import danielalcoleas.world.ejercito.*;
import danielalcoleas.world.razas.*;
import java.util.ArrayList;
import danielalcoleas.world.vehiculos.*;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author daniel
 */
public class Jugador {
    
    AbstractFactory veh = FactoryProducer.getFactory("vehiculo");
    AbstractFactory ejer = FactoryProducer.getFactory("ejercito");
    AbstractFactory factory = FactoryProducer.getFactory("raza");
    
    private String nombre;
    private Raza raza;
    private Taller1 tall1;
    private Taller2 tall2;
    private Taller3 tall3;
    private CentroMando centroDeMando;
    private Cuartel cuartel;
    private Recolector3 rec3;
    private Recolector2 rec2;
    private Recolector1 rec1;
    private int fase;
    private double diamante, oro, plata;
    private ArrayList <Vehiculo> vehiculos;
    private ArrayList <Ejercito> ejercitos;
    private ArrayList <Edificacion> edificaciones;
    
    
    public Jugador(){
        this.vehiculos = new ArrayList<>();
        this.ejercitos = new ArrayList<>();
        this.edificaciones = new ArrayList<>();
        
        this.fase = 0;
        this.diamante = 2000;
        this.oro = 2000;
        this.plata = 2000;
        this.tall1 = new Taller1();
        this.tall2 = new Taller2();
        this.tall3 = new Taller3();
        this.rec3 = new Recolector3();
        this.rec2 = new Recolector2();
        this.rec1 = new Recolector1();
        this.cuartel = new Cuartel();
        this.centroDeMando = new CentroMando();
        centroDeMando.setDiamante(this.diamante);
        centroDeMando.setOro(this.oro);
        centroDeMando.setPlata(this.plata);
  
    }

    public Jugador(String nombre, Raza raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.vehiculos = new ArrayList<>();
        this.ejercitos = new ArrayList<>();
        this.edificaciones = new ArrayList<>();
        this.centroDeMando = new CentroMando();    
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
    
    
    
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Ejercito> getEjercitos() {
        return ejercitos;
    }

    public void setEjercitos(ArrayList<Ejercito> ejercitos) {
        this.ejercitos = ejercitos;
    }

    public ArrayList<Edificacion> getEdificaciones() {
        return edificaciones;
    }

    public void juego(){
        Scanner leer = new Scanner(System.in);
        int opc = 0, opc2, opc3, opc4, opc5, opc6, opc7, mej;
        
        while(opc !=5){
            System.out.println("-------------------");
            System.out.println("Recursos Actuales");
            System.out.println(" ");
            System.out.println("Diamante: " + centroDeMando.getDiamante());
            System.out.println("Oro: " + centroDeMando.getOro());
            System.out.println("Plata: " + centroDeMando.getPlata());
            System.out.println(" ");
            System.out.println("Turno de: "+ nombre);
            System.out.println("Raza: " + getRaza().getNombre());
            System.out.println("Fase: " + this.fase);
            System.out.println("Jugador, ¿que opcion deseas elegir?");
            opciones();
            opc = leer.nextInt();
            
            switch (opc){
                case 1:
                    System.out.println("Ahora estás en el menu de edificaciones.");
                    System.out.println("A continuacion te muestro lo que puedes hacer.");
                    System.out.println("\n");
                    menuEdificaciones();
                    
                    opc2 = leer.nextInt();
                    
                    switch(opc2){
                        
                        case 1:   
                            if(this.diamante >= cuartel.getCostoDia() && (this.oro >= cuartel.getCostoOro()) &&  (this.diamante >= cuartel.getCostoDia())) {
                                cuartel.setNumFase(this.fase); 
                                this.diamante = this.diamante - cuartel.getCostoDia();
                                this.oro = this.oro - cuartel.getCostoOro();
                                this.plata = this.plata - cuartel.getCostoPla();
                                centroDeMando.setPlata(this.plata);
                                centroDeMando.setDiamante(this.diamante);
                                centroDeMando.setOro(this.oro);
                                edificaciones.add(cuartel);
                                cuartel.construir();
                                
                            } else{
                                System.out.println("Recursos Insuficientes");
                            } 
                            break;
                        case 2:
                            System.out.println("Que tipo de edificio de recurso deseas construir?");
                            System.out.println("1-Recurso 1 (Diamante)");
                            System.out.println("2-Recurso 2 (Oro)");
                            System.out.println("3-Recurso 3 (Plata)");
                            System.out.print("Elige una opción!: ");
                            opc3 = leer.nextInt();
                            switch(opc3){
                                
                                case 1:
                                    if(this.diamante >= rec1.getCostoDia() && this.oro >= rec1.getCostoOro() && this.plata >= rec1.getCostoPla()){
                                        rec1.setNumFase(this.fase);
                                        this.diamante = this.diamante - rec1.getCostoDia();
                                        this.oro = this.oro - rec1.getCostoOro();
                                        this.plata = this.plata - rec1.getCostoPla();
                                        centroDeMando.setPlata(this.plata);
                                        centroDeMando.setDiamante(this.diamante);
                                        centroDeMando.setOro(this.oro);
                                        edificaciones.add(rec1);
                                        rec1.construir();
                                    }else{
                                        System.out.println("Lo sentimos, recursos insuficientes");
                                    }
                                    
                                    break;
                                case 2:
                                    if(this.diamante >= rec2.getCostoDia() && this.oro >= rec2.getCostoOro() && this.plata >= rec2.getCostoPla()){
                                        rec2.setNumFase(this.fase);
                                        this.diamante = this.diamante - rec2.getCostoDia();
                                        this.oro = this.oro - rec2.getCostoOro();
                                        this.plata = this.plata - rec2.getCostoPla();
                                        centroDeMando.setPlata(this.plata);
                                        centroDeMando.setDiamante(this.diamante);
                                        centroDeMando.setOro(this.oro);
                                        edificaciones.add(rec2);
                                        rec2.construir();;
                                    }else{
                                        System.out.println("Lo sentimos, recursos insuficientes");
                                    }
                                    break;
                                case 3: 
                                    if(this.diamante >= rec3.getCostoDia() && this.oro >= rec3.getCostoOro() && this.plata >= rec3.getCostoPla()){
                                        rec1.setNumFase(this.fase);
                                        this.diamante = this.diamante - rec3.getCostoDia();
                                        this.oro = this.oro - rec3.getCostoOro();
                                        this.plata = this.plata - rec3.getCostoPla();
                                        centroDeMando.setPlata(this.plata);
                                        centroDeMando.setDiamante(this.diamante);
                                        centroDeMando.setOro(this.oro);
                                        edificaciones.add(rec3);
                                        rec3.construir();
                                    }else{
                                        System.out.println("Lo sentimos, recursos insuficientes");
                                    }
                                    break;
                                default:
                                    System.out.println("Haz escogido mal!");
                                    break;
                            }
                            break;
                            
                        case 3:
                            System.out.println("Tenemos 3 talleres disponibles para construir.");
                            System.out.println("1-Taller Humvee");
                            System.out.println("2-Taller Challenger");
                            System.out.println("3-Taller Stryker");
                            System.out.println("Elige una opción!: ");
                            opc4 = leer.nextInt();
                            switch (opc4){
                                case 1:
                                    if(this.diamante >= tall1.getCostoDia() && this.oro >= tall1.getCostoOro() && this.plata >= tall1.getCostoPla()){
                                        tall1.setNumFase(this.fase);
                                        this.diamante = this.diamante - tall1.getCostoDia();
                                        this.oro = this.oro - tall1.getCostoOro();
                                        this.plata = this.plata - tall1.getCostoPla();
                                        centroDeMando.setPlata(this.plata);
                                        centroDeMando.setDiamante(this.diamante);
                                        centroDeMando.setOro(this.oro);
                                        edificaciones.add(tall1);
                                        tall1.construir();
                                    }else{
                                        System.out.println("Lo sentimos, recursos insuficientes");
                                    }
                                    break;
                                case 2:
                                    if(this.diamante >= tall2.getCostoDia() && this.oro >= tall2.getCostoOro() && this.plata >= tall2.getCostoPla()){
                                        tall2.setNumFase(this.fase);
                                        this.diamante = this.diamante - tall2.getCostoDia();
                                        this.oro = this.oro - tall2.getCostoOro();
                                        this.plata = this.plata - tall2.getCostoPla();
                                        centroDeMando.setPlata(this.plata);
                                        centroDeMando.setDiamante(this.diamante);
                                        centroDeMando.setOro(this.oro);
                                        edificaciones.add(tall2);
                                        tall2.construir();
                                    }else{
                                        System.out.println("Lo sentimos, recursos insuficientes");
                                    }
                                    break;
                                case 3:
                                    if(this.diamante >= tall3.getCostoDia() && this.oro >= tall3.getCostoOro() && this.plata >= tall3.getCostoPla()){
                                        tall3.setNumFase(this.fase);
                                        this.diamante = this.diamante - tall3.getCostoDia();
                                        this.oro = this.oro - tall3.getCostoOro();
                                        this.plata = this.plata - tall3.getCostoPla();
                                        centroDeMando.setPlata(this.plata);
                                        centroDeMando.setDiamante(this.diamante);
                                        centroDeMando.setOro(this.oro);
                                        edificaciones.add(tall3);
                                        tall3.construir();
                                    }else{
                                        System.out.println("Lo sentimos, recursos insuficientes");
                                    }
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("Mejorar el centro de mando costará los siguientes recursos:");
                            System.out.println("Nivel 1. Diamante: 1650 + Oro: 1650 + Plata: 1650.");
                            System.out.println("Nivel 2. Diamante: 2145 + Oro: 2145 + Plata: 2145.");
                            System.out.println("Nivel 3: Diamante: 3217.5 + Oro: 3217.5 + Plata: 3217.5");
                            System.out.println("Claro, para poder mejorarlo a nivel 3, tiene que haberlo mejoraro a nivel 1 y a nivel 2 sucesivamente.");
                            System.out.print("A que nivel lo desea mejorar ahorita?: ");
                            mej = leer.nextInt();
                            
                            switch(mej){
                                case 1:
                                    if(this.diamante >= 1650 && this.oro >= 1650 && this.plata >= 1650 && centroDeMando.getNivel() == 0){
                                        centroDeMando.mejorarEdificacion(1);
                                        //centroDeMando.setNumFase(this.fase);
                                        //centroDeMando.setHab(false);
                                        this.diamante = this.diamante - 1650;
                                        this.oro = this.oro - 1650;
                                        this.plata = this.plata - 1650;
                                        centroDeMando.setPlata(this.plata);
                                        centroDeMando.setDiamante(this.diamante);
                                        centroDeMando.setOro(this.oro);
                                    } else{
                                        System.out.println("Recursos insuficientes");
                                    } 
                                    break;
                                case 2:
                                    if(this.diamante >= 2145 && this.oro >= 2145 && this.plata >= 2145 && centroDeMando.getNivel() == 1){
                                        centroDeMando.mejorarEdificacion(2);
                                        //centroDeMando.setNumFase(this.fase);
                                        //centroDeMando.setHab(false);
                                        this.diamante = this.diamante - 2145;
                                        this.oro = this.oro - 2145;
                                        this.plata = this.plata - 2145;
                                        centroDeMando.setPlata(this.plata);
                                        centroDeMando.setDiamante(this.diamante);
                                        centroDeMando.setOro(this.oro);
                                    } else{
                                        System.out.println("Recursos insuficientes/Deseas avanzar de nivel muy rapido!");
                                    } 
                                    break;
                                case 3:
                                    if(this.diamante >= 3217.5 && this.oro >= 3217.5 && this.plata >= 3217.5 && centroDeMando.getNivel() == 2){
                                        centroDeMando.mejorarEdificacion(3);
                                        //centroDeMando.setNumFase(this.fase);
                                        //centroDeMando.setHab(false);
                                        this.diamante = this.diamante - 3217.5;
                                        this.oro = this.oro - 3217.5;
                                        this.plata = this.plata - 3217.5;
                                        centroDeMando.setPlata(this.plata);
                                        centroDeMando.setDiamante(this.diamante);
                                        centroDeMando.setOro(this.oro);
                                    } else{
                                        System.out.println("Recursos insuficientes/Deseas avanzar de nivel muy rapido!");
                                    } 
                                    break;
                                default:
                                    System.out.println("Error al mejorar. Eligió un nivel que no existe.");
                                    break;
                            }
                            break;
                            
                        case 5:
                            System.out.println("Recursos Disponibles para recolectar");
                            System.out.println("1-Diamante");
                            System.out.println("2-Oro");
                            System.out.println("3-Plata");
                            System.out.print("¿Que deseas recolectar?: ");
                            int re = leer.nextInt();
                            
                            switch(re){
                                case 1:
                                    for(Edificacion edi : this.edificaciones){
                                        if("Recolector Diamante".equals(edi.getNombre())){
                                            this.diamante = this.diamante + rec1.recDiamante();
                                            centroDeMando.setDiamante(this.diamante);
                                            break;
                                        } else{
                                            System.out.println("Aun no has construido el recolector de diamante");
                                            
                                        }
                                    }
                                    break;
                                case 2:
                                    for(Edificacion edi : this.edificaciones){
                                        if("Recolector Oro".equals(edi.getNombre())){
                                            this.oro = this.oro + rec2.recOro();
                                            centroDeMando.setOro(this.oro);
                                            break;
                                        } else{
                                            System.out.println("Aun no has construido el recolector de oro!");
                                            
                                        }
                                    }
                                    break;
                                case 3:
                                    for(Edificacion edi : this.edificaciones){
                                        if("Recolector Plata".equals(edi.getNombre())){
                                            this.plata = this.plata + rec3.recDiamante();
                                            centroDeMando.setDiamante(this.plata);
                                            break;
                                        } else{
                                            System.out.println("Aun no has construido el recolector de plata!");
                                            
                                        }
                                    }
                                    break;
                                default:
                                    System.out.println("ERROR!");
                                    break;
                            }
                            break;
                        case 6:
                                Iterator<Edificacion> nombreIterator = edificaciones.iterator();
                                while(nombreIterator.hasNext()){
                                    Edificacion elemento = nombreIterator.next();
                                    System.out.println(elemento.getNombre()+" / ");
                            }
                            break;
                        case 7:
                            System.out.println("Centro de Mando");
                            System.out.println("Capacidad Maxima Diamante: " + centroDeMando.getMaxDiamante() +  " Capacidad Maxima Oro: " + centroDeMando.getMaxOro() + " Capacidad Maxima Plata: " + centroDeMando.getMaxPlata());
                            break;
                    }
                    break;         
                    
                case 2:
                    System.out.println("Ahora estas en el menu del ejercito.");
                    System.out.println("A continuación te muestro lo que podes hacer!");
                    menuEjercito();
                    System.out.print("Elija la opción que desea!: ");
                    opc5 = leer.nextInt();

                    switch(opc5){
                        case 1:
                            
                            //VERIFICAR QUE HAYA RECURSOS Y QUE YA HAYA UN CUARTEL CONSTRUIDO
                            if("Coreanos".equals(getRaza().getNombre())){
                                for(Edificacion edi : this.edificaciones){
                                    if("Cuartel".equals(edi.getNombre())){
                                        if(this.diamante >= ejer.getEjercito("armadaCoreana").getCostoDia() && this.oro >= ejer.getEjercito("armadaCoreana").getCostoOro() && this.plata >= ejer.getEjercito("armadaCoreana").getCostoPla()){
                                            System.out.println(this.fase);
                                            ejer.getEjercito("armadaCoreana").setNumFase(2);
                                            System.out.println("pupu: " + ejer.getEjercito("armadaCoreana").getNumFase());
                                            ejercitos.add((Ejercito) ejer.getEjercito("armadaCoreana"));
                                            this.diamante = this.diamante - ejer.getEjercito("armadaCoreana").getCostoDia();
                                            this.oro = this.oro - tall2.getCostoOro() -  ejer.getEjercito("armadaCoreana").getCostoOro();
                                            this.plata = this.plata - tall2.getCostoPla() - ejer.getEjercito("armadaCoreana").getCostoPla();
                                            centroDeMando.setPlata(this.plata);
                                            centroDeMando.setDiamante(this.diamante);
                                            centroDeMando.setOro(this.oro);
                                            ejer.getEjercito("armadaCoreana").entrenarArmada();
                                            
                                        }  else{
                                            System.out.println("Recursos Insuficientes");
                                        }  
                                    } else 
                                        System.out.println(".");
                                }
                            }

                            if("Estadounidenses".equals(getRaza().getNombre())){
                                for(Edificacion edi : this.edificaciones){
                                    if("Cuartel".equals(edi.getNombre())){
                                        if(this.diamante >= ejer.getEjercito("armadaEstadounidense").getCostoDia() && this.oro >= ejer.getEjercito("armadaEstadounidense").getCostoOro() && this.plata >= ejer.getEjercito("armadaEstadounidense").getCostoPla()){
                                            System.out.println(this.fase);
                                            ejer.getEjercito("armadaEstadounidense").setNumFase(this.fase);
                                            System.out.println("pupu: " + ejer.getEjercito("armadaEstadounidense").getNumFase());
                                            ejercitos.add((Ejercito) ejer.getEjercito("armadaEstadounidense"));
                                            this.diamante = this.diamante - ejer.getEjercito("armadaEstadounidense").getCostoDia();
                                            this.oro = this.oro - tall2.getCostoOro() -  ejer.getEjercito("armadaEstadounidense").getCostoOro();
                                            this.plata = this.plata - tall2.getCostoPla() - ejer.getEjercito("armadaEstadounidense").getCostoPla();
                                            centroDeMando.setPlata(this.plata);
                                            centroDeMando.setDiamante(this.diamante);
                                            centroDeMando.setOro(this.oro);
                                            ejer.getEjercito("armadaEstadounidense").entrenarArmada();
                                            
                                        }  else{
                                            System.out.println("Recursos Insuficientes");
                                        }  
                                    } else 
                                        System.out.println(".");
                                }
                            }
                            if("Ingleses".equals(getRaza().getNombre())){
                                for(Edificacion edi : this.edificaciones){
                                    if("Cuartel".equals(edi.getNombre())){
                                        if(this.diamante >= ejer.getEjercito("armadaInglesa").getCostoDia() && this.oro >= ejer.getEjercito("armadaInglesa").getCostoOro() && this.plata >= ejer.getEjercito("armadaInglesa").getCostoPla()){
                                            System.out.println(this.fase);
                                            ejer.getEjercito("armadaInglesa").setNumFase(this.fase);
                                            System.out.println("pupu: " + ejer.getEjercito("armadaInglesa").getNumFase());
                                            ejercitos.add((Ejercito) ejer.getEjercito("armadaInglesa"));
                                            this.diamante = this.diamante - ejer.getEjercito("armadaInglesa").getCostoDia();
                                            this.oro = this.oro - tall2.getCostoOro() -  ejer.getEjercito("armadaInglesa").getCostoOro();
                                            this.plata = this.plata - tall2.getCostoPla() - ejer.getEjercito("armadaInglesa").getCostoPla();
                                            centroDeMando.setPlata(this.plata);
                                            centroDeMando.setDiamante(this.diamante);
                                            centroDeMando.setOro(this.oro);
                                            ejer.getEjercito("armadaInglesa").entrenarArmada();
                                            
                                        }  else{
                                            System.out.println("Recursos Insuficientes");
                                        }  
                                    } else 
                                        System.out.println(".");
                                }
                            }
                            if("Israelitas".equals(getRaza().getNombre())){
                                for(Edificacion edi : this.edificaciones){
                                    if("Cuartel".equals(edi.getNombre())){
                                        if(this.diamante >= ejer.getEjercito("armadaIsraeli").getCostoDia() && this.oro >= ejer.getEjercito("armadaIsraeli").getCostoOro() && this.plata >= ejer.getEjercito("armadaIsraeli").getCostoPla()){
                                            System.out.println(this.fase);
                                            ejer.getEjercito("armadaIsraeli").setNumFase(this.fase);
                                            System.out.println("pupu: " + ejer.getEjercito("armadaIsraeli").getNumFase());
                                            ejercitos.add((Ejercito) ejer.getEjercito("armadaIsraeli"));
                                            this.diamante = this.diamante - ejer.getEjercito("armadaIsraeli").getCostoDia();
                                            this.oro = this.oro - tall2.getCostoOro() -  ejer.getEjercito("armadaIsraeli").getCostoOro();
                                            this.plata = this.plata - tall2.getCostoPla() - ejer.getEjercito("armadaIsraeli").getCostoPla();
                                            centroDeMando.setPlata(this.plata);
                                            centroDeMando.setDiamante(this.diamante);
                                            centroDeMando.setOro(this.oro);
                                            ejer.getEjercito("armadaIsraeli").entrenarArmada();
                                            
                                        }  else{
                                            System.out.println("Recursos Insuficientes");
                                        }  
                                    } else 
                                        System.out.println(".");
                                }
                            }
                            if("Rusos".equals(getRaza().getNombre())){
                                for(Edificacion edi : this.edificaciones){
                                    if("Cuartel".equals(edi.getNombre())){
                                        if(this.diamante >= ejer.getEjercito("armadaRusa").getCostoDia() && this.oro >= ejer.getEjercito("armadaRusa").getCostoOro() && this.plata >= ejer.getEjercito("armadaRusa").getCostoPla()){
                                            System.out.println(this.fase);
                                            ejer.getEjercito("armadaRusa").setNumFase(this.fase);
                                            System.out.println("pupu: " + ejer.getEjercito("armadaRusa").getNumFase());
                                            ejercitos.add((Ejercito) ejer.getEjercito("armadaRusa"));
                                            this.diamante = this.diamante - ejer.getEjercito("armadaRusa").getCostoDia();
                                            this.oro = this.oro - tall2.getCostoOro() -  ejer.getEjercito("armadaRusa").getCostoOro();
                                            this.plata = this.plata - tall2.getCostoPla() - ejer.getEjercito("armadaRusa").getCostoPla();
                                            centroDeMando.setPlata(this.plata);
                                            centroDeMando.setDiamante(this.diamante);
                                            centroDeMando.setOro(this.oro);
                                            ejer.getEjercito("armadaRusa").entrenarArmada();
                                            
                                        }  else{
                                            System.out.println("Recursos Insuficientes");
                                        }  
                                    } else 
                                        System.out.println(".");
                                }
                            }     
                            break;
                        case 2:
                            
                            if("Coreanos".equals(getRaza().getNombre())){
                                ejercitos.add((Ejercito) ejer.getEjercito("kimJong"));
                                ejer.getEjercito("kimJong").entrenarArmada();
                            }

                            if("Estadounidenses".equals(getRaza().getNombre())){
                                ejercitos.add((Ejercito) ejer.getEjercito("mj"));
                                ejer.getEjercito("mj").entrenarArmada();
                            }
                            
                            if("Ingleses".equals(getRaza().getNombre())){
                                ejercitos.add((Ejercito) ejer.getEjercito("churchill"));
                                ejer.getEjercito("churchill").entrenarArmada();
                            }
                            if("Israelitas".equals(getRaza().getNombre())){
                                ejercitos.add((Ejercito) ejer.getEjercito("wonderGal"));
                                ejer.getEjercito("wonderGal").entrenarArmada();
                            }
                            
                            if("Rusos".equals(getRaza().getNombre())){
                                ejercitos.add((Ejercito) ejer.getEjercito("putinDestroyer"));
                                ejer.getEjercito("putinDestroyer").entrenarArmada();
                            }       
                            break;
                        case 3:
                            //ATACAR ENEMIGOS
                            break;
                        case 4:
                            //ATACAR TROPAS ENEMIGAS
                            break;
                        case 5:
                            Iterator<Ejercito> nombreIterator = ejercitos.iterator();
                                while(nombreIterator.hasNext()){
                                    Ejercito elemento = nombreIterator.next();
                                    System.out.println(elemento.getNombre()+" / ");
                            }
                            break;
                            
                    }
                    
                    break;
                case 3:
                    System.out.println("Ahora estás en el menu de Vehiculos.");
                    System.out.println("A continuacion te muestro lo que puedes hacer.");
                    System.out.println("\n");
                    menuVehiculos();
                    System.out.println("Elige la opción que deseas realizar!");
                    opc6 = leer.nextInt();
                    
                    switch(opc6){
                        case 1:
                            System.out.println("¿Que vehiculo deseas fabricar?");
                            System.out.println("1- Humvee");
                            System.out.println("2- Stryker");
                            System.out.println("3- Challenger");
                            System.out.println("Elige: ");
                            opc7 = leer.nextInt();
                            
                            switch(opc7){
                                case 1:
                                    vehiculos.add((Vehiculo) veh.getVehiculo("humvee"));
                                    veh.getVehiculo("humvee").fabricar();
                                    break;
                                case 2:
                                    vehiculos.add((Vehiculo) veh.getVehiculo("stryker"));
                                    veh.getVehiculo("stryker").fabricar();
                                    break;
                                case 3:
                                    vehiculos.add((Vehiculo) veh.getVehiculo("challenger"));
                                    veh.getVehiculo("challenger").fabricar();
                                    break;
                            }
                            break;
                        //ELEGIR CON CUAL VEHICULO ATACAR, VER SI YA FUE FABRICADO, SWITCH (OPC)...    
                        case 2:
                            veh.getVehiculo("humvee").atacar();
                            veh.getVehiculo("stryker").atacar();
                            veh.getVehiculo("challenger").atacar();
                            break;
                        case 3:
                            //Fab...defender();
                            break;
                        case 4:
                            Iterator<Vehiculo> nombreIterator = vehiculos.iterator();
                                while(nombreIterator.hasNext()){
                                    Vehiculo elemento = nombreIterator.next();
                                    System.out.println(elemento+" / ");
                            }
                            break;

                    }
                    break;
                case 4:
                    System.out.println("Nombre Jugador: " + this.nombre + " Raza: " + getRaza().getNombre());
                    break;
                    
            }

        }
        
        
    }
    
    public void opciones(){
        System.out.println("----Opciones Jugador----");
        System.out.println("1- Menu Edificaciones");
        System.out.println("2- Menu Ejercito");
        System.out.println("3- Menu Vehiculos");
        System.out.println("4- Ver Datos Jugador");
        System.out.println("5- Acabar turno");
        System.out.print("Opcion: ");
        
    }
    
        
    public void menuEdificaciones(){
        System.out.println("----Menu Edificaciones----");
        System.out.println("1-Construir Cuartel");
        System.out.println("2-Construir Recolector");
        System.out.println("3-Construir Taller");
        System.out.println("4-Mejorar centro de mando");
        System.out.println("5-Recolectar Recursos");
        System.out.println("6-Mostrar edificaciones actuales");
        System.out.println("7-Informacion centro de mando");
        System.out.println("8-Regresar");
        System.out.print("Opcion: ");
    }
 
    public void menuEjercito(){
        System.out.println("----Menu Ejercito----");
        System.out.println("1- Entrenar Armada");
        System.out.println("2- Entrenar Super Soldado");
        System.out.println("3- Atacar Edificaciones Enemigas");
        System.out.println("4- Defender base aliada");
        System.out.println("5- Ejercito Creado");
        System.out.println("6- Regresar");
        System.out.print("Opcion: ");
    }
    
    public void menuVehiculos(){
        System.out.println("----Menu Vehiculos----");
        System.out.println("1- Fabricar Vehiculo");
        System.out.println("2- Atacar enemigo");
        System.out.println("3- Defender Base");
        System.out.println("4- Vehiculos Fabricados");
        System.out.println("5- Regresar");
        System.out.print("Opcion: ");
    }
    
      public void moverFase(){
        this.fase += 1;
    }
      
    public void chequearFase(){
        for (Edificacion edificaciones : this.edificaciones){
            if((edificaciones.getNumFase() + edificaciones.getTiempoEspera()) == this.fase){
                edificaciones.setHab(true);
                System.out.println(edificaciones.getNombre() + " construido y listo para ser utilizado");
            }
        }
        
        for (Ejercito ejercitos : this.ejercitos){
            if((ejercitos.getNumFase() + ejercitos.getTiempoEspera()) == this.fase){
                ejercitos.setHab(true);
                System.out.println(ejercitos.getNombre() + " entrenado y  listo para atacar");
            }
        }
        
        /*for (MachineManager vehiculo : this.vehiculosPreparados){
            if((vehiculo.getCreationFase()+vehiculo.getWaitTime()) == this.faseActual){
                vehiculo.setIsEnable(true);
                System.out.println(vehiculo.getNombre() + "esta listo para atacar");
            }
        }*/
    }
}

