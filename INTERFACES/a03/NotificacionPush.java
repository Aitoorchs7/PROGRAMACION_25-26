package interfaces.a03;

class NotificacionPush implements Notificable {
    @Override
    public void enviarNotificacion(String mensaje){
        System.out.println(mensaje);
    }
    
}
