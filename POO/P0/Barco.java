package POO;

public class Barco extends Vehiculo {

    private double millasNauticas;

    public Barco() {
    }

    public Barco(String marca, String modelo, double consumo, String tipoCombustible, double millasNauticas) {
        super(marca, modelo, consumo, tipoCombustible);
        this.millasNauticas = millasNauticas;
    }

    public double getMillasNauticas() {
        return this.millasNauticas;
    }

    public void setMillasNauticas(double millasNauticas) {
        this.millasNauticas = millasNauticas;
    }
}