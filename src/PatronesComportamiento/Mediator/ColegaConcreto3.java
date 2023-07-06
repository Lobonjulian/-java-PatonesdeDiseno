package PatronesComportamiento.Mediator;

public class ColegaConcreto3 extends Colega{
    @Override
    void recibe() {
        System.out.println("he recivido un mensaje son el colegaConcreto3");
    }

    @Override
    void envia() {
        System.out.println("soy colegaConcreto3 y estoy enviando un mensaje");
        mediador.reenvia(this);
    }
}