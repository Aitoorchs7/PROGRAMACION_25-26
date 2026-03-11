package a01;

public class CuentaCorriente {
    String nombre;
    String dni;
    double salario;

    CuentaCorriente(String nombre, String dni, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.salario = salario;
    }
    void sacarDinero(double retirada){
        salario = salario - retirada;
        System.out.println(salario);
    }
    void ingresarDinero(double ingreso){
        salario = salario + ingreso;
        System.out.println(salario);
    }
    void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("DNI: " + this.dni);
        System.out.println("Salario: " + this.salario);
    }


}
