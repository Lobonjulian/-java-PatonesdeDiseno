package Refactor;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        ConstructorLargoBuilder cosa = new ConstructorLargoBuilder("ford")
                .comModelo("v3")
                .comMotor("electrico")
                .comPuertas(2);


        int []numeros = {45,56,23,6};
        imprimirMayoryMenor(numeros);
    }

    // inline
//    public static boolean hoyesDomingo(){
//        boolean isDomingo = (numeros == 7 ? true : false);
//        if(isDomingo){
//            System.out.println(isDomingo);
//        }
//    }




    public static void  imprimirMayoryMenor(int []numeros){
        int mayor = Arrays.stream(numeros).reduce(0 ,(a,b) -> a > b ? a : b);
        int menor = Arrays.stream(numeros).reduce(numeros[0],(a,b) -> a > b ? a : b);

        System.out.println("Mayor: " + mayor + " y menor: " + menor);
    }

    // estraer el valor de rectorno
    public static int ifAniado1(){
        int valor1 = 10;
        int valor2 = 10;

        if (valor1 > valor2){
            return valor1;
        }
        return valor2;
    }
}
