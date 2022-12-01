package Hito_3;

import Hito_3.PilaNumeros;

public class Main {

    public static void main(String[] args){
        PilaNumeros pila1 = new PilaNumeros(10);
        pila1.adicionar(12);
        pila1.adicionar(4);
        pila1.adicionar(5);
        pila1.adicionar(23);
        pila1.adicionar(7);
        pila1.adicionar(12);

        pila1.mostrar();
        moverelemento(pila1,5);
        cambiarporcien(pila1,100);
    }

    private static void moverelemento(PilaNumeros pilas , int elemnto) {
        PilaNumeros aux =new PilaNumeros(10);
        int valorExtraidodelapila = 0;
        while(pilas.esVacio()== false){
            valorExtraidodelapila = pilas.eliminar();
            if( valorExtraidodelapila != elemnto){
                aux.adicionar(valorExtraidodelapila);
            }
        }
        pilas.vaciar(aux);
        pilas.adicionar(elemnto);
        pilas.mostrar();
    }
    private static void cambiarporcien(PilaNumeros pilas , int elemnto) {
        PilaNumeros aux =new PilaNumeros(10);
        int valorExtraidodelapila = 0;
        while(pilas.esVacio()== false){
            valorExtraidodelapila = pilas.eliminar();

                aux.adicionar(valorExtraidodelapila);

        }
        pilas.vaciar(aux);
        pilas.adicionar(elemnto);
        pilas.mostrar();
    }


}
