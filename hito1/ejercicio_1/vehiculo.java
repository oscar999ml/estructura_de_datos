package ejercicio1;

public class vehiculo {
    // atributos de la clase
    private String nombre;
    private String color;
    private String modelo;
    private String tamano;
    private String marca;

    public vehiculo() {
        System.out.println("soy el constructor");
    }
    public vehiculo(String nom,String col,String mod,String tam,String mar){
        this.nombre = nom;
        this.color = col;
        this.tamano = tam;
        this.marca = mar;
        this.modelo = mod;
    }

    public void  Mover (){
        System.out.println("soy el metodo mover");
    }

    public void frenar (){
        System.out.println("soy el metodo frenar");
    }
    public void girar_a_la_derecha(){
        System.out.println("girar_a_la_derecha");
    }
    public void girar_a_la_izquierda(){
        System.out.println("girar_a_la_izquierda");
    }
    public void cambiar_de_carril (){
        System.out.println("cambiar_de_carril");
    }
    public void mostrar(){
        System.out.println("nombre = " + this.nombre);
        System.out.println("color = " + this.color);
        System.out.println("tamano = " + this.tamano);
        System.out.println("marca = " + this.marca);
        System.out.println("modelo = " + this.modelo);
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setColor(String camValor) {
        this.color = camValor;
    }
}
