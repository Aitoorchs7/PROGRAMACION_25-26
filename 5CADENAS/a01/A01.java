package a01;
import java.util.Scanner;
public class A01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pido al usuario que introdizca 2 frases
        //y las almaceno en una string
        System.out.println("introduzca 2 frases: ");
        String frase1 = sc.nextLine();
        String frase2 = sc.nextLine();

        //guardo las longitudes en enteros para compararlas
        //Y pinto el resultado

        int longitud1 = frase1.length();
        int longitud2 = frase2.length();

        String resultado = longitud1 < longitud2 ? frase1 : frase2;
        System.out.println("La frase mas corta es:  \n"+ resultado);
    }
}
