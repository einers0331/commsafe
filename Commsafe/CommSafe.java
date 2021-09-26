
/**
 * Write a description of class CommSafe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.io.IOException;

public class CommSafe
{
    public static void clrscr(){
        //Clears Screen in Java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

    public static void main(String[] args) 
    {
        Fabrica objetos = new Fabrica();
        boolean inicio = true;
        Registros registros = objetos.registros;
        Sesion sesion = null;

        while(inicio)
        {
            try{
            System.out.println("CommSafe");
            System.out.println("Bienvenido Ciudadano");
            System.out.println("1. Iniciar Sesion\n2. Olvide mi contraseña \n3. Registro \n4. Salir");

            Scanner myObj = new Scanner(System.in);
            int opcion = myObj.nextInt();
            clrscr();

            switch (opcion) 
            {
                case 1:
                    boolean digitandodatos = true;
                    while(digitandodatos)
                    {
                        System.out.println("Cedula \n ");
                        myObj = new Scanner(System.in);
                        int cedula = myObj.nextInt();
                        System.out.println("Contraseña");
                        myObj = new Scanner(System.in);
                        String contrasena = myObj.nextLine();
                        clrscr();
                        System.out.println("1. Confirmar Sesion \n 2. Cancelar Sesion");
                        myObj = new Scanner(System.in);
                        int op = myObj.nextInt();
                        clrscr();

                        if(op == 1)
                        {

                            Ciudadano c = registros.validacion(cedula,contrasena);

                            if(c == null)
                            {
                                System.out.println("Error en la autenticación \n");
                            }

                            else

                            {  
                                digitandodatos = false;
                                sesion = new Sesion(c,"cumbre"); //añade la ubicación actual

                                while(sesion!= null){

                                    System.out.println("Menu Barra");
                                    System.out.println("1. Ver publicaciones \n2. Agregar Publicacion \n3. Perfil \n4. Configuracion");
                                    myObj = new Scanner(System.in);
                                    int op1 = myObj.nextInt();
                                    clrscr();

                                    switch(op1)
                                    {
                                        case 1:
                                            ArrayList<Ciudadano> ciudadanos = registros.getCuidadanos();
                                            ArrayList<Post> Muro = new ArrayList<>();
                                            for(Ciudadano iterar: ciudadanos )
                                            {
                                                ArrayList<Post> publicaciones = iterar.getPost();
                                                for (Post iterar1: publicaciones)
                                                {
                                                    if(sesion.getUbicacionActual().equals(iterar1.getUbicacion()) )
                                                    {
                                                        Muro.add(iterar1); 
                                                    }
                                                }
                                            }
                                            System.out.println("Muro");
                                            for(Post iterar2: Muro)
                                            {
                                                iterar2.showPost();
                                            }

                                    }

                                }
                            }
                        }
                        else 
                        {
                            digitandodatos = false;
                        }

                    }
                    break;

                case 2:
                    break;
                case 3:
                    ArrayList<String> datos = new ArrayList<>();
                    datos.add("Nombres");
                    datos.add("Apellidos");
                    datos.add("Contrasena");
                    datos.add("Direccion");
                    datos.add("Ciudad");

                    ArrayList<String> datos1 = new ArrayList<>();

                    for(String str: datos )
                    {
                        System.out.println(str);
                        myObj = new Scanner(System.in);
                        datos1.add(myObj.nextLine());

                    }
                    System.out.println("Cedula");
                    myObj = new Scanner(System.in);
                    int cedula = myObj.nextInt();
                    System.out.println("Celular");
                    myObj = new Scanner(System.in);
                    int celular = myObj.nextInt();

                    clrscr();
                    System.out.println("1. Confirmar registro \n 2. Cancelar registro");
                    myObj = new Scanner(System.in);
                    int op = myObj.nextInt();
                    clrscr();
                    if (op==1)
                    {
                        registros.registrarCiudadano(datos1.get(0), datos1.get(1), datos1.get(2), cedula, celular,datos1.get(3), datos1.get(4));
                    }

                    break;

                case 4:
                    inicio = false;
                    break;
            }
        }
        catch(Exception e){
            System.out.println("Ingrese una opción valida");
        }
        }
    }
}