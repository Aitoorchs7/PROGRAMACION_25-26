package colecciones.a02;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class A02 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Collection<Integer> numeros = new ArrayList<>();
        Iterator<Integer> it = numeros.iterator();

        Integer num = 0;
        System.out.println("Ve introduciendo los numeros");
        while(num != -1){
            num = sc.nextInt();
            if(num >= 0){
                numeros.add(num);
            }
        }
        
        System.out.println(numeros);

        System.out.println("Numeros pares:\n");
        for(Integer num1 : numeros){
            if(num1 % 2 == 0){
                System.out.println(num1);
            }
        }
        System.out.println("Numeros multiplos de 3 eliminados:\n");
        while(it.hasNext()){
            Integer num2 = it.next();
            
            if(num2 % 3 != 0){
                it.remove();
            }
        }
        System.out.println(numeros);
        sc.close();

    }
    
}
