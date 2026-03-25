package a16;
import java.util.Scanner;
import java.util.Arrays;

public class A16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== BIENVENIDO AL JUEGO DE LA CÁMARA SECRETA =====");

        // Pedir dificultad
        int dificultad = pedirDificultad();

        // Crear arrays con la longitud introducida
        int[] t1 = new int[dificultad];
        int[] t2 = new int[dificultad];

        // 3. Definir tipo (fácil/difícil)
        int tipo = (dificultad <= 5) ? 1 : 2;

        if(tipo == 1){
            System.out.println("Vamos con la dificultad fácil");
        } else {
            System.out.println("Vamos con la dificultad difícil");
        }

        // Generar combinación y pedir primera tirada
        tablas(t1, t2);

        System.out.print("Esta es tu combinación por ahora: ");
        System.out.println(Arrays.toString(t2));

        // Bucle principal del juego
        do {
            juego(t1, t2);
            System.out.println("Vuelve a introducir los valores:");

            for(int i = 0; i < t1.length; i++){
                t2[i] = sc.nextInt();
            }

        } while (!Arrays.equals(t1, t2));

        System.out.println("¡Felicidades, has abierto la cámara secreta!");
    }


    // PIDE LA DIFICULTAD Y LA DEVUELVE

    public static int pedirDificultad() {
        Scanner sc = new Scanner(System.in);
        int dificultad;

        do {
            System.out.println("* INTRODUCE EL NIVEL DE DIFICULTAD:");
            System.out.println("(siendo 0 el más bajo y 10 el más alto)");
            System.out.println("El número será la longitud de la combinación");
            System.out.print("* DIFICULTAD: ");
            dificultad = sc.nextInt();
        } while(dificultad < 1 || dificultad > 10);

        return dificultad;
    }


    // RELLENA T1 ALEATORIAMENTE Y T2 CON INTRODUCCIÓN

    public static void tablas(int[] t1, int[] t2){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < t1.length; i++){
            t1[i] = (int)(Math.random()*5 + 1);
        }

        for(int i = 0; i < t2.length; i++){
            System.out.print("Introduce un valor (1-5): ");
            t2[i] = sc.nextInt();
        }
    }


    // MUESTRA LAS PISTAS

    public static void juego(int[] t1, int[] t2){
        for(int i = 0; i < t1.length; i++){
            if(t1[i] == t2[i]){
                System.out.println("Posición "+i+": ¡Correcto! ("+t2[i]+")");
            }
            else if(t1[i] > t2[i]){
                System.out.println("Posición "+i+": El número secreto es MAYOR");
            }
            else{
                System.out.println("Posición "+i+": El número secreto es MENOR");
            }
        }
    }
}

