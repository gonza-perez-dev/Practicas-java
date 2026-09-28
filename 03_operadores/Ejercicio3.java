import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de X");
        int valor_x = scanner.nextInt();
        System.out.println("El valor de X es: "+ valor_x);

        int valor_y = 2 * (valor_x * valor_x) + 7 * valor_x + 1;
        System.out.println("El valor de y es: " + valor_y);

    }
}