
package dominio;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author lukaku
 */
public class Examen {
    
    protected ArrayList<Consigna> vector;
    protected String materia;

    public Examen() {
    }

    public Examen(ArrayList<Consigna> vector, String materia) {
        this.vector = vector;
        this.materia = materia;
    }

    public ArrayList<Consigna> getVector() {
        return vector;
    }

    public void setVector(ArrayList<Consigna> vector) {
        this.vector = vector;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "             Examen de " + materia + "\n" +
                "Dia:    Mes:       Año:     \n" + 
                "Nombre del estudiante:             \n" + 
                "\n" + imprimirConsignas();
    }
    public String imprimirConsignas(){
        StringBuilder completo = new StringBuilder();
        for (Consigna consigna : vector) {
            completo.append(consigna.toString()).append("\n");
        }
        String result = completo.toString();
        return result;
    }
    public void revolverConsignas(ArrayList consignas){
        Collections.shuffle(consignas);
    }
    
}
