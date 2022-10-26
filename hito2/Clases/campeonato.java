package Campeonato.Clases;

public class campeonato {
    private String nombreCampeonato;
    private equipo[] equipos;

    public campeonato(String nombreCampeonato, equipo[] equipos){
        this.nombreCampeonato= nombreCampeonato;
        this.equipos= equipos;
    }

    public String getNombreCampeonato() {
        return this.nombreCampeonato;
    }

    public equipo[] getEquipos() {
        return this.equipos;
    }

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    public void setEquipos(equipo[] equipos) {
        this.equipos = equipos;
    }
    public void mostrarCampeonato(){
        System.out.println("MOSTRANDO DATOS DEL campeonato" );
        System.out.println("Nombre campeonato; " + this.getNombreCampeonato());

        for( int i=0; i< this.getEquipos().length; i++) {
            this.getEquipos()[i].mostarequipo();
        }

    }
}
