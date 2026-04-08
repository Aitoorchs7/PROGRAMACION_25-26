package cadenas.a12;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class A12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introcuzca el codigo del producto: ");
        String codigo = sc.nextLine();

        codigo = codigo.strip();
        String[] limpio = codigo.split("#");

        for(int i = 0; i < limpio.length; i++){
            limpio[i] = limpio[i].strip();
            limpio[i] = limpio[i].toUpperCase();
        }
        Arrays.sort(limpio);
        System.out.println(Arrays.toString(limpio));
    }
}