package a02;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Probando clase Hora ---");
        Hora h1 = new Hora(23, 58);
        System.out.println("Hora inicial: " + h1); // 23:58
        
        h1.inc();
        System.out.println("Después de inc(): " + h1); // 23:59
        
        h1.inc();
        System.out.println("Después de inc() (cambio de día): " + h1); // 0:0
        
        System.out.println("¿Set horas 25? " + h1.setHoras(25)); // false
        System.out.println("¿Set minutos 30? " + h1.setMinutos(30)); // true
        System.out.println("Estado final Hora: " + h1);

        System.out.println("\n--- Probando clase HoraExacta ---");
        HoraExacta he = new HoraExacta(23, 59, 58);
        System.out.println("Hora exacta inicial: " + he); // 23:59:58
        
        he.inc();
        System.out.println("Después de 1 segundo: " + he); // 23:59:59
        
        he.inc();
        System.out.println("Después de 1 segundo (cambio de día completo): " + he); // 0:0:0
        
        System.out.println("¿Set segundos 61? " + he.setSegundos(61)); // false
        System.out.println("¿Set segundos 15? " + he.setSegundos(15)); // true
        
        he.setHoras(12);
        he.setMinutos(30);
        System.out.println("Estado final HoraExacta: " + he); // 12:30:15
    }
}
