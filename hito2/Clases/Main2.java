package Campeonato.Clases;

import java.util.Scanner;

public class Main2 {
   public static void  main(String [] args){
       Scanner leer = new Scanner(System.in);

       System.out.println("INGRESE DATOS DE JUGADORES");

       String nombreCompleto1, apellidos1, ci1;
       int edad1;

       System.out.println("ingrese nombre del jugador1: ");
       nombreCompleto1 = leer.nextLine();
       System.out.println("ingrese apellidos del jugador1: ");
       apellidos1 = leer.nextLine();
       System.out.println("ingrese ci del jugador1: ");
       ci1 = leer.next();
       System.out.println("ingrese edad del jugador1: ");
       edad1 = leer.nextInt();

      // jugador jug1= new jugador(nombreCompleto1, apellidos1, ci1, edad1);
       //jug1.mostrarJugador();

       jugador jug1 = new jugador();
       jug1.setNombreCompleto(nombreCompleto1);
       jug1.setApellidos(apellidos1);
       jug1.setCi(ci1);
       jug1.setEdad(edad1);

       jug1.mostrarJugador();

       /////////////////////

       String nombreCompleto2, apellidos2, ci2;
       int edad2;
       System.out.println("ingrese nombre del jugador2: ");
       nombreCompleto2 = leer.nextLine();
       System.out.println("ingrese apellidos del jugador2: ");
       apellidos2 = leer.nextLine();
       System.out.println("ingrese ci del jugador02: ");
       ci2 = leer.next();
       System.out.println("ingrese edad del jugador2: ");
       edad2 = leer.nextInt();

       // jugador jug1= new jugador(nombreCompleto1, apellidos1, ci1, edad1);
       //jug1.mostrarJugador();

       jugador jug2 = new jugador();
       jug2.setNombreCompleto(nombreCompleto2);
       jug2.setApellidos(apellidos2);
       jug2.setCi(ci2);
       jug2.setEdad(edad2);

       jug2.mostrarJugador();

   }
}

