package colecciones.a08;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class A08 {
    public static void main(String[] args) {

        String[] tablaNombres = {"Ana","Luis","Marta","Luis"};
        List<String> listaA = new ArrayList<>(Arrays.asList(tablaNombres));
        List<String> listaB = new ArrayList<>(Arrays.asList(tablaNombres));

        System.out.println("Estas listas son iguales: "+ listaA.equals(listaB));

        System.out.println("Primera vez que aparece luis en la lista: "+ listaA.indexOf("Luis"));
        System.out.println("Ultima vez que aparece luis en la lista: "+ listaA.lastIndexOf("Luis"));

        listaA.sort(null);

        System.out.println("Estas listas son iguales despues de ordenar listaA: "+ listaA.equals(listaB));

        listaB.sort(Comparator.reverseOrder());

        System.out.println("Lista B: "+listaA);

        System.out.println("Lista B: "+listaB);
        System.out.println("Ahora son iguales: "+ listaA.equals(listaB));
    }
}
