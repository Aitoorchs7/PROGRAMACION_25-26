package INTERFACES.a01;

interface DispositivoConectado {
    static String red = "Wi-Fi 7";
    void encender();
    void apagar();
    
    default void conectar(){
        System.out.println("Conectando a la red " + red);
    }
    static void mostrarInfo(){
        System.out.println("Red: " + red);
    }
    
}
