package PatronesComportamiento.Mediator;

public class ColegaConcreto1 extends Colega{
    @Override
    void recibe() {
        System.out.println("he recivido un mensaje son el colegaConcreto1");
    }

    @Override
    void envia() {
        System.out.println("soy colegaConcreto1 y estoy enviando un mensaje");
        mediador.reenvia(this); //METODO ENVIA DEL MEDIADOR
    }
}
