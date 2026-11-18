package Arreglos;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) throws Exception {
        String semana[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
        int pSemanales[] = new int[7];
        Scanner leer = new Scanner(System.in);

        // Bucle de carga sincronizada
        for (int i = 0; i < pSemanales.length; i++) {
            System.out.println("Ingrese la cantidad de pizzas del " + semana[i] + ": ");
            pSemanales[i] = leer.nextInt();
        }

        // Bucle de informe final con arreglos paralelos
        System.out.println("--- INFORME DE PRODUCCIÓN ---");
        for (int i = 0; i < semana.length; i++) {
            System.out.println(semana[i] + ": " + pSemanales[i] + " pizzas");
        }
    }
}