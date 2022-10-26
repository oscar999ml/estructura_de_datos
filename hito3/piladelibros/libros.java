package piladelibros;

public class libros {
    private String titulo;
    private String autor;
    private int nropag;
    private double precio;
    private String categoria;

    public libros(String titulo,String autor,  int nropag,  double precio, String categoria){
        this.titulo = titulo;
        this.autor = autor;
        this.nropag = nropag;
        this.precio = precio;
        this.categoria = categoria;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNropag() {
        return nropag;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNropag(int nropag) {
        this.nropag = nropag;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void mostrarlibro(){
        System.out.println("\nmostrando LIBRO");
        System.out.println("titulo:" + this.getTitulo());
        System.out.println("autor:" + this.getAutor() );
        System.out.println("nropag:" + this.getNropag());
        System.out.println("precio:" + this.getPrecio());
        System.out.println("categoria:" + this.getCategoria());
    }
}

