package colecciones.a07;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class A07 {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(10,20,30,40));
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(99,99));

        lista1.add(0,5);

        lista1.addAll(2, lista2);

        System.out.println(lista1.get(4));// con el get conseguimos pintar el indice que indiquemos 

        Integer numero = 500;
        lista1.addLast(numero);

        System.out.println(lista1.getLast());

        lista1.remove(1);

        Integer posicion = Integer.valueOf(99);
        lista1.remove(posicion);

        System.out.println(lista1);
    }
    
}
