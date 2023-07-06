package PatronesComportamiento.State;

public class EstadoBloqueado extends Estado{
    public EstadoBloqueado(Telefono telefono){
        super(telefono);
    }
    @Override
    public String desbloquear() {
        telefono.cambiarEstado(new EstadoBloqueado(telefono));
        return "desbloquea(); Movil desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "abrir(Camara);La Camara esta bloqueada, desbloqueda el movil antes";
    }

    @Override
    public String hacerFoto() {
        return "(hacer foto);La Camara esta bloqueada, desbloqueda el movil antes";
    }
}
