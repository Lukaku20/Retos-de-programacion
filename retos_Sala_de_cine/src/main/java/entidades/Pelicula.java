
package entidades;

/**
 *
 * @author lukaku
 */
public class Pelicula {
   
    public String titulo;
    private long duracion;
    private String director;
    private int edadMinima;

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getDuracion() {
        return duracion;
    }

    public void setDuracion(long duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public Pelicula(String titulo, long duracion, String director, int edadMinima) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return  titulo + ". Duración: " + duracion + "min. "+"\n" +
                "Director: " + director + ", Edad minima requerida: " + edadMinima ;
    }
    
}
