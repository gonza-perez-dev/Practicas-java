package P1;

public class Main {
    public static void main(String[] args) {

        Casa casa1 = new Casa();
        casa1.setIdentificador(1);
        casa1.setDireccion("Roque Saenz Peña 5591 E");
        casa1.setArea(200);
        casa1.setPrecioPorM2(1500);
        casa1.setNumDormitorio(1);
        casa1.setNumBanos(1);
        casa1.setNumCasa(1);

        casa1.mostrarDatos();
        System.out.println(casa1.calcularPrecioVenta());

        Casa casa2 = new Casa(2, "San Martin 123", 220, 1400, 3, 2, 2);

        casa2.mostrarDatos();
        System.out.println(casa2.calcularPrecioVenta());

        Departamento departamento1 = new Departamento();
        departamento1.setIdentificador(3);
        departamento1.setDireccion("Av. Libertador 23");
        departamento1.setArea(80);
        departamento1.setPrecioPorM2(1000);
        departamento1.setNumDormitorio(2);
        departamento1.setNumBanos(1);
        departamento1.setPiso(2);
        departamento1.setDepartamento("2B");

        departamento1.mostrarDatos();
        System.out.println(departamento1.calcularPrecioVenta());

        Departamento departamento2 = new Departamento(4, "Av. Libertador 23", 80, 1000, 2, 1, 3, "3A");

        departamento2.mostrarDatos();
        System.out.println(departamento2.calcularPrecioVenta());

        LocalComercial localComercial1 = new LocalComercial();
        localComercial1.setIdentificador(5);
        localComercial1.setDireccion("Pampa 123");
        localComercial1.setArea(400);
        localComercial1.setPrecioPorM2(3000);
        localComercial1.setCentroComercial("Paseo del Centro");

        localComercial1.mostrarDatos();
        System.out.println(localComercial1.calcularPrecioVenta());

        LocalComercial localComercial2 = new LocalComercial(6, "Las praderas S/N", 500, 2800, "La Bodega");

        localComercial2.mostrarDatos();
        System.out.println(localComercial2.calcularPrecioVenta());

    }
}