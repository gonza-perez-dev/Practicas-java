package P1;

public class Inmueble {

    private int identificador;
    private String direccion;
    private double area;
    private double precioPorM2;

    // Constructor vacío
    public Inmueble() {
    }

    public Inmueble(int identificador, String direccion, double area, double precioPorM2){
        this.identificador=identificador;
        this.direccion=direccion;
        this.area=area;
        this.precioPorM2=precioPorM2;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrecioPorM2() {
        return this.precioPorM2;
    }

    public void setPrecioPorM2(double precioPorM2) {
        this.precioPorM2 = precioPorM2;
    }

    public double calcularPrecioVenta(){
        return this.area * this.precioPorM2;
    }

    public void mostrarDatos(){
        System.out.println("El ID del inmueble es: " + this.identificador);
        System.out.println("La direccion es: " + this.direccion);
        System.out.println("El area es: " + this.area);
        System.out.println("El precio por metro cuadrado es: "+ this.precioPorM2);

    }
}
