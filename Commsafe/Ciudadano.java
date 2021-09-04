
/**
 * Write a description of class Ciudadano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ciudadano
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String apellido;
    private String contrasena;
    private int cedula;
    private int celular;
    private String direccion;
    private Perfil perfil;

    /**
     * Constructor for objects of class Ciudadano
     */
    public Ciudadano(String nombre, String apellido, String contrasena, int cedula, int celular, String direccion)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.cedula = cedula;
        this.celular = celular;
        this.direccion = direccion;
        perfil = new Perfil(nombre,apellido);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getcedula(){
        return this.cedula;
    }
    
    public int getcelular(){
        return this.celular;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
}
