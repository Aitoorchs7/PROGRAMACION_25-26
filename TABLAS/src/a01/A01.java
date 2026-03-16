package a01;
import java.util.Arrays;
public class A01 {

    public static void main (String [] args){
        int numAleatorio [] = new int [10];
        int sumaNumeros = 0;
        for (int i = 0; i < numAleatorio.length ; i++){
            numAleatorio [i] = (int)(Math.random()*100);
            sumaNumeros += numAleatorio[i];
        }

        System.out.println("La suma de los 10 numeros es: " + sumaNumeros);
    }
}
