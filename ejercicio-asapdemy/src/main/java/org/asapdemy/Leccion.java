package org.asapdemy;

public class Leccion {
    private String nombre;
    private int duracionMinutos;
    private TipoLeccion tipo;

    public Leccion(String id, String nombre, int duracionMinutos, TipoLeccion tipo) {
        this.nombre = nombre;
        this.duracionMinutos = duracionMinutos;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Leccion{" +
                ", nombre='" + nombre + '\'' +
                ", duracionMinutos=" + duracionMinutos +
                ", tipo=" + tipo +
                '}';
    }
}
