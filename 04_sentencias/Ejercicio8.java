import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de estudiantes: ");
        int numE = scanner.nextInt();
        int suma = 0;
        int contador = 0;
        for (int i = 1; i <= numE; i++) {
            suma += i;
            System.out.println("Ingrese edad del estudiante");
            int edad = scanner.nextInt();
            suma += edad;
            if (edad >= 18) {
                contador++;
            }
        }
        double promE = (double) suma / numE;
        System.out.println("El promedio de edades es: " + promE);  
        System.out.println("El número de estudiantes mayores de edad es: " + contador);
    }
}
