package org.asapdemy;

public class Usuario {
   private String id;
   private String nombre;
   private String email;
   private boolean esBecado;

    public Usuario(String id, String nombre, String email, boolean esBecado) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.esBecado = esBecado;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEsBecado() {
        return esBecado;
    }
}
