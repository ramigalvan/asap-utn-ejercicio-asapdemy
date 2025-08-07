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
        Resultado resultado;

        if (!existeCurso(cursoId)) {
            resultado = Resultado.CURSO_INEX;
        } else if (!existeUsuario(usuarioId)) {
            resultado = Resultado.USUARIO_INEX;
        } else {
            //el usuario y curso existen, entonces los obtenemos y validamos lo demas
            Usuario usuario = obtenerUsuario(usuarioId);
            Curso curso = obtenerCurso(cursoId);
            //el curso existe, trae el curso y verifica si esta inscripto
            //recorres categorias, vas por los cursos, encuentras el curso y verificas el usuario

            if (curso.estaSuscripto(usuarioId)) {
                resultado = Resultado.YA_SUSCRIPTO;
            } else if (esAutorDelCurso(usuario, curso)) {
                resultado = Resultado.ES_AUTOR;
            } else if (excedeLimiteDeBecados(usuario, curso)) {
                resultado = Resultado.MAX_BECADOS;
            } else {
                curso.agregarUsuario(usuario);
                resultado = Resultado.SUSCRIPTO_OK;
            }
        }

        return resultado;
    }

    public boolean existeCurso(String cursoId) {
        boolean existeCurso = false;

        int i = 0;
        while (i < categorias.size() && !existeCurso) {
            if (categorias.get(i).tieneCurso(cursoId)) {
                existeCurso = true;
            }
            i++;
        }
        return existeCurso;
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

    public Curso obtenerCurso(String cursoId) {
        Curso cursoEncontrado = null;

        int i = 0;
        while (i < categorias.size() && cursoEncontrado == null) {
        Categoria categoria = categorias.get(i);
        cursoEncontrado = categoria.buscarCursoPorId(cursoId) ;//metodo nuevo
            i++;
        }
        return cursoEncontrado;
    }

    private boolean esAutorDelCurso(Usuario usuario, Curso curso) {
        return curso.getAutor().getId().equals(usuario.getId());
    }

    private boolean excedeLimiteDeBecados(Usuario usuario, Curso curso) {
        return usuario.isEsBecado() && curso.cantidadActualBecados() >= 5;
    }

    public void agregarCategoria(Categoria categoria) {
        boolean categoriaExistente = existeCategoria(categoria.getId());
        if(!categoriaExistente){
            categorias.add(categoria);
        }else{
            System.out.println("El categoria: " + categoria.toString() + ", ya existe.");
        }

    }

    private boolean existeCategoria(String categoriaId) {
        boolean existeCategoria = false;

        int i = 0;
        while (i < categorias.size() && !existeCategoria) {
            if (categorias.get(i).getId().equals(categoriaId)) {
                existeCategoria = true;
            }
            i++;
        }
        return existeCategoria;
    }

    public void agregarUsuario(Usuario usuario) {
        boolean usuarioExistente = existeUsuario(usuario.getId());
        if(!usuarioExistente) {
            usuarios.add(usuario);
        }else{
            System.out.println("El usuario: " + usuario.toString() + ", ya existe.");
        }

    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }


}
