package DefensaPilasHito3;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private int edad;
    private String sede;
    private int  notafial;
    private String Ci;

    public Estudiante(String nombres, String apellidos, int edad, String sede, int notafial, String ci) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sede = sede;
        this.notafial = notafial;
        this.Ci = ci;
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

    public String getSede() {
        return sede;
    }

    public int getNotafial() {
        return notafial;
    }

    public String getCi() {
        return Ci;
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

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setNotafial(int notafial) {
        this.notafial = notafial;
    }

    public void setCi(String ci) {
        Ci = ci;
    }
    public void mostrarEstudiante (){
        System.out.println("\nmostrando estudiante");
        System.out.println("nombre: " + this.getNombres());
        System.out.println("apellido: " + this.getApellidos() );
        System.out.println("edad: " + this.getEdad());
        System.out.println("sede: " + this.getSede());
        System.out.println("notaFInal: " + this.getNotafial());
        System.out.println("ci: " + this.getCi());
    }
}
