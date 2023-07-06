package PatronesComportamiento.Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //UsuarioMemoria usuarios = new UsuarioMemoria();
        UsuarioFichero usuarios = new UsuarioFichero();

        crear(usuarios,"julian");
        crear(usuarios,"liam");
        crear(usuarios,"jillian");
        crear(usuarios,"juan");

        for(String usuario : usuarios.listar()){
            System.out.println(usuario);
        }
    }
    public  static void  crear(Usuarios usuarios, String nombre){
        usuarios.crear(nombre);
    }
    public  static ArrayList<String> listar(Usuarios usuarios){
        return usuarios.listar();
    }
}
