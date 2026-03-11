package a09;

public class Main {
    public static void main (String[]args){
        Bombilla bombilla1 = new Bombilla();
        Bombilla bombilla2 = new Bombilla();
        Bombilla bombilla3 = new Bombilla();

        System.out.println("Intentamos encender una bombilla con el generador apagado:");
        bombilla1.encender();
        
        System.out.println("\nEncendemos el generador:");
        Bombilla.encenderGenerador();
        System.out.println("\nIntentamos encender las bombillas nuevamente:");
        System.out.println("\nBombilla 1:");
        bombilla1.encender();
        System.out.println("\nBombilla 2:");
        bombilla2.encender();
        System.out.println("\nBombilla 3:");
        bombilla3.display();
        System.out.println("\nApagamos el generador:");
        Bombilla.apagarGenerador();
        System.out.println("\nIntentamos encender las bombillas nuevamente:");
        System.out.println("\nBombilla 1:");
        bombilla1.encender();
        System.out.println("\nBombilla 2:");
        bombilla2.encender();
        System.out.println("\nBombilla 3:");
        bombilla3.encender();
        System.out.println("\nMostramos el estado de las bombillas:");
        System.out.println("\nBombilla 1:");
        bombilla1.display();
        System.out.println("\nBombilla 2:");
        bombilla2.display();
        System.out.println("\nBombilla 3:");
        bombilla3.display();
        System.out.println("\nEncendemos el generador nuevamente:");
        Bombilla.encenderGenerador();
        System.out.println("\nVemos que el estado de las bombillas no cambia al encender el generador:");
        System.out.println("\nBombilla 1:");
        bombilla1.display();
        System.out.println("\nBombilla 2:");    
        bombilla2.display();
        System.out.println("\nBombilla 3:");
        bombilla3.display();
    }
    
}
