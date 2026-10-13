package POO;

public class Auto extends Vehiculo {

    private double km;

    public Auto() {
    }

    public Auto(String marca, String modelo, double consumo, String tipoCombustible, double km) {
        super(marca, modelo, consumo, tipoCombustible);
        this.km = km;
    }

    public double getKm() {
        return this.km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}