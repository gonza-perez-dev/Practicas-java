import java.time.LocalTime;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c1 = 0;
        int c2 = 0;
        int candidato = 1;

        // El ciclo se repite solo si la hora actual de la PC es menor a las 18 hs
        while ((LocalTime.now().getHour() < 18) && candidato != 0) {

            System.out.print("Ingrese el numero para votar a los candidatos 1 o 2: ");
            candidato = scanner.nextInt();

            if (candidato == 1) {
                System.out.println("Usted voto al candidato 1");
                c1++;
            } else if (candidato == 2) {
                System.out.println("Usted voto al candidato 2");
                c2++;
            } else {
                System.out.println("Ingreso un numero incorrecto, vuelva a intentarlo");
            }
        }
        System.out.println("Resultados de la votación:");
        System.out.println("Candidato 1: " + c1 + " votos");
        System.out.println("Candidato 2: " + c2 + " votos");
        if (c1 > c2) {
            System.out.println("El candidato 1 es el ganador");
        } else if (c2 > c1) {
            System.out.println("El candidato 2 es el ganador");
        } else {
            System.out.println("Hubo un empate entre los candidatos");
        }
    }
}
