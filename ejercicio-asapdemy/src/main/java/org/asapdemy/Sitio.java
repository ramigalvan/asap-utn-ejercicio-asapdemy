package org.asapdemy;

import java.util.ArrayList;
import java.util.List;

public class Sitio {
    private String nombre;
    private List<Usuario> usuarios;
    private List<Categoria> categorias;

    public Sitio(String nombre) {
        this.nombre = nombre;
        this.usuarios = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }

    public Resultado suscribirseACurso(String usuarioId, String cursoId) {
        //boolean cursoExistente = existeCurso(cursoId);
        //boolean usuarioExistente = existeUsuario(usuarioId);
        //TODO: hacer la logica de registrar al usuario al curso

        if(!existeCurso(cursoId)){
            return Resultado.CURSO_INEX;
        }
        if (!existeUsuario(usuarioId)) {
            return Resultado.USUARIO_INEX;
        }
        return null;
    }

    public boolean existeUsuario(String usuarioId) {
        boolean existeUsuario = false;
        int i = 0;
        while (i < usuarios.size() && !existeUsuario) {
            if (usuarios.get(i).getNombre().equals(usuarioId)) {
                existeUsuario = true;
            }
            i++;
        }
        return existeUsuario;
    }

    public boolean existeCurso(String cursoId) {
        boolean existeCurso = false;
        //categorias tienen cursos
        //cada categoria tiene muchos cursos

        int i = 0;
        while (i < categorias.size() && !existeCurso) {
            if (categorias.get(i).tieneCurso(cursoId)) {
                existeCurso = true;
            }
            i++;
        }
        return existeCurso;
    }

    public void agregarCategoria(Categoria categoria){
        categorias.add(categoria);
    }


    //agregar usuarios? agregarUsuario()¿
    //agregar cursos? agregarCurso()

}
