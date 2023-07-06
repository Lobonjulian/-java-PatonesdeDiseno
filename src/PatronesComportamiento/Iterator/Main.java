package PatronesComportamiento.Iterator;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("jillian",6));
        usuarios.crear(new Usuario("julian",29));
        usuarios.crear(new Usuario("isabella",16));
        usuarios.crear(new Usuario("Natalia",31));

        while (usuarios.hayMas()){
            Usuario usuario = usuarios.siguiente();
            System.out.println("Usuario es:  " + usuario.getNombre());
        }

        usuarios.crear(new Usuario("santiago",1));
        Usuario usuario = usuarios.siguiente();
        System.out.println("Usuario furear del while es:  " + usuario.getNombre());
    }
}
