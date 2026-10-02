package co.edu.uniquindio.poo.almacenamiento;



public class Manzana implements Producto {

    private double peso;

    public Manzana(double peso) {
        this.peso = peso;
    }

    @Override
    public double getPeso() {
        return peso;
    }
}
