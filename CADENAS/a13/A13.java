package a13;

import java.util.Scanner;

public class A13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Intruduzca tu nombre de usuario: ");
        String usuario = sc.nextLine();

        if (usuario.length() > 5){
            char letra = usuario.charAt(0);
            boolean check1 = Character.isLetter(letra);

            char letra2 = usuario.charAt(usuario.length()-1);
            boolean check2 = Character.isDigit(letra2);

            if (check1 && check2){
                System.out.println("Usuario correcto");
            }else{
                System.out.println("Usuario incorrecto");

            }
            sc.close();
        }else{
            System.out.println("Usuario incorrecto");
            sc.close();
        }
    }
}
