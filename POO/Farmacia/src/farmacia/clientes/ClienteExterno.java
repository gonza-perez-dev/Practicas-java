package farmacia.clientes;

import farmacia.productos.Producto;

public class ClienteExterno {
    String nombreCliente;

    public void accesoExterno() {
        Producto p = new Producto();
        System.out.println("Precio: " + p.precio);
    }

    public void datosPublicos() {
        Producto p = new Producto();
        System.out.println("Precio: " + p.precio);
        System.out.println("Cliente: " + this.nombreCliente);
    }
}