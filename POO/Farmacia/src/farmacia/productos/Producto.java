package farmacia.productos;

public class Producto {

    private String codigoBarras;
    String nombre;
    protected String categoria;
    public double precio;

    public Producto() {

    }

    public Producto(String codigoBarras, String nombre, String categoria, double precio) {
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public void mostrarInfoInterna() {
        System.out.println("Codigo: " + this.codigoBarras);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Precio: " + this.precio);
    }

    public void mostrarInfoInterna(boolean oferta){
        System.out.println("¡Oferta del día! 15% de descuento en productos seleccionados.");
    }

    public void datosPublicos(){
        System.out.println("Precio: " + this.precio);
    }
}
