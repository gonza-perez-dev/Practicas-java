package POO;

public class MainAvion {

    public static void main(String[] args) {

        Avion avion1 = new Avion("Boeing", "747", 5, "Jet Fuel", 400);

        System.out.println("--- PRIMER AVION ---");
        System.out.println("Marca: " + avion1.getMarca());
        System.out.println("Modelo: " + avion1.getModelo());
        System.out.println("Consumo: " + avion1.getConsumo() + " km/l");
        System.out.println("Tipo de combustible: " + avion1.getTipoCombustible());
        System.out.println("Horas de vuelo: " + avion1.getHorasVuelo());

        Avion avion2 = new Avion("Airbus", "A320", 3, "Jet A-1", 250);

        System.out.println("--- SEGUNDA AVION ---");
        System.out.println("Marca: " + avion2.getMarca());
        System.out.println("Modelo: " + avion2.getModelo());
        System.out.println("Consumo: " + avion2.getConsumo() + "km/l");
        System.out.println("Tipo de combustible: " + avion2.getTipoCombustible());
        System.out.println("Horas de vuelo: " + avion2.getHorasVuelo());
    }

}
