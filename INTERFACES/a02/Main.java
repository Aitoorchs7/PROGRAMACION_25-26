package interfaces.a02;

class Main {
    public static void main(String[]args){

        MetodoPago b = new PagoBizum();
        MetodoPago t = new PagoTarjeta();
        double importeBizum = 20.5;
        double importeTarjeta = 10.4;

        System.out.println("Pagos procesados");

        b.procesarPago(importeBizum);//procesamos el pago de cada uno de los metodos de pago
        t.procesarPago(importeTarjeta);//ahora la de tarjeta

        System.out.println("Probamos que funciona la interfaz con el metodo generar factura");
        MetodoPago.generarFactura(importeBizum);
        MetodoPago.generarFactura(importeTarjeta);

    }
    
}
