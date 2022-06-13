import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empresa miEmpresa=new Empresa(3);
        Empleado objempleado=new Empleado();
        miEmpresa.setNombre("Nombre de la empresa");

        String nombre;
        float sueldo;
        for (int i=1; i<=2; i++){
            Scanner emp= new Scanner(System.in);
            System.out.println("Nombre del Empleado");
            nombre=emp.nextLine();
            System.out.println();
            System.out.println("Sueldo: ");
            sueldo=emp.nextFloat();

            objempleado=new Empleado();


            objempleado.setNombre(nombre);
            objempleado.setSueldo(sueldo);

            miEmpresa.Contratar(objempleado);
        }

        miEmpresa.mostrarListaEmpleados();







    }
}
