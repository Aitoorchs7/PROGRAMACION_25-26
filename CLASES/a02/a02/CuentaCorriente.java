package a02;

public class CuentaCorriente {
    //definimos los atributos
    String dni;
    String nombre;
    double saldo;

    //creamos el constructor
    CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    //en este constructor sobrecargado introducimos solo
    //el nombre y el dni, y el salario se pone de predeterminado
    CuentaCorriente(String dni,String nombre) {
        this( dni, nombre,0);
    }
    //Mientras que en este solo se introduce el dni y el salario
    CuentaCorriente(String dni,double saldo) {
        this(dni,"",saldo);
    }
    // Métodos del ejercicio anterior
    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) this.saldo += cantidad;
    }

    public boolean sacarDinero(double cantidad) {
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + nombre + " | DNI: " + dni + " | Saldo: " + saldo + "€");
    }
}




