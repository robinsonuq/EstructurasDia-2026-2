package co.edu.uniquindio.poo.collections;

import java.util.Objects;

public class Cliente implements Comparable<Cliente>{

    private String nombre;
    private String identificacion;
    private int edad;
    private int tipoOrden;

    public Cliente(String nombre,String identificacion,int edad,int tipoOrden) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.tipoOrden = tipoOrden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return  Objects.equals(identificacion, cliente.identificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificacion);
    }

    @Override
    public int compareTo(Cliente o) {
        //0 son iguales
        //+ si es mayor
        //- si es menor
        return Integer.compare(this.edad,o.getEdad());//
    }
}
