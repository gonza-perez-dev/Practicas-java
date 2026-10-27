package P1;

public class Vivienda extends Inmueble{
    private int numDormitorio;
    private int numBanos;

    public Vivienda(int identificador, String direccion, double area, double precioPorM2, int numDormitorio, int numBanos){
        super(identificador, direccion, area, precioPorM2);
        this.numDormitorio = numDormitorio;
        this.numBanos = numBanos;
    }

    public Vivienda(){
        
    }

    public int getNumDormitorio() {
        return this.numDormitorio;
    }

    public void setNumDormitorio(int numDormitorio) {
        this.numDormitorio = numDormitorio;
    }

    public int getNumBanos() {
        return this.numBanos;
    }

    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Cantidad de dormitorios: " + this.numDormitorio);
        System.out.println("Camtodad de banos: " + this.numBanos);
    }

}