import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // El ciclo se repite solo si la hora actual de la PC es menor a las 18 hs
    while (LocalTime.now().getHour() < 18) {
    
        System.out.print("Ingrese el numero para votar a los candidatos 1 o 2: ");
        int candidato = scanner.nextint();
    }  
    
    }
}
