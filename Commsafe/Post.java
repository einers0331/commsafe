
/**
 * Write a description of class Post here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Post
{
    // instance variables - replace the example below with your own
    private String nombreC; 
    private String descripcion;
    private String ubicacion;
    private String multimedia;
    private String datetime;

    /**
     * Constructor for objects of class Post
     */
    public Post(String nombre, String desc, String ubicacion)
    {
        nombreC = nombre;
        descripcion = desc;
        this.ubicacion = ubicacion;
        datetime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public String getUbicacion(){
        return this.ubicacion;
    }
    
    //El atributo foto es una ruta ('/foto.jpg')
    public void setMultimedia(String foto){
        this.multimedia = foto;
    }
    
    public String getMultimedia(){
        return this.multimedia;
    }
    
    public void showPost(){
        String info = "---------------------------------------- \n";
        info += nombreC + "                " + datetime + "\n";
        info += descripcion;
        if(multimedia != null){
            info += multimedia;
        }
        System.out.println(info + "\n");
    }
}