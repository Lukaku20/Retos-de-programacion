

package com.mycompany.retos_ruleta_rusa;

import entidades.Jugador;
import entidades.Revolver;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import servicio.ServiceJuego;

public class Retos_ruleta_rusa {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("------Ruleta Rusa! ----");
        ServiceJuego rusa = new ServiceJuego();
        System.out.println("-----------------------");
        //crea el conjunto y el revolver
        Set<Jugador>jugadores = new HashSet<>();
        Revolver r = new Revolver();
        
        //iniciando el Juego.
        System.out.println(" ");
        System.out.println("Se debe llenar la carga del revolver: [•] ");
        r.llenarCarga();
        System.out.println(r.toString());
        System.out.println("Ahora, completemos el juego con los jugadores: ");
        rusa.llenarJuego(jugadores, r);
        rusa.pasaElQueSigue(jugadores, r);
        for (Jugador jugadore : jugadores) {
            if(jugadore.isMojado()){
                System.out.println("          I          ");
                System.out.println("---Presiona Enter----");
                System.out.println("El que la quedó fue: " + jugadore.toString());
                break;
        }
        }
        // Detecta que algun jugador haya sido mojado.

        Jugador jugadorMojado = null;

        for (Jugador jugador : jugadores) {
            if (jugador.isMojado()) {
                jugadorMojado = jugador;
                break;
            }
        }

        if (jugadorMojado != null) {
            // El jugador mojado se ha encontrado y se puede utilizar
        } else {
            // No se encontró ningún jugador mojado en el conjunto Set
        }
        if (jugadorMojado != null) {
            System.out.println("El que ha sido mojado fue: " + jugadorMojado.getNombre());
        } else {
            System.out.println("No se encontró ningún jugador mojado, se han salvado!");
        }
      
    }
}
