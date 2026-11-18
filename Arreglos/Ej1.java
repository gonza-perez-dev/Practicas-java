package Arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) throws Exception {
        double ingresos[] = new double[12];
        Scanner leer = new Scanner(System.in);
        double acumulador = 0;

        for (int i = 0; i < ingresos.length; i++) {
            System.out.println("Ingrese el sueldo: ");
            ingresos[i] = leer.nextDouble();
            acumulador += ingresos[i];
        }
        
        System.out.println("Los sueldos de este año son: " + Arrays.toString(ingresos));
        System.out.println("El promedio del sueldo anual es: " + acumulador / 12);
    }
}