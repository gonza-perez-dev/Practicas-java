package farmacia.productos;

public class Medicamento extends Producto {

    public String recetaObligatoria;

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
