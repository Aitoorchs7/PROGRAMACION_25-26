package excepciones.a01v2;

import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int a = sc.nextInt();
        metodo2(a);
        sc.close(); 
    }

    public static int metodo1(int a) throws Exception {
        
        
    }
    public static int metodo2(int a) {
        return metodo1(a);
        
    }
    
}
