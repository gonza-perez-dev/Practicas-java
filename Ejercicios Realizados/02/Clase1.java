public class Clase1 {

    public static void main (String [] args){
    int edad = 30;
    double precio = 99.99;

    int aniosFuturos = 5;
    int edadFutura = edad + aniosFuturos; //suma
    double precioConDescuento = precio - 20.0; //resta

    char inicial = 'A';
    String mensaje = "Hola, bienvenidos a Java";

    System.out.println(mensaje);
    System.out.println("Tu inicial es: " + inicial);
    System.out.println("Edad en 5 años: " + edadFutura);
    System.out.println("Precio con descuento "+ precioConDescuento);
}
}