
package servicio;

import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lukaku
 */
public class ServiceJuego {
     Scanner scan =new Scanner(System.in).useDelimiter("\n");;
     Juego nuevo = new Juego();
    
// llenarJuego(Hashset<Jugador>jugadores, Revolver r): este método recibe los jugadores
// y el revolver para guardarlos en los atributos del juego.
    
    public void llenarJuego(Set<Jugador>jugadores, Revolver r){
       int numero = 6;//por defecto
       boolean valido=false;
        do{
            System.out.println(" ");
            System.out.println("¿Cuantos jugadores desean participar?");
            try {
                numero = scan.nextInt();
                if(numero>=1&&numero<=6){
                    valido =true;
                } else{
                    System.out.println("El numero debe ser entr 1 y 6. Intente nuevamente");
                }
                
            } catch(InputMismatchException e){
                System.out.println("Debe ingresar un numero ingreselo nuevamente.");
                scan.next();
            }
        }while(!valido);
        //crear los jugadores:
        for (int i = 0; i < numero; i++) {
            jugadores.add(crearJugador());
            
        }
        nuevo.setJugadores(jugadores);
        
        
        //crear el revolver
        nuevo.setRevol(r);

    }
     public Jugador crearJugador(){
        Jugador py = new Jugador();
        Random rand = new Random();
        int id = rand.nextInt(9999);
        
        System.out.println("Nombre: ");
        String nombre = scan.next();
        System.out.println("Recibio ID: " + id);
        py.setId(id);
        py.setMojado(false);
        py.setNombre(nombre);
        return py;
    }
     
     public void ronda(Jugador uno, Revolver dos)throws InterruptedException{
         long velocidad=2000;
         System.out.println("El disparo lo ejecuta: "+ uno.getNombre());
         Thread.sleep(velocidad);
         if (uno.disparo(dos)) {
             System.out.println("--> Ha sido mojado: " +uno.getNombre() + " ha perdido.");
             Thread.sleep(velocidad);
         } else {  
             System.out.println("El disparo no ha salido! ");
             Thread.sleep(velocidad);
             dos.siguienteChorro();
         }
         
     }
    
     
     public void pasaElQueSigue(Set<Jugador> jugadores, Revolver revol) throws InterruptedException{
         
         //revol.llenarCarga();
         
         for (Jugador jugadore : jugadores) {
             ronda(jugadore, revol);
            // Salir del bucle si un jugador está mojado
            if(jugadore.isMojado()){
                break;
            }
            
             
         }
     }
}
