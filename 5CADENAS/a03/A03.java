package a03;
import java.util.Scanner;
public class A03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inversa = "";
        //pedimos al usuario que introduzca una frase y la almacenamos
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        //con este bcle recorremos la frase del final al principio
        //Y la vamos almacenando letra por letra al reves en el
        //String inversa
        for(int i = frase.length() - 1; i>=0; i--){
            char letra = frase.charAt(i);
            inversa += letra;
        }
        System.out.println("La frase inversa es:  \n"+ inversa);
    }
}
// tambien se podria directamente sin crear letra hacer:
// inversa += fraseCharat(i)
//Ya que se va almacenando el valor i desde la ultima hasta la primera letra