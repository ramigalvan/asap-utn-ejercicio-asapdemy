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
    public boolean tieneCurso(String cursoId) {
        boolean encontrado = false;
        int i = 0;
        while (i < cursos.size() && !encontrado) {
            if (cursos.get(i).getId().equals(cursoId)) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }
    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }


}
