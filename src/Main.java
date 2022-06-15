import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empresa miEmpresa=new Empresa(3);
        Empleado objempleado=new Empleado();
        miEmpresa.setNombre("Nombre de la empresa");

        // Composicion--> el Empleado Forma parte de la Empresa.

        String nombre;
        float sueldo;
        for (int i=1; i<=2; i++){
            Scanner emp= new Scanner(System.in);
            System.out.println("Nombre del Empleado:");
            nombre=emp.nextLine();
            System.out.println("Sueldo:");
            sueldo=emp.nextFloat();

            objempleado=new Empleado();
            objempleado.setNombre(nombre);
            objempleado.setSueldo(sueldo);

            //objempleado.setNombre("abc");

            miEmpresa.Contratar(objempleado);

           //objempleado.setNombre("xyz");
        }
        miEmpresa.mostrarListaEmpleados();


        //agregacion--> Los clientes tienen relacion con la Empresa.

        Cliente objcliente= new Cliente();
        objcliente.setNombre("cliente 1");
        miEmpresa.Agregar_Cliente(objcliente);

        //objcliente=new Cliente();
        objcliente.setNombre("cliente 2");
        miEmpresa.Agregar_Cliente(objcliente);

        miEmpresa.mostrarListaClientes();












    }
}
