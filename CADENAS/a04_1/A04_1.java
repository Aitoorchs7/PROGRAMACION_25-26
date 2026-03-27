package CADENAS.a04_1;
import java.util.Scanner;
public class A04_1 {
    public static void main(String[] args) {
        //declaramos el escaner y la contraseña que va a introducir el usuario
        Scanner sc = new Scanner(System.in);
        String contraseña;

        //pedimos la contraseña a adivinar al usuario
        System.out.println("Introduzca la palabra contraseña: ");
        String oculta = sc.nextLine();

        /* en este bucle pedimos que introduzca la palabra a adivinar hasta
        hasta que la adivine, con las condicionales le vamos diciendo si es
        mayor o menor alfabeticamente
         */
        do{
            System.out.println("Introduzca la contraseña: ");
            contraseña = sc.nextLine();

            if(contraseña.compareToIgnoreCase(oculta) > 0){
                System.out.println("La contraseña a adivinar es menor alfabeticamente: ");
            }else if(contraseña.compareToIgnoreCase(oculta) < 0){
                System.out.println("La contraseña a adivinar es mayor alfabeticamente:");
            }
        }while(!oculta.equals(contraseña));

        System.out.println("Contraseña adivinada");
    }
}
