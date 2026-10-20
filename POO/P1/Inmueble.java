package P1;

public class Inmueble {

    private int ID;
    private String dir;
    private double area;
    private double precio;

    // Constructor vacío
    public Inmueble() {
    }

    public Inmueble(int ID, String dir, double area, double precio){
        this.ID=ID;
        this.dir=dir;
        this.area=area;
        this.precio=precio;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDir() {
        return this.dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularPrecioVenta(){
        return this.area * this.precio;
    }

    public void mostrarDatos(){
        System.out.println();
    }
}
