package colecciones.a06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Arrays;

public class A06 {
    public static void main (String[]args){
        Collection<Integer> listaNumeros = new ArrayList<>();
        Integer[] tablaNumeros = new Integer[0];
        
        for(int i = 0; i < 20;i++){
            Integer num = (int)(Math.random()*100);
            listaNumeros.add(num);
            tablaNumeros = listaNumeros.toArray(new Integer [i]);
        }

        Arrays.sort(tablaNumeros);
        System.out.println("Tabla estatica con los numeros de la tabla de colecciones ordenada");
        System.out.println(Arrays.toString(tablaNumeros));
        
        Collection<Integer> listaOrdenada = new ArrayList<>(Arrays.asList(tablaNumeros));
        System.out.println("Tabla de colecciones ordenada tras volcar los numeros de la tabla estatica en orden");
        System.out.println(listaOrdenada);

        System.out.println("Para ordenarlo de mayor a menor, volcaria la coleccion en una tabla");
        System.out.println("Y con un bucle voy recorriendo y ordenando la tabla en funcion del mayor");

        Integer[] tablaNumeros2 = listaNumeros.toArray(new Integer[0]);
        
        boolean cambio = true;
        while(cambio){
            cambio = false;
            for(int j = 0; j < tablaNumeros2.length - 1; j++){
                if(tablaNumeros2[j] < tablaNumeros2[j + 1]){
                    Integer temp = tablaNumeros2[j];
                    tablaNumeros2[j] = tablaNumeros2[j + 1];
                    tablaNumeros2[j + 1] = temp;
                    cambio = true;
                }
            }
        }

        //lo volcamos de nuevo
        Collection<Integer> listaOrdenadaMayor = new ArrayList<>(Arrays.asList(tablaNumeros2));
        System.out.println("lista ordenada de mayor a menor");
        System.out.println(listaOrdenadaMayor);
    }
}
