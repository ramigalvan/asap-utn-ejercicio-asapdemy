package org.asapdemy;
import java.util.List;
import java.util.ArrayList;

public class Curso {
    private  String id;
    private String titulo;
    private double precio;
    private int valoracion;
    private Usuario autor;
    private List<Leccion> lecciones;
    private List<Usuario> suscriptos;

    public Curso(String id, String titulo, double precio, int valoracion, Usuario autor) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.valoracion = valoracion;
        this.autor = autor;
        this.lecciones = new ArrayList<>();
        this.suscriptos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void agregarLeccion(Leccion leccion){
        lecciones.add(leccion);
    }

    public boolean estaSuscripto(String usuarioId) {
        boolean encontrado = false;
        int i = 0;
        while (i < suscriptos.size() && !encontrado) {
            if (suscriptos.get(i).getId().equals(usuarioId)) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getValoracion() {
        return valoracion;
    }

    public Usuario getAutor() {
        return autor;
    }

    public List<Leccion> getLecciones() {
        return lecciones;
    }

    public List<Usuario> getSuscriptos() {
        return suscriptos;
    }
    //TODO: verificar que se repete el limite de MAX_BECADOS = 5
    public void agregarUsuario(Usuario usuario) {
        //realizar un control
        suscriptos.add(usuario);
    }

    public int cantidadActualBecados() {
        int contadorBecados = 0;
        for(Usuario usuario: suscriptos){
            if(usuario.isEsBecado()){
                contadorBecados++;
            }
        }
        return contadorBecados;
    }
}
