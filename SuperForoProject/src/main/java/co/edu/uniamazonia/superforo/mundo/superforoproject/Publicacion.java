package co.edu.uniamazonia.superforo.mundo.superforoproject;

public class Publicacion {

    // Atributos
    private int fecha;
    private String contenido;
    private Comunidad comunidad;
    private Comentario comentario;
    private TipoDePublicacion tipop;
    private Usuario user;

    // Constructor
    public Publicacion(int fecha, String contenido) {
        this.fecha = fecha;
        this.contenido = contenido;
    }

    // Métodos consultores (get)
    public int getFecha() {
        return fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public Usuario getUsuario() {
        return user;
    }

    public Comunidad getComunidad() {
        return comunidad;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public TipoDePublicacion getTipoDePublicacion() {
        return tipop;
    }

    // Métodos modificadores (set)
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setComunidad(Comunidad comunidad) {
        this.comunidad = comunidad;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public void setTipoDePublicacion(TipoDePublicacion tipop) {
        this.tipop = tipop;
    }

    public void setUsuario(Usuario user) {
        this.user = user;
    }

    // Método de negocio
    public void mostrarInformacion() {
        System.out.println("Publicación: " + contenido);
        System.out.println("Fecha: " + fecha);
        System.out.println("Tipo de publicación: " + tipop);

        if (user != null) {
            System.out.println("Usuario: " + user.getNombre());
        }

        if (comunidad != null) {
            System.out.println("Comunidad a la que pertenece: " + comunidad.getNombre());
        }
    }
}

