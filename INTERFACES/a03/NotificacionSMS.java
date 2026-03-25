package INTERFACES.a03;

class NotificacionSMS implements Notificable {
    @Override
    public void enviarNotificacion(String mensaje){
        System.out.println(mensaje);
    }
}
