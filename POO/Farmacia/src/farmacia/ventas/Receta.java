package farmacia.ventas;

import farmacia.productos.Producto;

public class Receta extends Producto {
    public String paciente;

    public Receta() {
    }

    public Receta(String codigoBarras, String nombre, String categoria, double precio, String paciente) {
        super(codigoBarras, nombre, categoria, precio);
        this.paciente = paciente;
    }

    @Override
    public void mostrarInfoInterna() {
        super.mostrarInfoInterna();
        System.out.println("Paciente: " + this.paciente);
    }

    @Override
    public void datosPublicos() {
        super.datosPublicos();
        System.out.println("Paciente: " + this.paciente);
    }
}
