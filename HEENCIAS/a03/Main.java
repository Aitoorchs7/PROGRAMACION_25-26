package a03;

public class Main {
    public static void main(String[] args) {
        // Creamos dos horas idénticas menos en segundos para probar el equals que hemos creado 
        HoraExacta h1 = new HoraExacta(10, 30, 45);
        HoraExacta h2 = new HoraExacta(10, 30, 47);
        
        // Creamos una distinta
        HoraExacta h3 = new HoraExacta(12, 00, 00);

        System.out.println("Hora 1: " + h1.toString());
        System.out.println("Hora 2: " + h2.toString());
        System.out.println("Hora 3: " + h3.toString());
        

        // Comparaciones
        System.out.println("¿h1 es igual a h2?: " + h1.equals(h2)); // Debe devolver true
        System.out.println("¿h1 es igual a h3?: " + h1.equals(h3)); // Debe devolver false

        // Probamos el incremento
        h1.inc();
        System.out.println("Tras incrementar h1 un segundo: " + h1.toString());
        System.out.println("¿Ahora h1 es igual a h2?: " + h1.equals(h2)); // Debe devolver false
    }
}

    

