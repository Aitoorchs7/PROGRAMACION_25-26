package TABLAS.a04;
import java.util.Scanner;
public class A04 {

    public static int Maximo(int t[]){
        int mayor = t[0];
        for(int i = 1;i < t.length;i++){
            mayor = (t[i] > mayor) ? t[i] : mayor;

        }
        return mayor;

    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        //hasta el primer for incluido es igual que el ejercicio 3
        int cantidad;

        System.out.println("Cuantos numeros desea introducir: ");
        cantidad = sc.nextInt();
        int t[] = new int[cantidad];


        System.out.println("A continuacion introduce los numeros: ");
        for(int i = 0; i < cantidad;i++){
            t[i] = sc.nextInt();

        }

        int mayor = Maximo(t);

        System.out.println("El numero mas grande de la tabla es: "+mayor);


    }
}
