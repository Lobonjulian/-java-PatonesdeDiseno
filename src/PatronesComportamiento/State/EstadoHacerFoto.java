package PatronesComportamiento.State;

public class EstadoHacerFoto extends Estado{
    public EstadoHacerFoto(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "Movil ya desbloqueado";
    }

    @Override
    public String abrirCamara() {

        return "la camara ya la habias abierto.";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiarEstado(new EstadoDesbloqueado(telefono));
        return "la foto se ha realizado";
    }
}
