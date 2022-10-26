package Campeonato.Clases;

public class jugador {
    private String apellidos;
    private String ci;
    private int edad;
    private String NombreCompleto;

    public jugador(String NombreCompleto, String apellidos, String ci, int edad)
    { this.NombreCompleto = NombreCompleto;
        this.apellidos = apellidos;
        this.ci = ci;
        this.edad = edad;
    }
    //constructor que no recibe parametros//

    public jugador(){
        this.NombreCompleto ="";
        this.apellidos ="";
        this.ci = "";
        this.edad =0;

    }
    public String getNombreCompleto()
    {
     return this.NombreCompleto;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public String getCi(){
        return this.ci;
    }
    public int getedad(){
        return this.edad;
    }
    public void setNombreCompleto(String nuevoNombre){
        this.NombreCompleto = nuevoNombre;
    }
    public void setApellidos(String nuevoApellido){
        this.apellidos = nuevoApellido;
    }
    public void setCi (String nuevoCi){
        this.ci = nuevoCi;
    }
    public  void setEdad(int nuevaEdad){
        this.edad = nuevaEdad;
    }
    public void mostrarJugador(){
        System.out.println("\nMOSTRANDO DATOS DEL JUGADOR" );
        System.out.println("Nombre jugador; " + this.getNombreCompleto());
        System.out.println("Apellidos jugadores; " +this.getApellidos() );
        System.out.println("ci jugador: " +this.getCi());
        System.out.println("edad jugador:  " +this.getedad() );
    }
}
