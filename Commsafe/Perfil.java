
/**
 * Write a description of class Perfil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perfil
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String apellido;
    private String foto;

    /**
     * Constructor for objects of class Perfil
     */
    public Perfil(String nombre, String Apellido)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    //El atributo foto es una ruta ('/foto.jpg')
    public void setFoto(String foto){
        this.foto = foto;
    }
    
    public String getFoto(){
        return this.foto;
    }
}
