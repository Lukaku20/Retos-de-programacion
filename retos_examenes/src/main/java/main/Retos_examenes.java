
package main;

import dominio.Consigna;
import dominio.Examen;
import dominio.servicios.ServicioExamen;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lukaku
 */
public class Retos_examenes {

    public static void main(String[] args) {
        ArrayList<Consigna> lasConsignas=new ArrayList<>();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ServicioExamen ela = new ServicioExamen();
        System.out.println(" ");
        System.out.println("Bienvenido al editor de examenes: ");
        System.out.println("La función de este programa es construir el texto que figure" +"\n"+
                "en un examen, ordenarlo y reordenarlo las veces que quieras. Luego, con "+"\n"+
                "el texto escrito, lo copias y lo pegas en un Editor de texto para darle "+"\n"+
                "forma terminada"+ "\n");
        System.out.println(" ");
        Examen nuevo = new Examen();
        System.out.println("Responde: ¿De que materia es el examen?");
        ela.cargarMateria(nuevo);
        System.out.println("Responde: ¿Cuantas preguntas tiene tu examen?");
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            Consigna con = ela.rellenarConsigna();
            lasConsignas.add(con);
        }
        ela.enumerarlas(lasConsignas);
        nuevo.setVector(lasConsignas);
        
        ela.imprimirExamen(nuevo);
        boolean salir = false;
        int re;
        do{ System.out.println("¡¿Deseas reordenar el examen?!");
            System.out.println("1. si lo deseas.");
            System.out.println("2. si no lo prefieres");
            re = scan.nextInt();
            if(re!=1){
                salir = true;
            } else {
                ArrayList copia = new ArrayList(nuevo.getVector());
                nuevo.revolverConsignas(copia);
                ela.enumerarlas(copia);
                nuevo.setVector(copia);
                ela.imprimirExamen(nuevo);
            }
            
        }while(!salir);
        
        System.out.println(" ");
        System.out.println("Perfecto, has utilizado "+"\n"+
                "un software para tomar exámenes.");
        }
        
    }

