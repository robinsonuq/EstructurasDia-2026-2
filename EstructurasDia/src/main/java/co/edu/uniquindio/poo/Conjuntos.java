package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.torneo.Jugador;

import java.util.*;

public class Conjuntos {


    static void main() {

        Set<Cliente> conjunto = new HashSet<>();




        Set<String> conjunto2 = new LinkedHashSet<>();
        conjunto2.add("Juan");
        conjunto2.add("Pedro");
        conjunto2.add("Luis");
        conjunto2.add("Sandra");

        Set<String> conjunto3 = new TreeSet<>();
        conjunto3.add("Juan");
        conjunto3.add("Pedro");
        conjunto3.add("Ana");
        conjunto3.add("Luis");



        Set<Cliente> listaClientes = new TreeSet<>(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.getIdentificacion().compareTo(o2.getIdentificacion());
            }
        });
        listaClientes.add(new Cliente("Pedro","1",2,1));
        listaClientes.add(new Cliente("Luis","2",24,0));
        listaClientes.add(new Cliente("Ana","3",10,1));
        listaClientes.add(new Cliente("Mario","4",50,0));

        for(Cliente aux : listaClientes){
            System.out.println(aux.getNombre());
        }


        ArrayList<Cliente> listaClien = new ArrayList<>();
        listaClien.add(new Cliente("Pedro","1",2,1));
        listaClien.add(new Cliente("Luis","2",24,0));
        listaClien.add(new Cliente("Ana","3",10,1));
        listaClien.add(new Cliente("Mario","4",50,0));

        Collections.sort(listaClien,new ComparadorIdentificacion(6));

    }
}
