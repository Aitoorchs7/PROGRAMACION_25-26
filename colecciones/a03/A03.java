package colecciones.a03;


import java.util.Collection;
import java.util.ArrayList;

public class A03 {
    public static void main(String[] args) {
        Collection<Integer> listaNumeros = new ArrayList<>();
        int numero;
        Collection<Integer> listaNumeros2 = new ArrayList<>();

    for(int i = 0; i < 20; i++){
        numero = (int)(Math.random()*10);
        if(numero <= 10 && numero >= 0){
            listaNumeros.add(numero);
        }
    }

    for(Integer num : listaNumeros){
        if(!listaNumeros2.contains(num)){
            listaNumeros2.add(num);
        }      
    }

    System.out.println("Lista con los numeros aleatorios");
    System.out.println(listaNumeros);
    System.out.println("Lista sin repetidos");
    System.out.println(listaNumeros2);




    }
    
}
