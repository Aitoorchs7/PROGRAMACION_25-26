package a05;

public class CuentaCorriente {
    // Atributos con visibilidad configurada según Actividad 3
    String dni;              // Visibilidad por defecto (clases vecinas) 
    public String nombre;    // Visibilidad total (público) 
    private double saldo;    // Invisible para clases externas (privado) 

    Gestor gestor;
    static String banco = "Banco Santander"; // Atributo estático de clase

    // Constructor principal con todos los parámetros
    public CuentaCorriente(String dni, String nombre, double saldo, Gestor gestor) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
        this.gestor = gestor;
    }

    // Constructor con DNI y nombre (saldo inicial por defecto a 0) 
    public CuentaCorriente(String dni, String nombre) {
        this(dni, nombre, 0, null); // Reutiliza el constructor principal 
    }

    // Constructor con DNI y saldo inicial (nombre "Sin asignar") 
    public CuentaCorriente(String dni, double saldo) {
        this(dni, "Sin asignar", saldo, null); // Reutiliza el constructor principal
    }

    public static String getBanco(){
        return banco;
    }

    public static void setBanco(String nuevoBanco){
        CuentaCorriente.banco = nuevoBanco;//para modificar un atributo estatico, se pone el nombre de la clase
    }
    // Método para mostrar el estado de la cuenta 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);      
        System.out.println("Saldo: " + saldo + " euros"); 
        System.out.println("Banco: " + banco);
            if (gestor != null) {
                System.out.println(gestor.mostrarInformacion());
            } else {
                System.out.println("No hay gestor asignado.");
            }
    }
}
