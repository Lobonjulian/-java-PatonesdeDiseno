package patronesCreacionales.factory;

public class Main {
    public static void main (String []args) {
        Factory factory = new Factory("Colombia");
        System.out.println("El precio para Colombia es: " + factory.getPrecio());

        Factory factory2 = new Factory("USA");
        System.out.println("El precio para Estados Unidos es: " + factory2.getPrecio());

        Factory factory3 = new Factory("Europa");
        System.out.println("El precio para Europa es de: " + factory3.getPrecio());
    }
}
