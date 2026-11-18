package farmacia.clientes;

import farmacia.productos.Producto;

public class ClienteExterno{
    public String nombreCliente;

    public ClienteExterno(){
    }

    public ClienteExterno(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public void accesoExterno(){
        Producto p = new Producto();
        System.out.println("Precio: " + p.precio);
    }
}