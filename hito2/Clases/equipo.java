package Campeonato.Clases;

public class equipo {

    private String nombreEquipo;


    private String categoria;
    private jugador[] jugadores;

    public equipo(String nombreEquipo, String categoria,jugador[] jugadores){
        this.nombreEquipo = nombreEquipo;
        this.categoria = categoria;
        this.jugadores = jugadores;
    }

    public equipo(){
        jugador [] jugadores = new jugador[0];
        this.nombreEquipo = "";
        this.categoria = "";
        this.jugadores = jugadores;
    }


    public String getNombreEquipo(){
        return this.nombreEquipo;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public jugador[] getJugadores(){
        return this.jugadores;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setJugadores(jugador[] jugadores) {
        this.jugadores = jugadores;
    }
    public void mostarequipo(){
        System.out.println("MOSTRANDO DATOS DEL EQUIPO\n" );
        System.out.println("Nombre Equipo ; " + this.getNombreEquipo());
        System.out.println("categoria ; " +this.getCategoria() );

        for( int i=0; i< this.getJugadores().length; i++) {
            this.getJugadores()[i].mostrarJugador();
        }
    }
}


