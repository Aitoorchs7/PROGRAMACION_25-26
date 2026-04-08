package excepciones.a01v1;

import java.util.Scanner;

public class A01 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        do{
            int a = sc.nextInt();
            try{
             a;
            System.out.println("El número introducido es: " + a);
            } catch (Exception e) {
                System.out.println("Error: Debes introducir un número entero.");
            }
        }while(true);
    }  
}
