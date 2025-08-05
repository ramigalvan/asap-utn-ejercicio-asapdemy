package org.asapdemy;
import java.util.List;
import java.util.ArrayList;

public class Curso {
    private  String id;
    private String titulo;
    private double precio;
    private int valoracion;
    private Usuario autor;
    private List<Leccion> lecciones;
    private List<Usuario> suscriptos;

    public Curso(String id, String titulo, double precio, int valoracion, Usuario autor) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.valoracion = valoracion;
        this.autor = autor;
        this.lecciones = new ArrayList<>();
        this.suscriptos = new ArrayList<>();
    }
}
