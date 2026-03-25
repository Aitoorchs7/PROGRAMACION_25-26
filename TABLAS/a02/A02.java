package TABLAS.a02;
import java.util.Arrays;
import java.util.Scanner;
public class A02{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int numIntroducido [] = new int [5];
        for(int i = 0; i < numIntroducido.length ; i++){
            System.out.println("Introduce un numero entero: ");
            numIntroducido[i] = sc.nextInt();
        }
        System.out.println("Los numero introducidos son:" );
        for (int i = 0 ; i < numIntroducido.length; ++i){
            System.out.print(Arrays.toString(numIntroducido));
        }
    }
}