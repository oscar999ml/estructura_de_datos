package pila_de_cadenas;

public class PilaDeCadenas {
    private int max;
    private String []nombres;
    private int tope;


    public PilaDeCadenas(int max)
    {
        this.tope = 0;
        this.max = max;
        nombres = new String[this.max +1];
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

    public void adicionar(String nuevoItem)
    {
        if (!this.esllena())
        {
            this.tope = this.tope +1;
            this.nombres[this.tope] = nuevoItem;

        }
        else
        {
            System.out.println("La pila de Nombres(cadenas)esta llena.");
        }

    }

    public String eliminar()
    {

        String elementosEliminados = "";

        if (this.esllena() == false)
        {
            elementosEliminados = this.nombres[this.tope];
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
        String elem;
        if(this.esVacio())
            System.out.println("PilaDeCadenas vacia");
        else{
            System.out.println("\n Datos de la PilaDeCadenas");
            PilaDeCadenas aux = new PilaDeCadenas(10);
            while (!esVacio())
            {
                elem = eliminar();
                aux.adicionar(elem);
                System.out.println("Elemento: "+ elem);
            }
            vaciar(aux);
        }
    }

    public void vaciar(PilaDeCadenas a)
    {
        while (!a.esVacio())
            adicionar(a.eliminar());
    }

}

