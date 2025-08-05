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


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public TipoLeccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoLeccion tipo) {
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
