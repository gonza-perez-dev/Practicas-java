package farmacia.productos;

public class Medicamento extends Producto {

    public String recetaObligatoria;

    public Medicamento() {
    }

    public Medicamento(String codigoBarras, String nombre, String categoria, double precio, String recetaObligatoria) {
        super(codigoBarras, nombre, categoria, precio);
        this.recetaObligatoria = recetaObligatoria;

    }

    @Override
    public void mostrarInfoInterna() {
        super.mostrarInfoInterna();
        System.out.println("Receta Obligatoria: " + this.recetaObligatoria);
    }

    @Override
    public void datosPublicos() {
        super.datosPublicos();
        System.out.println("Receta Obligatoria: " + this.recetaObligatoria);
    }
}
