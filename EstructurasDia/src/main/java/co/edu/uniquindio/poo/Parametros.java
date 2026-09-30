package co.edu.uniquindio.poo;

public class Parametros {


    static void main() {

        Persona p = new Persona("Robinson");
        cambiarNombre(p);

        System.out.println(p.getNombre());
    }

    private static void cambiarNombre(Persona p) {
        //p.setNombre("Quintero");

        p = new Persona("Luis");
       // p = new Persona("Luis");
        //p.setNombre("Yesuu");


    }


}
