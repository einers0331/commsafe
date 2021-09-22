
/**
 * Write a description of class Ciudadano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class Ciudadano
{
    private String nombre;
    private String apellido;
    private String contrasena;
    private int cedula;
    private int celular;
    private String direccion;
    private String foto;
    private ArrayList<String> perfil;
    private ArrayList<Post> posts;

    /**
     * Constructor for objects of class Ciudadano
     */
    public Ciudadano(String nombre, String apellido, String contrasena, int cedula, int celular, String direccion)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.cedula = cedula;
        this.celular = celular;
        this.direccion = direccion;
        posts = new ArrayList<>();
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
    
    //Establece una ruta con la imagen
    public void setFoto(String ft){
        foto = ft;
    }
    
    public void setPerfil(){
        perfil.add(nombre);
        perfil.add(apellido);
        perfil.add(foto);
    }
    
    public void addPost(String desc){
        Post p = new Post(nombre,desc);
        posts.add(p);
    }
    
    public void showPerfil(){
        String perfil = "";
        if (foto != null){
            perfil += "               "+ foto + "\n";
        }
        perfil += "          " + nombre + " " + apellido + "\n";
        
        System.out.println(perfil);
        
        System.out.println("Publicaciones \n");
        
        if (posts != null){
            for(Post p : posts){
                p.showPost();
            }
        }
        else{
            System.out.println("Aun no ha hecho ningun post.");
        }
        
    }
}
