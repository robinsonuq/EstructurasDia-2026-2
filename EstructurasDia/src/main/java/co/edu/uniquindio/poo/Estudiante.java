package co.edu.uniquindio.poo;

import java.util.Objects;

public class Estudiante implements  Comparable<Estudiante> {

    private String nombre;
    private String identificacion;
    private int prioridad;

    public Estudiante(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(identificacion, that.identificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, identificacion);
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Estudiante o) {
        return o.getPrioridad() -prioridad ;
    }
}
