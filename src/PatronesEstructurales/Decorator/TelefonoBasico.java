package PatronesEstructurales.Decorator;

public class TelefonoBasico implements Telefono{
    public void crear() {
        System.out.println("Soy un teléfono basico. Mis carácteristicas son: ");

        this.tengoGSM();
        this.tengoSMS();
    }

    private void tengoGSM() {
        System.out.println("  -> Red 2G/3G");
    }

    private void tengoSMS() {
        System.out.println("  -> SMS/MMS");
    }
}
