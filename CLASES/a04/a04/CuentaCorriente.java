package a04;
/* * Clase que representa una cuenta corriente bancaria.
 * Incluye gestión de saldo, nombre del titular y DNI con diferentes niveles de visibilidad.
 */
public class CuentaCorriente {
    // Atributos con visibilidad configurada según Actividad 3
    String dni;              // Visibilidad por defecto (clases vecinas) 
    public String nombre;    // Visibilidad total (público) 
    private double saldo;    // Invisible para clases externas (privado) 
    // --- CONSTRUCTORES (Sobrecargados y reutilizados) ---

    static String banco = "Banco Santander"; // Atributo estático de clase

    // Constructor principal con todos los parámetros
    public CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public static String getBanco(){
        return banco;
    }

    public static void setBanco(String nuevoBanco){
        CuentaCorriente.banco = nuevoBanco;//para modificar un atributo estatico, se pone el nombre de la clase
    }

    // Constructor con DNI y nombre (saldo inicial por defecto a 0) 
    public CuentaCorriente(String dni, String nombre) {
        this(dni, nombre, 0); // Reutiliza el constructor principal 
    }

    // Constructor con DNI y saldo inicial (nombre "Sin asignar") 
    public CuentaCorriente(String dni, double saldo) {
        this(dni, "Sin asignar", saldo); // Reutiliza el constructor principal
    }

    // --- MÉTODOS DE OPERACIÓN ---

    // Método para retirar dinero 
    public boolean egreso(double cant) {
        boolean operacionPosible;
        if (saldo >= cant) { // Si hay saldo suficiente 
            saldo -= cant;   // Se resta la cantidad
            operacionPosible = true;
        } else {
            System.out.println("No hay dinero suficiente");
            operacionPosible = false;
        }
        return operacionPosible; // Indica el éxito de la operación 
    }

    // Método para ingresar dinero 
    public void ingreso(double cant) {
        saldo += cant;
    }

    // Método para mostrar el estado de la cuenta 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);      
        System.out.println("Saldo: " + saldo + " euros"); 
        System.out.println("Banco: " + banco);
    }
}
