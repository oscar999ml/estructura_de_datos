package DefensaPilasHito3;

public class PilaDeEstudiantes {
    private int max;
    private int tope;
    private Estudiante[] Estudiante;


    public PilaDeEstudiantes(int max)
    {
        this.tope = 0;
        this.max = max;
        Estudiante = new Estudiante[this.max +1];
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

    public void adicionar(Estudiante nuevoEstudinate)
    {
        if (!this.esllena())
        {
            this.tope = this.tope +1;
            this.Estudiante[this.tope] = nuevoEstudinate;

        }
        else
        {
            System.out.println("La pila de estudinates esta llena.");
        }

    }

    public Estudiante eliminar()
    {

        Estudiante elementosEliminados = null;

        if (this.esllena() == false)
        {
            elementosEliminados = this.Estudiante[this.tope];
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
        Estudiante elem = null;
        if(this.esVacio())
            System.out.println("PilaDeEStudinate vacia");
        else{
            System.out.println("\n Datos de la Pila de estudinates");
            PilaDeEstudiantes aux = new PilaDeEstudiantes (this.max);
            while (!esVacio())
            {
                elem = eliminar();
                aux.adicionar(elem);
                elem.mostrarEstudiante();
            }
            vaciar(aux);
        }
    }

    public void vaciar(PilaDeEstudiantes  a)
    {
        while (!a.esVacio())
            adicionar(a.eliminar());
    }
}

