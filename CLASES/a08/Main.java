
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        String resultado;
        Sintonizador fm = new Sintonizador(70.0,80.0,108.0);
        
        System.out.println("Para subir la frecuencia escriba up, para bajarla down");
        System.out.println("Para comprobar la frecuencia en la que esta escriba FM");
        
        do{
        System.out.println("up/down/FM");
        resultado = sc.nextLine();
        
        if(resultado.equalsIgnoreCase("up")){
            fm.up();
            fm.display();
        }else if(resultado.equalsIgnoreCase("down")){
            fm.down();
            fm.display();
        }else if(resultado.equalsIgnoreCase("FM")){
            fm.display();
        }else if(resultado.equalsIgnoreCase("off")){
            System.out.println("Cerrando Programa... ");
            System.exit(0);
        }else{
            System.out.println("Este boton no hace nada, para salir escriba off");
        }
        }while(true);

        
        
    }
    
}
