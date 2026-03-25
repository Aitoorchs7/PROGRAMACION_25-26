package CADENAS.a15;

import java.util.Arrays;

public class A15 {
    public static void main(String[] args) {
    String vocales = "aeiouAEIOU";
        String frase = " ¡Odio el #Lunes y el #Java! Son lo peor 123 ";
        frase = frase.strip();
        String[] limpia = frase.split(" ");
        for(int i = 0; i < limpia.length; i++){
            String palabra  = limpia[i];
            boolean valor = limpia[i].startsWith("#");
            if(valor){
                limpia[i] = limpia[i].replace("#","");
            }
            for(int j = 0; j < palabra.length(); j++){
                char letra = palabra.charAt(j);
                int pos = palabra.indexOf(vocales);
                if(pos != -1){
                    palabra = palabra.replace(letra,'*');
                }
            }
        }
        System.out.println(Arrays.toString(limpia));

    }
    }

