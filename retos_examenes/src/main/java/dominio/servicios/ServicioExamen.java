
package dominio.servicios;

import java.util.Scanner;
import dominio.Consigna;
import dominio.Examen;
import java.util.ArrayList;
/**
 * @author lukaku
 */
public class ServicioExamen {
    
    public static Scanner scan;

    public ServicioExamen() {
        
        scan = new Scanner(System.in).useDelimiter("\n");
    }
    public void cargarMateria(Examen ex){
        String materia = scan.next();
        ex.setMateria(materia);
    }
    public Consigna rellenarConsigna(){
        Consigna a1 = new Consigna();
        System.out.println("Formula la consigna (escribe tal cual) :");
        String consigna = scan.next();
        System.out.println("Tendras 4 opciones :");
      
        String[] opciones = new String[4]; 
        char on;
        System.out.println("Comienza a llenar las opciones");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println("La opcion " +(i+1));
            opciones[i] = (i+1)+"- "+ scan.next();
        }
        a1.setPregunta(consigna);
        a1.setOpciones(opciones);
        return  a1;
    }         
    
    public void enumerarlas(ArrayList<Consigna> vector){
        int i = 1;
        for (Consigna consigna : vector) {
            consigna.setNum(i);
            i++;
        }
    }      
          
    public void imprimirExamen(Examen fin){
        System.out.println(fin.toString());
    }
    
    
}
