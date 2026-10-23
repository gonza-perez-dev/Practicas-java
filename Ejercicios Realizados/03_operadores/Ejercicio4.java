import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de IVA");
        int valor_IVA = scanner.nextInt();
        System.out.println("Ingrese el valor de producto");
        int valor_producto = scanner.nextInt();
        float resultado = valor_IVA * valor_producto / 100;
        System.out.println("El valor del producto de " + valor_IVA + "% de IVA "+ " es "+ resultado );
    }
}