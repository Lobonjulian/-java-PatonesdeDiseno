package PatronesEstructurales.Decorator;
//aqui se produce el decorador
public class TelefonoDecorador implements Telefono {
    private final Telefono telefono;

    public TelefonoDecorador(Telefono telefono) {
        this.telefono = telefono;
    }

    @Override
    public void crear() {
        this.telefono.crear();
    }
}
