package POO;

public class MainAuto {
    public static void main(String[] args) {

        // Creamos un objeto Auto usando el la herencia del padre (Vehiculo)
        Auto auto1 = new Auto("Toyota", "Corolla", 14, "Nafta", 100000);

        // Probamos ver sus datos usando los getters, incluyendo los heredados del padre
        System.out.println("--- PRIMER AUTO ---");
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Consumo: " + auto1.getConsumo() + " km/l");
        System.out.println("Tipo de combustible: " + auto1.getTipoCombustible());
        System.out.println("Kilometraje: " + auto1.getKm() + " km");

        // Creamos un segundo objeto
        Auto auto2 = new Auto("Honda", "Civic", 16, "Nafta", 80000);

        System.out.println("--- SEGUNDO AUTO ---");
        System.out.println("Marca: " + auto2.getMarca());
        System.out.println("Modelo: " + auto2.getModelo());
        System.out.println("Consumo: " + auto2.getConsumo() + " km/l");
        System.out.println("Tipo de combustible: " + auto2.getTipoCombustible());
        System.out.println("Kilometraje: " + auto2.getKm() + " km");


        Auto auto3 = new Auto("Fiat", "600", 17.5, "Diesel", 800000);



        System.out.println("--- TERCER AUTO ---");
        System.out.println("Marca: " +auto3.getMarca());
        System.out.println("Modelo: " + auto3.getModelo());
        System.out.println("Consumo: " + auto3.getConsumo() + " km/l");
        System.out.println("Tipo de combustible: " + auto3.getTipoCombustible());
        System.out.println("Kilometraje: " + auto3.getKm() + " km");


        //Crear un auto que no sabemos los datos (Constructo Vacio)

        Auto auto4 = new Auto();

        //Crear un auto que no sabemos los datos (Constructo Vacio)

        
    }

}