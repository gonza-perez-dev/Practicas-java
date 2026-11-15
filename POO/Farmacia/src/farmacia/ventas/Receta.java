package farmacia.ventas;

import farmacia.productos.Producto;

public class Receta extends Producto {

    public String paciente;

    @Override
    public void mostrarInfoInterna() {
        super.mostrarInfoInterna();

    }

    @Override
    public void datosPublicos() {
        super.datosPublicos();
        System.out.println("Paciente: " + this.paciente);
    }
}
