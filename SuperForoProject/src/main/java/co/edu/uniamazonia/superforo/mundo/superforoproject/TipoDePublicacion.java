package co.edu.uniamazonia.superforo.mundo.superforoproject;

public class TipoDePublicacion {

    // Atributos
    private String nombre;

    // Constructor
    public TipoDePublicacion(String nombre) {
        this.nombre = nombre;
    }

    // Métodos consultores (get)
    public String getNombre() {
        return nombre;
    }

    // Métodos modificadores (set)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método de negocio
    public void mostrarInformacion() {
        System.out.println("Tipo de publicación: " + nombre);
    }
}