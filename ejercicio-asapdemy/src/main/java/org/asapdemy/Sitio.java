package org.asapdemy;

import java.util.ArrayList;
import java.util.List;

//TODO: controlar que los usuarios no esten repetidos, mediante un campo unico, por ejemplo email
//TODO: controlar que las categorias no esten repetidas

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
        //TODO: controlar si el usuario es autor
        Usuario usuario = obtenerUsuario(usuarioId);

        if(!existeCurso(cursoId)){
            return Resultado.CURSO_INEX;
        }
        if (!existeUsuario(usuarioId)) {
            return Resultado.USUARIO_INEX;
        }
        //TODO TRUE, TODO OK
        //el curso existe, trae el curso y verifica si esta inscripto
        //recorres categorias, vas por los cursos, encuentras el curso y verificas el usuario

        Curso curso = obtenerCurso(cursoId);
        if (curso.estaSuscripto(usuarioId)) {
            return Resultado.YA_SUSCRIPTO;
        }

        if (curso.getAutor().getId().equals(usuarioId)) {
            return Resultado.ES_AUTOR;
        }
        if(usuario.isEsBecado() && curso.cantidadActualBecados() >= 5){
            return Resultado.MAX_BECADOS;
        }
        curso.agregarUsuario(usuario);
        return Resultado.SUSCRIPTO_OK;
    }

    public boolean existeUsuario(String usuarioId) {
        boolean existeUsuario = false;
        int i = 0;
        while (i < usuarios.size() && !existeUsuario) {
            if (usuarios.get(i).getId().equals(usuarioId)) {
                existeUsuario = true;
            }
            i++;
        }
        return existeUsuario;
    }

    public Curso obtenerCurso(String cursoId) {
        Curso cursoEncontrado = null;
        //categorias tienen cursos
        //cada categoria tiene muchos cursos

        int i = 0;
        while (i < categorias.size() && cursoEncontrado == null) {
        Categoria categoria = categorias.get(i);
        cursoEncontrado = categoria.buscarCursoPorId(cursoId) ;//metodo nuevo
            i++;
        }
        return cursoEncontrado;
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

    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    private Usuario obtenerUsuario(String usuarioId) {
        Usuario usuarioEncontrado = null;
        int i = 0;
        while (i < usuarios.size() && usuarioEncontrado == null) {
            Usuario usuarioActual = usuarios.get(i);
            if (usuarioActual.getId().equals(usuarioId)) {
                usuarioEncontrado = usuarioActual;
            }
            i++;
        }
        return usuarioEncontrado;
    }




    //agregar usuarios? agregarUsuario()¿
    //agregar cursos? agregarCurso()

}
