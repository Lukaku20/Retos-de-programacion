
package entidades;

/**
 *
 * @author lukaku
 */
public class Espectador {
    
    private String nombre;
    private int edad;
    private int dinero;
    public Asiento entrada;

    public Asiento getEntrada() {
        return entrada;
    }

    public void setEntrada(Asiento entrada) {
        this.entrada = entrada;
    }

    public Espectador(Asiento entrada) {
        this.entrada = entrada;
    }

    public Espectador(String nombre) {
        this.nombre = nombre;
    }

    public Espectador(String nombre, int edad, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public Espectador(String nombre, int edad, int dinero, Asiento entrada) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.entrada = entrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    public boolean tieneDineroSuficiente(int precioEntrada) {
    return dinero > precioEntrada;
    }


    @Override
    public String toString() {
        return  nombre + " " + edad +" años." + " - Plata restante $" + dinero
                ;
    }
    
}
