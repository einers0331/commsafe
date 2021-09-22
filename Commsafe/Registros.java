
/**
 * Write a description of class Registro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
*/
import java.util.ArrayList;

public class Registros
{
    // instance variables - replace the example below with your own
    private ArrayList<Ciudadano> registros = new ArrayList<>();

    /**
     * Constructor for objects of class Registro
     */
    public Registros()
    {
        // initialise instance variables
        
    }

    public void registrarCiudadano(String nombre, String apellido, String contrasena, int cedula, int celular, String direccion)
    {
        // put your code here
        Ciudadano ciudadano = new Ciudadano(nombre,apellido,contrasena,cedula,celular,direccion);
        registros.add(ciudadano);
    }
}
