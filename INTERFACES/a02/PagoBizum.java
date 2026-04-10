package interfaces.a02;

class PagoBizum implements MetodoPago {
    @Override
    public void procesarPago(double importe){
        System.out.println("El importe a pagar en bizum: "+importe);
        MetodoPago.generarFactura(importe);
    }
}
