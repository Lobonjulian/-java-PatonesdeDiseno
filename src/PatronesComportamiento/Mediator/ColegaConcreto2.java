package PatronesComportamiento.Mediator;

public class ColegaConcreto2 extends Colega{
    @Override
    void recibe() {
        System.out.println("he recivido un mensaje son el colegaConcreto2");
    }

    @Override
    void envia() {
        System.out.println("soy colegaConcreto2 y estoy enviando un mensaje");
        mediador.reenvia(this);
    }
}