package excepciones.a01v2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = null;

        while (n == null) {
            try {
                n = leerNumero(sc);
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero.");
                sc.next(); 
            }
        }
        
        System.out.println("El número ingresado es: " + n);
        sc.close();
    }

    static Integer leerNumero(Scanner sc) throws InputMismatchException {
        System.out.print("Ingrese un número: ");
        return sc.nextInt();
    }
}