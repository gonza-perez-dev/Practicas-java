package P1;

public class LocalComercial extends Inmueble {

    private String centroComercial;

    public LocalComercial(int identificador, String direccion, double area, double precioPorM2,
            String centroComercial) {
        super(identificador, direccion, area, precioPorM2);
        this.centroComercial = centroComercial;
    }

    public LocalComercial() {
    }

    public String getCentroComercial() {
        return this.centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Ubicacion del local: " + this.centroComercial);
    }
}
