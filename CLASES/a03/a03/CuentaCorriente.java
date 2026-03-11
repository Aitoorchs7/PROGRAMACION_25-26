package a03;

public class CuentaCorriente {
    private double saldo;
    public String nombre;
    String dni;

    CuentaCorriente(String nombre, String dni, double saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
    }

    void mostrarDatos(){

        System.out.println("Saldo: "+saldo);
        System.out.println("Nombre: "+nombre);
        System.out.println("Dni: "+dni);
    }

}
