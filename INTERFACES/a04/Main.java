package interfaces.a04;

public class Main {
    public static void main(String[] args) {
        //creamos los objetos de las impresoras

        Imprimible ib = new ImpresoraBasica();
        Multifuncion ia = new ImpresoraAvanzada();

        //probamos primero si las dos tienen la funcion imprimir y vemos que es verdad
        ib.imprimir();
        ia.imprimir();

        //ahora probamos que las dos puedan escanear
        // ib.escanear();
        //y vemos que el ide ya da fallos al dejarlo asi, asique lo dejo como comentario
        //para que compile 
        ia.escanear();
    }
    
}
