package patronesCreacionales.Builder;

public class Main {
    public static void main(String []args) {
        Vehiculo coche = new CocheBuilder("KIA ")
                .setTipo("Diesel")
                .setMotor("Combustion o Electrico")
                .setPuertas(2)
                .build();

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Tipo: " + coche.getTipo());
        System.out.println("Motor: " + coche.getMotor());
        System.out.println("Puertas: " + coche.getPuertas());

    }

}
