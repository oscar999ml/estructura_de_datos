package Campeonato.Clases;

import java.util.Scanner;

public class MainCampeonato {
    public static void main(String[] args){

        Scanner leer =new Scanner(System.in);

        jugador j1= new jugador("kevin","mamani","123567lp",22);


        jugador j2= new jugador("werwef","mamani","123567lp",22);

        jugador[] jugadores = new jugador[2];
        jugadores[0]= j1;
        jugadores[1]= j2;



        equipo eq1 = new equipo("club real el alto  ","varones  ",jugadores );
        eq1.mostarequipo();

        //
       // public static void main(String[] args){
         //   campeonato cam1= new campeonato("kasdasfdwesdgj",equipo)}
    }
}

