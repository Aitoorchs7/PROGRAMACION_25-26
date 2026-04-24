package excepciones.a01v1;

import java.util.Scanner;

public class A01 {
    public static void main(String [] args){
        Integer n = leerNumero();
        System.out.println("El número ingresado es: " + n);
    }  
    static Integer leerNumero(){
        Scanner sc = new Scanner(System.in);
        Integer resultado = null;

        while(resultado == null){
        System.out.print("Ingrese un número: ");
        try{
            resultado = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Debes introducir un número entero.");
            sc.next();
        } 
        sc.close();
    }
    return resultado;
    }
}
