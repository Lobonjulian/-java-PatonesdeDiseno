package patronesCreacionales.Builder;
//Creacion de un Builder
public class CocheBuilder {
    Vehiculo vehiculo; //llamada de la clase

    private CocheBuilder() {};

    public CocheBuilder(String marca) { //instanciacion
        vehiculo = new Vehiculo(marca);
        vehiculo.marca = marca;
    }

    public CocheBuilder setPuertas(int puertas) {
        vehiculo.puertas = puertas;
        return this;  // funcion que se devuelve asi misma
    }

    public CocheBuilder setMotor(String motor) {
        vehiculo.motor = motor;
        return this;
    }

    public CocheBuilder setTipo(String tipo) {
        vehiculo.tipo = tipo;
        return this;
    }

    public Vehiculo build() { //metodo para que nos devuelva el objecto que hemos creado
        return this.vehiculo;
    }
}
