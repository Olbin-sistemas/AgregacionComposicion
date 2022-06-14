import java.util.LinkedList;

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
        empleados.add(objEmpleado);
        this.e++;
    }

    public void Agregar_Cliente(Cliente objcliente) {
        clientes.add(objcliente);
        this.c++;
    }

    public void mostrarListaEmpleados() {
        int tam = this.empleados.size();
        for (int i = 0; i < tam; i++) {
            System.out.println(this.empleados.get(i).getNombre()); //"-->" + this.empleados.get(i).getSueldo() + "\n"/);
        }
    }

    public void mostrarListaClientes() {
        int tam = this.clientes.size();
        for (int i = 0; i < tam; i++) {
            System.out.println(this.clientes.get(i).getNombre() +"\n");
        }
    }

}

