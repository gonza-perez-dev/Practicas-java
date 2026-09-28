import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese la edad");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el promedio");
        double prom = scanner.nextDouble();

        if ((edad >= 16 && edad <=18) && (prom >= 4.6)) {
            System.out.println("Estas aprobado");
        } else {
            System.out.println("Estas desaprobado");
        }
    }
}
