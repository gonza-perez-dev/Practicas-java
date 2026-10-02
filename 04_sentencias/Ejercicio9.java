import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del peaje: ");
        int peaje = scanner.nextInt();

        int totalRecaudado = 0;
        int autos = 0;
        int buses = 0;
        int camiones = 0;

        int totalVehiculos = 0;

        while (peaje != 0) {

            
            if (peaje == 5000) {
                System.out.println("Ingreso un auto");
                autos++;
                totalRecaudado = totalRecaudado + peaje;
                totalVehiculos++;

            } else if (peaje == 7000) {
                System.out.println("Ingreso un bus");
                buses++;
                totalRecaudado = totalRecaudado + peaje;
                totalVehiculos++;
            } else if (peaje == 10000) {
                System.out.println("Ingreso un camion");
                camiones++;
                totalRecaudado = totalRecaudado + peaje;
                totalVehiculos++;
            } else {
                System.out.println("Valor de peaje no valido");
                
            }

            
            System.out.print("Ingrese el valor del peaje (0 para salir): ");
            peaje = scanner.nextInt();

        }
        int autosPublicos = buses + camiones;

        System.out.println("Total recaudado: " + totalRecaudado);
        System.out.println("Porcentaje de autos: " + (autos * 100 / totalVehiculos) + "%");
        System.out.println("Porcentaje de autos publicos: " + (autosPublicos * 100 / totalVehiculos) + "%");
    }
}
