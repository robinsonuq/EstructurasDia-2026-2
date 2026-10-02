package co.edu.uniquindio.poo.collections;

public class Recursividad {


    static void main() {
        int arreglo[] = {1,2,3,4,5};
        int suma = sumaDivide(arreglo,0,arreglo.length-1);
        System.out.println(suma);






    }

    public static int sumaDivide(int[] arreglo,int inicio, int fin ){
        if(inicio == fin){
            return arreglo[inicio];
        }
        int mitad = ( inicio + fin )/2;
        int sumIzq = sumaDivide(arreglo,inicio,mitad);
        int sumder = sumaDivide(arreglo,mitad + 1,fin);
        return sumIzq + sumder;
    }



    public static int binarySearch(int[] arreglo,int inicio, int fin ,int buscado){
        if(inicio > fin){
            return -1;
        }
        int mitad = ( inicio + fin )/2;

        if(arreglo[mitad] == buscado){
            return mitad;
        }
        return   buscado > arreglo[mitad]
                ?binarySearch(arreglo,mitad+1,fin,buscado)
                :binarySearch(arreglo,inicio,mitad-1,buscado);
    }











    // obtener el numero mayor de un arreglo usando divide y venceras








    private static void recorrerArreglo(int[] arreglo) {
        //1. Valor inicial ok
        //2. Condicion parada ok
        //3. dar paso -avanzar-incremento
        //4. El ciclo
        //5. Las instrucciones que se repiten
        for( ; ; ){
            System.out.println(arreglo[0]);
        }
    }

    private static void recorrerArregloRecursivo(int[] arreglo, int i) {

        if(i == arreglo.length) return;
        System.out.println(arreglo[i]);
        recorrerArregloRecursivo(arreglo,i+1);
        System.out.println(arreglo[i]);
    }

    private static boolean buscar(int[] arreglo, int i,int numero) {
        if(i == arreglo.length) return false;

        if(arreglo[i] == numero){
            return true;
        }
        return buscar(arreglo,i+1,numero);
    }

    private static int mayor(int[] arreglo) {

        int mayor = 0;
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] > mayor){
                mayor = arreglo[i];
            }
        }

        return mayor;
    }

    private static int mayorRecursivo(int[] arreglo,int i,int mayor) {

        if(i == arreglo.length) return mayor;

        if(arreglo[i] > mayor){
            mayor = arreglo[i];
        }
        return mayorRecursivo(arreglo,i+1,mayor);
    }

    private static int mayorRecursivo2(int[] arreglo,int i) {

        if(i == arreglo.length-1) return arreglo[i];
        int mayor = mayorRecursivo2(arreglo,i+1);
        return  arreglo [i] > mayor ? arreglo[i]:mayor;
    }

    //recursividad de cola
    private static int sumar(int[] arreglo,int i, int suma) {
        if(i == arreglo.length-1) return suma;
        return sumar(arreglo,i+1,suma + arreglo[i]); // n + sumar(n-1)
    }

    //cuanto numeros pares hay en un arreglo de forma recursiva

    public static int contarPares(int[] arreglo,int i, int pares){

        if(i == arreglo.length) return pares;
        if(arreglo[i] % 2 == 0){
            return contarPares(arreglo,i+1,pares + 1); // n + sumar(n-1)
        }else  return contarPares(arreglo,i+1,pares); // n + sumar(n-1)
    }

    public static int contarPares2(int[] arreglo,int i){

        if(i == arreglo.length) return 0;
        if(arreglo[i] % 2 == 0){
            return 1 + contarPares2(arreglo,i+1); // n + sumar(n-1)
        }else  return contarPares2(arreglo,i+1); // n + sumar(n-1)
    }















}
