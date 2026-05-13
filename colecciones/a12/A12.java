package colecciones.a12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A12 {
    public static void main(String[]args){
        List<Integer> premios = new ArrayList<>(Arrays.asList(1000, 50, 500, 50, 200));

        System.out.println("Lista de premios: "+premios);

        System.out.println("Frecuencia de precios de 50: "+Collections.frequency(premios, 50));

        System.out.println("Premio máximo: "+ Collections.max(premios));
        System.out.println("Premio mínimo: "+ Collections.min(premios));

        System.out.println("Lista desordenada");
        Collections.shuffle(premios);
        System.out.println(premios);

        System.out.println("Lista ordenada");
        Collections.sort(premios);
        System.out.println(premios);

        System.out.println("La posicion con busqueda rapida del premio de 500 es:");
        System.out.println(Collections.binarySearch(premios,500)+1); 
    }
    
}
