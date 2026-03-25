package CADENAS.a11;

public class A11 {
    public static void main(String[] args) {
        //introducimos la frase a analizar
        String frase = "En un lugar de La Mancha";

        //convertimos todas las letras e minúsculas para que sea más fácil
        frase = frase.toLowerCase();
        //y la frase en tabla para analizar posición por posicion
        char[] tablaFrase = frase.toCharArray();

        System.out.println("las letras que se repiten son: ");
        //en el bucle recorremos la frase letra por letra

        for (int i = 0; i < tablaFrase.length; i++) {
            //si la frase tiene espacios no los contamos
            if (tablaFrase[i] == ' '){
                continue;
            }
            //y si se repite una letra al leerla continuamos
            if(frase.indexOf(tablaFrase[i]) != i){
                continue;
            }
            int contador = 0;

            /*en este bucle con cada letra compara la frase con
            la tabla, y si se repite una letra de la tabla en la
            frase, el contador aumenta su valor
             */
            for (int j = 0; j < tablaFrase.length; j++) {
                if (tablaFrase[j] == tablaFrase[i]){
                    contador++;
                }
            }
            //solo pintamos los que se repitan más de una vez
            if(contador > 1){
                System.out.println(tablaFrase[i] + ": " +contador);
            }
        }


    }
}

