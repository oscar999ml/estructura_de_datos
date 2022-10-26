package piladelibros;

public class Main {
    public static void main(String[] args) {
        libros lib1 = new libros("odisea", "homero", 40, 20.50, "novela");
        libros lib2 = new libros("obra I", "saul", 58, 30.50, "base de datos");
        libros lib3 = new libros("obra II", "ana", 60, 40.50, "base de datos");
        libros lib4 = new libros("progra intro", "micaela", 200, 10.50, "logica");
        libros lib5 = new libros("analisis y diseño", "juan", 40, 20.50, "analisis");

        piladelibros pilalibros = new piladelibros(10);
        pilalibros.adicionar(lib1);
        pilalibros.adicionar(lib2);
        pilalibros.adicionar(lib3);
        pilalibros.adicionar(lib4);
        pilalibros.adicionar(lib5);

        //pilalibros.mostrar();
        librosPaginasMayor50(pilalibros, 50);
        cambiasentido(pilalibros );
    }
    //determinar cuantos libros una cantidad de paginas mayor a 50\\
    public static void librosPaginasMayor50(piladelibros pila, int cantidad){
        piladelibros aux = new piladelibros(10);
        libros libroeliminado = null;
        int mayores = 0;

        while (!pila.esVacio()){
            libroeliminado = pila.eliminar();
            if (libroeliminado.getNropag() > cantidad){
                mayores = mayores + 1;
            }
            aux.adicionar(libroeliminado);
        }
        pila.vaciar(aux);
        System.out.println("cantidad mayor a 50 es: " + mayores );
    }
    //cambiar el sentido de los items
    public static void cambiasentido(piladelibros pila){
        piladelibros aux = new piladelibros(10);
        libros ultimolibroeliminado = pila.eliminar();
        libros libroeliminado = null;
        libros primerlibroeliminado = null;
        while (!pila.esVacio()) {
            libroeliminado = pila.eliminar();
            aux.adicionar(libroeliminado);
        }
        primerlibroeliminado = aux.eliminar();
        aux.adicionar(ultimolibroeliminado);
        pila.adicionar(primerlibroeliminado);
        pila.vaciar(aux);
        pila.mostrar();
        }
    }

