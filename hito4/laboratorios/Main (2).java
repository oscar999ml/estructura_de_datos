
public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros(100);
        numeros.insertar(10);
        numeros.insertar(5);
        numeros.insertar(50);
        numeros.insertar(37);
        numeros.insertar(10);
        numeros.insertar(500);
        numeros.mostrar();

        Numeros numeros2= new Numeros(100);
        numeros2.insertar(11);
        numeros2.insertar(5);
        numeros2.insertar(51);
        numeros2.insertar(37);
        numeros2.insertar(11);
        numeros2.insertar(301);
        numeros2.mostrar();

     //   numeroMenor(numeros);
        //menorValorAlPrincipio(numeros);
     // EliminaRepetidos(numeros);
      //  elimiarRepetidos(numeros);
       // numeroMayorNUm(numeros2);
       // getmayor(numeros);
        intercambiarMayores(numeros,numeros2);
    }
    public static int numeroMenor(Numeros numeros){
        Numeros aux =new Numeros(100);
        int menor =100;
        int valorExtraidoDeLaPila=0;
        while(numeros.esVacio()==false ){
            valorExtraidoDeLaPila=numeros.eliminar();
            if (valorExtraidoDeLaPila<menor){
                menor=valorExtraidoDeLaPila;
            }
            aux.insertar(valorExtraidoDeLaPila);
        }
        numeros.vaciar(aux);
        System.out.println("\nEl numero menor es: " + menor);
        return menor;
    }
    public static void menorValorAlPrincipio(Numeros cola){
        int menorvalor =numeroMenor(cola);
        int valorEliminadodelacola;
        Numeros aux= new Numeros(100);
        while (!cola.esVacio()){
            valorEliminadodelacola = cola.eliminar();
            if(menorvalor !=valorEliminadodelacola){
                aux.insertar(valorEliminadodelacola);
            }
        }
        cola.insertar(menorvalor);
        cola.vaciar(aux);
        cola.mostrar();
    }
    public static int numeroMayorNUm(Numeros numeros) {
        Numeros aux = new Numeros(100);
        int menor = 0;
        int valorExtraidoDeLaPila = 0;
        while (numeros.esVacio() == false) {
            valorExtraidoDeLaPila = numeros.eliminar();
            if (valorExtraidoDeLaPila > menor) {
                menor = valorExtraidoDeLaPila;
            }
            aux.insertar(valorExtraidoDeLaPila);
        }
        numeros.vaciar(aux);
        System.out.println("\nEl numero mayor es: " + menor);
        return menor;
    }

    public static void getmayor(Numeros cola){
        int menorvalor =numeroMayorNUm(cola);
        int valorEliminadodelacola;
        Numeros aux= new Numeros(100);
        while (!cola.esVacio()){
            valorEliminadodelacola = cola.eliminar();
            if(menorvalor !=valorEliminadodelacola){
                aux.insertar(valorEliminadodelacola);
            }
        }
        cola.insertar(menorvalor);
        cola.vaciar(aux);
        cola.mostrar();
    }
    public static void elimiarrrrrRepetidos(Numeros numeros){
         Numeros aux =new Numeros(100);
        int igual=0;
        int woo= 100;
        while (numeros.esVacio()== false) {
            if (numeros == numeros) {
                numeros.eliminar();
            }
            numeros.insertar(numeros.eliminar());
        }
    }
    public static void EliminaRepetidosbefore(Numeros colass){
        int valorExtraidoDELACola= 0;
        int numelementos = colass.nroElementos();
        int i;
        Numeros aux = new Numeros(100);
        for ( i=1; i<= numelementos;i++){
            valorExtraidoDELACola = colass.eliminar();
            System.out.println("cola value: "+valorExtraidoDELACola);
            aux.insertar(valorExtraidoDELACola);
        }
        colass.vaciar(aux);
        colass.mostrar();
    }
    public static void EliminaRepetidos(Numeros colass){
        int valorExtraidoDELACola= 0;
        int numelementos = colass.nroElementos();
        int i;
        for ( i=1; i<= numelementos;i++){
            valorExtraidoDELACola = colass.eliminar();
          //  System.out.println("cola value: "+valorExtraidoDELACola);
            if(!verificarRepetido(valorExtraidoDELACola, colass)){
                // si el valor eliminado de la cola aun existe entonces eso valor se repite;
                colass.insertar(valorExtraidoDELACola);
            }

        }
        colass.mostrar();
    }
    public static boolean verificarRepetido(int numerobuscar, Numeros cola)
    {     int valorExtraidodelacola;
        int nroElemento= cola.nroElementos();
        int i;
        int repetidos=0;
        for(i=1; i<= nroElemento; i++){
            valorExtraidodelacola =cola.eliminar();
            if(numerobuscar == valorExtraidodelacola){
                repetidos=repetidos+1;
            }
          else {  cola.insertar(valorExtraidodelacola);
          }
        }
        if (repetidos>0){
            return true;
        }else {
            return false;
        }
    }
    public static void intercambiarMayores(Numeros colaA, Numeros colaB){
      int maxcolaA = numeroMayorNUm(colaA);
      int maxcolaB = numeroMayorNUm(colaB);
      //System.out.println(maxcolaA+maxcolaB);
        int nrmElementocolaA= colaA.nroElementos();
        int nroElementoB=colaB.nroElementos();
        int valorEliminado;

        for(int i=1;i<= nrmElementocolaA;i++){
            valorEliminado=colaA.eliminar();
            if(valorEliminado==maxcolaA){
                colaA.insertar(maxcolaA);
            }else {colaA.insertar(valorEliminado);}
        }
        for(int i=1;i<= nroElementoB;i++){
            valorEliminado=colaB.eliminar();
            if(valorEliminado==maxcolaB){
                colaB.insertar(maxcolaB);
            }else {colaB.insertar(valorEliminado);}
        }
        colaA.mostrar();
        colaB.mostrar();

    }
}
