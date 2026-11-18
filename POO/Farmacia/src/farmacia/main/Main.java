package farmacia.main;

import farmacia.productos.Producto;
import farmacia.productos.Medicamento;
import farmacia.ventas.Receta;
import farmacia.clientes.ClienteExterno;

public class Main {

    public static void main(String[] args) {

        Producto p = new Producto("1", "Ibuprofeno", "Analgesicos", 5000);
        p.mostrarInfoInterna();
        p.datosPublicos();

        Medicamento m = new Medicamento("2", "Tafirol", "Analgesico", 5000, "1 cada 8 horas");
        m.mostrarInfoInterna();
        m.datosPublicos();

        Receta r = new Receta("3", "Caladril", "Analgesico", 4000, "Carlos");
        r.mostrarInfoInterna();
        r.datosPublicos();

        ClienteExterno cE = new ClienteExterno("Luciano");
        cE.accesoExterno();

    }

}