
package co.edu.uniamazonia.superforo.mundo.superforoproject;


public class Usuario {

    
   
    private String nombre;
    private String correo;
    
    //metodos
    
    public Usuario(String nombre, String correo) {
        //atributos 
        this.nombre = nombre;
        this.correo = correo;
    
    
    }
    public String getNombre(){
        return nombre ;
    }
    
    public void setnombre(String nombre){
        this.nombre = nombre;
        }
    public String getcorreo(){
        return correo ;
    }
    
    public void setcorreo(String correo){
        this.correo = correo;
        }
   public void publicar(){
       
       System.err.println(nombre + " Subir una publicacion dentro de el foro ");
   }
    
}
