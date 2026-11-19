package Arreglos;

public class Ej3 {

    public static void main(String[] args) throws Exception {

        double temperaturas[] = { 30, 28, 36, 32, 29, 31, 32 };
        double acumulador = 0;
        double mayort = temperaturas[0];

        for (int i = 0; i < temperaturas.length; i++) {

            acumulador += temperaturas[i];
            if (temperaturas[i] > mayort) {

                mayort = temperaturas[i];

            }
            if (i == 0) {

                System.out.println("Dia 1: " + temperaturas[i] + "°C");

            } else if (i == 3) {

                System.out.println("Dia 4: " + temperaturas[i] + "°C");
            }
        }

        System.out.println("El promedio semanal es: " + String.format("%.2f", (acumulador / 7.0)) + "°C");
        System.out.println("La mayor temperatura es: " + mayort + "°C");
    }
}
