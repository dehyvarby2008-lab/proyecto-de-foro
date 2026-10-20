package co.edu.uniamazonia.superforo.mundo.superforoproject;

public class Membresia {

    // Atributos
    private Usuario usuario;
    private Comunidad comunidad;
    private String rolUsuario;

    // Constructor
    public Membresia(Usuario usuario, Comunidad comunidad,
                     String rolUsuario) {
        this.usuario = usuario;
        this.comunidad = comunidad;
        this.rolUsuario = rolUsuario;
    }

    // Métodos consultores (get)
    public Usuario getUsuario() {
        return usuario;
    }

    public Comunidad getComunidad() {
        return comunidad;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    // Método modificador (set)
    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    // Método de negocio
    public void cambiarRol(String nuevoRolUsuario) {
        this.rolUsuario = nuevoRolUsuario;
    }
}