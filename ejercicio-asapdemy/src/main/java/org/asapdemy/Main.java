package org.asapdemy;

public class Main {
    public static void main(String[] args) {
        Sitio sitio = new Sitio("AsapDemy");
        Categoria categoria = new Categoria("1","cocina");
        Usuario autor = new Usuario ("u1" , "juan", "juangmail", false);
        Curso curso = new Curso ("c1", "curso java", 100.0, 5 ,autor);

        categoria.agregarCurso(curso);

        sitio.agregarCategoria(categoria);

        //TODO:Probar con los enums de Resultado
        boolean existe = sitio.existeCurso("c1");
        System.out.println("existe el curso c1= " + existe);

        boolean noExiste = sitio.existeCurso("c999");
        System.out.println("existe el curso c999?= " + noExiste);

        Resultado respuesta = sitio.suscribirseACurso(autor.getId(), curso.getId());
        System.out.println("Esta es la respuesta: " + respuesta);
        //TODO: Tomar los resultados de los enums y dejar mensajes claros. USUARIO_INEX ---> USUARIO INEXISTENTE
    }
 }