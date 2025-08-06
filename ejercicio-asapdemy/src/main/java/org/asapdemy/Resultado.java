package org.asapdemy;

public enum Resultado {
    CURSO_INEX("El curso no existe"),
    USUARIO_INEX("El usuario no existe)"),
    YA_SUSCRIPTO("El usuario ya esta suscripto al curso"),
    ES_AUTOR("El autor del curso no puede suscribirse"),
    MAX_BECADOS("Ya hay becados en el curso"),
    SUSCRIPTO_OK("Usuario suscripto correctamente al curso");

    private final String mensaje;

    Resultado(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
