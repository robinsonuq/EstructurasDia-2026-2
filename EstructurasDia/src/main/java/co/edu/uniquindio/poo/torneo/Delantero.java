package co.edu.uniquindio.poo.torneo;

public class Delantero implements Jugador {

    private int numeroGoles;

    @Override
    public int hacerGoless() {
        System.out.println("Hice gol");
        return 3;
    }

    @Override
    public int compareTo(Jugador o) {

        return 0;
    }
}
