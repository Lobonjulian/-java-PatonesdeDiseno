package PatronesEstructurales.Decorator;

public class Main {
    public static void main(String []args) {
        Telefono telefonoNokia = new TelefonoBasico();
        telefonoNokia.crear();

        Telefono telefonoInteligente = new TelefonoInteligente(new TelefonoBasico());
        telefonoInteligente.crear();

        Telefono telefonoNextGen = new TelefonoNextGen(
                new TelefonoInteligente(
                        new TelefonoBasico()
                )
        );
        telefonoNextGen.crear();

        Telefono telefonoNextGen2 = new TelefonoNextGen(new TelefonoBasico());
        telefonoNextGen2.crear();

    }

}

