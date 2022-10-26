package DefensaPilasHito3;

public class Main {
    public static void main(String[]args){
        Estudiante est1 = new Estudiante("cristian", "legolas", 40, "lp", 90,"34365414lp");
        Estudiante est2 = new Estudiante("kevin", "saraga", 58, "chb", 80,"7238489chb");
        Estudiante est3 = new Estudiante("beymar", "gomez", 60, "sz", 60,"762345876sz");
        Estudiante est4 = new Estudiante("andres", "rojas", 20, "sz", 58,"967834695sz");
        Estudiante est5 = new Estudiante("ana", "laura", 40, "lp", 96,"626525258lp");

        PilaDeEstudiantes pilaEstudiantes = new PilaDeEstudiantes(10);
        pilaEstudiantes.adicionar(est1);
        pilaEstudiantes.adicionar(est2);
        pilaEstudiantes.adicionar(est3);
        pilaEstudiantes.adicionar(est4);
        pilaEstudiantes.adicionar(est5);

    //pilaEstudiantes.mostrar();
       // cambiaorden(pilaEstudiantes,4);
        //notamayor50(pilaEstudiantes,51);
        kesimo(pilaEstudiantes,2 );
    }
    public static void notamayor50(PilaDeEstudiantes pila, int cantidad){
       PilaDeEstudiantes aux = new PilaDeEstudiantes(10);
        Estudiante notaEstudiante = null;
        Estudiante notaEstudiantes = null;
        int mayores = 0;

        while (!pila.esVacio()){
            notaEstudiante = pila.eliminar();

            if (notaEstudiante.getNotafial() > cantidad && notaEstudiante.getSede()=="lp"){
                mayores = mayores + 1;
            }
            aux.adicionar(notaEstudiante);
        }

        pila.vaciar(aux);
        System.out.println("cantidad mayor a 51 es: " + mayores + " ");
    }




    public static void cambiaorden(PilaDeEstudiantes pila, int tope){
        PilaDeEstudiantes aux = new PilaDeEstudiantes(10);
        Estudiante ultimoEstliminado = pila.eliminar();
        Estudiante esteliminado= null;
        Estudiante primerlibroeliminado = null;
        while (!pila.esVacio()) {
            esteliminado = pila.eliminar();
            aux.adicionar(esteliminado);
        }
        primerlibroeliminado = aux.eliminar();
        aux.adicionar(ultimoEstliminado);
        pila.adicionar(primerlibroeliminado);
        pila.vaciar(aux);
        pila.mostrar();
    }
//private static void cambiaorden(PilaDeEstudiantes nombresEDD, String Estudiante)
//{
//    PilaDeEstudiantes aux = new PilaDeEstudiantes(10);
//    String valorDeLaPila = "";
//
//    while(nombresEDD.esVacio()== false)
//    {
//        valorDeLaPila = nombresEDD.eliminar();
//
//        aux.adicionar(valorDeLaPila);
//
//    }
//    aux.adicionar(Estudiante);
//    nombresEDD.vaciar(aux);
//    nombresEDD.mostrar();
//}
public static void kesimo(PilaDeEstudiantes pila , int valorkesimo){
    PilaDeEstudiantes aux = new PilaDeEstudiantes(10);
    Estudiante valor = null;

    while (pila.esVacio() == false){
        if (pila.nroElementos() != valorkesimo){
            aux.adicionar(pila.eliminar());
        } else {
            valor = pila.eliminar();
        }
    }
    pila.vaciar(aux);
    pila.adicionar(valor);
    pila.mostrar();
}
//    public static void menornota(PilaDeEstudiantes pila , int valorkesimo){
//        PilaDeEstudiantes aux = new PilaDeEstudiantes(10);
//        Estudiante valor = null;
//
//        while (pila.esVacio() == false){
//            valor= pila.eliminar();
//            if (pila.nroElementos() != valorkesimo && getNotafial<51){
//
//                aux.adicionar(pila.eliminar());
//            } else {
//                valor = pila.eliminar();
//            }
//            aux.adicionar(valor);
//        }
//        pila.vaciar(aux);
//        pila.adicionar(valor);
//        pila.mostrar();
//    }

    // Mover a la base con menor nota

}


