
package entidades;

/**
 * @author lukaku
 */
public class Jugador {
    
    
    int id;
    String nombre;
    boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public boolean disparo(Revolver r) {
     
        mojado = r.mojar(r);
    
        return mojado;
    }

    @Override
    public String toString() {
        return "" + nombre + "- Mojado:" + mojado + '\n'+
                "Id: " + id;
    }
}
