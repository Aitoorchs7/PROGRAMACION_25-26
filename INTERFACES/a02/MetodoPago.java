package INTERFACES.a02;

interface MetodoPago {
    public final double IVA = 0.21;
    
    void procesarPago(double cantidad);

    private static void logTransaccion(){
        System.out.println("Pago realizado");
    }
    static void generarFactura(double importe){
        logTransaccion();
        System.out.println("Importe final más IVA: "+ (importe+(importe*IVA)));
    }    
}
