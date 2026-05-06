package colecciones.a04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A04 {
    public static void main(String[] args) {
        Collection<Integer> listaNumeros = new ArrayList<>();

        for(int i = 0; i <= 99; i++){
            Integer n = (int)(Math.random()*10);
            listaNumeros.add(n);
        }

        System.out.println("Lista original:");
        System.out.println(listaNumeros);

        Iterator<Integer> it = listaNumeros.iterator();

        do{
            Integer num2 = it.next();

            if(num2 == 5){
                it.remove();
            }          
        }while(it.hasNext());
        System.out.println("Lista sin 5");
        System.out.println(listaNumeros);
    }    
}
