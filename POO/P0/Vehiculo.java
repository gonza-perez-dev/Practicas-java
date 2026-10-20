package POO;

public class Vehiculo {

    private String marca;
    private String modelo;
    private double consumo;
    private String tipoCombustible;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, double consumo, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.tipoCombustible = tipoCombustible;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumo() {
        return this.consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getTipoCombustible() {
        return this.tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

}
