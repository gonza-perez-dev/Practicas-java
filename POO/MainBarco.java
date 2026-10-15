package POO;

public class MainBarco {
    public static void main(String[] args) {

        Barco barco1 = new Barco("Pepsi", "1942", 500, "tres yardas", 20000);

        System.out.println("--- PRIMER AVION ---");
        System.out.println("Marca: " + barco1.getMarca());
        System.out.println("Modelo: " + barco1.getModelo());
        System.out.println("Consumo: " + barco1.getConsumo() + " km/l");
        System.out.println("Tipo de combustible: " + barco1.getTipoCombustible());
        System.out.println("Horas de vuelo: " + barco1.getMillasNauticas());

    }

}
