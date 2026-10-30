package P1;

public class Casa extends Vivienda {

    private int numCasa;

    public Casa(int identificador, String direccion, double area, double precioPorM2, int numDormitorio, int numBanos,
            int numCasa) {
        super(identificador, direccion, area, precioPorM2, numDormitorio, numBanos);
        this.numCasa = numCasa;
    }

    public Casa() {

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El numero de casa es: " + this.numCasa);
    }

    public int getNumCasa() {
        return this.numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

}
