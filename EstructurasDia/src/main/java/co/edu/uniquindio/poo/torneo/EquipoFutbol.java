package co.edu.uniquindio.poo.torneo;

import java.util.ArrayList;

public class EquipoFutbol {

    private ArrayList<Jugador> listasJugadores = new ArrayList<>();

    public void add(Jugador jugador){
        listasJugadores.add(jugador);
    }


    public void iniciarPartido(){
        System.out.println("Inicio el partido");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        listasJugadores.get(1).hacerGoless();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        listasJugadores.get(0).hacerGoless();


    }

}
