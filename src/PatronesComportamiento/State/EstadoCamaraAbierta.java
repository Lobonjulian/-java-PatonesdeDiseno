package PatronesComportamiento.State;

public class EstadoCamaraAbierta extends Estado {
    public EstadoCamaraAbierta(Telefono telefono){
        super(telefono);
    }
    @Override
    public String desbloquear() {

        return "desbloquear(); YA ESTA DESBLOQUEADO EL MOVIL";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(); LA CAMARA YA LA HABIAS ABIERTO";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiarEstado(new EstadoHacerFoto(telefono));
        return "La foto se va a tomar ya ...";
    }
}
