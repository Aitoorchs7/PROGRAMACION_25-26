package a01;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        String DNI = sc.nextLine();
        double salario = 2000.0;

        CuentaCorriente cuenta = new CuentaCorriente(nombre,DNI,salario);

        cuenta.sacarDinero(500);

        cuenta.ingresarDinero(550);

        cuenta.mostrarDatos();

    }
}
