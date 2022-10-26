package pila_de_cadenas;

import Hito_3.PilaNumeros;

public class Main2
{
    public static void main(String[] args)
    {
        PilaDeCadenas nombresEDD = new PilaDeCadenas(10);

        nombresEDD.adicionar("william");
        nombresEDD.adicionar("jonathan");
        nombresEDD.adicionar("ilia");
        nombresEDD.adicionar("freddy");
        nombresEDD.adicionar("marco");
        nombresEDD.adicionar("andres");

        nombresEDD.mostrar();

        determinaUsuarioPorNombre(nombresEDD,"ana");

        agregaALINICIO(nombresEDD, "ilia");


    }
    //crear un metodo en la clase MAIN que me permita ver cuantos nombres son iguales a andres

    public static void determinaUsuarioPorNombre(PilaDeCadenas nombresEDD, String nombres)
    {
        PilaDeCadenas aux = new PilaDeCadenas(10);
        String valorDeLaPila = "";
        int cantidad = 0;

        while (nombresEDD.esVacio() == false)
        {
            valorDeLaPila = nombresEDD.eliminar();
            if (valorDeLaPila == nombres)
            {
                cantidad = cantidad + 1;
            }
            aux.adicionar(valorDeLaPila);
        }
        nombresEDD.vaciar(aux);

        System.out.println("cantidad " + cantidad);

    }

    private static void agregaALINICIO(PilaDeCadenas nombresEDD, String nombres)
    {
        PilaDeCadenas aux = new PilaDeCadenas(10);
        String valorDeLaPila = "";

        while(nombresEDD.esVacio()== false)
        {
            valorDeLaPila = nombresEDD.eliminar();

            aux.adicionar(valorDeLaPila);

        }
        aux.adicionar(nombres);
        nombresEDD.vaciar(aux);
        nombresEDD.mostrar();
    }





}
