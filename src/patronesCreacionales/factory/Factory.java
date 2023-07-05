package patronesCreacionales.factory;

public class Factory {
    private Precio precio; //esta es la factory
    private Factory() {}; // ocultamos el constructor
    public Factory(String pais) {
        if (pais.equalsIgnoreCase("Colombia")) {
            this.precio = new PrecioCOO();
        }else if (pais.equalsIgnoreCase("Europa")){
            this.precio = new PrecioEUR();
        }
        else {
            this.precio = new PrecioUSD();
        }
    }
        //nos devuelve una variable de la interfaz precio
    public double getPrecio() {
        return precio.getPrecio();
    }
}
