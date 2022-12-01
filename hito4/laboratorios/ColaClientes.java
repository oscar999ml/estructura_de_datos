package defensa_colas_hito4;

public class ColaClientes {
    private int max;    //MAXIMO ELEMENTO DE LA COLS
    private int fin;    //fin de la cola
    private int ini;        //INICIO DE LA COLA
    private Cliente colCliente[]; //ARRAY PARA RECORRER DATOS

    public ColaClientes(int max){
        this.max = max;
        this.colCliente = new Cliente[this.max+1]; //1,2,3,4,5,6,7, estructura del array
        this.ini = 0;
        this.fin = 0;
    }

    public boolean esVacio(){
        if(this.ini==0 && this.fin==0){
            return true;
        }else {
            return false;
        }
    }

    public boolean esLleno(){
        if(this.fin==this.max){
            return true;
        }else {
            return false;
        }
    }

    public int nroElementos(){
        return fin-ini;
    }

    public void insertar(Cliente elemento){
        if(!esLleno()){
            fin++;
            colCliente[fin]=elemento;
        }else{
            System.out.println("La cola esta llena");
        }
    }
    // inicio = 0        1,2,3,4,5              final=5

    public Cliente eliminar(){
        Cliente elemento= null;
        if(!esVacio()){
            ini++;
            elemento=colCliente[ini];
            if (ini==fin){
                ini=0;
                fin=0;
            }
        }else{
            System.out.println("La cola esta vacia");
        }
        return elemento;
    }

    public void mostrar(){
        if(esVacio()){
            System.out.println("La cola esta vacia");
        }else{
            Cliente elementoEliminado= null;
            System.out.println("Mostrando datos de la cola");
            ColaClientes aux = new ColaClientes (this.max);
            while(!esVacio()){
                elementoEliminado=eliminar();
             //   System.out.println("valor: " + elementoEliminado);
                elementoEliminado.mostrarCliente();
                aux.insertar(elementoEliminado);
            }
            vaciar(aux);
        }
    }
    public void vaciar(ColaClientes aux) {
        Cliente elementoEliminado= null;
        while(!aux.esVacio()){
            elementoEliminado=aux.eliminar();
            insertar(elementoEliminado);
        }
    }
}
