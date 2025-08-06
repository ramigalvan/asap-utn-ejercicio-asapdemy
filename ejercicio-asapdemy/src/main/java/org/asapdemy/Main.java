package org.asapdemy;

public class Main {
    public static void main(String[] args) {
        Sitio sitio = new Sitio("AsapDemy");
        Categoria categoria = new Categoria("1","cocina");
        Usuario autor = new Usuario ("u1" , "juan", "juangmail", false);
        Usuario usuario1 = new Usuario ("u2" , "pedro", "pedormail", true);
        Usuario usuario2 = new Usuario ("u3" , "jose", "josemail", false);

        Usuario usuario3 = new Usuario("u3", "Ana", "ana@mail.com", true);
        Usuario usuario6 = new Usuario("u6", "Luis", "luis@mail.com", true);
        Usuario usuario7 = new Usuario("u7", "Jose", "jose@mail.com", true);
        Usuario usuario4 = new Usuario("u4", "Maria", "maria@mail.com", true);
        Usuario usuario5 = new Usuario("u5", "Pedro", "pedro@mail.com", true);
        Usuario usuario8 = new Usuario("u8", "Pedro", "pedro@mail.com", true);
        Usuario usuarioCorrecto = new Usuario("u9", "Perfect User", "perfectuser@mail.com", false);


        Curso curso = new Curso ("c1", "curso java", 100.0, 5 ,autor);

        //primero agregalo al sitio ---> despues las operaciones restantes
        categoria.agregarCurso(curso);
        sitio.agregarUsuario(usuario1);
        sitio.agregarUsuario(usuario2);
        sitio.agregarUsuario(autor);
        sitio.agregarUsuario(usuario3);
        sitio.agregarUsuario(usuario4);
        sitio.agregarUsuario(usuario5);
        sitio.agregarUsuario(usuario6);
        sitio.agregarUsuario(usuario7);
        sitio.agregarUsuario(usuario8);
        sitio.agregarUsuario(usuarioCorrecto);

        sitio.agregarCategoria(categoria);

        //TODO: relacionar sitio, cateogira y curso --> categoria.agregarCurso();
        //TODO: si el usuario no existe en el sitio, no debes de agregarlo al curso
        curso.agregarUsuario(usuario1);
        curso.agregarUsuario(usuario2);
        curso.agregarUsuario(usuario3);
        curso.agregarUsuario(usuario4);
        curso.agregarUsuario(usuario5);
        curso.agregarUsuario(usuario6);
        curso.agregarUsuario(usuario7);
        //curso.agregarUsuario(usuario8);
        //NO AGREGO AL USUARIO PERFECTO


        //TODO:Probar con los enums de Resultado
        boolean existe = sitio.existeCurso("c1");
        System.out.println("existe el curso c1= " + existe);

        //boolean noExiste = sitio.existeCurso("c999");
        //System.out.println("existe el curso c999?= " + noExiste);

        //deberia de devolver el Resultado USUARIO YA SUSCRIPTO
        Resultado respuesta = sitio.suscribirseACurso(usuarioCorrecto.getId(), curso.getId());


        System.out.println(respuesta.getMensaje());
        //TODO: Tomar los resultados de los enums y dejar mensajes claros. USUARIO_INEX ---> USUARIO INEXISTENTE


    }
 }