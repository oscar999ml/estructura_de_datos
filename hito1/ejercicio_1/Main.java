package ejercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        vehiculo v1 = new vehiculo();

       // v1.girar_a_la_derecha();
        //v1.cambiar_de_carril();

        vehiculo v2 = new vehiculo("turbo","blaco","vagoneta","4x4","toyota");
        v2.Mover();
        v2.mostrar();


       //System.out.println("hyaisdh "+v2.getNombre());


     v2.setColor("rojo");
     v2.mostrar();
    }
}
