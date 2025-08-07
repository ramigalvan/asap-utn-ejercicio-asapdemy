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

    public boolean isEsBecado() {
        return esBecado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", esBecado=" + esBecado +
                '}';
    }
}
