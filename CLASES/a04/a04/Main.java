package a04;

public class Main {
    public static void main(String[] args) {
        // Creamos dos cuentas distintas 
        CuentaCorriente c1 = new CuentaCorriente("11111111A", "Pepe");
        CuentaCorriente c2 = new CuentaCorriente("22222222B", "Ana");

        System.out.println("--- Antes del cambio ---");
        c1.mostrarInformacion();
        c2.mostrarInformacion();

        // Cambiamos el banco usando el método estático
        // Se recomienda llamar a través de la Clase, no del objeto
        CuentaCorriente.setBanco("CaixaBank");

        System.out.println("\n--- Después del cambio ---");
        // ¡Ambas cuentas ahora muestran el nuevo banco!
        c1.mostrarInformacion();
        c2.mostrarInformacion();
        
        System.out.println("\nNombre del banco recuperado: " + CuentaCorriente.getBanco());
    }
}

