package Campeonato.Clases;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        System.out.println("main 3");


            Scanner leer = new Scanner(System.in);

            System.out.println("INGRESE DATOS DE JUGADORES");

            String nombreCompleto, apellidos, ci;
            int edad;
            int njugadores = 2;

//            jugador[] jugadores = new jugador[njugadores];
//
//        for (int i=0 ; i < njugadores; i = i+1) {
//
//            System.out.println("ingrese nombre del jugador: "+ (i+1) + ": ");
//            nombreCompleto = leer.next();
//            System.out.println("ingrese apellidos del jugador1: "+ (i+1) + ": ");
//            apellidos = leer.next();
//            System.out.println("ingrese ci del jugador1: "+ (i+1) + ": ");
//            ci = leer.next();
//            System.out.println("ingrese edad del jugador1: "+ (i+1) + ": ");
//            edad = leer.nextInt();
//
//            // jugador jug1= new jugador(nombreCompleto1, apellidos1, ci1, edad1);
//            //jug1.mostrarJugador();
//
//            jugador jug = new jugador();
//            jug.setNombreCompleto(nombreCompleto);
//            jug.setApellidos(apellidos);
//            jug.setCi(ci);
//            jug.setEdad(edad);
//            jug.mostrarJugador();
//
//            jugadores[i] = jug;
//
//        }
        String nombreEquipo, categoriaEquipo;
        int nEquipos = 2;
        for (int j = 0 ; j< nEquipos; j++){
            System.out.println("ingrese nombre del equipo"+ (j+1) + ": ");
            nombreEquipo = leer.next();
            System.out.println("ingrese categoria del equipo"+ (j+1) + ": ");
            categoriaEquipo = leer.next();
            jugador[] jugadores = new jugador[njugadores];
            for (int i=0 ; i < njugadores; i = i+1) {

                System.out.println("ingrese nombre del jugador: "+ (i+1) + ": ");
                nombreCompleto = leer.next();
                System.out.println("ingrese apellidos del jugador1: "+ (i+1) + ": ");
                apellidos = leer.next();
                System.out.println("ingrese ci del jugador1: "+ (i+1) + ": ");
                ci = leer.next();
                System.out.println("ingrese edad del jugador1: "+ (i+1) + ": ");
                edad = leer.nextInt();

                // jugador jug1= new jugador(nombreCompleto1, apellidos1, ci1, edad1);
                //jug1.mostrarJugador();

                jugador jug = new jugador();
                jug.setNombreCompleto(nombreCompleto);
                jug.setApellidos(apellidos);
                jug.setCi(ci);
                jug.setEdad(edad);
                jug.mostrarJugador();

                jugadores[i] = jug;

            }
            equipo eq1 = new equipo();
            eq1.setNombreEquipo("el alto fc");
            eq1.setCategoria("varone");
            eq1.setJugadores(jugadores);
            eq1.mostarequipo();
        }
        //crear 2 campeonatos (sede alto, sede lp)
//cada campeonato tiene 2 equipos
//cada equipo tiene 2 jugadores
        String nombreCampeonato;
        int nCampeonato = 1;
        for(int j = 0; j< nCampeonato; j++){
            System.out.println("ingrese nombre del campeonato"+ (j+1) + ": ");
            nombreCampeonato = leer.next();

//            campeonato cam1 =new campeonato("sedeElAlto",nombreCampeonato);
        }

    }
}
