package Arreglos.Parcial;

import java.util.Arrays;

public class arregloParcial {

    public static void main() throws Exception {

        double montos[] = { 15000.5, 23000.0, 19500.8, 31000.2, 28000.0, 14200.5, 35000.0 };
        double acumulador = 0;
        double maximo = 0;

        for (int i = 0; i < montos.length; i++) {

            acumulador += montos[i];
            if (montos[i] > maximo) {
                maximo = montos[i];
            }

        }
        System.out.println("Total acumulado por semana: " + acumulador);
        System.out.println("La venta maxima fue: " + maximo);
        System.out.println("Dia 2: " + montos[1]);
        System.out.println("Dia 5: " + montos[4]);

    }

}
