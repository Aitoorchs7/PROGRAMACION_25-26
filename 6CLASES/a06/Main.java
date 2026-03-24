
package a06;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora: ");
        byte h = sc.nextByte();
        byte m = sc.nextByte();
        byte s = sc.nextByte();
        
        System.out.println("Ahora introduce el tiempo que quieres avanzar: ");
        byte n = sc.nextByte();
        
        Hora h1 = new Hora(h,m,s);
        
        for(int i = 0; i < n; i++){
            h1.siguienteSegundo();
            h1.mostrarHora();
        }
        
        sc.close();
    }
    
}
