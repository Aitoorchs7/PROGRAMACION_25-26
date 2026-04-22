package colecciones.a01;

import java.util.Arrays;

public class A01 {
    public static void main(String[] args) {

        String[] s = {"hola", "mundo"};
        Integer[] i = {1, 2, 3};

        s = guardar("adios", s);
        i = guardar(4, i);
    
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(i));

        
        }
    static <T> T[] guardar(T e, T[] t){
        
        T[] n = Arrays.copyOf(t, t.length + 1);
        n[n.length - 1] = e;
        return n;
    }

}




