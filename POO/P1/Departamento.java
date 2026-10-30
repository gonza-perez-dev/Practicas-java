package P1;

public class Departamento extends Vivienda {

    private int piso;
    private String departamento;

    public Departamento(int identificador, String direccion, double area, double precioPorM2, int numDormitorio,
            int numBanos, int piso, String departamento) {
        super(identificador, direccion, area, precioPorM2, numDormitorio, numBanos);
        this.piso = piso;
        this.departamento = departamento;
    }

    public Departamento() {

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El numero de piso es: " + this.piso);
        System.out.println("El numero y/o letra de departamento es: " + this.departamento);
    }

    public int getPiso() {
        return this.piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
