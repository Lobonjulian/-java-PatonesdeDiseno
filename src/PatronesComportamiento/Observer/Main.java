package PatronesComportamiento.Observer;

public class Main {
    public static void main(String[] args) {
        Emisora emisora = new Emisora();

        ReceptorRadio radio = new ReceptorRadio();
        ReceptorSatelite satelite = new ReceptorSatelite();
        ReceptorTv tv = new ReceptorTv();

        emisora.añadeReceptor(radio);
        emisora.añadeReceptor(tv);
        emisora.añadeReceptor(satelite);


        emisora.emite();
    }
}
