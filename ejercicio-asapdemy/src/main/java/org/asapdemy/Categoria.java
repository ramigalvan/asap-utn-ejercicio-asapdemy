package org.asapdemy;

import java.util.ArrayList;
import java.util.List;

//verificar que no se agreguen los cursos tengan un ID unico
public class Categoria {
    private String id;
    private String nombre;
    private List<Curso> cursos;

    public Categoria(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    /**
     * verifica si existe o no un curso
     * @param cursoId
     * @return
     */
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

    public Curso buscarCursoPorId(String cursoId) {
        Curso cursoBuscado = null;
        int i = 0;
        boolean encontrado = false;

        while (i < cursos.size() && !encontrado) {
            if (cursos.get(i).getId().equals(cursoId)) {
                cursoBuscado = cursos.get(i);
                encontrado = true;
            }
            i++;
        }

        return cursoBuscado;
    }


    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
