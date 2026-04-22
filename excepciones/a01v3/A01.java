package excepciones.a01v3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = leerNumeroRecursivo(sc);
        System.out.println("El número ingresado es: " + n);
        sc.close();
    }

    
    static Integer leerNumeroRecursivo(Scanner sc) {
        System.out.print("Ingrese un número: ");
        try {
            // Caso base implícito: la lectura es correcta y retorna el valor.
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir un número entero.");
            sc.next(); // Limpieza del buffer para evitar recursión infinita
            // Llamada recursiva tras el fallo
            return leerNumeroRecursivo(sc); 
        }
    }
}