import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese el valor de la primera nota");
        double nota1 = scanner.nextDouble();
        System.out.println("Ingrese el valor de la segunda nota");
        double nota2 = scanner.nextDouble();
        System.out.println("Ingrese el valor de la tercera nota");
        double nota3 = scanner.nextDouble();
        
        double notaFinal = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5);

        System.out.println("El valor de la nota final es:" + notaFinal);
    }
}
