package tablas.a03;
import java.util.Arrays;
import java.util.Scanner;
public class A03 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //declaramos la variable donde se va a almacenar los numeros que quiera el usuario
        int cantidad;
        //le pedimos al usuario cuantos numeros quiere y lo almacenamos en la tabla
        System.out.println("Cuantos numeros desea introducir: ");
        cantidad = sc.nextInt();
        int numeros[] = new int[cantidad];

        //En el bucle metemos los valores en la tabla y en el siguiente los leemos al reves
        System.out.println("A continuacion introduce los numeros: ");
        for(int i = 0; i < cantidad;i++){
            numeros[i] = sc.nextInt();
        }
        //para leerlos al reves ponemos desde el final hasta el principio
        for(int i = numeros.length -1;i >= 0; i--){
            System.out.println(numeros[i]);
        }
    }
}
