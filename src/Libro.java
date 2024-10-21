public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean prestado;

    public Libro(String titulo,String autor, int anioPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
        this.prestado=false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    public void cambiarEstado() {
        this.prestado = !this.prestado; // Cambia el estado entre disponible y prestado
    }
    public void mostrarInformacion() {
        String estado = prestado ? "Prestado" : "Disponible";
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("Estado: " + estado);
    }
}
