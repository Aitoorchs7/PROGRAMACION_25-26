package INTERFACES.a05;

import INTERFACES.a03.Notificable;

public class Main {
    public static void main(String[] args) {

       Notificable mensajePaloma = new Notificable() {
        @Override
        public void enviarNotificacion(String mensaje){
            System.out.println(mensaje);
        }
       }; 
       mensajePaloma.enviarNotificacion("Cuu cuu: El CEO os saluda");
    }
    
}
