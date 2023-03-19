
package entidades;

import java.util.HashSet;
import java.util.Set;



/**
 * @author lukaku
 */
public class Juego {
    
    Set<Jugador> jugadores =  new HashSet<>();;
    Revolver revol;

    public Juego() {
    }

    public Juego(Revolver revol) {
        this.revol = revol;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevol() {
        return revol;
    }

    public void setRevol(Revolver revol) {
        this.revol = revol;
    }

        
        
        
    }
    
  
   

