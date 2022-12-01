package defensa_colas_hito4;

public class Cliente {
    public String nombres;
    public String apellidos;
    public int edad;
    public String pais;
    public String genero;
    public String tipo;

    public Cliente(String nombres, String apellidos, int edad, String pais, String genero, String tipo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.pais = pais;
        this.genero = genero;
        this.tipo = tipo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getPais() {
        return pais;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarCliente(){
        System.out.println("\n cliente  ");
        System.out.println(" nombre "+ this.nombres);
        System.out.println("apellido "+this.apellidos);
        System.out.println("edad "+ this.edad);
        System.out.println("pais "+this.pais);
        System.out.println("genero "+ this.genero);
        System.out.println("tipo "+this.tipo);
    }
}
