package colecciones.a05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A05 {
    public static void main(String[]args){
        Collection<Integer> listaNumeros = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            Integer num = (int)(Math.random()*10);
            listaNumeros.add(num);
        }
        System.out.println("Lista rellena con numeros aleatorios");
        System.out.println(listaNumeros);

        Collection<Integer> listaNumeros2 = new ArrayList<>();

        Iterator<Integer> it = listaNumeros.iterator();

        do{
            Integer num = it.next();
            if(num == 5){
                listaNumeros2.add(num);
                it.remove();
            }
        }while(it.hasNext());
        System.out.println("Primera lista sin el numero 5");
        System.out.println(listaNumeros);
        System.out.println("Lista con solo los 5");
        System.out.println(listaNumeros2);

    }
    
}
