package co.edu.uniquindio.poo;

import java.util.*;

public class Mapas {

    static void main() {

        //mapas

        Map<Estudiante, ArrayList<Estudiante>> estudiantes = new HashMap<>();//O(1)   agregar y obtener

        Estudiante estudiante1 = new Estudiante("Juan","12345");
        Estudiante estudiante2 = new Estudiante("Pedro","89999");
        Estudiante estudiante3 = new Estudiante("Luis","45679");
        Estudiante estudiante4 = new Estudiante("Sandra","3456");
        Estudiante estudiante5 = new Estudiante("Juan","99999");

        ArrayList<Estudiante> grupo1 = new ArrayList<>();
        grupo1.add(estudiante1);
        grupo1.add(estudiante2);
        grupo1.add(estudiante3);
        grupo1.add(estudiante4);
        estudiantes.put(estudiante1,grupo1);

        ArrayList<Estudiante> grupo2 = new ArrayList<>();
        grupo2.add(estudiante3);
        grupo2.add(estudiante4);
        grupo2.add(estudiante5);
        estudiantes.put(estudiante2,grupo2);

        estudiantes.remove("Luis");

        ArrayList<Estudiante> nota = estudiantes.get(estudiante2);
        estudiantes.containsKey("Luis");
        estudiantes.containsValue(3);

        for(Map.Entry<Estudiante,ArrayList<Estudiante>> entry : estudiantes.entrySet()){
            entry.getKey();
            entry.getValue();
        }

        LinkedHashMap<Estudiante, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(estudiante1,3);
        linkedHashMap.put(estudiante2,3);

        for(Map.Entry<Estudiante,Integer> entry : linkedHashMap.entrySet()){
            entry.getKey();
            entry.getValue();
        }

        TreeMap<Estudiante,Integer> treeMap = new TreeMap<>(new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });


        Queue<Estudiante> cola1 = new LinkedList<>();

        cola1.offer(estudiante1);
        cola1.offer(estudiante2);
        cola1.offer(estudiante3);
        cola1.offer(estudiante4);

        Estudiante poll = cola1.poll();
        Estudiante poll2 = cola1.poll();

        cola1.peek();

        if(!cola1.isEmpty()){

        }

        Queue<Estudiante> cola2 = new PriorityQueue<>();

        estudiante1.setPrioridad(10);
        estudiante2.setPrioridad(10);
        estudiante3.setPrioridad(20);

        cola2.add(estudiante1);


        TreeSet<Estudiante> estudiantes1 = new TreeSet<>();

        ArrayList<Estudiante> lista = new ArrayList<>();

        estudiante1.setPrioridad(10);
        estudiante2.setPrioridad(5);
        estudiante3.setPrioridad(8);


        Queue<Estudiante>cpla = new PriorityQueue<>();


        lista.add(estudiante1);
        lista.add(estudiante2);
        lista.add(estudiante3);

        Estudiante estudiante = desencolar(lista);

        cola2.poll();

    }

    private static Estudiante desencolar(ArrayList<Estudiante> lista) {

        Collections.sort(lista);
        return lista.get(0);
    }


}
