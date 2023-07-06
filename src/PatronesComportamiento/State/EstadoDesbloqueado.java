package PatronesComportamiento.State;

public class EstadoDesbloqueado extends Estado {
    public EstadoDesbloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear() el Movil ya estaba desbloqueado";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiarEstado(new EstadoCamaraAbierta(telefono));
        return "camara abierta, Puedes hacer la Foto";
    }

    @Override
    public String hacerFoto() {

        return "hacerFoto(); No se pueda hacer una foto sin abrir la Camara";
    }
}