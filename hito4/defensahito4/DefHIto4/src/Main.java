public class Main {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("kevin", "mamani", 22, "Bolivia", "Masculino", "SILVER");
        Cliente cl2 = new Cliente("saul", "laura", 17, "Bolivia", "Masculino", "GOLD");
        Cliente cl3 = new Cliente("justina", "mamani", 37, "Peru", "Femenino", "VIP");
        Cliente cl4 = new Cliente("willy", "fabian", 35, "Ecuador", "Masculino", "GOLD");
        Cliente cl5 = new Cliente("miguel", "herera", 62, "Brazil", "Masculino", "VIP");

        ColaClientes Cola = new ColaClientes(100);
        Cola.adicionar(cl1);
        Cola.adicionar(cl2);
        Cola.adicionar(cl3);
        Cola.adicionar(cl4);
        Cola.adicionar(cl5);


        Cliente cl6 = new Cliente("hanabi", "fokito", 23, "China", "Femenino", "SILVER");
        Cliente cl7 = new Cliente("baxia", "lopez", 36, "Bolivia", "Masculino", "GOLD");
        Cliente cl8 = new Cliente("jhonson", "fugimori", 22, "Peru", "Masculino", "VIP");
        Cliente cl9 = new Cliente("martis", "rodrigues", 18, "mexico", "Masculino", "GOLD");
        Cliente cl10 = new Cliente("rafaela", "marick", 37, "francia", "Femenino", "VIP");

        ColaClientes Cola2 = new ColaClientes(100);
        Cola2.adicionar(cl6);
        Cola2.adicionar(cl7);
        Cola2.adicionar(cl8);
        Cola2.adicionar(cl9);
        Cola2.adicionar(cl10);


       // camVIPbolivia(Cola, "Bolivia", "GOLD", "VIP");
        // mayoresalInicio(Cola, 60);
        CambiarSaul(Cola,Cola2, "saul");

    }


    //          camVIPbolivia(Cola, "Bolivia", "GOLD","VIP");
    public static void camVIPbolivia(ColaClientes cola, String p, String t,String nt) {
        ColaClientes aux = new ColaClientes(10);
        Cliente Valorextraido = null;
        while (!cola.esVacia()) {
            Valorextraido = cola.eliminar();
            if (Valorextraido.getPais().equals(p) && Valorextraido.getTipo().equals(t)) {
                Valorextraido.setTipo(nt);
            }
            aux.adicionar(Valorextraido);
        }
        cola.vaciar(aux);
        cola.mostrar();
    }

    //           60
    public static void mayoresalInicio(ColaClientes cola, int edad60) {
        ColaClientes aux = new ColaClientes(100);
        ColaClientes aux2 = new ColaClientes(100);
        Cliente Valorextraido = null;
        while (!cola.esVacia()) {
            Valorextraido = cola.eliminar();
            if (Valorextraido.getEdad() >= edad60) {
                aux2.adicionar(Valorextraido);
            }
            if(Valorextraido.getEdad()<= edad60){
                aux.adicionar(Valorextraido);
            }
        }
        cola.vaciar(aux2);
        cola.vaciar(aux);
        cola.mostrar();
    }

           //CambiarSaul(Cola,Cola2, "saul");
    public static void CambiarSaul(ColaClientes colaA, ColaClientes colaB,String Nombre) {
        int nroElemColaA = colaA.nroElem();
        int nroElemColaB = colaB.nroElem();
        ColaClientes aux = new ColaClientes(100);
        ColaClientes aux2 = new ColaClientes(100);

        Cliente valorEliminado = null;
        for (int i = 1; i <= nroElemColaA; i++) {
            valorEliminado = colaA.eliminar();
            if (valorEliminado.getNombres().equals(Nombre)) {
                colaB.adicionar(valorEliminado);
            }
            if (!valorEliminado.getNombres().equals(Nombre)){
                colaA.adicionar(valorEliminado);
            }
        }
        for (int i = 1; i <= nroElemColaB; i++) {
            valorEliminado = colaB.eliminar();
            if (valorEliminado.getNombres().equals(Nombre)) {
                colaB.adicionar(valorEliminado);
            }
            if (!valorEliminado.getNombres().equals(Nombre))  {
                aux2.adicionar(valorEliminado);
            }
        }
        colaA.vaciar(aux);
        colaB.vaciar(aux2);
        colaA.mostrar();
        colaB.mostrar();
    }
}