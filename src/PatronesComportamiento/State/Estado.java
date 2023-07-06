package PatronesComportamiento.State;

abstract public class Estado {
    public Telefono telefono;

    public Estado(Telefono telefono) {
        this.telefono = telefono;
    }
    //estados del telefono
    abstract public String desbloquear();
    abstract public String abrirCamara();
    abstract public String hacerFoto();
}
