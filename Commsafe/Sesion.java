
/**
 * Write a description of class Sesion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sesion
{
    // instance variables - replace the example below with your own
    private Ciudadano ciudadano;
    private String ubicacionactual;

    /**
     * Constructor for objects of class Sesion
     */
    public Sesion(Ciudadano ciudadano,String ubicacionactual)
    {
        this.ciudadano = ciudadano; 
        this.ubicacionactual = ubicacionactual;
    }
    
    public String getUbicacionActual()
    {
      return ubicacionactual;  
    }
    
    public Ciudadano getCiudadano()
    {
        return ciudadano;
    }
}
