
package servicio;

import entidades.Asiento;
import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author lukaku
 */
public class ServiceCine { 
    
    String [] letras ={"A","B","C","D","E","F","G","H"};
    Iterator it;
    
    public void enumerarAsientos(Asiento[][]sala){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                sala[i][j]=new Asiento(determinarFila(i), (j+1), false);
            }
        }
        
    }
    public String determinarFila(int i){
        switch(i){
            case 0: 
                return "A";
            case 1: 
                return "B";
            case 2: 
                return "C";
            case 3: 
                return "D";
            case 4:
                return "E";
            case 5:
                return "F";
            case 6:
                return "G";
            case 7:
                return "H";

        }
        return "";
    }
    
    public void imprimirSala(Asiento[][]sala){
        System.out.println(" ");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(sala[i][j].toString());
            }   
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    
    public void cargarListado(ArrayList<Pelicula> peliculas){
        peliculas.add(new Pelicula("Avatar", 270, "Jaime Camaron", 14));
        peliculas.add(new Pelicula("Pachon de Cristo", 180, "Miel Gibson", 18));
        peliculas.add(new Pelicula("Los vengadores",110, "Nito Estank", 8));
        peliculas.add(new Pelicula("Pulpo ficcion", 140, "Muy muy malo", 14));
    }
    
    public Pelicula elegirPeli(ArrayList<Pelicula> peliculas){
        // Elegimos una película al azar
        Random rand = new Random();
        Pelicula peliculaElegida = peliculas.get(rand.nextInt(peliculas.size()));
        
        // Mostramos la película elegida
        System.out.println("La película elegida es: " + peliculaElegida.titulo);
        return peliculaElegida;
    }
    
    public int precioEntrada(){
        Random rand = new Random();
        return rand.nextInt(30) + 30;
    }
    //Crear los espectadores.
    public Set<Espectador> crearEspectador(Set<Espectador> publico){
        
        String[] nombres="berta andy julian javi june abril morena cale figueroa bosta pirulo mandibulin felice locomotora veruta anaquel monoloco ave pollo gaviota morcilla cuchillo rabanito brocoli uva".split(" ");
        //pasar la primera letra a mayus.
        for (int i = 0; i < nombres.length; i++) {
            String primeraLetra = nombres[i].substring(0,1).toUpperCase();
            String resto = nombres[i].substring(1);
            nombres[i]= primeraLetra + resto;
        }
        Random rand = new Random();
        Espectador[] espectadores;
        
        espectadores = new Espectador[nombres.length];
        
        for (int i = 0; i < nombres.length; i++) {
            int edad = rand.nextInt(50) + 6; // asignamos una edad entre 6 y 55
            int dinero = rand.nextInt(50) + 50; // asignamos una cantidad de dinero entre 50 y 100
            
            espectadores[i] = new Espectador(nombres[i], edad, dinero);
        }
        //agregar el vector al conjunto de espectadores.
        publico.addAll(Arrays.asList(espectadores));
        return publico;
    }
   
            
    public ArrayList<Espectador> venderEntradas(Set<Espectador> publico, Cine paradiso, Asiento [][] sala){
        Random rand = new Random();
        ArrayList<Espectador> concurrentes= new ArrayList<>();
        for (Espectador espectador : publico) {
            boolean valido = false;
            while (!valido) {
                // Verificamos si el espectador tiene suficiente dinero para pagar la entrada
                if ((!espectador.tieneDineroSuficiente(paradiso.getEntrada()))||(paradiso.getPelicula().getEdadMinima()>espectador.getEdad())){
                    break;
                } else {
                    int a = rand.nextInt(6);
                    int b = rand.nextInt(8);
                    String be = determinarFila(b);
//                Verificamos que no este el asiento ocupado

                    if (sala[b][a].isOcupado()) {
                        valido = false;

                    } else {
//                  vendemos la entrada:
                    // restar el dinero de la entrada
                        espectador.setDinero(espectador.getDinero() - paradiso.getEntrada());
                        // validar para terminar el bucle
                        valido = true;
                        //ocupar ese asiento
                        sala[b][a].setOcupado(valido);
                        //agregar el espectador
                        sala[b][a].setConcurcine(espectador);
                        //darle al espectador el asiento
                        espectador.setEntrada(sala[b][a]);
                        //agregarlo a la lista de concurrentes
                        concurrentes.add(espectador);
                    }    
                    }
                }
            }
            return concurrentes;
        }
    public void imprimirConcurrentes(Set<Espectador> publico){
        int num=0;
        for (Espectador espectador : publico) {
            num++;
            System.out.println(num +". " + espectador.getEntrada() + " " + espectador.toString());
            
        }
    }
    }        
       
    

            
        
        
        