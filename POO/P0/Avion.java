package POO;

public class Avion extends Vehiculo {

    private double horasVuelo;

    public Avion() {
    }

    public Avion(String marca, String modelo, double consumo, String tipoCombustible, double horasVuelo) {
        super(marca, modelo, consumo, tipoCombustible);
        this.horasVuelo = horasVuelo;
    }

    public double getHorasVuelo() {
        return this.horasVuelo;
    }

    public void setHorasVuelo(double horasVuelo) {
        this.horasVuelo = horasVuelo;
    }
}