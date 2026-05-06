package colecciones.a10;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<Socio> socios = new HashSet<>();
        socios.add(new Socio("123A", "Juan"));
        socios.add(new Socio("123A", "Aitor"));//no deberia aparecer
        socios.add(new Socio("456B", "Jesus"));
        socios.add(new Socio("789C", "Daniel"));

        System.out.println(socios);

        Set<Socio> sociosOrdenados = new TreeSet<>(socios);
        System.out.println(sociosOrdenados);

        Set<Socio> sociosOrdenadosLincados = new LinkedHashSet<>(socios);
        // mostramos solo el primero
        System.out.println(sociosOrdenadosLincados.toArray()[1]);

    }
    
}
