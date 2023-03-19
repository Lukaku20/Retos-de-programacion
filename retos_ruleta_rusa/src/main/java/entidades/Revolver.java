
package entidades;

/**
 *
 * @author lukaku
 */
import java.util.Random;

public class Revolver {
 
    int posicionActual;
    int posicionCarga;

    public Revolver() {
        
    }

    public Revolver(int posicionActual, int posicionCarga) {
        this.posicionActual = posicionActual;
        this.posicionCarga = posicionCarga;
    }
    
    public void llenarCarga(){
       
        Random rand = new Random();
        posicionActual = rand.nextInt(6);

        Random randy = new Random();
        posicionCarga = randy.nextInt(6);

    
        System.out.println("La carga ha sido realizada con exito");
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionCarga() {
        return posicionCarga;
    }

    public void setPosicionCarga(int posicionCarga) {
        this.posicionCarga = posicionCarga;
    }

    
    public boolean mojar(Revolver x){
        return x.getPosicionActual()==x.getPosicionCarga();
    }
    
    public void siguienteChorro(){
        if(posicionActual!=0){
            posicionActual--;
        } else {
            posicionCarga = 5;
        }
    }

    @Override
    public String toString() {
        return "Revolver: " + " Posicion: " + posicionActual + " Carga: " + posicionCarga + '}';
    }
    
}
