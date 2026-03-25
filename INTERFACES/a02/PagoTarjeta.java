package INTERFACES.a02;

class PagoTarjeta implements MetodoPago{
    @Override
    public void procesarPago(double importe){
        System.out.println("El importe a pagar en tarjeta: "+importe);
        MetodoPago.generarFactura(importe);
    }
}