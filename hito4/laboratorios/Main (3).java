package defensa_colas_hito4;

import static defensa_colas_hito4.Cliente.*;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("kevin","mamani",22,"bolivia","masculino","VIP");
        Cliente c2 = new Cliente("frdddy","machaca",20,"bolivia","masculino","silver");
        Cliente c3 = new Cliente("marcos","machicado",22,"bolivia","masculino","Gold");
        Cliente c4 = new Cliente("joel","ceballos",21,"bolivia","masculino","silver");
        Cliente c5 = new Cliente("andres","lopez",20,"bolivia","masculino","VIP");

        ColaClientes estu=new ColaClientes(10);
        estu.insertar(c1);
        estu.insertar(c2);
        estu.insertar(c3);
        estu.insertar(c4);
        estu.insertar(c5);



        Cliente cf1 = new Cliente("kevin","mamani",22,"bolivia","masculino","VIP");
        Cliente cf2 = new Cliente("frdddy","machaca",20,"bolivia","masculino","silver");
        Cliente cf3 = new Cliente("marcos","machicado",22,"bolivia","masculino","Gold");
        Cliente cf4 = new Cliente("joel","ceballos",21,"bolivia","masculino","silver");
        Cliente cf5 = new Cliente("andres","lopez",20,"bolivia","masculino","VIP");

        ColaClientes estu2=new ColaClientes(10);
        estu2.insertar(cf1);
        estu2.insertar(cf2);
        estu2.insertar(cf3);
        estu2.insertar(cf4);
        estu2.insertar(cf5);

       // estu.mostrar();
        boliviaVIP(estu);
    }
    public static void boliviaVIP( ColaClientes clientes ){
        ColaClientes aux = new ColaClientes(100);
        Cliente cli = null;
        while (!clientes.esVacio() ){
            cli= clientes.eliminar();
            if( cli.getTipo()=="Gold"&& cli.getPais()=="bolivia" ) {
                Cliente.setTipo("VIP");
            }
            aux.insertar(cli);
        }
        aux.vaciar(clientes);
        aux.mostrar();
    }








    //obtener el numero menor de la cola
//    public static int numeroMenor(ColaClientes ejemplo1) {
//        ColaClientes aux = new ColaClientes (100);
//        int menor;
//        int valorExtraido = null;
//        while (!ejemplo1.esVacio()) {
//          valorExtraido =  ejemplo1.eliminar().getEdad();
//            valorExtraido = ejemplo1.eliminar();
//            if (valorExtraido < menor) {
//                menor = valorExtraido;
//            }
//            aux.insertar(valorExtraido);
//        }
//        ejemplo1.vaciar(aux);
//        System.out.println("el numero menor: "+menor);
//        return  menor;
//    }
//    //mover el menor valor al principio
//    public static void menorValorAlPrincipio(Colas ejemplo1){
//        int menorValor=numeroMenor(ejemplo1);
//        int valorEliminado=0;
//        Colas aux = new Colas(100);
//        while (!ejemplo1.esVacio()){
//            valorEliminado=ejemplo1.eliminar();
//            if(menorValor != valorEliminado){
//                aux.adicionar(valorEliminado);  //guarda la informacion antes de ser borrado
//            }
//        }
//
//        ejemplo1.adicionar(menorValor);
//        ejemplo1.vaciar(aux);
//        ejemplo1.mostrar();
//    }

}
