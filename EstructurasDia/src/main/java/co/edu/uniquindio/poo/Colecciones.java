package co.edu.uniquindio.poo;

import java.util.*;

public class Colecciones {

    static void main() {

        ArrayList<String> lista = new ArrayList<>(1000000);// se que es y como funciona un arraylist? dudas
        lista.add("Jose");
        lista.add("Jose");
        lista.add("Jose");
        lista.add("Jose");
        lista.add("Jose");

        List <String> lista2 = new ArrayList<>(1000000);// se que es y como funciona un arraylist? dudas
        lista2.add("Jose");
        lista2.add("Jose");
        lista2.add("Jose");
        lista2.add("Jose");
        lista2.add("Jose");

        LinkedList<String> lista3 = new LinkedList<>();
        lista3.add("Ana");
        lista3.add("Luis");
        lista3.add("Peddro");
        lista3.add("MAnuel");
        lista3.add("Sandra");


        String nombre = lista3.get(3);

        lista3.addFirst("Pedro");
        lista3.addLast("Carlos");
        String first = lista3.getFirst();


        eliminarPersonas3(lista3);
        // desarrollar un metodo que elimine los nombres de las personas que empiecen por Jo
        eliminarPersonas3(lista2);
        System.out.println();
    }

    private static void eliminarPersonas3(List<String> lista) {
        ListIterator<String> listIterator = lista.listIterator();

        while(listIterator.hasNext()){
            String next = listIterator.next();
            if(next.startsWith("Jo")){
                listIterator.remove();
            }
        }
    }










    private static void eliminarPersonas(ArrayList<String> lista) {
        // error defecto fallo
          if(lista == null){
              throw new RuntimeException("La lista esta null");
          }
          for(int i=0; i < lista.size();i++){
              if(lista.get(i).startsWith("Jo")){
                  lista.remove(i);
                  i--;
              }
          }
    }
    private static void eliminarPersonas2(ArrayList<String> lista) {
        for(int i = lista.size()-1; i >= 0; i--){//documentar
            if(lista.get(i).startsWith("Jo")){
                lista.remove(i);
            }
        }
    }



}
