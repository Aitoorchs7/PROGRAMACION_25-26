package colecciones.a09;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class A09 {
    public static void main (String[] args){
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            lista.add(numeroAleatorio(1, 100));
        }
        System.out.println(lista);

        System.out.println("HashSet");
        Set<Integer> listaSinRepetidos = new HashSet<>(lista);
        System.out.println(listaSinRepetidos);
        System.out.println("La lista se ha reducido quitando los repetidos");

        System.out.println("TreeSet");
        Set<Integer> ListaOrdenadaSinRepetidos = new TreeSet<>(lista);
        System.out.println(ListaOrdenadaSinRepetidos);
        System.out.println("La lista se ha ordenado y se han quitado los repetidos");

        System.out.println("LinkedHashSet");
        Set<Integer> ListaLincadaSinRepetidos = new LinkedHashSet<>(lista);
        System.out.println(ListaLincadaSinRepetidos);
        System.out.println("La lista se ha ordenado y se han quitado los repetidos, pero se ha mantenido el orden de inserción");


    }
    
    public static int numeroAleatorio(int min, int max){
        return (int)(Math.random() * (max - min + 1) + min);
    }
}
