package PatronesComportamiento.Iterator;

import PatronesComportamiento.Iterator.Usuario;

public interface UsuarioIterator {
    //Hay mas usuarios en el iterador
    boolean hayMas();

    //Reinicia el contador (el iterador)
    void reiniciar();
     //obtener el siguiente
    Usuario siguiente();
}
