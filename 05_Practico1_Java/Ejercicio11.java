import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double L = 0;
        double P = 0;
        double sumaP = 0;
        int cantidadP = 0;
        double perdida = 0.9648;

        System.out.print("Ingrese el valor de L: ");
        L = scanner.nextDouble();
        System.out.print("Ingrese el valor de P: ");
        P = scanner.nextDouble();

        sumaP += P * perdida;
        cantidadP++;
        

        while (L>sumaP) {
            
            sumaP += P * perdida;
            cantidadP++;

        }
        System.out.println("La cantidad de camiones que descargaron es: " + cantidadP);
    }
}
