package PatronesComportamiento.Mediator;

abstract public class Colega {
    public Mediador mediador;
    public void  setMediador(Mediador mediador) {
        this.mediador = mediador;
    }
    abstract void recibe();
    abstract void envia();
}
