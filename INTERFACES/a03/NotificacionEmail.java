package INTERFACES.a03;

class NotificacionEmail implements Notificable {

    @Override
    public void enviarNotificacion(String mensaje){
        System.out.println(mensaje);
    }
    
}
