package a02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pedimos los datos al usuario para crear la cuenta
        System.out.println("Introduzca su dni y su nombre: ");
        String dni = sc.nextLine();
        String nombre = sc.nextLine();
        double sueldo = 0;
        //creamos la cuenta en el constructor de la otra clase
        CuentaCorriente cuenta1 = new CuentaCorriente(dni,nombre,sueldo);

        //para probar los demás constructores, les metemos valores
        CuentaCorriente cuenta2 = new CuentaCorriente("00000000A", 500.0);

        // Probando Constructor 3: DNI y Nombre (Saldo será 0)
        CuentaCorriente cuenta3 = new CuentaCorriente("99999999B", "Aitor Chicano");

        //para comprobar que se guerdan, simplemente ejecutamos el metodo que muestra la informacion
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
        cuenta3.mostrarInformacion();

        sc.close();

    }
}
