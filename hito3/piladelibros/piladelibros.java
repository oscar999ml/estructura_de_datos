package piladelibros;

import pila_de_cadenas.PilaDeCadenas;

public class piladelibros
{
    private int max;
    private int tope;
    private libros[] libros;


    public piladelibros(int max)
    {
        this.tope = 0;
        this.max = max;
        libros = new libros[this.max +1];
    }

    public boolean esVacio()
    {
        if(tope == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean esllena()
    {
        if(tope == max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int nroElementos()
    {
        return this.tope;
    }

    public void adicionar(libros nuevolibro)
    {
        if (!this.esllena())
        {
            this.tope = this.tope +1;
            this.libros[this.tope] = nuevolibro;

        }
        else
        {
            System.out.println("La pila de LIBROS esta llena.");
        }

    }

    public libros eliminar()
    {

        libros elementosEliminados = null;

        if (this.esllena() == false)
        {
            elementosEliminados = this.libros[this.tope];
            this.tope = this.tope -1;
        }
        else
        {
            System.out.println("No se puede eliminar una pila vacia.");
        }
        return elementosEliminados;
    }

    public void llenar()
    {


    }

    public void mostrar()
    {
        libros elem = null;
        if(this.esVacio())
            System.out.println("PilaDelibros vacia");
        else{
            System.out.println("\n Datos de la Pila de libros");
            piladelibros  aux = new piladelibros (this.max);
            while (!esVacio())
            {
                elem = eliminar();
                aux.adicionar(elem);
              elem.mostrarlibro();
            }
            vaciar(aux);
        }
    }

    public void vaciar(piladelibros  a)
    {
        while (!a.esVacio())
            adicionar(a.eliminar());
    }
}
