package Arreglos;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) throws Exception {

        String invitados[] = { "Gonzalo", "Diego", "Marcelo", "Claudia", "Romina" };
        boolean encontrado = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del invitado: ");
        String nombreBuscado = leer.nextLine();

        for (int i = 0; i < invitados.length; i++) {

            if (invitados[i].equalsIgnoreCase(nombreBuscado)) {

                encontrado = true;

            }
        }

        if (encontrado == true) {
            System.out.println("El invitado esta en la lista");
        } else {
            System.out.println("El invitado no esta en la lista");
        }

    }
}