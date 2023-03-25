package entidades;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author lukaku
 */
public class Cine {
    
    protected Pelicula pelicula;
    protected Asiento[][] sala;
    protected int entrada;
    protected Set<Espectador> publico;

    public Cine(Pelicula pelicula, Asiento[][] sala, int entrada, Set<Espectador> publico) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.entrada = entrada;
        this.publico = publico;
    }

    public Set<Espectador> getPublico() {
        return publico;
    }

    public void setPublico(Set<Espectador> publico) {
        this.publico = publico;
    }

    public Cine() {
    }

    public Cine(Pelicula pelicula, Asiento[][] sala, int entrada) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.entrada = entrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.pelicula);
        hash = 83 * hash + Arrays.deepHashCode(this.sala);
        hash = 83 * hash + this.entrada;
        hash = 83 * hash + Objects.hashCode(this.publico);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cine other = (Cine) obj;
        if (this.entrada != other.entrada) {
            return false;
        }
        if (!Objects.equals(this.pelicula, other.pelicula)) {
            return false;
        }
        if (!Arrays.deepEquals(this.sala, other.sala)) {
            return false;
        }
        return Objects.equals(this.publico, other.publico);
    }


    @Override
    public String toString() {
        return "En el cine estan pasando: '" + pelicula +  "'\n" +
                "Entrada: $ " + entrada +"|";
    }
    
}
