package Refactor;

public class ConstructorLargoBuilder {
    String marcas;
    String modelo;
    String motor;
    int puertas;

    private ConstructorLargoBuilder(){}
    public  ConstructorLargoBuilder(String marcas){
        this.marcas = marcas;
    }
    public  ConstructorLargoBuilder comModelo(String modelo){
        this.modelo = modelo;
        return this;
    }
    public  ConstructorLargoBuilder comMotor(String motor){
        this.motor = motor;
        return this;
    }
    public  ConstructorLargoBuilder comPuertas(int puertas){
        this.puertas = puertas;
        return this;
    }


}
