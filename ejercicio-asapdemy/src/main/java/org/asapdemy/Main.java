package org.asapdemy;



public class Main {
    public static void main(String[] args) {
        //creacion del sitio
        Sitio sitio = new Sitio("AsapDemy");

        //creacion de las categorias
        Categoria categoria = new Categoria("1","programacion");
        Categoria categoria1 = new Categoria("2","cine");
        Categoria categoria2 = new Categoria("2","cocina");

        //creacion de los usuarios
        Usuario autor = new Usuario ("9" , "juan", "juangmail", false);
        Usuario usuario1 = new Usuario ("u1" , "pedro", "pedormail", true);
        Usuario usuario2 = new Usuario ("u2" , "jose", "josemail", false);
        Usuario usuario3 = new Usuario("u3", "Ana", "ana@mail.com", true);
        Usuario usuario6 = new Usuario("u6", "Luis", "luis@mail.com", true);
        Usuario usuario7 = new Usuario("u7", "Jose", "jose@mail.com", true);
        Usuario usuario4 = new Usuario("u4", "Maria", "maria@mail.com", true);
        Usuario usuario5 = new Usuario("u5", "Pedro", "pedro@mail.com", true);
        Usuario usuario8 = new Usuario("u8", "Pedro", "pedro@mail.com", true);
        Usuario usuarioCorrecto = new Usuario("u9", "Perfect User", "perfectuser@mail.com", false);

        Curso curso = new Curso ("c1", "curso java", 100.0, 5 ,autor);
        Curso curso1 = new Curso ("c2", "curso python", 200.0, 3 ,autor);
        Curso curso2 = new Curso ("c2", "curso react", 150.0, 3 ,autor);


        sitio.agregarCategoria(categoria);
        sitio.agregarUsuario(autor);
        sitio.agregarUsuario(usuario1);
        sitio.agregarUsuario(usuario2);
        sitio.agregarUsuario(usuario3);
        sitio.agregarUsuario(usuario4);
        sitio.agregarUsuario(usuario5);
        sitio.agregarUsuario(usuario6);
        sitio.agregarUsuario(usuario7);
        sitio.agregarUsuario(usuario8);
        sitio.agregarUsuario(usuarioCorrecto);

        categoria.agregarCurso(curso);

        Resultado respuesta = null;
        //SUSCRIPTO_OK("Usuario suscripto correctamente al curso");
        respuesta = sitio.suscribirseACurso(usuario1.getId(), curso.getId());
        System.out.println(respuesta.getMensaje());

        //YA_SUSCRIPTO("El usuario ya esta suscripto al curso"),
        respuesta = sitio.suscribirseACurso(usuario1.getId(), curso.getId());
        System.out.println(respuesta.getMensaje());

        //CURSO_INEX("El curso no existe"),
        respuesta = sitio.suscribirseACurso(usuario1.getId(), "fh1013");
        System.out.println(respuesta.getMensaje());

        //USUARIO_INEX("El usuario no existe)"),
        respuesta = sitio.suscribirseACurso("u456", curso.getId());
        System.out.println(respuesta.getMensaje());

        //ES_AUTOR("El autor del curso no puede suscribirse"),
        respuesta = sitio.suscribirseACurso(autor.getId(), curso.getId());
        System.out.println(respuesta.getMensaje());

        //MAX_BECADOS("Ya hay becados en el curso"),
        respuesta = sitio.suscribirseACurso(usuario2.getId(), curso.getId());
        System.out.println(respuesta.getMensaje());

        respuesta = sitio.suscribirseACurso(usuario3.getId(), curso.getId());
        System.out.println(respuesta.getMensaje());

        respuesta = sitio.suscribirseACurso(usuario4.getId(), curso.getId());
        System.out.println(respuesta.getMensaje());

        respuesta = sitio.suscribirseACurso(usuario5.getId(), curso.getId());
        System.out.println(respuesta.getMensaje());

        respuesta = sitio.suscribirseACurso(usuario6.getId(), curso.getId());
        System.out.println(respuesta.getMensaje());

        respuesta = sitio.suscribirseACurso(usuario7.getId(), curso.getId());
        System.out.println(respuesta.getMensaje());

        respuesta = sitio.suscribirseACurso(usuario8.getId(), curso.getId());
        System.out.println(respuesta.getMensaje());


    }
 }