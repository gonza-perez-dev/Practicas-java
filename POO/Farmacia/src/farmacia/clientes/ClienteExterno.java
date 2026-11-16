package farmacia.clientes;

import farmacia.productos.Producto;

public class ClienteExterno{
    public String nombreCliente;

    public void accesoExterno(){
        System.out.println("Precio: " + this.precio);
    }
}