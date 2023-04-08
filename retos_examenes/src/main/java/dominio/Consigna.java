
package dominio;

import java.util.Arrays;

/**
 * @author lukaku
 */
public class Consigna {
    
    protected String pregunta;
    protected String[] opciones;
    protected int num;

    public Consigna() {
    }

    public Consigna(String pregunta, String[] opciones, int num) {
        this.pregunta = pregunta;
        this.opciones = opciones;
        this.num = num;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num +") "+ pregunta + "\n" 
                + Arrays.toString(opciones) +"\n";
    }
    
}
