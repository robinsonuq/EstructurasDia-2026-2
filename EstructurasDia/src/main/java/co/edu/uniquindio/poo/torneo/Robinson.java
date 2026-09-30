package co.edu.uniquindio.poo.torneo;

public class Robinson implements Jugador{
    @Override
    public int hacerGoless() {
        return 1;
    }

    @Override
    public int compareTo(Jugador o) {
        return 0;
    }
}
