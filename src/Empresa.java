import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private String nombre;
    private LinkedList<Empleado> empleados;
    private LinkedList<Cliente> clientes;
    private int e;
    private int c;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empresa(int n) {
        e = -1;
        c = -1;
        empleados = new LinkedList<Empleado>();
        clientes = new LinkedList<Cliente>();
    }

    public void Contratar(Empleado objEmpleado) {
        this.e++;
        empleados.add(objEmpleado);
    }

    public void Agregar_Cliente(Cliente objcliente) {
        this.c++;
        clientes.add(objcliente);
    }

    public void mostrarListaEmpleados() {
        int tam = this.empleados.size();

        for (int i = 0; i < tam; i++) {
            System.out.println(this.empleados.get(i).getNombre() + "-->" + this.empleados.get(i).getSueldo() + "\n");
        }


    }

}


