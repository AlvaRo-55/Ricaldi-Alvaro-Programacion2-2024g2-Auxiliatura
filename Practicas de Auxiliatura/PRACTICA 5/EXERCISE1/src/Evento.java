import java.util.ArrayList;

public class Evento {
    private String nombre;
    private ArrayList<EventoNotificacion> notificaciones;

    public Evento(String nombre) {
        this.nombre = nombre;
        this.notificaciones = new ArrayList<EventoNotificacion>();
    }

    public void registrarNotificacion(EventoNotificacion notificacion) {
        if (notificaciones == null) {
            notificaciones = new ArrayList<EventoNotificacion>();
        }
        notificaciones.add(notificacion);
    }

    public void activar() {
        String mensaje = "El evento " + nombre + " ha sido activado";
        if (notificaciones != null) {
            for (EventoNotificacion notificacion : notificaciones) {
                notificacion.notificar(mensaje);
            }
        }
    }
}
