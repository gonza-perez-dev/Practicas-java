package P1;

public class Vivienda extends Inmueble(){
    private int numDormitorio;
    private int numBanos;

    public Vivienda(int identificador, String direccion, double area, double precioPorM2, int numDormitorio, int numBanos){
        super(identificador, direccion, area, precioPorM2);
        this.numDormitorio = numDormitorio;
        this.numBanos = numBanos;
    }
}