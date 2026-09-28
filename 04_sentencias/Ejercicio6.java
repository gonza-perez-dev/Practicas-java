import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese el primer numero");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double num2 = scanner.nextDouble();
        System.out.println("Ingrese el tercer numero");
        double num3 = scanner.nextDouble();
        double numM;

        if (num1 > num2) {
            numM = num1;
        } else {
            numM = num2;
        }
        if (numM < num3) {
            numM = num3;
            System.out.println("El numero mayor es" + numM);
        } else {
            System.out.println("El numero mayor es" + numM);
        }
    }
}