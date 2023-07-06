package PatronesComportamiento.Mediator;

import java.util.ArrayList;

public class MediadorConcreto extends Mediador {

    ArrayList<Colega> colegas = new ArrayList();
    @Override
    void registra(Colega colega) {
        if (!colegas.contains(colega)) {
            colegas.add(colega);
            colega.setMediador(this);
        }
    }

    @Override
    void reenvia(Colega colega) { //envia el mensaje  a todos menos a mi mismo
        for (Colega actual : colegas){
            if (!actual.equals(colega)){
                actual.recibe();
            }
        }
    }
}
