package cadenas.a04_2;
import java.util.Scanner;
public class A04_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseña;

        System.out.println("introduzca la palabra a adivinar: ");
        String oculta = sc.nextLine();

        /*en este bucle, que es igual que el del ejercicio
        anterior, ponemos un for para que vaya recorriendo
        la palabra letra por letra y dependiendo de si la ha acertado o no,
        ponemos un asterisco o la letra
         */
        do{
            System.out.println("\nIntroduzca la contraseña: ");
            contraseña = sc.nextLine();

            for(int i=0; i<oculta.length(); i++){
                if(oculta.charAt(i) == contraseña.charAt(i)){
                    System.out.print(oculta.charAt(i));
                }else{
                    System.out.print("*");
                }
            }

        }while(!oculta.equals(contraseña));
        System.out.println("Contraseña acertada");
    }
}

