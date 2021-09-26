
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
    private String ciudad;
    private ArrayList<String> perfil;
    private ArrayList<Post> posts;

    /**
     * Constructor for objects of class Ciudadano
     */
    public Ciudadano(String nombre, String apellido, String contrasena, int cedula, int celular, String direccion,String ciudad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.cedula = cedula;
        this.celular = celular;
        this.ciudad = ciudad;
        this.direccion = direccion;
        posts = new ArrayList<>();
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getCedula(){
        return this.cedula;
    }
    
    public int getCelular(){
        return this.celular;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
     public String getContrasena(){
        return this.contrasena;
    }
    
    //Establece una ruta con la imagen
    public void setFoto(String ft){
        foto = ft;
    }
    
     public String getCiudad(){
        return this.ciudad;
    }
    
    public void setPerfil(){
        perfil.add(nombre);
        perfil.add(apellido);
        perfil.add(foto);
    }
    
    public void addPost(String desc,String ubicacion){
        Post p = new Post(nombre,desc,ubicacion);
        posts.add(p);
    }
    public ArrayList<Post> getPost()
    {
    return posts;
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
