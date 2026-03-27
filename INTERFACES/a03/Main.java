package INTERFACES.a03;

public class Main {
    public static void main (String[]args){
        Notificable ne = new NotificacionEmail();
        Notificable np = new NotificacionPush();
        Notificable ns = new NotificacionSMS();

        ne.enviarNotificacion("Mensaje para un email");
        np.enviarNotificacion("Mensaje para un Push");
        ns.enviarNotificacion("Mensaje para un SMS");

        //para enviar un mensaje a la vez a todos los objetos creamos
        //un array de objetos y lo recorremos metiendoles el mensaje a cada uno

        Notificable [] nt = {ne,np,ns};
        for(Notificable nNuevo : nt){
            nNuevo.enviarNotificacion("Mantenimento urgente del servidor");
        }
        //este mensaje se mostrara por todos los canales en el orden del array

    }
    
}
