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
        return null;
    }
}
