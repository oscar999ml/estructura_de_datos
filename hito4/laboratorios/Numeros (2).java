
public class Numeros {
    private int max;    //MAXIMO ELEMENTO DE LA COLS
    private int fin;    //fin de la cola
    private int ini;        //INICIO DE LA COLA
    private int cNum[]; //ARRAY PARA RECORRER DATOS

    public Numeros(int max){
        this.max = max;
        this.cNum= new int[this.max+1]; //1,2,3,4,5,6,7, estructura del array
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

    public void insertar(int elemento){
        if(!esLleno()){
            fin++;
            cNum[fin]=elemento;
        }else{
            System.out.println("La cola esta llena");
        }
    }
    // inicio = 0        1,2,3,4,5              final=5

    public int eliminar(){
        int elemento=0;
        if(!esVacio()){
            ini++;
            elemento=cNum[ini];
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
            int elementoEliminado=0;
            System.out.println("Mostrando datos de la cola");
            Numeros aux= new Numeros(this.max);
            while(!esVacio()){
                elementoEliminado=eliminar();
                System.out.println("valor: " + elementoEliminado);
                aux.insertar(elementoEliminado);
            }
            vaciar(aux);
        }
    }
    public void vaciar(Numeros aux) {
        int elementoEliminado=0;
        while(!aux.esVacio()){
            elementoEliminado=aux.eliminar();
            insertar(elementoEliminado);
        }
    }
}
