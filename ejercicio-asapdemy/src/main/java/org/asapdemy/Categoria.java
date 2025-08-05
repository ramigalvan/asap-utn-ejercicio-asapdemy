package org.asapdemy;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String id;
    private String nombre;
    private List<Curso> cursos;

    public Categoria(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

}
