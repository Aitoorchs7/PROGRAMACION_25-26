package INTERFACES.a01;

public class Main {
    public static void main(String[] args) {
        
        System.out.println(">>> TEST BOMBILLA <<<");
        DispositivoConectado miBombilla = new Bombilla();
        miBombilla.encender();   // Salida: Bombilla prendida
        miBombilla.conectar();   // Salida: Conectando a la red Wi-Fi 7 (Default)
        miBombilla.mostrarInfo(); // Muestra estado booleano
        miBombilla.apagar();     // Salida: Bombilla apagada

        System.out.println("\n---------------------------\n");

        System.out.println(">>> TEST TELEVISOR <<<");
        DispositivoConectado miTV = new Televisor();
        miTV.encender();         // Salida: Televisor prendido
        miTV.conectar();         // Salida: Buscando actualizaciones... (Override)
        miTV.mostrarInfo();      // Muestra estado y conexión
        miTV.apagar();           // Salida: Televisor apagado

        System.out.println("\n---------------------------\n");

        // Verificamos que la constante 'red' es accesible desde la interfaz
        System.out.println("Validación de Red Global: " + DispositivoConectado.red);
    }
}
