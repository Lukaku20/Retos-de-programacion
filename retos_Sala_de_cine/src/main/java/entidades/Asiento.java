
package entidades;

/**
 * @author lukaku
 */
public class Asiento {
    
  
    public String fila;
    public int numero;
    public boolean ocupado;
    public Espectador concurcine;

    public Asiento(String fila, int numero, boolean ocupado, Espectador concurcine) {
        this.fila = fila;
        this.numero = numero;
        this.ocupado = ocupado;
        this.concurcine = concurcine;
    }

    public Asiento(String fila, int numero, boolean ocupado) {
        this.fila = fila;
        this.numero = numero;
        this.ocupado = ocupado;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Espectador getConcurcine() {
        return concurcine;
    }

    public void setConcurcine(Espectador concurcine) {
        this.concurcine = concurcine;
    }
    
    public Asiento(String fila, int numero) {
        this.fila = fila;
        this.numero = numero;
        this.ocupado = false;
    }
    
    public String getAsiento() {
        return fila + " - " + numero;
    }
    
    public void ocupar() {
        this.ocupado = true;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    public boolean estaOcupado() {
        return ocupado;
    }

    
    @Override
    public String toString() {
        if(isOcupado()){
            return "|" + fila +" "+ numero  + "X|";
        }
        else{
            return "|" + fila +" "+ numero  + " |";
        }
        
    }
    
}
    
    

